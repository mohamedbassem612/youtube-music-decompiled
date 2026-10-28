package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class adhz implements View.OnLayoutChangeListener {
    public boolean a;
    final /* synthetic */ adia b;
    private qcb c;

    public adhz(adia adiaVar, boolean z) {
        this.b = adiaVar;
        if (this.a != z) {
            this.a = z;
            if (z) {
                b(null);
            } else if (this.c == null) {
                adiaVar.a.removeOnLayoutChangeListener(this);
            }
        }
    }

    public final void a() {
        if (!this.a) {
            this.b.a.removeOnLayoutChangeListener(this);
        }
        this.c = null;
    }

    public final void b(qcb qcbVar) {
        this.c = qcbVar;
        this.b.a.addOnLayoutChangeListener(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        adia adiaVar = this.b;
        adiaVar.g(this.c, this.a ? null : adiaVar.b);
    }
}
