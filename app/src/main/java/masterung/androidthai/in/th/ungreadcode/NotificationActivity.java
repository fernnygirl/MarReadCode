package masterung.androidthai.in.th.ungreadcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import masterung.androidthai.in.th.ungreadcode.fragment.ShowNotiFrgment;

public class NotificationActivity extends AppCompatActivity {

    private String[] messageStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        messageStrings = getIntent().getStringArrayExtra("Message");

        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentNotiFragment, ShowNotiFrgment.showNotiInstance(messageStrings))
                    .commit();


        }




    }
}
