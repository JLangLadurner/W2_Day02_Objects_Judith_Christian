//A001: Create a class MovieTicket for a cineplex-like movie theater.

//This class holds following information:
//Price
//Date
//Time
//Movie
//cinema hall (1-10)

//Create four  MovieTicket objects and store them in properties.

//Create get and set methods accessing the movie ticket properties.

//Now, calculate and store in a variable the total price of all created MovieObjects. Discuss with the group.


public class Movie {

 double price;
 String date;
 String time;
 String movieName;
 int hall;

 public Movie (double price, String date, String time, String movieName, int hall) {
  this.price = price;
  this.date = date;
  this.time = time;
  this.movieName = movieName;
  this.hall = hall;
 }
  public void printAllData(){
   System.out.println("The price of the movie is "+this.price+ " on that date "+this.date+" at this time "+ this.time+". The name of the movie is "+ this.movieName+ " and it is played at hall "+ this.hall);
  }

 }

