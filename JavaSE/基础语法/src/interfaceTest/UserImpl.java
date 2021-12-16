package interfaceTest;

public class UserImpl implements User{
    @Override
    public void addUser(String name) {
        System.out.println("add a user "+name);
    }

    @Override
    public void deleteUser(String name) {
        System.out.println("delete a user");
    }

    @Override
    public void editUser(String name) {
        System.out.println("edit a user");
    }

    @Override
    public void selectUser(String name) {
        System.out.println("select a user");
    }
}
