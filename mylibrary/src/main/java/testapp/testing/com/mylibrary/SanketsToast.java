package testapp.testing.com.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class SanketsToast
{


    public static void getToastBySanket(Context context,String toastMessage)
    {
        Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
    }


}
