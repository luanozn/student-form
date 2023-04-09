package com.ifgoiano.studentform.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ifgoiano.studentform.R;
import com.ifgoiano.studentform.entities.University;

import java.util.List;
import java.util.Set;
import java.util.zip.Inflater;

public class UniversityAdapter extends BaseAdapter {

    private final List<University> universities;
    private final LayoutInflater inflater;
    private final Context context;

    public UniversityAdapter(List<University> universities, Context context) {
        this.universities = universities;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return universities.size();
    }

    @Override
    public University getItem(int i) {
        return universities.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        University university = getItem(i);

        @SuppressLint({"ViewHolder", "InflateParams"})
        View rowView = inflater.inflate(R.layout.university_adapter, null, true);

        TextView text = rowView.findViewById(R.id.itemId);
        ImageView image = rowView.findViewById(R.id.campusImage);
        text.setText(university.getName());
        image.setImageResource(university.getLogo());

        return rowView;
    }

    public Context getContext() {
        return context;
    }
}
