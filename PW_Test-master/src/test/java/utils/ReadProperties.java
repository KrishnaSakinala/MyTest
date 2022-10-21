package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadProperties {

    static Properties properties;
    static FileInputStream envFis;
    static FileInputStream qaFis;
    static FileInputStream devFis;

    public static Properties readProperties() throws Exception {
        properties = new Properties();
        envFis = new FileInputStream("src/test/resources/props/env.properties");
        qaFis = new FileInputStream("src/test/resources/props/qa.properties");
        devFis = new FileInputStream("src/test/resources/props/dev.properties");
        properties.load(envFis);

        if(properties.getProperty("environment").equalsIgnoreCase("qa")) {
            properties.load(qaFis);
        } else {
            properties.load(devFis);
        }
        return properties;
    }
}