package main.java.com.lldquestions.loggerDesign;

import main.java.com.lldquestions.loggerDesign.interfaces.LogProcessor;
import main.java.com.lldquestions.loggerDesign.processors.DebugLogProcessor;
import main.java.com.lldquestions.loggerDesign.processors.ErrorLogProcessor;
import main.java.com.lldquestions.loggerDesign.processors.InfoLogProcessor;

public class LoggerSystem {
    public void run(){
        LogProcessor logProcessor = new InfoLogProcessor(
                                        new DebugLogProcessor(
                                            new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.INFO, "print some info");
        logProcessor.log(LogProcessor.DEBUG, "debugging some info");
        logProcessor.log(LogProcessor.ERROR, "print some error");
    }
}
