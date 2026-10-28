package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adlc extends adkq {
    private LinearLayout a;

    @Override // defpackage.adkq
    protected final ViewGroup d(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(0);
        this.a.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        this.a.setGravity(48);
        return this.a;
    }

    @Override // defpackage.adkq
    protected final adkv e(Context context, admh admhVar) {
        return new adlb(context, admhVar);
    }

    @Override // defpackage.adkq
    protected final void g(adly adlyVar, adla adlaVar) {
        int i = adlaVar.c;
        this.a.setPadding(adlyVar.b("grid_row_presenter_horizontal_row_padding", i), adlyVar.b("grid_row_presenter_top_padding", 0), adlyVar.b("grid_row_presenter_horizontal_row_padding", adlaVar.d), adlyVar.b("grid_row_presenter_bottom_padding", adlaVar.b));
    }

    @Override // defpackage.adkq
    protected final void h(View view, adla adlaVar, int i) {
        int i2 = adlaVar.e;
        view.setPadding(i2, 0, i2, 0);
        this.a.addView(view);
    }
}
