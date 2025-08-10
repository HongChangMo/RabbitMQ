package com.rabbitmq.hellomessagequeue.step2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WorkQueueController {
    private final WorkQueueProducer workQueueProducer;

    public WorkQueueController(WorkQueueProducer workQueueProducer) {
        this.workQueueProducer = workQueueProducer;
    }

    @PostMapping("/workQueue")
    public String workQueue(@RequestParam String message, @RequestParam int duration) {
        workQueueProducer.sendWorkQueue(message, duration);
        return "work queue sent = " + message + ", (" + duration + ")";
        /*
        curl -X POST "http://localhost:8080/api/workQueue?message=Task1&duration=2000"
        curl -X POST "http://localhost:8080/api/workQueue?message=Task2&duration=4000"
        curl -X POST "http://localhost:8080/api/workQueue?message=Task3&duration=5000"
        */
    }
}
