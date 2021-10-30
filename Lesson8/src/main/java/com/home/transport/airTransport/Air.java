package com.home.transport.airTransport;

import com.home.transport.Transport;
import lombok.experimental.SuperBuilder;

/**
 * Created by Егор on 28.10.2021.
 */
@SuperBuilder
public class Air extends Transport {
    private int wingspan;
    private int minRunwayength;

    protected int getWingspan() {
        return wingspan;
    }

    protected int getMinRunwayength() {
        return minRunwayength;
    }

    protected String checkAvailability(boolean check) {
        String presence;
        if (check) {
            presence = "Да";
        } else {
            presence = "Нет";
        }
        return presence;
    }
}

