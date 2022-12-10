import com.snow.pojo.Materials;
import com.snow.service.impl.MaterialsServiceImpl;

import java.util.List;

public class testMaterials {
    public static void main(String[] args) {
//        selectAll();
        selectLastId();
//        add();
//        delete();
//        update();
//        select();
//
        selectAll();
//        selectLastId();
//        add();
//        delete();
//        update();
//        select();
    }
    static void selectAll(){
        MaterialsServiceImpl materialsService = new MaterialsServiceImpl();
        List<Materials> materials = materialsService.selectAll();
        System.out.println(materials);
    }
    static void selectLastId(){
        MaterialsServiceImpl materialsService = new MaterialsServiceImpl();
        Integer lastId = materialsService.selectLastId();
        System.out.println(lastId);
    }

    static void add(){
        //add
        Materials materials = new Materials();
        materials.setMaterialsList("test");

        MaterialsServiceImpl materialsService = new MaterialsServiceImpl();
        materialsService.add(materials);

    }
    static void delete(){
        MaterialsServiceImpl materialsService = new MaterialsServiceImpl();
        materialsService.delete(2);
    }
    static void update(){
        MaterialsServiceImpl materialsService = new MaterialsServiceImpl();
        Materials materials = new Materials();
        materials.setMaterialsList("test_update");
        materials.setID(2);
        materialsService.update(materials);

    }
    static void select(){
        MaterialsServiceImpl materialsService = new MaterialsServiceImpl();
        Materials materials = materialsService.selectById(2);
        System.out.println(materials);
    }

}
