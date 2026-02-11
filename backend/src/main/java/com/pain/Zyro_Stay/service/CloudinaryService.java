package com.pain.Zyro_Stay.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.pain.Zyro_Stay.exception.OurException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Service
public class CloudinaryService {

    private final Cloudinary cloudinary;

    public CloudinaryService(Cloudinary cloudinary) {
        this.cloudinary = cloudinary;
    }

    public String saveImage(MultipartFile photo) {

        try {
            Map uploadResult = cloudinary.uploader().upload(
                    photo.getBytes(),
                    ObjectUtils.asMap(
                            "folder", "phegon-hotel-images"
                    )
            );

            return uploadResult.get("secure_url").toString();

        } catch (Exception e) {
            throw new OurException("Unable to upload image to Cloudinary: " + e.getMessage());
        }
    }
}
