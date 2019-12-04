package org.imooc.controller.content;

import java.util.List;

import org.imooc.bean.Ad;
import org.imooc.bean.BaseBean;
import org.imooc.bean.Test;
import org.imooc.constant.PageCodeEnum;
import org.imooc.dto.AdDto;
import org.imooc.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ad")
public class AdController {
	
	@Autowired
	private AdService adService;
	
	//列表页面
	//如果没有也不为null,还真是的卧槽
	@RequestMapping("/initList")
	public String initList(Model model,AdDto daDto,Test t) {
		System.out.println(daDto.getPage());
		System.out.println(t);
		List<AdDto> ls = adService.searchByPage(daDto);
		model.addAttribute("list",ls);
		model.addAttribute("searchParam",daDto);
		return "/content/list";
	}
	
	
	//测试Ad参数怎么来的
		@RequestMapping("/initList2")
		public String initList2(BaseBean daDto) {
			System.out.println(daDto.getPage());
			//List<AdDto> ls = adService.searchByPage(daDto);
			//model.addAttribute("list",ls);
			//model.addAttribute("searchParam",daDto);
			return "/content/list";
		}
	
	//维护页面
	@RequestMapping("/initModify")
	public String initModify() { 
		return "/content/modify";
	}
	
	
	
	
	
	//广告新增
	@RequestMapping("/addPage")
	public String adAddUI() {
		
		return "/content/modify";
	}
	
		
	@RequestMapping("/add")
	public String adAdd(AdDto adDto,Model model) {
		
		if(adService.add(adDto)) {
			model.addAttribute(PageCodeEnum.KEY, PageCodeEnum.ADD_SUCCESS);
		}else {
			model.addAttribute(PageCodeEnum.KEY, PageCodeEnum.ADD_FAIL);
		}

		return "/content/modify";
	}
	
	
}