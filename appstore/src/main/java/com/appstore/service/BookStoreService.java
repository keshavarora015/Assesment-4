package com.appstore.service;

import com.appstore.dao.Book;
import com.appstore.dao.BookDao;
import com.appstore.dao.BookDaoImpl;



public class BookStoreService {
	//private Connection connection = null;
	private BookDao bookDao =new BookDaoImpl();
	public void persistObjectGraph(Book book) {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "password"); 
//			
//			PreparedStatement stmt = connection.prepareStatement("INSERT INTO PUBLISHER (CODE, PUBLISHER_NAME) VALUES (?, ?)");
//			stmt.setString(1, book.getPublisher().getCode());	
//			stmt.setString(2, book.getPublisher().getName());			
//			stmt.executeUpdate();
//			
//			stmt.close();
//			
//			stmt = connection.prepareStatement("INSERT INTO BOOK (ISBN, BOOK_NAME, PUBLISHER_CODE) VALUES (?, ?, ?)");
//			stmt.setString(1, book.getIsbn());	
//			stmt.setString(2, book.getName());
//			stmt.setString(3, book.getPublisher().getCode());
//			stmt.executeUpdate();
//			
//			stmt.close();
//			
//			stmt = connection.prepareStatement("INSERT INTO CHAPTER (BOOK_ISBN, CHAPTER_NUM, TITLE) VALUES (?, ?, ?)");
//			for(Chapter chapter: book.getChapters()) {
//				stmt.setString(1, book.getIsbn());
//				stmt.setInt(2, chapter.getChapterNumber());
//				stmt.setString(3, chapter.getTitle());
//				stmt.executeUpdate();
//			}
//					
//			stmt.close();			
//		} catch (ClassNotFoundException e) { e.printStackTrace(); } catch (SQLException e) { e.printStackTrace(); } 
//		finally { try { connection.close(); } catch (SQLException e) { e.printStackTrace(); } }
	bookDao.addBook(book);
	}
	
	public Book retrieveObjectGraph(String isbn) {
//		Book book = null;
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "password"); 
//			
//			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM BOOK, PUBLISHER WHERE BOOK.PUBLISHER_CODE = PUBLISHER.CODE AND BOOK.ISBN = ?");
//			stmt.setString(1, isbn);
//			
//			ResultSet rs = stmt.executeQuery();
//			
//			book = new Book();
//			if (rs.next()) {
//				book.setIsbn(rs.getString("ISBN"));
//				book.setName(rs.getString("BOOK_NAME"));
//				
//				Publisher publisher = new Publisher();
//				publisher.setCode(rs.getString("CODE"));
//				publisher.setName(rs.getString("PUBLISHER_NAME"));
//				book.setPublisher(publisher);
//			}
//			
//			rs.close();
//			stmt.close();
//			
//			List<Chapter> chapters = new ArrayList<Chapter>();
//			stmt = connection.prepareStatement("SELECT * FROM CHAPTER WHERE BOOK_ISBN = ?");
//			stmt.setString(1, isbn);
//			rs = stmt.executeQuery();
//			
//			while (rs.next()) {
//				Chapter chapter = new Chapter();
//				chapter.setTitle(rs.getString("TITLE"));
//				chapter.setChapterNumber(rs.getInt("CHAPTER_NUM"));		
//				chapters.add(chapter);
//			}
//			book.setChapters(chapters);
//			
//			rs.close();
//			stmt.close();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				connection.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			} 
//		}
//		return book;
		return bookDao.getBook(isbn);
	}

}




