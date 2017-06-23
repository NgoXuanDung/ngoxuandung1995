package com.cdweb.dao;

import com.cdweb.domain.Role;

public interface RoleDAO {
	Role findOne(String name);
}
