package defpackage;

import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sdy {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;

    public sdy(agfr agfrVar, agfr agfrVar2, awmd awmdVar) {
        this.a = SystemClock.uptimeMillis();
        this.c = agfrVar;
        this.d = agfrVar2;
        this.b = awmdVar;
    }

    public sdy(String str, long j, String str2, ListenableFuture listenableFuture) {
        this.b = str;
        this.a = j;
        this.c = str2;
        this.d = listenableFuture;
    }
}
