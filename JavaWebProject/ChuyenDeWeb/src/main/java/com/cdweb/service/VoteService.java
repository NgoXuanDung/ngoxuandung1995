package com.cdweb.service;

import com.cdweb.domain.Vote;

public interface VoteService {

	Vote findOne(int aid, int uid);

	void create(Vote vote);
	
}
