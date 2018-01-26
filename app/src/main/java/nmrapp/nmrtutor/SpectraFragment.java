package nmrapp.nmrtutor;

import android.content.Context;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class SpectraFragment extends Fragment {

    static PinchZoomImageView specView;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_spectra, container, false);
        specView = (PinchZoomImageView) rootView.findViewById(R.id.pinchZoomView);


        return rootView;


    }




}
