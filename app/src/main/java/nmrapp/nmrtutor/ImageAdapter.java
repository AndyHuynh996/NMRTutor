package nmrapp.nmrtutor;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Andyh on 1/11/2018.
 * Purpose: Create image for grid view
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;


   public ImageAdapter (Context c){
       mContext =c;
   }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) { // if it's not recycled, initialize some
            // attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(100, 100));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = { R.mipmap.chalkboardicon_2a, R.mipmap.chalkboardicon_2b,
            R.mipmap.chalkboardicon_2c, R.mipmap.chalkboardicon_2d,
            R.mipmap.chalkboardicon_2e, R.mipmap.chalkboardicon_2f,
            R.mipmap.chalkboardicon_2g, R.mipmap.chalkboardicon_2h,
            R.mipmap.chalkboardicon_2i, R.mipmap.chalkboardicon_2j,
            R.mipmap.chalkboardicon_2k, R.mipmap.chalkboardicon_2l,
            R.mipmap.chalkboardicon_2m, R.mipmap.chalkboardicon_2n,
            R.mipmap.chalkboardicon_2o, R.mipmap.chalkboardicon_2p,
            R.mipmap.chalkboardicon_2q, R.mipmap.chalkboardicon_2r,
            R.mipmap.chalkboardicon_2s, R.mipmap.chalkboardicon_2t,
    };
}