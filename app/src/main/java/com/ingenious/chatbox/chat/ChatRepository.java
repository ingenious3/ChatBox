package com.ingenious.chatbox.chat;

public interface ChatRepository {
    void sendMessage(String msg);
    void setReceiver(String receiver);

    void destroyChatListener();
    void subscribeForChatUpates();
    void unSubscribeForChatUpates();

    void changeUserConnectionStatus(boolean online);
}
