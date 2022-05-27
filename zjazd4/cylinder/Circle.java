package zjazd4.cylinder;
public class Circle {
        protected double radius;
        protected String color="red";
        public Circle() { 
            this(1);
        }
    
        public Circle(double radius) { 
            this.radius=radius;
        }
    
        public double getRadius() {
            return this.radius;
        };
    
        public double getArea() {
            return Math.PI * this.radius * this.radius;
        }
    
        public void Info(String name) {
            System.out.println("The circle " + name + " has radius " + this.getRadius() + " and area of " + this.getArea());
        }
        public String toString() {
            System.out.println("Circle: radius = " + this.getArea());
            return "";
        }
    }
