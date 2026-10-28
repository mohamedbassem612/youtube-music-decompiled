package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jhw extends DataSetObserver {
    final /* synthetic */ hxh a;

    public jhw(hxh hxhVar) {
        this.a = hxhVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.a();
    }
}
