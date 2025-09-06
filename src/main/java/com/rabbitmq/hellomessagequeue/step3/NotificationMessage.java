package com.rabbitmq.hellomessagequeue.step3;

public class NotificationMessage {
    private String message;

    // Jackson이 역직렬화 대상 클래스의 객체를 찾음 -> 객체를 생성(생성시 기본 생성자 호출 new NotificationMessage(); // 없으면 error 발생)
    public NotificationMessage() {
    }

    public NotificationMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
