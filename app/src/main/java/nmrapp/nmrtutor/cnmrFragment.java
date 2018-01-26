package nmrapp.nmrtutor;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class cnmrFragment extends Fragment {


    public cnmrFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_cnmr,container,false);
        PinchZoomImageView nmrView = (PinchZoomImageView) rootView.findViewById(R.id.cnmrPinchZoomView);

        urlPasser up = new urlPasser();

        String url= up.getCnmrUrl();

        Picasso.with(getContext()).load(url).resize(1500,1500).centerCrop().into(nmrView);
        nmrView.setMaxZoom(3f);

        nmrView.getBackground();

        // Inflate the layout for this fragment
        return rootView;
    }

}
