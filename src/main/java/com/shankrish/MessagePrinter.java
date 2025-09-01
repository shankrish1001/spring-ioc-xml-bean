package com.shankrish;

import java.util.logging.Logger;

public class MessagePrinter {

    private MessageService service;
    private static final Logger logger = Logger.getLogger(MessagePrinter.class.getName());

    // Setter injection
    public void setService(MessageService service) {
        this.service = service;
    }

    public void printMessage() {

        logger.info(this.service.getMessage());

    }
}
