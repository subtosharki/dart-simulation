class DartBoard{
  double dartThrown;
  double dartHit;
  public DartBoard(){
    dartThrown = 0;
    dartHit = 0;
  }
  public void registerDart(Dart d){
    dartThrown++;
    double dx = (d.getX()-.5);
    double dy = (d.getY()-.5);
    dx = dx*dx;
    dy=dy*dy;
    double sqrt = dx+dy;
    double distance = Math.sqrt(sqrt);
    if(distance<.5)
      dartHit++;
  }
  public double getDarts(){
    return dartThrown;
  }
  public double getHits(){
    return dartHit;
  }
}