package com.builder.pseudocode.builders;

import com.builder.pseudocode.cars.CarType;
import com.builder.pseudocode.components.Engine;
import com.builder.pseudocode.components.GPSNavigator;
import com.builder.pseudocode.components.Transmission;
import com.builder.pseudocode.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
