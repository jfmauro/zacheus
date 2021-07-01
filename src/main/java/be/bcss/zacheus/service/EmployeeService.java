package be.bcss.zacheus.service;

import be.bcss.zacheus.controller.SalaryResponse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {

    private static Map<String, SalaryResponse> result = new HashMap<>();

    {
        result.put("59041525973", new SalaryResponse("59041525973", "Robert Parker", "150000"));
        result.put("86101624089", new SalaryResponse("86101624089", "Alain De Meter", "470000"));

    }

    public SalaryResponse retrieveSalaryInfo(String nationalNumber) {
        return result.get(nationalNumber);
    }
}
