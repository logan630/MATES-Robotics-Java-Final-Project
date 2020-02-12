class Point{
  private int x;
  private int y;
  
  // Makes the Point set parameters 
  Point(int x, int y){
    this.x = x;
    this.y = y;
  }
  // set the y value
  public void setY(int y){ 
    this.y = y;
  }
  // set the x value
  public void setX(int x){ 
    this.x = x;
  }
  // get the y value
  public int getY(){ 
    return y;
  }
  // get the x value
  public int getX(){
    return x;
  }
  // print out the object ex: (x, y)
  public String toString(){
    return "(" + x + ", " + y + ")";
  }

}