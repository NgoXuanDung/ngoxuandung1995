package com.cdweb.dao;

import java.util.List;

import com.cdweb.domain.Question;

public interface QuestionDAO {
	List<Question> findAll();

	List<Question> findLast(int first, int max);

	List<Question> findTopViews(int first, int max);

	List<Question> findNoAnswers(int first, int max);

	List<Question> findAllByUser(int uid);

	List<Question> findAllByCategory(int cid);

	List<Question> findAllByCategory(int cid, int first, int max);

	List<Question> findAllByTag(String name);

	List<Question> findAllByTag(String name, int first, int max);

	List<Question> search(String q, int first, int max);

	Question findOne(int id);

	int count();

	void create(Question question);

	void upViews(int id);

	void delete(Question question);
}
