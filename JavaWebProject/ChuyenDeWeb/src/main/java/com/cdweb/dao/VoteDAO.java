package com.cdweb.dao;

import com.cdweb.domain.Vote;

public interface VoteDAO {

    Vote findOne(int aid, int uid);

    void create(Vote vote);

}
