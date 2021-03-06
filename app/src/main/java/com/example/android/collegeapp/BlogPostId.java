package com.example.android.collegeapp;

import androidx.annotation.NonNull;

import com.google.firebase.firestore.Exclude;

public class BlogPostId {
    @Exclude
    public String BlogPostId;

    public <T extends BlogPostId> T withID(@NonNull final String id) {
        this.BlogPostId = id;
        return (T) this;
    }
}
