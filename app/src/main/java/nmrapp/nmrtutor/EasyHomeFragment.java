package nmrapp.nmrtutor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

/**
Purpose : Create problem selector grid view and acquire questions on select item

 */
public class EasyHomeFragment extends Fragment {
    public interface OnSelectedListener {
        public void onSelected();


    }
    OnSelectedListener mListener;
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnArticleSelectedListener");
        }
    }

    GridView gridview;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_easy_question_home, container, false);
        gridview = (GridView)rootView.findViewById(R.id.gridView1);
        gridview.setAdapter(new ImageAdapter(gridview.getContext()));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                urlPasser uP = new urlPasser();

                uP.setUrl(position);

                startActivity(new Intent(getActivity(),ProblemActivity.class));
                Toast.makeText(getActivity(), " " + position, Toast.LENGTH_SHORT).show();
            }

        });




        return rootView;

    }




}