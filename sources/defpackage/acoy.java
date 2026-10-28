package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acoy {
    private final int a;
    private TextView b;
    private String c;
    private long d;

    public acoy(int i) {
        this.a = i;
    }

    public final void a(View view) {
        if (this.b == null) {
            TextView textView = (TextView) view.findViewById(this.a);
            this.b = textView;
            String str = this.c;
            if (str != null) {
                textView.setText(str);
            }
        }
    }

    public final void b(long j) {
        this.d++;
        String str = String.format(Locale.US, "%.2fs #%d", Float.valueOf(j / 1000.0f), Long.valueOf(this.d));
        this.c = str;
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
