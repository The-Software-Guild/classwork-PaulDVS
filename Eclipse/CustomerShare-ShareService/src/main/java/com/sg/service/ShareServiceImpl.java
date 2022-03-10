package com.sg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.entities.Share;
import com.sg.persistence.ShareDoa;

@Service
public class ShareServiceImpl implements ShareService {

	@Autowired
	private ShareDoa shareDoa;
	
	@Override
	public Share getShareById(int Id) {
		return shareDoa.getById(Id);
	}

}
