class Main {
  public static void main(String[] args) {
    DartBoard dartBoard = new DartBoard();
    double estimate;
    Dart dart = new Dart();
    for(int i=0;i<100;i++){
      dart.toss();
      dartBoard.registerDart(dart);
    }
    estimate = dartBoard.getHits()/dartBoard.getDarts();
    System.out.println("100: "+estimate);
    for(int x=0;x<300;x++){
      dart.toss();
      dartBoard.registerDart(dart);
    }
    estimate = dartBoard.getHits()/dartBoard.getDarts();
    System.out.println("400: "+estimate);
    for(int c=0;c<400;c++){
      dart.toss();
      dartBoard.registerDart(dart);
    }
    estimate = dartBoard.getHits()/dartBoard.getDarts();
    System.out.print("800: "+estimate);
  }
}