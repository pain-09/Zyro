package com.zyroStay.zyro.service.interfac;

import com.zyroStay.zyro.dto.LoginRequest;
import com.zyroStay.zyro.dto.Response;
import com.zyroStay.zyro.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);
}
