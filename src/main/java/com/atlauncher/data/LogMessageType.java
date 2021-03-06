/**
 * Copyright 2013-2014 by ATLauncher and Contributors
 *
 * ATLauncher is licensed under CC BY-NC-ND 3.0 which allows others you to
 * share this software with others as long as you credit us by linking to our
 * website at http://www.atlauncher.com. You also cannot modify the application
 * in any way or make commercial use of this software.
 *
 * Link to license: http://creativecommons.org/licenses/by-nc-nd/3.0/
 */
package com.atlauncher.data;

public enum LogMessageType {

    error("EE2222"), warning("FFFF4C"), info("89c236");

    private final String code;

    LogMessageType(String code) {
        this.code = code;
    }

    public String getColourCode() {
        return this.code;
    }
    
    public String getType() {
        switch(this){
            case info:
            default:
                return "INFO";
            case warning:
                return "WARN";
            case error:
                return "ERROR";
            
        }
    }

}
