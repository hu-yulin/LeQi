package la.neu.leqi.shopfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import la.neu.leqi.R;

/**
 * Created by lenovo on 2016/11/2.
 */

public class ShopActivityContent extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.shop_activity_content, null);

        return view;
    }
}
