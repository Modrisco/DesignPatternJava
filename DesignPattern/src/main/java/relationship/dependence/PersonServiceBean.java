package relationship.dependence;

/**
 * @author mlx
 * Dependence: 1) used in class
 *             2) class's member attribute
 *             3) claas's return type
 *             4) method's receive type
 *             5) used in method
 */
public class PersonServiceBean {
    private PersonDAO personDAO;

    public void save(Person person) {

    }

    public IDCard getIDCard(Integer personId) {
        return null;
    }

    public void modify() {
        Department department = new Department();
    }
}
