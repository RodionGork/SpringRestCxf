package none.rg.springblank;

import none.rg.springblank.models.Group;
import none.rg.springblank.models.Product;

import java.util.List;

public interface Dao {

    public List<Group> getGroups();
    public List<Product> getProductsByGroupId(int groupId);

}
