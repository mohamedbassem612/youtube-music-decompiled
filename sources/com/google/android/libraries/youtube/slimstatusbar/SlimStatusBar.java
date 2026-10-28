package com.google.android.libraries.youtube.slimstatusbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class SlimStatusBar extends LinearLayout {
    public TextView a;

    public SlimStatusBar(Context context) {
        super(context);
    }

    public final void a(int i) {
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public final void b(CharSequence charSequence) {
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.text);
    }

    public SlimStatusBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SlimStatusBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SlimStatusBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
