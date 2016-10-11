package com.prashil.masker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by prashil on 10/11/16.
 * Test
 */

@RestController
@RequestMapping("/masker")
public class PrashilMaskerController {
    @RequestMapping("v1/mask")
    void mask() {
        System.out.println("Masked Data");
    }
}
