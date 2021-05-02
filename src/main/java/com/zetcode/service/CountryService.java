package com.zetcode.service;

import com.opencsv.CSVReader;
import com.zetcode.bean.Heart;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

@Service
public class CountryService implements ICountryService {

    private final ArrayList<Heart> heartdata;

    public CountryService() {

    	heartdata = new ArrayList();
    }

    @Override
    public ArrayList<Heart> findAll() {

        FileInputStream fis = null;

        try {

            String fileName = "C:/Mother/Balaji/workspace/heart/src/main/resources/heart.csv";

            fis = new FileInputStream(new File(fileName));
            CSVReader reader = new CSVReader(new InputStreamReader(fis));
            String[] nextLine;
            reader.readNext();
            
            while ((nextLine = reader.readNext()) != null) {

                Heart newCountry = new Heart(nextLine[0],
                        nextLine[1], nextLine[2],nextLine[3],nextLine[4],nextLine[5],nextLine[6],
                        		nextLine[7],nextLine[8],nextLine[9],nextLine[10],nextLine[11],
                        		nextLine[12],nextLine[13]);
                heartdata.add(newCountry);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CountryService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CountryService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(CountryService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return heartdata;
    }
}