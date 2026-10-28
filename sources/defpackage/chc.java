package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class chc {
    final /* synthetic */ chd a;
    private Exception b;
    private long c = -9223372036854775807L;
    private long d = -9223372036854775807L;

    public chc(chd chdVar) {
        this.a = chdVar;
    }

    public final void a() {
        this.b = null;
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    public final void b(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.b == null) {
            this.b = exc;
        }
        if (this.c == -9223372036854775807L && !this.a.I()) {
            this.c = 200 + jElapsedRealtime;
        }
        long j = this.c;
        if (j == -9223372036854775807L || jElapsedRealtime < j) {
            this.d = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.b;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.b;
        a();
        throw exc3;
    }

    public final boolean c() {
        if (this.b != null) {
            return this.a.I() || SystemClock.elapsedRealtime() < this.d;
        }
        return false;
    }
}
