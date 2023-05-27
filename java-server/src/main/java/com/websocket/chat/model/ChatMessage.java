package com.websocket.chat.model;
import java.util.Date;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class ChatMessage {
    private String nickname;
    private String content;
    private Date timestamp;

    // Constructors, getters, and setters
}