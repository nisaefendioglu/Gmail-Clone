package com.nisaefendioglu.gmailclone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

public class MailDetails extends Activity {

    Button back,backMail,reply,replyAll;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maildetails);

        back = findViewById(R.id.back);
        back.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(),MainActivity.class);
            startActivity(intent);
        });
        backMail = findViewById(R.id.backMail);
        backMail.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(),MainActivity.class);
            startActivity(intent);
        });

        reply = findViewById(R.id.reply);
        reply.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(),SendMessage.class);
            startActivity(intent);
        });

        replyAll = findViewById(R.id.replyAll);
        replyAll.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(),SendMessage.class);
            startActivity(intent);
        });
    }
}
