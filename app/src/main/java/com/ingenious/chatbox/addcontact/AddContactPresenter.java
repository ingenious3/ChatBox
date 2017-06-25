package com.ingenious.chatbox.addcontact;

import com.ingenious.chatbox.addcontact.events.AddContactEvent;

public interface AddContactPresenter {
    void onShow();
    void onDestroy();

    void addContact(String email);
    void onEventMainThread(AddContactEvent event);
}

