package defpackage;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mlm implements nrp {
    private final ftc a;

    public mlm(ftc ftcVar) {
        this.a = ftcVar;
    }

    @Override // defpackage.nrp
    public final RecyclerView a() {
        return this.a.a();
    }

    @Override // defpackage.nrp
    public final void b(int i, od odVar) {
        this.a.d(true, i, i, odVar);
    }

    @Override // defpackage.nrp
    public final void c(int i, boolean z) {
        this.a.d(z, i, i, null);
    }
}
