package com.example.friendsappv0;
import android.graphics.Point;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class UpdateActivity extends AppCompatActivity {

    /*
    DatabaseManager dbManager;


    public void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        dbManager = new DatabaseManager( this );

        updateView( );
    }

    // Build a View dynamically with all the candies
    public void updateView( ) {
        ArrayList<Friends> friends = dbManager.selectAll( );

            // create ScrollView and GridLayout
            ScrollView scrollView = new ScrollView( this );
            GridLayout grid = new GridLayout( this );
            grid.setRowCount( friends.size( ) );
            grid.setColumnCount(2);

            // create arrays of components
            TextView [] ids = new TextView[friends.size( )];
            EditText [][] namesAndPrices = new EditText[friends.size( )][2];
            Button [] buttons = new Button[friends.size( )];
            ButtonHandler bh = new ButtonHandler( );

            // retrieve width of screen
            Point size = new Point( );
            getWindowManager( ).getDefaultDisplay( ).getSize( size );
            int width = size.x;

            int i = 0;

            for (Friends friend : friends ) {
                // create the TextView for the candy's id
                ids[i] = new TextView( this );
                ids[i].setGravity( Gravity.CENTER );
                ids[i].setText( "" + Friends.getId() );

                // create the two EditTexts for the candy's name and price
                namesAndPrices[i][0] = new EditText( this );
                namesAndPrices[i][1] = new EditText( this );
                namesAndPrices[i][2] = new EditText( this );
                namesAndPrices[i][0].setText("" + Friends.getFirstName( ) );
                namesAndPrices[i][1].setText( "" + Friends.getLastName() );
                namesAndPrices[i][2].setText( "" + Friends.getEmail( ) );
                namesAndPrices[i][1].setInputType( InputType.TYPE_CLASS_NUMBER );
                namesAndPrices[i][0].setId( 10 * Friends.getId( ) );
                namesAndPrices[i][1].setId( 10 * Friends.getId( ) + 1 );
                namesAndPrices[i][2].setId( 10 * Friends.getId( ) + 2 );

                // create the button
                buttons[i] = new Button( this );
                buttons[i].setText( "Update" );
                buttons[i].setId( Friends.getId( ) );

                // set up event handling
                buttons[i].setOnClickListener( bh );

                // add the elements to grid
                grid.addView( ids[i], width / 10,
                        ViewGroup.LayoutParams.WRAP_CONTENT );
                grid.addView( namesAndPrices[i][0], ( int ) ( width * .4 ),
                        ViewGroup.LayoutParams.WRAP_CONTENT );
                grid.addView( namesAndPrices[i][1], ( int ) ( width * .15 ),
                        ViewGroup.LayoutParams.WRAP_CONTENT );
                grid.addView( buttons[i], ( int ) ( width * .35 ),
                        ViewGroup.LayoutParams.WRAP_CONTENT );

                i++;
            }
            scrollView.addView( grid );
            setContentView( scrollView );

    }

    private class ButtonHandler implements View.OnClickListener {
        public void onClick( View v ) {
            // retrieve name and price of the candy
            int friendsId = v.getId( );
            EditText fnameET = findViewById( 10 * friendsId );
            EditText lnameET = findViewById( 10 * friendsId + 1 );
            EditText emailET = findViewById( 10 * friendsId + 2 );
            String fnameString = fnameET.getText( ).toString( );
            String lnameString = lnameET.getText( ).toString( );
            String emailString = emailET.getText( ).toString( );

            // update candy in database

                //double price = Double.parseDouble( priceString );
                dbManager.updateById( friendsId, fnameString, lnameString, emailString);
                Toast.makeText( UpdateActivity.this, "friend updated",
                        Toast.LENGTH_SHORT ).show( );

                // update screen
                updateView( );

        }
    }
     */
}
