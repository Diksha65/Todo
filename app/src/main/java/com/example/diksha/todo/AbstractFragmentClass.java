package com.example.diksha.todo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by diksha on 11/11/18.
 */

abstract public class AbstractFragmentClass extends Fragment{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = FragmentView(inflater, container, savedInstanceState);
        return view;
    }

    public abstract View FragmentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);
}
