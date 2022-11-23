package com.project.StudentManagement.controller.auth;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.project.StudentManagement.entity.User;
import com.project.StudentManagement.model.dto.UserDto;
import com.project.StudentManagement.repository.UserRepository;
import com.project.StudentManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserService userService;
//    @GetMapping("")
//    public String getListUser(){
//        List<UserDto> userDto = userService.getListUser();
//        List<JsonObject> userDtoJson = new ArrayList<>();
//        for (UserDto n: userDto) {
//            JsonObject json = new JsonObject();
//            json.addProperty("id", n.getId());
//            json.addProperty("dateOfBirth", n.getDateOfBirth());
//            json.addProperty("address", n.getAddress());
//            json.addProperty("phoneNumber", n.getPhoneNumber());
//            json.addProperty("fullName", n.getFullName());
//            json.addProperty("token", n.getToken());
//            json.addProperty("role", n.getRole());
//            userDtoJson.add(json);
//        }
//        JsonArray jsonarr = new JsonArray();
//        for (int i = 0 ; i< userDtoJson.size();i++){
//            jsonarr.add(userDtoJson.get(i));
//        }
//        String jsonInString = new Gson().toJson(jsonarr);
//        return jsonInString;
//    }


}
