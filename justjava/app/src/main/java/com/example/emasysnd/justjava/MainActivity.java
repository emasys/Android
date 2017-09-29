package com.example.emasysnd.justjava;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}

/**
 * IMPORTANT: Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 * <p>
 * package com.example.android.justjava;
 */


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the order button is clicked.
     */

    public void submitOrder(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.whipped_cream_checkBox);
        boolean hasWhippedCream = checkBox.isChecked();
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.choco_checkBox);
        boolean hasChocolate = checkBox1.isChecked();

        EditText name = (EditText) findViewById(R.id.name);
//        String names = String.valueOf(name.getText());
        String names = name.getText().toString();


        int price = calculatePrice(hasChocolate, hasWhippedCream);


        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "java order for " + names);
        intent.putExtra(Intent.EXTRA_TEXT, createOrderSummary(price, hasWhippedCream, hasChocolate, names));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    private String createOrderSummary(int price, boolean hasWhippedCream, boolean choco, String name) {
        String priceMessage = "Name: " + name;
        priceMessage += "\nQuantity: " + quantity;
        priceMessage += "\nAdd Whipped Cream? " + hasWhippedCream;
        priceMessage += "\nChocolate? " + choco;
        priceMessage += "\nTotal: $" + (price);
        priceMessage += "\nThank you!";
        return priceMessage;
    }

    /**
     * Calculates the price of the order.
     *
     * @param -quantity is the number of cups of coffee ordered
     */

    private int calculatePrice(boolean hasChoco, boolean hasWhippedCream) {

        int base_price = 5;
        if (hasChoco) {
            base_price += 2;
        }

        if (hasWhippedCream) {
            base_price += 1;
        }

        return quantity * base_price;
    }

    public void increment(View view) {


        if (quantity < 100) {
            quantity += 1;
            displayQuantity(quantity);
        } else {
            Toast.makeText(this, "sorry, you can't order more than 100 cups", Toast.LENGTH_LONG).show();
        }
    }

    /**
     * This method displays the given text on the screen.
     */



    public void decrement(View view) {

        if (quantity > 1) {
            quantity -= 1;
            displayQuantity(quantity);
        } else {
//
            Toast.makeText(MainActivity.this, "sorry, you can't order below 1 cup", Toast.LENGTH_LONG).show();
        }

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */

}