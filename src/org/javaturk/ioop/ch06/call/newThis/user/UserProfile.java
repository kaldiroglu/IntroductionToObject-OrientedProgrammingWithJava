package org.javaturk.ioop.ch06.call.newThis.user;

public class UserProfile {
    private final String username;
    private final String email;

    public UserProfile(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public UserProfile(String rawInput) {
        // 1. Logic BEFORE the this() call (The "Prologue")
        if (!rawInput.contains(":")) {
            throw new IllegalArgumentException("Format must be \"username:email\"");
        }

        int split = rawInput.indexOf(':');
        String name = rawInput.substring(0, split);
        String mail = rawInput.substring(split + 1);

        // 2. The explicit constructor call
        this(name, mail);

        // 3. Logic AFTER the this() call (The "Epilogue")
        System.out.println("Profile created for: " + name);
    }
}
