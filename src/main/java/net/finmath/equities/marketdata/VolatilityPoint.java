package net.finmath.equities.marketdata;

import java.time.LocalDate;

/**
 * Class to store and handle volatility market quote.
 * 
 * @author Andreas Grotz
 */

public class VolatilityPoint {
	
	public final LocalDate date;
	public final double strike;
	public final double volatility;
	
	public VolatilityPoint(
		final LocalDate date,
		final double strike,
		final double volatility) 
	{
		this.date = date;
		this.strike = strike;
		this.volatility = volatility;
	};
	
	public LocalDate getDate() {
		return date;
	}
	
	public double getStrike() {
		return strike;
	}
	
	public double getVolatility() {
		return volatility;
	}
	
}