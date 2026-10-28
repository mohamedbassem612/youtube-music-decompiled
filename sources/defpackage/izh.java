package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class izh implements View.OnLayoutChangeListener {
    final /* synthetic */ izj a;

    public izh(izj izjVar) {
        this.a = izjVar;
    }

    public final void a() {
        this.a.b.addOnLayoutChangeListener(this);
    }

    public final void b() {
        this.a.b.removeOnLayoutChangeListener(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        izj izjVar = this.a;
        izjVar.c();
        izjVar.b();
    }
}
