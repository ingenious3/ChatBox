package com.ingenious.chatbox.contactlist.ui;

import com.ingenious.chatbox.contactlist.entities.User;

public interface OnItemClickListener {
    void onItemClick(User user);
    void onItemLongClick(User user);
}
