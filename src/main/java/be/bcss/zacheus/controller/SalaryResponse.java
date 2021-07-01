package be.bcss.zacheus.controller;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalaryResponse {
    private String nationalNumber;
    private String employerName;
    private String salaryAmount;
}
