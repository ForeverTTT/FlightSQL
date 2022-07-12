package com.example.flight_system.Mapper;

import org.apache.ibatis.annotations.*;
import com.example.flight_system.entity.Flight;
import java.util.List;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Mapper
public interface FlightMapper {
    @Select("SELECT * FROM flight_info")
    List<Flight> findAll();

    @Insert("INSERT into flight_info(flightname) VALUES (#{flightname})")
    int insert(Flight flight);

//    @Update("update flight_info set id = #{id},flightname = #{flightname})")
//    int update(Flight flight);

    @Delete("delete from flight_info where id = #{id}")
    Integer deleteById(Integer id);
//
//    @Delete("delete from flight_info where flightname = #{flightname}")
//    Integer deleteByName(String flightname);
}
