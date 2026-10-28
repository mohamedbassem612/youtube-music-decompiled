package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdw implements ccz {
    public btb a = btb.a;
    private boolean b;
    private long c;
    private long d;

    @Override // defpackage.ccz
    public final long a() {
        long j = this.c;
        if (!this.b) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.d;
        btb btbVar = this.a;
        return j + (btbVar.b == 1.0f ? bwp.y(jElapsedRealtime) : jElapsedRealtime * ((long) btbVar.d));
    }

    @Override // defpackage.ccz
    public final btb b() {
        return this.a;
    }

    public final void c(long j) {
        this.c = j;
        if (this.b) {
            this.d = SystemClock.elapsedRealtime();
        }
    }

    public final void e() {
        if (this.b) {
            return;
        }
        this.d = SystemClock.elapsedRealtime();
        this.b = true;
    }

    public final void f() {
        if (this.b) {
            c(a());
            this.b = false;
        }
    }

    @Override // defpackage.ccz
    public final void gb(btb btbVar) {
        if (this.b) {
            c(a());
        }
        this.a = btbVar;
    }

    @Override // defpackage.ccz
    public final /* synthetic */ boolean gc() {
        return false;
    }
}
