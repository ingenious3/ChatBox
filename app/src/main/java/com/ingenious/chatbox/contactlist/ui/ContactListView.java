package com.ingenious.chatbox.contactlist.ui;

import com.ingenious.chatbox.contactlist.entities.User;

public interface ContactListView {
    void onContactAdded(User user);
    void onContactChanged(User user);
    void onContactRemoved(User user);
}
