package com.skilldistillery.vst.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.vst.data.VSTDAO;
import com.skilldistillery.vst.entities.Softsynth;

@Controller
public class SoftSynthController {

	@Autowired
	private VSTDAO dao;
	
	@RequestMapping(path={"/", "home.do"})
	public String index(Model model) {
		//debug statement
		model.addAttribute("synth", dao.findById(1));
		return "index";
	}
	
	@RequestMapping(path="singleResult.do")
	public ModelAndView singleResult(@RequestParam("synthId")int synthId) {
		ModelAndView mv = new ModelAndView();
		
		Softsynth synth = dao.findById(synthId);
		
		List<Softsynth> synths = new ArrayList<>();
		
		if(synth == null) {
			synths = null;
		}
		else
			synths.add(synth);
		
		mv.addObject("synths", synths);
		mv.setViewName("searchResults");
		
		return mv;
	}
	
	@RequestMapping(path="multiResult.do")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		
		List<Softsynth> synths = dao.findAllSynths();
		
		if(synths.size() == 0) {
			synths = null;
		}
		
		mv.addObject("synths", synths);
		mv.setViewName("searchResults");
		return mv;
	}
	
	@RequestMapping(path="create.do", params={"name", "company", "price", "oscillators", "synthesisType", "hasSampler", "image", "userCreated"})
	public ModelAndView create(String name, String company, String price, String oscillators, String synthesisType, String hasSampler, String image, String userCreated) {
		ModelAndView mv = new ModelAndView();
		
		Softsynth synth = new Softsynth(name, company, Double.valueOf(price), Integer.valueOf(oscillators), synthesisType, Boolean.valueOf(hasSampler), image, Boolean.valueOf(userCreated));
		
		boolean updated = dao.addSynth(synth);
		
		mv.addObject("updated", updated);
		mv.setViewName("created");
		return mv;
	}
	
	@RequestMapping(path="createSynth.do")
	public ModelAndView createSynth() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("create");
		return mv;
	}
	
	@RequestMapping(path="updateView.do")
	public ModelAndView updateView(@RequestParam("synthId") int synthId) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("synth", dao.findById(synthId));
		mv.setViewName("update");
		return mv;
	}
	
	@RequestMapping(path="update.do", params={"id", "name", "company", "price", "oscillators", "synthesisType", "hasSampler"})
	public ModelAndView update(String id, String name, String company, String price, String oscillators, String synthesisType, String hasSampler) {
		ModelAndView mv = new ModelAndView();
		
		Softsynth synth = new Softsynth(Integer.valueOf(id), name, company, Double.valueOf(price), Integer.valueOf(oscillators), synthesisType, Boolean.valueOf(hasSampler));
		
		dao.updateSynth(synth);
		
		mv.setViewName("updated");
		return mv;
	}
	
	@RequestMapping(path="deleteView.do")
	public ModelAndView delete(@RequestParam("synthId")int synthId) {
		ModelAndView mv = new ModelAndView();
		
		dao.deleteSynth(synthId);
		
		mv.setViewName("deleted");
		return mv;
	}
	
	@RequestMapping(path="keywordSearch.do")
	public ModelAndView keywordSearch(@RequestParam("keyword")String keyword) {
		ModelAndView mv = new ModelAndView();
		
		List<Softsynth> synths = dao.searchByKeyword(keyword);
		
		if(synths.size() == 0) {
			synths = null;
		}
		
		
		mv.addObject("synths", synths);
		mv.setViewName("searchResults");
		return mv;
	}
}
