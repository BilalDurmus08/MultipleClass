  public class Fan {
          final int slow = 1;
          final int medium = 2;
          final int fast = 3;


                private int speed;
                private boolean on;
                private double radius;
                private String color;
                Fan (){
                        radius = 458.025;
                        speed = 1;
                        on = false;
                        color = "Blue";
                }


                public void setSpeed(int speed) {
                        this.speed = speed;
                }

                public void setOn(boolean on) {
                        this.on = on;
                }

                public void setRadius(double radius) {
                        this.radius = radius;
                }

                public void setColor(String color) {
                        this.color = color;
                }

                public int getSpeed() {
                        return speed;
                }

                public boolean isOn() {
                        return on;
                }

                public double getRadius() {
                        return radius;
                }

                public String getColor() {
                        return color;
                }

          public void toString(Fan inputFan){
                  String speedMethoddaki = null;
                  if (speed == 1){
                          speedMethoddaki = "Slow";
                  }
                  else if (speed == 2){
                          speedMethoddaki = "Medium";
                  }
                  else if (speed == 3){
                          speedMethoddaki = "Fast";
                  }

                  System.out.println("Speed: "+speedMethoddaki);
                  System.out.println("Radius: "+radius);
                  System.out.println("On: "+on);
                  System.out.println("Color: "+color);
          }

        }

