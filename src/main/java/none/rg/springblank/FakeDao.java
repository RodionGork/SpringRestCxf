package none.rg.springblank;

import none.rg.springblank.models.Group;
import none.rg.springblank.models.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class FakeDao implements Dao {

    Map<Integer, Group> groups;
    Map<Integer, Product> products;

    public FakeDao() {
        groups = new HashMap<>();
        products = new HashMap<>();
        int lastId;
        lastId = addGroup("Grocery");
        addProduct("Bread", lastId);
        addProduct("Sugar", lastId);
        lastId = addGroup("Drinks");
        addProduct("Wine", lastId);
    }

    @Override
    public List<Group> getGroups() {
        return new ArrayList<>(groups.values());
    }

    @Override
    public List<Product> getProductsByGroupId(int groupId) {
        List<Product> list = new ArrayList<>();
        for (Product p : products.values()) {
            if (p.getGroupId() == groupId) {
                list.add(p);
            }
        }
        return list;
    }

    @Override
    public int addGroup(String name) {
        Group g = new Group();
        g.setId(groups.size() + 1);
        g.setName(name);
        groups.put(g.getId(), g);
        return g.getId();
    }

    @Override
    public int addProduct(String name, int groupId) {
        Product p = new Product();
        p.setId(products.size() + 1);
        p.setTitle(name);
        p.setGroupId(groupId);
        products.put(p.getId(), p);
        return p.getId();
    }
}
