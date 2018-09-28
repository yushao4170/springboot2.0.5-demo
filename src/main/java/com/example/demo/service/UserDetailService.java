package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @author xmasq_feiyu
 * @version 1.0.0
 */
@Component
public class UserDetailService implements UserDetailsService {

	@Autowired
	private CommonPasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = new User(username, passwordEncoder.encode("11"),
				AuthorityUtils.commaSeparatedStringToAuthorityList("test"));
		return user;

	}

}
