package com.icia.secu.controller;

import com.icia.secu.dto.SecuDTO;
import com.icia.secu.service.SecuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecuController {

    @Autowired
    private SecuService svc;

    private ModelAndView mav = new ModelAndView();

    // 대체가능
    // @RequestMapping(value="/index", method = RequestMethod.GET)
    // @GetMapping("index")

    // @RequestMapping(value="/join", method = RequestMethod.POST)
    // @PostMapping("join")

    // 처음화면 실행
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    // 메인화면으로 이동
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index1() {
        return "index";
    }

    // 회원가입
    @RequestMapping(value="/join", method = RequestMethod.POST)
    public ModelAndView secuJoin(@ModelAttribute SecuDTO secu) {
        mav = svc.secuJoin(secu);
        return mav;
    }

    // 로그인
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public ModelAndView secuLogin(@ModelAttribute SecuDTO secu) {
        mav = svc.secuLogin(secu);
        return mav;
    }
    

}
