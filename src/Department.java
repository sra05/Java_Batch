abstract class AbstractDepartment{

    public abstract int getDepartmentSize();
}
class SubDepartment extends Department {

    @Override
    public int getDepartmentSize() {

        return 25;
    }
}


public abstract class Department {

    public static void main(String[] args) {

        SubDepartment SubDepartment = new SubDepartment();
        int departmentSize = SubDepartment.getDepartmentSize();
        System.out.println("Department Size: " + departmentSize);
    }

    public abstract int getDepartmentSize();
}

