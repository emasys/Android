package com.example.android.justjava; /**
 * IMPORTANT: Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava; 
 *
 */


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int numberOfCoffee = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = numberOfCoffee * 5;
        String message = "Total: $" + price +"\nThank You!" ;
        displayMessage(message);

    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    public void increment(View view){
        if(numberOfCoffee < 100){
            numberOfCoffee++;
        }
        else {
            Toast.makeText(this, "You can not order more than 100 coffee",
                    Toast.LENGTH_LONG).show();
        }
        display(numberOfCoffee);
    }

    public void decrement(View view){
        if(numberOfCoffee > 1){
            numberOfCoffee--;
        }
        else {
            Toast.makeText(this, "You can not order less than 1 coffee",
                    Toast.LENGTH_LONG).show();
        }
        display(numberOfCoffee);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}