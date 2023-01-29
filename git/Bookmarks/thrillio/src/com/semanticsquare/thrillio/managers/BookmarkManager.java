package com.semanticsquare.thrillio.managers;

import com.semanticsquare.thrillio.dao.BookmarkDao;
import com.semanticsquare.thrillio.entities.Book;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.Movie;
import com.semanticsquare.thrillio.entities.WebLink;

public class BookmarkManager {

	private static BookmarkManager instance = new BookmarkManager();
	private static BookmarkDao dao= new BookmarkDao();

	private BookmarkManager() {

	}

	public static BookmarkManager getInstance() {
		
		
		return instance;
	}

	public Movie createMovies(long id,String title,String profileUrl,int realeseYear,String[]cast,String[] directors,String genre,double imdbRating ) {
		Movie movie = new Movie();
		movie.setId(id);
		movie.setTitle(title);
		movie.setProfileUrl(profileUrl);
		movie.setReleaseYear(realeseYear);
		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setGenre(genre);
		movie.setImdbRating(imdbRating);
		
		return movie;
	}
	
	public Book createBooks(long id,String title,int publicationYear,String publisher,String [] authors,String genre,double amazonRating) {
		
		Book book = new Book();
		book.setId(id);
		book.setTitle(title);
		book.setPublicationYear(publicationYear);
		book.setPublisher(publisher);
		book.setAuthors(authors);
		book.setGenre(genre);
		book.setAmazonRating(amazonRating);
		
		return book;
	}
	
		
	

	public WebLink createWebLink(long id,String title,String profileUrl,String url,String host) { 
		WebLink weblink = new WebLink();
				weblink.setId(id);
				weblink.setTitle(title);
				weblink.setProfileUrl(profileUrl);
				weblink.setHost(host);
				
				
				
				
				return weblink;
				
				
	}
	
	public Bookmark[][]getBookmarks(){
		return dao.getBookmarks();
	}
		
	}
	
	
	
	

