package tn.zoppolis.hellouz;


import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import tn.zoppolis.hellouz.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class EssaiFragmentHome extends Fragment {
    TextView text;
    Button bu ;
    String stringtext;
    private static final int REQUEST_WEIGHT = 1;
    public EssaiFragmentHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("debut","aujourdhui");

        final View v = inflater.inflate(R.layout.fragment_home, container, false);

       /*Button button2  = (Button) v.findViewById(R.id.Location);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Here
                MyDialogFragment dialog =  new MyDialogFragment();;
                dialog.show(getFragmentManager(), "dialog_login");
            }
        });*/

        bu  = (Button) v.findViewById(R.id.time);
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {


                FragmentManager fm = getFragmentManager();
                FragTime dialogFragment = new FragTime();
                dialogFragment.show(fm, "Time");
            }
        });
        return v;
    }



    public void setText(final String string){
        bu.setText(string);
    }

    public void sentText(){
        new MyTask().execute();

    }

    private class MyTask extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... strings) {
            Bundle b = getArguments();
            stringtext = b.getString("text");
            return null;
        }

        protected void onPostExecute(String result){
            setText(stringtext);
        }
    }


        }

