package com.home.transport.air_transport;

import com.home.transport.Transport;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

/**
 * Created by Егор on 28.10.2021.
 */
@SuperBuilder
@Getter
public class Air extends Transport {
    private int wingspan;
    private int minRunwayength;

    protected String checkAvailability(boolean check) {
        String presence = check ? "Да" : "Нет";
        return presence;
    }
}

