package net.finmath.fouriermethod.products;

import java.util.Map;
import java.util.function.Function;

import net.finmath.exception.CalculationException;
import net.finmath.fouriermethod.CharacteristicFunctionInterface;
import net.finmath.fouriermethod.models.ProcessCharacteristicFunctionInterface;

/**
 * Base interface for all Fourier-based pricers.
 *
 * The particular feature is given by the method getValue, that returns a collection of prices.
 *
 * @author Alessandro Gnoatto
 *
 */
public interface SmileByIntegralTransform extends CharacteristicFunctionInterface{

	/**
	 * Return the maturity of the associated payoff.
	 *
	 * @return The maturity of the associated payoff.
	 */
	double getMaturity();

	/**
	 * Return the lower bound of the imaginary part of the domain where
	 * the characteristic function can be integrated.
	 *
	 * @return the lower bound of the imaginary part of the domain of integration.
	 */
	double getIntegrationDomainImagLowerBound();

	/**
	 * Return the upper bound of the imaginary part of the domain where
	 * the characteristic function can be integrated.
	 *
	 * @return the upper bound of the imaginary part of the domain of integration.
	 */
	double getIntegrationDomainImagUpperBound();

	/**
	 * Return the value of a family of options with the same maturity for different strikes.
	 *
	 * @param model The model against which the product should be values.
	 * @return The map of product values mapping from strike to value.
	 * @throws CalculationException Thrown if the valuation failed.
	 */
	Map<String, Function<Double,Double>> getValue(double evaluationTime, ProcessCharacteristicFunctionInterface model) throws CalculationException;

}
