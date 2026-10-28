package com.google.android.apps.youtube.music.ui.avatarmenu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class PrivacyTosFooter extends LinearLayout {
    public PrivacyTosFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.privacy_tos_footer, this);
    }

    public final void a() {
        TextView textView = (TextView) findViewById(R.id.privacy_footer);
        TextView textView2 = (TextView) findViewById(R.id.tos_footer);
        textView.setText(R.string.privacy_policy_footer);
        textView2.setText(R.string.tos_footer);
    }
}
