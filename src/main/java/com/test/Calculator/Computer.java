package com.test.Calculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Computer {

    public String compute(String script1) {
        try {
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

            Object result = engine.eval(
                    "var greeting='hello world';" +
                            "print(greeting);" +
                            "greeting");

            System.out.println(result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }

        return "3";
    }
}
