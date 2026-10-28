package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jqd extends ggf {
    final /* synthetic */ View f;

    public jqd(View view) {
        this.f = view;
    }

    @Override // defpackage.ggf
    public final void d(GradientDrawable gradientDrawable) {
        this.f.setBackground(gradientDrawable);
    }
}
