package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adka extends adjv {
    public final LinearLayout a;
    private final ScrollView b;

    public adka(ScrollView scrollView, Context context) {
        super(context);
        this.b = scrollView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        this.a = linearLayout;
        scrollView.addView(linearLayout);
    }
}
