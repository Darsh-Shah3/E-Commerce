package e_commerce.user_service.enums;

public enum UserStatus {
    ACTIVE("Active user account"),
    INACTIVE("Inactive user account"),
    SUSPENDED("Suspended user account"),
    BANNED("Banned user account"),
    PENDING_VERIFICATION("Pending email verification");

    private final String description;

    UserStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}