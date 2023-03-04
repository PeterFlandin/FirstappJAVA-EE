/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.directmedia.onlinestore.core;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

/**
 *
 * @author Administrateur
 */
public class Startup {

   
    public static void main(String[] args) {
        

       Work JhonWick = new Work("Jhon Wick");       
       Work Superman = new Work("Superman");
       Work AngryBirds = new Work("Angry Birds");
       
       
       Artist KeanuReevs = new Artist("Keanu Reevs");
       Artist HenryCalvin = new Artist("Henry Calvin");
       Artist oiseau = new Artist("oiseau");

       
       Superman.setMainArtist(HenryCalvin);
       JhonWick.setMainArtist(KeanuReevs);
       AngryBirds.setMainArtist(oiseau);
       
       
       Superman.setRelease(2013);
       JhonWick.setRelease(2023);
       AngryBirds.setRelease(2016);
       
       
       
       Catalogue.listOfWorks.add(Superman);
       Catalogue.listOfWorks.add(JhonWick);
       Catalogue.listOfWorks.add(AngryBirds);
       
       
       for (Work listOfWorks : Catalogue.listOfWorks ){
           System.out.println(listOfWorks.getTitle());
           
       }
       
    }
}
