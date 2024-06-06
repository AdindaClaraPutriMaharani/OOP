package com.example.libraryweb.controller;

import com.example.libraryweb.model.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/members")
public class MemberController {

    private List<Member> memberList = new ArrayList<>();

    @GetMapping("/list")
    public String listMembers(Model model) {
        model.addAttribute("members", memberList);
        return "member-list";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("member", new Member());
        return "member-register";
    }

    @PostMapping("/register")
    public String registerMember(Member member) {
        memberList.add(member);
        return "redirect:/members/list";
    }
}
