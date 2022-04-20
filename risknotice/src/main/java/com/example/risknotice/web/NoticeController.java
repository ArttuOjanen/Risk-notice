package com.example.risknotice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.risknotice.domain.Notice;
import com.example.risknotice.domain.NoticeRepository;

@Controller
public class NoticeController {
	
	@Autowired
	private NoticeRepository repository;
	
	@RequestMapping(value = {"/", "/noticelist"})
	public String noticeList(Model model) {
		model.addAttribute("notices", repository.findAll());
		return "noticelist";
	}
	
			@RequestMapping(value = "/add")
			public String addNotice(Model model) {
				model.addAttribute("notice", new Notice());
				return "addnotice";
			}
			
			@RequestMapping(value = "/save", method = RequestMethod.POST)
			public String save(Notice notice) {
				repository.save(notice);
				return "redirect:noticelist";
			}
			
			@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
			public String deleteNotice(@PathVariable("id") Long noticeId, Model model) {
				repository.deleteById(noticeId);
				return "redirect:../noticelist";
				
			}
			
			@RequestMapping(value ="/edit/{id}")
			public String editNotice(@PathVariable("id")Long noticeId, Model model) {
				model.addAttribute("notice", repository.findById(noticeId));
				return "editNotice";
			
			}
			
			@RequestMapping(value ="/login")
			public String login() {
				return "login";
			}

}
