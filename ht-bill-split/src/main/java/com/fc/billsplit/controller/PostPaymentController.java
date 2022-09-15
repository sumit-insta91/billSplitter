package com.fc.billsplit.controller;

import com.fc.billsplit.dto.GroupDetailsDto;
import com.fc.billsplit.service.PostPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/postPayment")
public class PostPaymentController {

    @Autowired
    private PostPaymentService postPaymentService;

    @GetMapping(value = "/health")
    public ResponseEntity<String> healthCheckPostPayment(){
        return new ResponseEntity<>("HTTP-OK", HttpStatus.OK);
    }

    @GetMapping(value = "/v1/getGroupDetails/{groupId}")
    public ResponseEntity<GroupDetailsDto> getGroupDetails(@PathVariable("groupId") int groupId) {
        return new ResponseEntity<>(postPaymentService.getGroupDetails(groupId), HttpStatus.OK);
    }
}
