package home.robot;

/**
 * Created by Егор on 31.10.2021.
 */

public interface IRobot {

    void action();

    /**
     * Get the cost of a robot
     *
     * @return int
     */
    int getPrice();
}