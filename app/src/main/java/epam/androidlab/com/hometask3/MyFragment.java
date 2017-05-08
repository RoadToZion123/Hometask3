package epam.androidlab.com.hometask3;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.style.BackgroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.Random;

public class MyFragment extends Fragment  {
    final static String TAG = "myLogs";
    final Random random = new Random();

    Button btnColor1, btnColor2, btnColor3;

    int cnt = 0;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach: запущен");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: запущен");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_my, container, false);

        final Button btnColor1 = (Button) rootView.findViewById(R.id.btnColor1);
        final Button btnColor2 = (Button) rootView.findViewById(R.id.btnColor2);
        final Button btnColor3 = (Button) rootView.findViewById(R.id.btnColor3);
        btnColor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] colors = getResources().getIntArray(R.array.colors);
                int pos = random.nextInt(colors.length);
                btnColor1.setBackgroundColor(colors[pos]);
            }
        });
        btnColor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] colors = getResources().getIntArray(R.array.colors);
                int pos = random.nextInt(colors.length);
                btnColor2.setBackgroundColor(colors[pos]);
            }
        });
        btnColor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] colors = getResources().getIntArray(R.array.colors);
                int pos = random.nextInt(colors.length);
                btnColor3.setBackgroundColor(colors[pos]);
            }
        });

        Log.d(TAG, "onCreateView: запущен");

        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated: запущен");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: запущен");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: запущен");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }


    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: запущен");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: запущен");
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView: запущен");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: запущен");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach: запущен");
    }

    /*@Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnColor1:
                int[] colors = getResources().getIntArray(R.array.colors);
                int pos = random.nextInt(colors.length);
                btnColor1.setBackgroundColor(colors[pos]);
            case R.id.btnColor2:
                break;
            case R.id.btnColor3:
                break;
        }
    }*/


}
