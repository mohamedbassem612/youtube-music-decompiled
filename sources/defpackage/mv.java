package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mv extends DataSetObserver {
    final /* synthetic */ mx a;

    public mv(mx mxVar) {
        this.a = mxVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        mx mxVar = this.a;
        if (mxVar.u()) {
            mxVar.s();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.k();
    }
}
