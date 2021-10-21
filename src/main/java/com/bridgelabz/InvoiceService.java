package com.bridgelabz;

/**
 * Purpose  - Given distance and time, Invoice generator should return the total fare of the journey
 * @author  - Utkarsh Mishra
 * @version - 16.0
 * @since   - 2021-10-21
 */

public class InvoiceService {
    private static final double COST_PER_KM = 10;
    private static final double COST_PER_MIN = 1;
    private static final double MIN_FARE = 5.0;

    // Created a method to calculate the fare of journey
    public double CalculateFare(double distance, int time) {
        double totalFare = distance * COST_PER_KM + time * COST_PER_MIN;
        if (totalFare < MIN_FARE) {
            return MIN_FARE;
        }
        return totalFare;
    }
}