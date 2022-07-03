package com.test.Calculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Computer {

    public String compute(String script) {
        try {
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
             Object result = engine.eval(script);
            return result.toString();
        } catch (ScriptException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
