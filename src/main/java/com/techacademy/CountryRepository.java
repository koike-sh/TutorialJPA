package com.techacademy;

import org.springframework.data.jpa.repository.JpaRepository;

//データストアにアクセスしてデータ操作を行なうための手段を提供
public interface CountryRepository extends JpaRepository<Country, String> {

}