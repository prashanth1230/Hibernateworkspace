package com.banu.hibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class SpringBook 
{	
	public static void main(String[] args) 
	{
	ApplicationContext context=new  FileSystemXmlApplicationContext("src/com/banu/hibernate/spring-hibernate.xml");
		  //ApplicationContext context = new ClassPathXmlApplicationContext("com/banu/hibernate/spring-hibernate.xml");

	BookDAOImpl dao = (BookDAOImpl)context.getBean("myBookDao");
	dao.addObjects();
	List  bookList = dao.getBooks();
	for(int i=0; i< bookList.size(); i++)
	{
		Book book=(Book)bookList.get(i);
		System.out.println( book.getId() +"," + book.getTitle() +"," +  book.getArtist() 
				+ ", " + book.getCost()+ "," + book.getPurchaseDate());
	}
	/*Collection list=dao.loadProducts();
	Iterator iterate=list.iterator();
	while(iterate.hasNext())
	{
		Book book=(Book)iterate.next();
		System.out.println( book.getTitle() +"," +  book.getArtist() 
				+ ", " + book.getCost()+ "," + book.getPurchaseDate());
	}
		*/
	
	
	}

}
