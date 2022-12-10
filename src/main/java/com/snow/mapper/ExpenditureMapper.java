package com.snow.mapper;

import com.snow.pojo.Expenditure;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ExpenditureMapper {

    @Insert("insert into my_IT_system.AAS.Expenditure values (#{TotalMoney},null,#{ShoppingList},#{Application},#{SubmitTime},null)")
    void add(Expenditure expenditure);

    @Delete("delete my_IT_system.AAS.Expenditure where ID=#{id}")
    void delete(Integer id);

    @Update("update my_IT_system.AAS.Expenditure " +
            "set TotalMoney=#{TotalMoney},Auditor=#{Auditor},ShoppingList=#{ShoppingList},Application=#{Application},SubmitTime=#{SubmitTime},state=#{state} " +
            "where ID=#{ID}")
    void update(Expenditure expenditure);

    @Select("select * from my_IT_system.AAS.Expenditure")
    List<Expenditure> selectAll();

    @Select("select * from my_IT_system.AAS.Expenditure where ID=#{id}")
    Expenditure selectById(Integer id);

    @Select("select Max(ID) from my_IT_system.AAS.Expenditure")
    Integer selectLastId();
}
