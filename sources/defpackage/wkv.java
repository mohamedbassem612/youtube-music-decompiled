package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.EnumSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wkv {
    public final boolean a;
    public final Executor b;
    private final int c;
    private final long d;
    private final long e;
    private final Executor f;

    public wkv(tqj tqjVar, Executor executor, Executor executor2) {
        int i = tqr.a;
        this.c = tqjVar.a(1074004714);
        this.d = tqjVar.c(1077942784);
        this.e = tqjVar.c(1077944768);
        this.a = tqjVar.k(1073815424);
        this.b = executor2;
        this.f = executor;
    }

    public static wkv a(tqj tqjVar) {
        int i = tqr.a;
        return new wkv(tqjVar.k(1073815424), tqjVar.a(1074004714), tqjVar.c(1077942784), tqjVar.c(1077944768), MoreExecutors.directExecutor());
    }

    public final Executor b(EnumSet enumSet) {
        Executor executor = this.f;
        return (executor == null || enumSet.isEmpty()) ? this.b : executor;
    }

    public final boolean c(wkt wktVar) {
        return (this.d & (1 << ((int) wktVar.U))) != 0;
    }

    public final boolean d(wkt wktVar) {
        return (this.e & (1 << ((int) wktVar.U))) != 0;
    }

    public final boolean e(int i) {
        return (this.c & (1 << (i + (-1)))) != 0;
    }

    public wkv(boolean z, int i, long j, long j2, Executor executor) {
        this.a = z;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.b = executor;
        this.f = null;
    }
}
