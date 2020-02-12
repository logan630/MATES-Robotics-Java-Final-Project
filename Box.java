 class Box {
  // INTRODUCING-POINTS P1 and P2!!!!!
  // ALWAYS MAKE YOUR CONSTRUCTOR PUBLIC
  public Box(int x1, int y1, int x2, int y2) {
    Point p1 = new Point(x1, y1);
    Point p2 = new Point(x2, y2);
  } 
  // Checks if a given point is located inside the box by comparing the x and y vaules of the point with the given boundaries
  public boolean contains(Point p) {
    int maxX, maxY, minX, minY;
    // defines the min x and max x
    if(p1.getX() > p2.getX()) {
      maxX = p1.getX();
      minX = p2.getX();
    }
    else {
      maxX = p2.getX();
      minX = p1.getX();
    } 
    // defines the min y and max y
    if(p1.getY() > p2.getY()){
      maxY = p1.getY();
      minY = p2.getY();
    }
    else {
      maxY = p2.getY();
      minY = p1.getY();
    } 
    return minX <= p.getX() && maxX >= p.getX() && minY <= p.getY() && maxY >= p.getY();
  }
  // Checks if a line intersects the box
  public boolean contains(Point lineP1, Point lineP2) {
    // Checks to see if point 2 intersects in a box
    contains(lineP2);
    int direction;
    // Checks what direction the line is going in
    // Checks if line is horizontal
    if(lineP1.getY() == lineP2.getY()) {
      direction = 1;
    } 
    // Checks if line is vertical
    else if(lineP1.getX() == lineP2.getX()) {
      direction = 2;
    }

    int maxX, maxY, minX, minY;
    // defines the min x and max x
    if(p1.getX() > p2.getX()) {
      maxX = p1.getX();
      minX = p2.getX();
    }
    else {
      maxX = p2.getX();
      minX = p1.getX();
    } 
    // defines the min y and max y
    if(p1.getY() > p2.getY()){
      maxY = p1.getY();
      minY = p2.getY();
    }
    else {
      maxY = p2.getY();
      minY = p1.getY();
    }

    // Checks if the line goes through the box, with both endpoints on the outside
    if (direction == 1) {
      return lineP2.getY() >= minY && lineP2.getY() <= maxY && ((lineP2.getX() >= maxX && lineP1.getX <= minX) ||(lineP2.getX <= minX && lineP1.getX <= maxX));
    }
    else if (direction == 2) {
      return lineP2.getX() >= minX && lineP2.getX() <= maxX && ((lineP2.getY() >= maxY && lineP1.getY <= minY) ||(lineP2.getY <= minY && lineP1.getY <= maxY));
    }
  }
}