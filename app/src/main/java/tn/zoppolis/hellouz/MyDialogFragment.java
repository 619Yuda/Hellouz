package tn.zoppolis.hellouz;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

/**
 * Created by oussa on 27/06/2017.
 */

public class MyDialogFragment extends DialogFragment
{

    public MyDialogFragment()
    {
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_dialog_time, new LinearLayout(getActivity()), false);

        // Retrieve layout elements
       // TextView title = (TextView) view.findViewById(R.id.Ce_weekend);

        // Set values
       // title.setText("Time");

        // Build dialog
        Dialog builder = new Dialog(getActivity());
        builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
        builder.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        builder.setContentView(view);
        return builder;
    }
}