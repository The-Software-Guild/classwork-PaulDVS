package com.sg.object.creation;
/**
 *
 * @author Paul van Sittert
 */
public class ClassModeling {
    public class gpsHouse {
        double latitude;
        double longitube;
        
        public gpsHouse(double x, double y){
            this.latitude = x;
            this.longitube = y;
        }
        
        public String getLocation(){
            String location;
            
            location = ("The house is located " +this.latitude+ "* north and " +this.longitube+ "* south");
            
            return location;
        }
    }
    
    public class modelHouse {
        double length;
        double width;
        double height;
        
        public modelHouse(double x, double y, double z){
            this.length = x;
            this.height = y;
            this.height = z;
        }
        
        public void changeSizes(double x, double y, double z){
            this.length = x;
            this.height = y;
            this.height = z;
        }
        
        public double getArea(){
            double area;
            
            area = this.length*this.width*this.height;
            
            return area;
        }
        
    }
    
    public class trafficPlane {
        public String destination;
        private int heading;
        private int speed;
        private int height;
        
        public trafficPlane(String destination, int heading, int speed, int height){
            this.destination = destination;
            this.heading = heading;
            this.speed = speed;
            this.height = height;
        }
        
        public int getHeading(){
            return this.heading;
        }
        
        public int getSpeed(){
            return this.speed;
        }
        
        public int getHeight(){
            return this.height;
        }
    }
    
    public class gamePlane {
        int health;
        int heading;
        int speed;
        int height;
        
        public gamePlane(){
            this.health = 100;
        }
        
        public void damage(int damage){
            this.health -= damage;
        }
        
        public void speedChange(int change){
            this.speed += change;
        }
        
        public void heightChange(int change){
            this.height += change;
        }
        
    }
    
    
    
}
