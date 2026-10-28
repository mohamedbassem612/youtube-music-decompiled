package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class qsg implements Callable {
    volatile boolean a;
    final /* synthetic */ qsx b;
    final /* synthetic */ qsi c;
    final /* synthetic */ omr d;

    public qsg(qsi qsiVar, qsx qsxVar, omr omrVar) {
        this.b = qsxVar;
        this.d = omrVar;
        this.c = qsiVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SQLiteDatabase sQLiteDatabase = this.c.a;
        ahno.P(!sQLiteDatabase.inTransaction(), "Thread is already in a transaction! This should never happen, or this will be treated as a nested transaction.");
        sQLiteDatabase.beginTransactionWithListener(new qsf(this));
        try {
            this.a = true;
            Object objA = this.b.a(this.d);
            omr.f();
            sQLiteDatabase.setTransactionSuccessful();
            this.a = false;
            return objA;
        } finally {
            this.c.a.endTransaction();
        }
    }
}
