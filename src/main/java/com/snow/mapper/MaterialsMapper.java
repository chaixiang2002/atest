package com.snow.mapper;

import com.snow.pojo.Materials;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface MaterialsMapper {
    @Select("select * from my_IT_system.AAS.Materials")
    List<Materials> selectAll();
    
    @Select("select Max(ID) from my_IT_system.AAS.Materials")
    Integer selectLastId();

    @Insert("insert into my_IT_system.AAS.Materials values (#{MaterialsList},#{Borrower},#{time},#{BorrowingPurposes})")
    void add(Materials materials);

    @Delete("delete my_IT_system.AAS.Materials where ID=#{ID}")
    void delete(Integer id);

    @Update("update my_IT_system.AAS.Materials set MaterialsList=#{MaterialsList},Borrower=#{Borrower},time=#{time},BorrowingPurposes=#{BorrowingPurposes} where ID=#{ID}")
    void update(Materials materials);
//    void update(Integer id,Materials materials);

    @Select("select * from my_IT_system.AAS.Materials where ID=#{ID}")
    Materials selectById(Integer ID);
}
