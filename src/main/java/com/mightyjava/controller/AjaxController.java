package com.mightyjava.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mightyjava.model.BlogDTO;
import com.mightyjava.model.Category;
import com.mightyjava.model.User;
import com.mightyjava.model.Video;
import com.mightyjava.model.VideoDTO;
import com.mightyjava.service.HelperService;
import com.mightyjava.service.UserService;

@RestController
@RequestMapping("/datatable")
public class AjaxController {
	
	@Autowired
	private HelperService<Video> videoService;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/blogs" ,method = RequestMethod.GET, produces = "application/json")
	public List<BlogDTO> getBlogRecords(){
		List<User> users = userService.list();
		List<BlogDTO> dtolist = new ArrayList<BlogDTO>();
		users.forEach(user -> {
			BlogDTO dto =new BlogDTO();
			BeanUtils.copyProperties(user, dto);
			dtolist.add(dto);
		});
		List<Video> videolist = videoService.list();
		dtolist.forEach(userdto -> {
			List<VideoDTO> videolistdto = userdto.getVideolist();
			if(videolistdto == null) {
				videolistdto = new ArrayList<VideoDTO>();
			}
			for(Video video:videolist) {
				videolistdto.add(new VideoDTO(video.getId(), video.getTitle()));
			}
			userdto.setVideolist(videolistdto);
		});

		return dtolist;
	}
}


