package com.admusoft.user.navigation;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {


    Button buttonSecond,buttonfirst;
    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        buttonfirst = getView().findViewById(R.id.nav_second_fragment);
        buttonSecond=getView().findViewById(R.id.nav_third_fragment);

      buttonfirst.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_firstFragment2_to_secondFragement2));
        buttonSecond.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_firstFragment2_to_thirdFragment));
    }
}
