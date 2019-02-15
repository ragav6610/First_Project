package com.niit.Culeskitback;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.niit.config.DBConfig;
import com.niit.model.User;
import com.niit.userdao.UserDAO;

/*public class UserMain {

	public void userOut()
	{
	 AbstractApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
   	 UserDAO userDAO = (UserDAO) context.getBean("userDAO");
   	 
       
       User user=new User();
       Scanner sc = new Scanner(System.in);
		
		System.out.println("Please select a category to do the manipulation");
		System.out.println("1.Add User /n 2.Delete User /n 3.Update User /n 4.View All Users /n 5.View Users by ID /n 6.View Users by Name");
		
		int choice = sc.nextInt();
		
		switch(choice){
		case 1:
			System.out.println("Please Enter the user details to enter");
			System.out.println("User ID:");

			user.setUserId(sc.nextInt());
			
			System.out.println("UserName:");

			user.setUserName(sc.next());
			
			System.out.println("UserLocation:");

			user.setUserLocation(sc.next());
			System.out.println("UserAge:");

			user.setUserAge(sc.nextInt());
			System.out.println("UserGender:");

			user.setUserGender(sc.next());
			System.out.println("Phone Number");
			
			user.setPhoneNumber(sc.next());
			System.out.println("Email");
			
			user.setEmail(sc.next());
			System.out.println("Password");
			
			user.setPassword(sc.next());
			
			boolean result1 = userDAO.addUser(user);
			if(result1 == true)
			{
				System.out.println("Details has been added successfully");
			}
			break;
		case 2:
			
			List<User> userList1 = userDAO.findAllUsers();
			for(User user1 : userList1)
			{
				System.out.print("| Id:"+user1.getUserId()+"|");
				System.out.print("Name:"+user1.getUserName()+"|");
				System.out.print("Age:"+user1.getUserAge()+"|");
				System.out.print("Location:"+user1.getUserLocation()+"|");
				System.out.print("Gender:"+user1.getUserGender()+"");
				System.out.print("PhoneNumber:"+user1.getPhoneNumber()+"");
				System.out.print("Email:"+user1.getEmail()+"");
				System.out.println("");

			}
			System.out.println("Please enter the UserId to be deleted from the above Table");
			int id = sc.nextInt();
			boolean result = userDAO.deleteUser(id);
			if(result == true)
			{
				System.out.println("The row has been successfuly deleted");
			}
			break;
		case 3:
			List<User> userList2 = userDAO.findAllUsers();
			for(User user2 : userList2)
			{
				System.out.print("| Id:"+user2.getUserId()+"|");
				System.out.print("Name:"+user2.getUserName()+"|");
				System.out.print("Age:"+user2.getUserAge()+"|");
				System.out.print("Location:"+user2.getUserLocation()+"|");
				System.out.print("Gender:"+user2.getUserGender()+"");
				System.out.print("PhoneNumber:"+user2.getPhoneNumber()+"");
				System.out.print("Email:"+user2.getEmail()+"|");
				System.out.println("");

			}
			System.out.println("Please Enter the userId");
			user.setUserId(sc.nextInt());
			System.out.println("Please Enter the user details for updation");
			
			System.out.println("UserName:");

			user.setUserName(sc.next());
			
			System.out.println("UserLocation:");

			user.setUserLocation(sc.next());
			System.out.println("UserAge:");

			user.setUserAge(sc.nextInt());
			System.out.println("UserGender:");

			user.setUserGender(sc.next());
			System.out.println("Phone Number");
		
			user.setPhoneNumber(sc.next());
			System.out.println("Email");
			
			user.setEmail(sc.next());
			System.out.println("Password");
			
			user.setPassword(sc.next());
			
			boolean result2 = userDAO.updateUser(user);
			if(result2 == true)
			{
				System.out.println("Details has been updated successfully");
			}
			break;
			
		case 4:
			List<User> userList4 = userDAO.findAllUsers();
			for(User user3 : userList4)
			{
				System.out.print("| Id:"+user3.getUserId()+"|");
				System.out.print("Name:"+user3.getUserName()+"|");
				System.out.print("Age:"+user3.getUserAge()+"|");
				System.out.print("Location:"+user3.getUserLocation()+"|");
				System.out.print("Gender:"+user3.getUserGender()+"|");
				System.out.print("PhoneNumber:"+user3.getPhoneNumber()+"");
				System.out.print("Email:"+user3.getEmail()+"|");
				System.out.println("");

			}
			break;
			
		case 5:
			System.out.println("Please enter the UserId to view User Details");
			int id2 = sc.nextInt();
			User user4 = userDAO.findUserById(id2);
			System.out.print("| Id:"+user4.getUserId()+"|");
			System.out.print("Name:"+user4.getUserName()+"|");
			System.out.print("Age:"+user4.getUserAge()+"|");
			System.out.print("Location:"+user4.getUserLocation()+"|");
			System.out.print("Gender:"+user4.getUserGender()+"|");
			System.out.print("PhoneNumber:"+user4.getPhoneNumber()+"");
			System.out.print("Email:"+user4.getEmail()+"|");
			break;
		case 6:
			System.out.println("Please enter the User Name to view User Details");
			String UserName = sc.next();
			User user5 = userDAO.findUserByName(UserName);
			System.out.print("| Id:"+user5.getUserId()+"|");
			System.out.print("Name:"+user5.getUserName()+"|");
			System.out.print("Age:"+user5.getUserAge()+"|");
			System.out.print("Location:"+user5.getUserLocation()+"|");
			System.out.print("Gender:"+user5.getUserGender()+"");
			System.out.print("PhoneNumber:"+user5.getPhoneNumber()+"");
			System.out.print("Email:"+user5.getEmail()+"|");
			break;
			
	 default: System.out.println("Please enter a valid input");
			
		}
		
		
		
		context.close();
		sc.close();
		
	}
}
*/