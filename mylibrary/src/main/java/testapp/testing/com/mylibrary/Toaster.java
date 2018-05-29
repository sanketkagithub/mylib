package testapp.testing.com.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class Toaster {


    public static void getToast(Context context)
    {
        Toast.makeText(context, "show toast", Toast.LENGTH_SHORT).show();
    }


}
