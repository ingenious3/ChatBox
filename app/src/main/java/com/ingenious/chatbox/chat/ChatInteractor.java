package com.ingenious.chatbox.chat;

public interface ChatInteractor {
    void sendMessage(String msg);
    void setRecipient(String recipient);

    void destroyChatListener();
    void subscribeForChatUpates();
    void unSubscribeForChatUpates();
}
