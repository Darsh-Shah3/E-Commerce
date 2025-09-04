package e_commerce.user_service.enums;

public enum UserRole {
    CUSTOMER("Customer - Can browse and purchase products"),
    ADMIN("Administrator - Full system access"),
    SELLER("Seller - Can manage products"),
    MODERATOR("Moderator - Can manage users and content");

    private final String description;

    UserRole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
