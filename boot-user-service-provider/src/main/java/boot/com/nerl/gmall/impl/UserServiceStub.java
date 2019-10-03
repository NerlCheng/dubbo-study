package boot.com.nerl.gmall.impl;

import com.nerl.gmall.bean.UserAddress;
import com.nerl.gmall.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserServiceStub implements UserService {
	
//	private final UserService userService;
	

	/**
	 * 传入的是userService远程的代理对象
//	 * @param userService
	 */
//	public UserServiceStub(UserService userService) {
//		super();
//		this.userService = userService;
//	}



	public List<UserAddress> getUserAddressList(String userId) {
		// TODO Auto-generated method stub
		System.out.println("UserServiceStub.....");
//		if(!StringUtils.isEmpty(userId)) {
//			return userService.getUserAddressList(userId);
//		}
		return null;
	}

}
