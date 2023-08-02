package casestudy;

import java.util.List;

import com.Book;
import com.User;

public class Order {
	 private String orderId;
	    private User user;
	    private List<Book> books;

	    public Order(String orderId, User user, List<Book> books) {
	        this.orderId = orderId;
	        this.user = user;
	        this.books = books;
	    }
}
