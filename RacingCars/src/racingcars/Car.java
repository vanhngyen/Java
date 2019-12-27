/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racingcars;

/**
 *
 * @author asus
 */
public class Car {

    private String name;
    private float Speed;
    private int x = 20;
    private int y = 20;

    /**
     * Get the value of y
     *
     * @return the value of y
     */
    public int getY() {
        return y;
    }

    /**
     * Set the value of y
     *
     * @param y new value of y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Get the value of x
     *
     * @return the value of x
     */
    public int getX() {
        return x;
    }

    /**
     * Set the value of x
     *
     * @param x new value of x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Get the value of Speed
     *
     * @return the value of Speed
     */
    public float getSpeed() {
        return Speed;
    }

    /**
     * Set the value of Speed
     *
     * @param Speed new value of Speed
     */
    public void setSpeed(float Speed) {
        this.Speed = Speed;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    private String Car3;

    /**
     * Get the value of Car3
     *
     * @return the value of Car3
     */
    public String getCar3() {
        return Car3;
    }

    /**
     * Set the value of Car3
     *
     * @param Car3 new value of Car3
     */
    public void setCar3(String Car3) {
        this.Car3 = Car3;
    }

    private String Car2;

    /**
     * Get the value of Car2
     *
     * @return the value of Car2
     */
    public String getCar2() {
        return Car2;
    }

    /**
     * Set the value of Car2
     *
     * @param Car2 new value of Car2
     */
    public void setCar2(String Car2) {
        this.Car2 = Car2;
    }

        private String Car1;

    /**
     * Get the value of Car1
     *
     * @return the value of Car1
     */
    public String getCar1() {
        return Car1;
    }

    /**
     * Set the value of Car1
     *
     * @param Car1 new value of Car1
     */
    public void setCar1(String Car1) {
        this.Car1 = Car1;
    }

    
    public Car(String name) {
        this.name = name;
    }

    public Car(String name, float Speed) {
        this.name = name;
        this.Speed = Speed;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", Speed=" + Speed + ", x=" + x + ", y=" + y + '}';
    }
    public static void main(String[] args) {
        Car a = new Car("car1");
        Car b = new Car("car2");
        Car c = new Car("car3");
        
        a.setSpeed((float) Math.random());
        b.setSpeed((float) Math.random());
        c.setSpeed((float) Math.random());
        
        System.out.println("Car1 :"+a.getSpeed()+"\nCar2 :"+b.getSpeed()+"\nCar3 :"+c.getSpeed());
        
        if(a.getSpeed()> b.getSpeed() && a.getSpeed()>c.getSpeed()){
            System.out.println("Car 1 win"+ a.toString());
        }else if(b.getSpeed() > a.getSpeed() && b.getSpeed() > c.getSpeed()){
            System.out.println("Car 2 win"+ b.toString());
        }else if(c.getSpeed() > b.getSpeed() && c.getSpeed() > a.getSpeed()){
            System.out.println("Car 3 win"+c.toString());
        }
    }
}
