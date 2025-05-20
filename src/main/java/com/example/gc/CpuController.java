package com.example.gc;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CpuController {

    /**
     * This block is only for heavy CPU load testing purposes; there's no need to add any service layer.
     * @return String
     */
    @GetMapping("/burn")
    public String burnCpu() {
        List<byte[]> garbageList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            garbageList.add(new byte[5 * 1024 * 1024]);
        }
        garbageList.clear();
        return "Burned!";
    }
}