package defpackage;

import android.os.Process;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mdb extends ThreadLocal {
    public static final mdb a = new mdb();

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        int iMyTid = Process.myTid();
        return new mcz(Thread.currentThread(), iMyTid, true, Process.getThreadPriority(iMyTid), true, false);
    }
}
