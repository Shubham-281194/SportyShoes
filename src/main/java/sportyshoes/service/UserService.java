package sportyshoes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sportyshoes.dao.UserDao;
import sportyshoes.model.Product;
import sportyshoes.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public int createUser(User user) {
		
		return this.userDao.saveUser(user);
	}
	
	@Autowired
	private UserDao useDao;
	public void createProduct(Product product) {
		
	this.useDao.createProduct(product);
	}
	
	
}