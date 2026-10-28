package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class crp implements crq {
    public static final yvt d = new yvt(2, -9223372036854775807L);
    public static final yvt e = new yvt(3, -9223372036854775807L);
    public crl a;
    public IOException b;
    public final axnz c;

    public crp(String str) {
        int i = bwp.a;
        this.c = new axnz(Executors.newSingleThreadExecutor(new kyn("ExoPlayer:Loader:".concat(str), 1)), new cjj(3), 1);
    }

    @Override // defpackage.crq
    public final void a() {
        throw null;
    }

    public final void b() {
        crl crlVar = this.a;
        crlVar.getClass();
        crlVar.a(false);
    }

    public final void c() {
        this.b = null;
    }

    public final void d(int i) throws IOException {
        IOException iOException = this.b;
        if (iOException != null) {
            throw iOException;
        }
        crl crlVar = this.a;
        if (crlVar != null) {
            if (i == Integer.MIN_VALUE) {
                i = crlVar.a;
            }
            IOException iOException2 = crlVar.b;
            if (iOException2 != null && crlVar.c > i) {
                throw iOException2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [bvh, java.lang.Object] */
    public final void e(crn crnVar) {
        crl crlVar = this.a;
        if (crlVar != null) {
            crlVar.a(true);
        }
        if (crnVar != null) {
            this.c.execute(new wi(crnVar, 3));
        }
        axnz axnzVar = this.c;
        axnzVar.a.a(axnzVar.b);
    }

    public final boolean f() {
        return this.b != null;
    }

    public final boolean g() {
        return this.a != null;
    }

    public final void h(crm crmVar, crk crkVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.b = null;
        new crl(this, looperMyLooper, crmVar, crkVar, i, SystemClock.elapsedRealtime()).b(0L);
    }
}
