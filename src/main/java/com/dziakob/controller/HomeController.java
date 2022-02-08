package com.dziakob.controller;

import com.dziakob.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping(value="/test")
    public @ResponseBody String getOtherTest() {
        return "Hello World";
    }

    @GetMapping(value="/student/{studentId}")
    public @ResponseBody Student getTestData(@PathVariable Integer studentId) {
        Student student = new Student();
        student.setName("kuba");
        student.setGivenName("ble ble ble");
        student.setStudentId(studentId);
        return student;
    }
}
