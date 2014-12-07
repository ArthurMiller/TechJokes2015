package techjokes2015.wayneient.com.techjokes2015;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class TechJokes2015Activity extends Activity {

//    public static final String TAG = TechJokes2015Activity.class.getSimpleName();
    private JokeBook mJokeBook = new JokeBook();
    private PickColor mPickColor = new PickColor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_jokes2015);
    //View variables
        final TextView jokeLabel = (TextView) findViewById(R.id.jokeTextView);
        final Button showJokeButton = (Button) findViewById(R.id.showJokeButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View view){
            //Execute random joke on click
                String joke = mJokeBook.getJoke();
                jokeLabel.setText(joke);
                int color = mPickColor.getColor();
                relativeLayout.setBackgroundColor(color);
                showJokeButton.setTextColor(color);
            }
        };

        showJokeButton.setOnClickListener(listener);
//        Toast.makeText(this, "Thank you for your support", Toast.LENGTH_LONG).show();
//        Log.d(TAG, "Test log from onCreate method");
    }
}
