class Move{
  Square start;
  Square landing;
  int value;

  public Move(Square x, Square y, int value){
    start = x;
    landing = y;
    this.value = value;
  }

  public Move(Square start, Square landing) {
    this.start = start;
    this.landing = landing;
    value = 0;
  }

  public Move(){
    
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public Square getStart(){
    return start;
  }

  public Square getLanding(){
    return landing;
  }
}
