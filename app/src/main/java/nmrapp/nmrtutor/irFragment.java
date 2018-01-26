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
public class irFragment extends Fragment {


    public irFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_ir,container,false);
        PinchZoomImageView nmrView = (PinchZoomImageView) rootView.findViewById(R.id.irPinchZoomView);

        urlPasser up = new urlPasser();

        String url= up.getIrUrl();

        Picasso.with(getContext()).load(url).resize(1500,1500).centerCrop().into(nmrView);
        nmrView.setMaxZoom(3f);

        nmrView.getBackground();

        // Inflate the layout for this fragment
        return rootView;
    }

}
