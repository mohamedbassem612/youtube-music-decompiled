package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dtz extends DataSetObserver {
    final /* synthetic */ duc a;

    public dtz(duc ducVar) {
        this.a = ducVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.f();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.f();
    }
}
