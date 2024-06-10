public class FilterWeb implements Filter {
    @Override
    public boolean userSelection (String string, UserType type) {

        if (type == UserType.ADMIN) {
            System.out.println("Доступ разрешен");
            return true;

        } else if (type == UserType.USER && useSite == UserType.USER.getString()) {
            System.out.println("Доступ разрешен для User");
            return true;

        } else
            return false;

    }


    }
}