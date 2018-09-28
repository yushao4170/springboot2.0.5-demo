package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xmasq_feiyu
 * @version 1.0.0
 */
@Slf4j
@Component
public class UserDetailService implements UserDetailsService {

	@Autowired
	private CommonPasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// UserDetails userDetails = new UserDetails() {
		//
		// private static final long serialVersionUID = 1L;
		//
		// @Override
		// public boolean isEnabled() {
		// return true;
		// }
		//
		// @Override
		// public boolean isCredentialsNonExpired() {
		// return true;
		// }
		//
		// @Override
		// public boolean isAccountNonLocked() {
		// return true;
		// }
		//
		// @Override
		// public boolean isAccountNonExpired() {
		// return true;
		// }
		//
		// @Override
		// public String getUsername() {
		// return username;
		// }
		//
		// @Override
		// public String getPassword() {
		// return passwordEncoder.encode("11");
		// }
		//
		// @Override
		// public Collection<? extends GrantedAuthority> getAuthorities() {
		// return AuthorityUtils.commaSeparatedStringToAuthorityList("123");
		// }
		// };
		//
		return new User(username, passwordEncoder.encode("11"),
				AuthorityUtils.commaSeparatedStringToAuthorityList("123"));

		// log.info(userDetails.getUsername());
		// log.info(userDetails.getAuthorities().toString());
		// return userDetails;
	}

}
