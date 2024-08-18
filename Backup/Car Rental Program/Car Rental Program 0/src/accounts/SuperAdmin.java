package accounts;

public class SuperAdmin extends Admin {
    private static String companyName = "";

    public static String getCompanyName() {
        return companyName;
    }
    public static void setCompanyName(String newCompanyName) {
        companyName = newCompanyName;
    }
    public void createAdminAccount() {}
    public void removeAdminAccount() {}
    public void removeUserAccount() {}
    public void listAllAdmins() {}
}
