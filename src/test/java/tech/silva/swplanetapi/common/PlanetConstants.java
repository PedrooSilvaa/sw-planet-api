package tech.silva.swplanetapi.common;

import tech.silva.swplanetapi.entity.Planet;

public class PlanetConstants {

    public static final Planet PLANET = new Planet("name", "climate", "terrain");
    public static final Planet INVALID_PLANET = new Planet("", "", "");

}
