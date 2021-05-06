class Dart {
  double x;
  double y;
  public Dart()
  {
    x=0;
    y=0;
  }
  public void toss() {
    x = Math.random();
    y = Math.random();
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
}