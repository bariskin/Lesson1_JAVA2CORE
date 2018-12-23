package lesson1.obstacles;

import lesson1.Competitors.Competitor;

public class Course extends  Obstacle{

    private int height;
    private int distancerun;
    private int distanceswim;

   public  Course(int height,int distance, int distanceswim){
       this.height = height;
       this.distancerun = distance;
       this.distanceswim = distanceswim;

   }
    @Override
    public void doIt(Competitor competitor) {
       competitor.jump(height);
       competitor.run(distancerun);
       competitor.swim(distanceswim);



    }


}
