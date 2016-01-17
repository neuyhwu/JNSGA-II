package org.skaggs.ec.population;

import org.skaggs.ec.multiobjective.population.FrontedPopulation;

/**
 * Created by Mitchell on 11/25/2015.
 * <p>
 * TODO Add stats about the frontedPopulation. Mean, min, max, standard deviation
 */
public class PopulationData<E> {
    private final FrontedPopulation<E> frontedPopulation;
    private final FrontedPopulation<E> truncatedPopulation;
    private final long elapsedTime;

    public PopulationData(FrontedPopulation<E> frontedPopulation, FrontedPopulation<E> truncatedPopulation, long elapsedTime) {
        this.frontedPopulation = frontedPopulation;
        this.truncatedPopulation = truncatedPopulation;
        this.elapsedTime = elapsedTime;
    }

    public FrontedPopulation<E> getFrontedPopulation() {
        return this.frontedPopulation;
    }

    public FrontedPopulation<E> getTruncatedPopulation() {
        return this.truncatedPopulation;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }
}
