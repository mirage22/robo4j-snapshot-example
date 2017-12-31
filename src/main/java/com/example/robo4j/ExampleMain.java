package com.example.robo4j;

import com.robo4j.RoboBuilder;
import com.robo4j.RoboContext;
import com.robo4j.util.SystemUtil;

import java.io.InputStream;

/**
 * Simple Robo4J context initiation example
 *
 * note: example is using SNAPSHOT version
 *
 * @author Marcus Hirt (@hirt)
 * @author Miroslav Wengner (@miragemiko)
 */
public class ExampleMain {

    public static void main(String[] args) throws Exception {

        InputStream roboSystemConfiguration =  Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("robo4j.xml");

        RoboContext system = new RoboBuilder()
                .add(roboSystemConfiguration)
                .build();

        System.out.println("State before start:");
        System.out.println(SystemUtil.printStateReport(system));
        system.start();
        System.out.println("State after start:");
        System.out.println(SystemUtil.printStateReport(system));

        System.out.println("Press enter to quit!");
        System.in.read();
        system.shutdown();
    }
}
