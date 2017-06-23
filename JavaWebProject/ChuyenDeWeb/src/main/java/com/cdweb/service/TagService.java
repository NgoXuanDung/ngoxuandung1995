package com.cdweb.service;

import java.util.List;

import com.cdweb.domain.Tag;

public interface TagService {
	List<Tag> findAllApp();

	List<Tag> findAllAdmin();

	Tag findOne(int id);

	Tag findOne(String name);

	int count();

	void create(Tag tag);

	void update(Tag tag);

	void delete(Tag tag);
}
