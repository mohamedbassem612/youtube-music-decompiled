package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeva extends aevg {
    @Override // defpackage.aevg
    public final int a(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredWidth() + marginLayoutParams.leftMargin;
    }

    @Override // defpackage.aevg
    public final int b() {
        return 2;
    }

    @Override // defpackage.aevg
    public final ViewPropertyAnimator c(View view, int i) {
        return view.animate().translationX(-i);
    }

    @Override // defpackage.aevg
    public final void d() {
    }
}
