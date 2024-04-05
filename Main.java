class Main {
      public static void main( String[] args ) {
         Movie FastAndFurious= new Movie();
         FastAndFurious.setYear(2008);
         System.out.println(" This movie was made in " + FastAndFurious.getYear() + ".");
     }
//Kai was here :3
  public static class Movie {

    int year = 0;

    public Movie(){}

    public void setYear(int startYear){
      year = startYear;
    }

    public int getYear(){
      return year;
    }
  }
}
