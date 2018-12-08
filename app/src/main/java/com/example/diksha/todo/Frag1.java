package com.example.diksha.todo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by diksha on 11/11/18.
 */

public class Frag1 extends AbstractFragmentClass {

    private TextView textView;

    @Override
    public View FragmentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        textView = view.findViewById(R.id.textmessage);
        textView.setText("One");
        return view;
    }


}
