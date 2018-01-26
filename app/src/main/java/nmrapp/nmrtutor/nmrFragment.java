package nmrapp.nmrtutor;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.squareup.picasso.Picasso;




/**
 * A simple {@link Fragment} subclass.
 */
public class nmrFragment extends Fragment {

    private BottomSheetBehavior mBottomSheetBehavior;
    public nmrFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_nmr,container,false);
        PinchZoomImageView nmrView = (PinchZoomImageView) rootView.findViewById(R.id.nmrPinchZoomView);



        urlPasser up = new urlPasser();

        String url= up.getnmrUrl();

        Picasso.with(getContext()).load(url).resize(1500,1500).centerCrop().into(nmrView);
        nmrView.setMaxZoom(3f);

        nmrView.getBackground();







        return rootView;
    }

}
