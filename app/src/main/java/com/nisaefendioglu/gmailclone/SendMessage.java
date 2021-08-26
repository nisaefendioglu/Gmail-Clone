package com.nisaefendioglu.gmailclone;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SendMessage extends Activity {

    TextView primaryTextView;
    Button send;
    EditText from,to,subject,mail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mailsend);


        from = findViewById(R.id.from);
        to = findViewById(R.id.to);
        subject = findViewById(R.id.subject);
        primaryTextView = findViewById(R.id.primaryTextView);
        mail = findViewById(R.id.mail);


        primaryTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),MainActivity.class);
                startActivity(intent);
            }
        });

        send = findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Intent.ACTION_SEND );
                intent.putExtra(intent.EXTRA_EMAIL, from.getText());
                intent.setData( Uri.parse( "mailto:" ) );
                intent.putExtra( Intent.EXTRA_EMAIL, to.getText());
                intent.putExtra( Intent.EXTRA_SUBJECT,subject.getText());
                intent.putExtra( Intent.EXTRA_TEXT, mail.getText());
                intent.setType( "messages/rfc822" );
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Send mail successful.",Toast.LENGTH_LONG).show();

            }

        });

    }
}
