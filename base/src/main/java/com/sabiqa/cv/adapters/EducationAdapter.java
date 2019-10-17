package com.sabiqa.cv.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.sabiqa.cv.R;

public class EducationAdapter extends Adapter <EducationAdapter.ViewHolder> {
    private String[] description;
    private int[] images;
    private String[] title;
    private String[] year;

    public EducationAdapter(String[] strArr, String[] strArr2, String[] strArr3, int[] iArr) {
        this.title = strArr;
        this.description = strArr2;
        this.year = strArr3;
        this.images = iArr;
    }

    public class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        TextView description;
        ImageView img;
        TextView text;
        TextView year;

        public ViewHolder(@NonNull View view) {
            super(view);
            this.img = (ImageView) view.findViewById(R.id.imageView);
            this.text = (TextView) view.findViewById(R.id.textView5);
            this.year = (TextView) view.findViewById(R.id.textView8);
            this.description = (TextView) view.findViewById(R.id.textView7);
        }
    }

    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.education, viewGroup, false));
    }

    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.text.setText(this.title[i]);
        viewHolder.description.setText(this.description[i]);
        viewHolder.year.setText(this.year[i]);
        viewHolder.img.setImageResource(this.images[i]);
    }

    public int getItemCount() {
        return this.title.length;
    }
}
