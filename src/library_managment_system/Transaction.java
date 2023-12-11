package library_managment_system;
import java.time.LocalDate;

public class Transaction {
	

	    private static int nextTransactionId = 1;

	    private int transactionId;
	    private int bookId;
	    private int userId;
	    private LocalDate checkOutDate;
	    private LocalDate returnDate;

	    // Constructors

	    Transaction(int bookId, int userId)
	    {
	        this.transactionId = nextTransactionId++;
	        this.bookId = bookId;
	        this.userId = userId;
	        this.checkOutDate = LocalDate.now(); 
	        this.returnDate = checkOutDate.plusWeeks(2); 
	    }
	    
	    Transaction()
	    {
	        
	    }

	    // Getters

	    public int getTransactionId()
	    {
	        return transactionId;
	    }

	    public int getBookId()
	    {
	        return bookId;
	    }

	    public int getUserId()
	    {
	        return userId;
	    }

	    public LocalDate getCheckOutDate() 
	    {
	        return checkOutDate;
	    }

	    public LocalDate getReturnDate() 
	    {
	        return returnDate;
	    }

	    // Setters

	    public void setBookId(int bookId)
	    {
	        this.bookId = bookId;
	    }

	    public void setUserId(int userId)
	    {
	        this.userId = userId;
	    }

	    public void setReturnDate(LocalDate returnDate)
	    {
	        this.returnDate = returnDate;
	    }
	    
	    

	    
	}



