package com.sg.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sg.entities.Share;
import com.sg.service.ShareService;

@RestController
public class ShareResource {

	@Autowired
	private ShareService shareService;

	@GetMapping(path = "/shares/{shareId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Share getShareByIdResource(@PathVariable int shareId) {
		return shareService.getShareById(shareId);
	}

}
