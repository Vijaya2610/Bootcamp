package casestudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.Book;
import com.Order;
import com.Payment;
import com.User;

public class CleanPracticeCaseStudy {

	public static void main(String[] args) {
		
		 User user1 = new User("1", "John");
	        User user2 = new User("2", "Alice");

	        Book book1 = new Book("101", "Introduction to Java", "John Doe", true);
	        Book book2 = new Book("102", "Clean Code", "Robert C. Martin", true);

	        List<Book> user1Books = new ArrayList<>();
	        user1Books.add(book1);

	        List<Book> user2Books = new ArrayList<>();
	        user2Books.add(book2);

	        Order order1 = new Order("A123", user1, user1Books);
	        Order order2 = new Order("B456", user2, user2Books);

	        Payment payment1 = new Payment("P111", 50.0);
	        Payment payment2 = new Payment("P222", 40.0);

	      
	        Map<String, User> usersMap = new HashMap<>();
	        usersMap.put(user1.getUserId(), user1);
	        usersMap.put(user2.getUserId(), user2);

	        List<Book> booksList = new ArrayList<>();
	        booksList.add(book1);
	        booksList.add(book2);

	        List<Order> ordersList = new ArrayList<>();
	        ordersList.add(order1);
	        ordersList.add(order2);

	        List<Payment> paymentsList = new ArrayList<>();
	        paymentsList.add(payment1);
	        paymentsList.add(payment2);
	    }
	}

}
