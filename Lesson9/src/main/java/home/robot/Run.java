package home.robot;

import home.robot.hands.IHand;
import home.robot.hands.SamsungHand;
import home.robot.hands.SonyHand;
import home.robot.hands.ToshibaHand;
import home.robot.heads.IHead;
import home.robot.heads.SamsungHead;
import home.robot.heads.SonyHead;
import home.robot.heads.ToshibaHead;
import home.robot.legs.ILeg;
import home.robot.legs.SamsungLeg;
import home.robot.legs.SonyLeg;
import home.robot.legs.ToshibaLeg;

/**
 * Created by Егор on 31.10.2021.
 */

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        IHand samsungHand = new SamsungHand(150);
        IHand sonyHand = new SonyHand(200);
        IHand toshibaHand = new ToshibaHand(120);
        IHead samsungHead = new SamsungHead(200);
        IHead sonyHead = new SonyHead(120);
        IHead toshibaHead = new ToshibaHead(250);
        ILeg samsungLeg = new SamsungLeg(120);
        ILeg sonyLeg = new SonyLeg(130);
        ILeg toshibaLeg = new ToshibaLeg(140);

        Robot robot1 = new Robot(sonyHead, toshibaHand, samsungLeg);
        Robot robot2 = new Robot(toshibaHead, samsungHand, sonyLeg);
        Robot robot3 = new Robot(samsungHead, sonyHand, toshibaLeg);
        System.out.println("Робот №1: ");
        robot1.action();
        System.out.println("Стоимость -  " + robot1.getPrice());
        System.out.println();
        System.out.println("Робот №2: ");
        robot2.action();
        System.out.println("Стоимость -  " + robot2.getPrice());
        System.out.println();
        System.out.println("Робот №3: ");
        robot3.action();
        System.out.println("Стоимость -  " + robot3.getPrice());
        System.out.println();

        if (robot1.getPrice() >= robot2.getPrice() && robot1.getPrice() >= robot3.getPrice()) {
            System.out.println("Робот № 1 - самый дорогой");
        } else if (robot2.getPrice() >= robot1.getPrice() && robot2.getPrice() >= robot3.getPrice()) {
            System.out.println("Робот № 2 - самый дорогой");
        } else {
            System.out.println("Робот № 3 - самый дорогой");
        }
    }
}
