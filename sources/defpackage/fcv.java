package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fcv implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ View a;
    public final /* synthetic */ fcw b;

    public fcv(fcw fcwVar, View view) {
        this.a = view;
        this.b = fcwVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        ffs.d().post(new bf(this, this.a, (ViewTreeObserver.OnDrawListener) this, 19));
    }
}
