package com.example.cats_or_dogs2;
import java.util.ArrayList;

public class CatManager{

 ArrayList<CatModel> listOfCats;

        CatManager(){
        this.listOfCats = new ArrayList<>(6);
        listOfCats.add(new CatModel("Tom", R.drawable.black_kitten));
        listOfCats.add(new CatModel("Marigold", R.drawable.calico));
        listOfCats.add(new CatModel("Sampson", R.drawable.orange_cat));
        listOfCats.add(new CatModel("Blanche", R.drawable.white_kitten));
        listOfCats.add(new CatModel("Ralph", R.drawable.kitten1));
        listOfCats.add(new CatModel("Sully", R.drawable.sully_cat));

        }
        }

