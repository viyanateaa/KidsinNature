package com.tensaii.kidsinnature;

/**
 * Created by Tensaii on 18/08/17.
 */
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalList extends ArrayAdapter<String>{


        private final Activity context;
        private final String[] animal;
        private final Integer[] imageId;
        AnimalList(Activity context,
                   String[] animal, Integer[] imageId) {
            super(context, R.layout.animal_list, animal);
            this.context = context;
            this.animal = animal;
            this.imageId = imageId;

        }

        @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.animal_list, null, true);
        TextView txtTitle = rowView.findViewById(R.id.txtTitle);
        ImageView imageView = rowView.findViewById(R.id.img);
        txtTitle.setText(animal[position]);
        imageView.setImageResource(imageId[position]);
        return rowView;

    }

}
