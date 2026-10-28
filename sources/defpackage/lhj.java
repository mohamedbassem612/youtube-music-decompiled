package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lhj extends lbc {
    public boolean a;
    public final lhe b;
    public final lhc c;
    public final lbb d;
    private Handler e;

    public lhj(ldr ldrVar) {
        super(ldrVar);
        this.a = true;
        this.d = new lbb(ldrVar);
        this.b = new lhe(ldrVar);
        this.c = new lhc(ldrVar);
    }

    @Override // defpackage.lbc
    protected final boolean f() {
        return false;
    }

    public final Handler s() {
        o();
        t();
        return this.e;
    }

    public final void t() {
        o();
        if (this.e == null) {
            this.e = new afkg(Looper.getMainLooper(), (byte[]) null);
        }
    }

    public final void u(boolean z) {
        o();
        this.a = z;
    }

    public final boolean v() {
        o();
        return this.a;
    }

    public final boolean w(boolean z, boolean z2, long j) {
        return this.b.c(z, z2, j);
    }
}
