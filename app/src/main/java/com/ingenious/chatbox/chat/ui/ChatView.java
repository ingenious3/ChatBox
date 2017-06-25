package com.ingenious.chatbox.chat.ui;

import com.ingenious.chatbox.chat.entities.ChatMessage;

public interface ChatView {
    void sendMessage();
    void onMessageReceived(ChatMessage msg);
}
