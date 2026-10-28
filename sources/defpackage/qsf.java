package defpackage;

import android.database.sqlite.SQLiteTransactionListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qsf implements SQLiteTransactionListener {
    final /* synthetic */ qsg a;

    public qsf(qsg qsgVar) {
        this.a = qsgVar;
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onRollback() {
        if (!this.a.a) {
            throw new qsv();
        }
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onBegin() {
    }

    @Override // android.database.sqlite.SQLiteTransactionListener
    public final void onCommit() {
    }
}
