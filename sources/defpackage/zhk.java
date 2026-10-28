package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zhk {
    public boolean a;

    public zhk() {
        this.a = false;
    }

    public final void a() {
        this.a = true;
    }

    public final synchronized void b() {
        while (!this.a) {
            wait();
        }
    }

    public final synchronized void c() {
        boolean z = false;
        while (!this.a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean d(long j) {
        if (j > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = j + jElapsedRealtime;
            if (j2 < jElapsedRealtime) {
                b();
            } else {
                while (!this.a && jElapsedRealtime < j2) {
                    wait(j2 - jElapsedRealtime);
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
            }
        }
        return this.a;
    }

    public final synchronized boolean e(long j) {
        if (j > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = j + jElapsedRealtime;
            if (j2 < jElapsedRealtime) {
                c();
            } else {
                boolean z = false;
                while (!this.a && jElapsedRealtime < j2) {
                    try {
                        wait(j2 - jElapsedRealtime);
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return this.a;
    }

    public final synchronized boolean f() {
        boolean z;
        z = this.a;
        this.a = false;
        return z;
    }

    public final synchronized boolean g() {
        return this.a;
    }

    public final synchronized boolean h() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }

    public zhk(byte[] bArr, byte[] bArr2) {
    }
}
