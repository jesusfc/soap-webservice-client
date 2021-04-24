package com.jesusfc.SoapWsClient.Controllers;

import com.jesusfc.SoapWsClient.Services.BLZServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created By Jesús Fdez. Caraballo on 2021.
 */
@Controller
public class MainController {

    private final BLZServiceImpl blzService;
    public MainController(BLZServiceImpl blzService) {
        this.blzService = blzService;
    }

    @RequestMapping(value = {"/","", "index.html"}, method = RequestMethod.GET)
    public String goToHomeView(Model model) {
        model.addAttribute("bankDetails", blzService.getBankInformation());
        return "index";
    }
}
