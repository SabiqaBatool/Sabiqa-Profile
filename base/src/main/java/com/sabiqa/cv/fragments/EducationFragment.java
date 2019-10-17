package com.sabiqa.cv.fragments;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sabiqa.cv.adapters.EducationAdapter;
import com.sabiqa.cv.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class EducationFragment extends Fragment {

    public EducationFragment() {
        // Required empty public constructor
    }
    public static EducationFragment newInstance() {
        EducationFragment fragment = new EducationFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


            View view = inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewDemo1);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            String [] education = {"Bachelor in Computer Science (BSCS)", "Intermediate (Fsc Pre-Engineering)", "Matric"};
            String[] school = {"National University of Computer and Emerging Sciences", "District Public School","District Public School"};
            String[]   year = {"2015-2019", "2013-2015", "2011-2013"};
            int[] images = {R.drawable.fastlogo, R.drawable.dps, R.drawable.dps};
            recyclerView.setAdapter(new EducationAdapter(education,school,year,images));
            return view;

           }
}




