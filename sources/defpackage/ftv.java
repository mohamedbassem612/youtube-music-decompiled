package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ftv implements Runnable {
    public final frp a;
    final /* synthetic */ ftx b;
    private final View c;

    public ftv(ftx ftxVar, frp frpVar, View view) {
        this.b = ftxVar;
        this.a = frpVar;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        frp frpVar = this.a;
        this.b.l = frpVar.c(this.c);
    }
}
