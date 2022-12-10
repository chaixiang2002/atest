import com.snow.pojo.Site;
import com.snow.service.impl.SiteServiceImpl;

import java.util.List;

public class testSite {
    private static SiteServiceImpl siteService = new SiteServiceImpl();

    public static void main(String[] args) {
        selectAll();
        selectLastId();
        add();
        delete();
        update();
        selectById();
        selectByUsername();

//        selectAll();
//        selectLastId();
//        add();
//        delete();
//        update();
//        selectById();
//        selectByUsername();
    }
    static void selectAll(){
        List<Site> sites = siteService.selectAll();
        System.out.println(sites);
    }
    static void selectLastId(){
        Integer lastId = siteService.selectLastId();
        System.out.println(lastId);
    }

    static void add(){
        //add
        Site site = new Site();
        site.setApplicantSite("tets");
        site.setBorrower("cx2313");

        siteService.add(site);
        Site site1 = siteService.selectById(siteService.selectLastId());

        if(site1.equalsNoID(site)){
            System.out.println("yes");
        }else {
            System.out.println("No");
            System.out.println(site);
            System.out.println(site1);
        }


        String a="asd";
        String b="asd";
        System.out.println(a.equals(b));
    }
    static void delete(){
        siteService.delete(1);
    }
    static void update(){
        Site site = new Site();
        site.setApplicantSite("tets update");
        site.setBorrower("cx2222");

        site.setID(1);

        siteService.update(site);

    }
    static void selectById(){
        Site site = siteService.selectById(1);
        System.out.println(site);
    }

    static void selectByUsername(){
        List<Site> site = siteService.selectByUsername("2");
        System.out.println(site);
    }
}
