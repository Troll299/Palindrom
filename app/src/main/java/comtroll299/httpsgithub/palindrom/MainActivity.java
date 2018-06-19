package comtroll299.httpsgithub.palindrom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mUserInput;
    private TextView mResult;
    private TextView mErrorMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUserInput = (EditText) findViewById(R.id.et_user_input);
        mResult = (TextView) findViewById(R.id.tv_result);
        mErrorMessage = (TextView) findViewById(R.id.tv_error_message);

        mUserInput.addTextChangedListener(textInputWatcher);

    }

    private final TextWatcher textInputWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        /**
         * afterTextChanged is the method that is called once the text has changed
         *                  in an Editable object
         *
         * @param editable is the object that has text changed within it
         * @return "" Nothing is returned
         */
        public void afterTextChanged(Editable s) {
            String userInput;
            boolean result = false;


            if (mUserInput.getText().toString().equals("")) {
                mResult.setText("");
                mErrorMessage.setText("Please enter a word");

            } else if (mUserInput.getText().toString().contains("0")) {
                mResult.setText("");
                mErrorMessage.setText("You can not input a number it has to be a word");

            } else if (mUserInput.getText().toString().contains("1")) {
                mResult.setText("");
                mErrorMessage.setText("You can not input a number it has to be a word");


            } else if (mUserInput.getText().toString().contains("2")) {
                mResult.setText("");
                mErrorMessage.setText("You can not input a number it has to be a word");

            } else if (mUserInput.getText().toString().contains("3")) {
                mResult.setText("");
                mErrorMessage.setText("You can not input a number it has to be a word");
            } else if (mUserInput.getText().toString().contains("4")) {
                mResult.setText("");
                mErrorMessage.setText("You can not input a number it has to be a word");

            } else if (mUserInput.getText().toString().contains("5")) {
                mResult.setText("");
                mErrorMessage.setText("You can not input a number it has to be a word");
            } else if (mUserInput.getText().toString().contains("6")) {
                mResult.setText("");
                mErrorMessage.setText("You can not input a number it has to be a word");

            } else if (mUserInput.getText().toString().contains("7")) {
                mResult.setText("");
                mErrorMessage.setText("You can not input a number it has to be a word");
            } else if (mUserInput.getText().toString().contains("8")) {
                mResult.setText("");
                mErrorMessage.setText("You can not input a number it has to be a word");

            } else if (mUserInput.getText().toString().contains("9")) {
                mResult.setText("");
                mErrorMessage.setText("You can not input a number it has to be a word");
            }
            else {
                mErrorMessage.setText("");
                result = checkPalindrome(mUserInput.getText().toString().toUpperCase(), 0);

                if( result == true)
                {

                    mResult.setText("That is a Palindrome");

                }
                else
                {
                    mResult.setText("That's not a Palindrome");
                }
            }


        }


    };

    /**
     * checkPalindrome is the method that checks wither the user has inputted a palindrome word
     *
     * @param userWord a string that holds the users word
     * @param currentIndex an index that holds the info of the word inputted
     * @return returns result
     */
    private boolean checkPalindrome( String userWord, int currentIndex )
    {
        boolean result;
        int indexFromEnd = userWord.length() - currentIndex - 1;
        if( userWord.charAt(currentIndex) == userWord.charAt(indexFromEnd) )
        {
            if(currentIndex == indexFromEnd || currentIndex == indexFromEnd - 1 )
            {
                result = true;
            }
            else
            {
                result = checkPalindrome(userWord, currentIndex + 1 );
            }

        }
        else
        {
            result = false;
        }

        return result;
    }
}
