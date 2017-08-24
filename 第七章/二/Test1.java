package ¶þ;

public class Test1 {
        public static void main(String[] args) {
			Vehicle v1 = new Vehicle();
			v1.setBrand("benz");v1.setColor("black");
			Car c1 = new Car();
			c1.setBrand("Honda");c1.setColor("ºì");
			c1.setLoader(2);c1.setSpeed(120);
			Car.run(args);
		}
}