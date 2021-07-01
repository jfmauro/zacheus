package be.bcss.zacheus.controller;


import be.bcss.zacheus.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/salary/")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    private static Logger logger = LoggerFactory.getLogger(EmployeeController.class);


    @GetMapping(value = "{nationalNumber}", produces = "application/json;charset=utf-8")
    public ResponseEntity<SalaryResponse> verifyAccount(@PathVariable String nationalNumber) {
        SalaryResponse salaryResponse = employeeService.retrieveSalaryInfo(nationalNumber);
        if (salaryResponse != null)
            return new ResponseEntity<>(salaryResponse, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
