package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qsd implements ahdd {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ qsd(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, qsx] */
    /* JADX WARN: Type inference failed for: r3v14, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.ahdd
    public final ahdm a(ahud ahudVar, Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return new ahdm(((qsi) obj).a(this.a));
        }
        if (i == 1) {
            qsi qsiVar = (qsi) obj;
            qsiVar.b();
            omr omrVar = (omr) this.a;
            qsh qshVar = new qsh(qsiVar, (Object[]) omrVar.a, (String) omrVar.b);
            int i2 = qsr.a;
            qsp qspVar = new qsp(qshVar);
            qspVar.d(qsiVar.b);
            return ahdm.b(qspVar, MoreExecutors.directExecutor());
        }
        if (i != 2) {
            return new ahdm(this.a);
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        boolean zIsWriteAheadLoggingEnabled = sQLiteDatabase.isWriteAheadLoggingEnabled();
        qso qsoVar = (qso) this.a;
        Executor executor = qsoVar.i;
        qsi qsiVar2 = zIsWriteAheadLoggingEnabled ? new qsi(sQLiteDatabase, qsoVar.c, executor, qsoVar.o) : new qsi(sQLiteDatabase, executor, executor, qsoVar.o);
        return qso.a(new aher(qsiVar2), new qsj(qsiVar2, 1));
    }
}
