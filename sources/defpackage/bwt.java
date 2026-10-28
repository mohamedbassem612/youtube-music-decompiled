package defpackage;

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwt {
    public final cso a;
    private final bvq b;
    private final bvq c;
    private boolean d;
    private boolean e;

    public bwt(Context context, Looper looper, bvd bvdVar) {
        this.a = new cso(context.getApplicationContext());
        this.b = bvdVar.d(looper, null);
        this.c = bvdVar.d(Looper.getMainLooper(), null);
    }

    public static boolean c(boolean z, boolean z2) {
        return z && z2;
    }

    private final void d(boolean z, boolean z2) {
        if (c(z, z2)) {
            this.b.d(new bwr(this, z, z2, 0));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.c.e(new blq(this, atomicBoolean, 12, (short[]) null), 1000L);
        this.b.d(new bws(this, atomicBoolean, z, z2, 0));
    }

    public final void a(boolean z) {
        if (this.d != z) {
            this.d = z;
            d(z, this.e);
        }
    }

    public final void b(boolean z) {
        if (this.e != z) {
            this.e = z;
            if (this.d) {
                d(true, z);
            }
        }
    }
}
