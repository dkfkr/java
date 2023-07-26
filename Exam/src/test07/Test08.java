package test07;

interface IRunnable {public void run();}

interface IFlyable  {public void Fly();}

class FlyingCar implements IRunnable, IFlyable {

	@Override
	public void Fly() {
		System.out.println("Car fly!");
	}

	@Override
	public void run() {
		System.out.println("Car Run!");
	}
}

public class Test08 {
	
	public static void main(String[] args) {
		FlyingCar car = new FlyingCar();
		car.run();
		car.Fly();
	}
}
