package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adjz extends adjv {
    public final TextView a;

    public adjz(LinearLayout linearLayout, Context context) {
        super(context);
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 4, 0, 0);
        textView.setLayoutParams(layoutParams);
        textView.setPadding(4, 0, 4, 0);
        textView.setBackgroundColor(tzk.i(context, R.attr.ytOverlayTextSecondary));
        textView.setTextColor(tzk.i(context, R.attr.ytTextPrimary));
        textView.setTextSize(2, 12.0f);
        this.a = textView;
        linearLayout.addView(textView);
    }
}
