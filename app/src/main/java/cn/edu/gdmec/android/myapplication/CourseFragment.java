package cn.edu.gdmec.android.myapplication;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;


public class CourseFragment extends Fragment  {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_course, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

}