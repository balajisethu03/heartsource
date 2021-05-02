package com.zetcode.service;

import com.zetcode.bean.Heart;
import java.util.ArrayList;

public interface ICountryService {
    
    public ArrayList<Heart> findAll();
}