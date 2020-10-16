package m1ex;

import java.util.logging.Logger;

public class S02 {
	private static final Logger LOG = Logger.getGlobal();

	/**
	 * Average speed
	 * 
	 * @param distance in meters
	 * @param time     in seconds
	 * @return speed in meters per second
	 */
	public static double speed(double distance, double time) {
		LOG.info(String.format("distance is %.3f and time is %.2f", distance, time));
		if (time < 0) {
			throw new IllegalArgumentException("No negative values expected");
		}
		return distance / time;
	}

	/**
	 * Distance between (x0, y0) and (x1, y1)
	 * 
	 * @param x0 first point x
	 * @param y0 first point y
	 * @param x  second point x
	 * @param y  second point y
	 * @return distance
	 */
	public static double distance(double x0, double y0, double x, double y) {
		return Math.sqrt(Math.pow(x - x0, 2) + Math.pow(y - y0, 2));
	}

	/**
	 * Engine capacity
	 * 
	 * @param bore   in mm
	 * @param stroke in mm
	 * @param nr     number of cylinders
	 * @return the engine capacity in cm^3
	 */
	public static double engineCapacity(double bore, double stroke, int nr) {
		return (Math.PI * Math.pow(bore / 2, 2) * stroke * nr) / 1000;
	}

	/**
	 * Add up all the digits in an integer
	 * 
	 * @param value
	 * @return sum of digits
	 */
	public static int digitSum(int value) {
		int sum = 0;
		
		value = Math.abs(value);
		
		while (value > 0) {
			sum += value % 10;
			value /= 10;
		}
		return sum;
	}

	/**
	 * Score based on distance from (0, 0) [1, 5, 10] -> [10, 5, 1, 0]
	 *
	 * @param x
	 * @param y
	 *
	 * @return
	 */
	public static int score(double x, double y) {
		int result = 0;
		double dist = S02.distance(0, 0, x, y);
		if (dist <= 1)
			return 10;
		else if (dist <= 5)
			return 5;
		else if (dist <= 10)
			return 1;
		else return 0;
	}

}
