package defpackage;

import android.content.DialogInterface;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class wm extends bpi {
    public eqf A;
    private wr B;
    private aetn C;
    public Executor a;
    public wb b;
    public DialogInterface.OnClickListener c;
    public DialogInterface.OnClickListener d;
    public CharSequence e;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public bop o;
    public bop p;
    public bop q;
    public bop r;
    public bop s;
    public bop t;
    public bop v;
    public bop x;
    public bop y;
    public vy z;
    public int f = 0;
    public boolean u = true;
    public int w = 0;

    public static void o(bop bopVar, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            bopVar.h(obj);
        } else {
            bopVar.i(obj);
        }
    }

    final wr a() {
        wr wrVar = this.B;
        if (wrVar != null) {
            return wrVar;
        }
        wr wrVar2 = new wr(new wk(this));
        this.B = wrVar2;
        return wrVar2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.CharSequence, java.lang.Object] */
    final CharSequence b() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence;
        }
        eqf eqfVar = this.A;
        if (eqfVar == null) {
            return null;
        }
        ?? r0 = eqfVar.b;
        return r0 == 0 ? "" : r0;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.CharSequence, java.lang.Object] */
    final CharSequence c() {
        eqf eqfVar = this.A;
        if (eqfVar != null) {
            return eqfVar.c;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.CharSequence, java.lang.Object] */
    final CharSequence e() {
        eqf eqfVar = this.A;
        if (eqfVar != null) {
            return eqfVar.d;
        }
        return null;
    }

    public final Executor f() {
        Executor executor = this.a;
        return executor == null ? new wh(2, (char[]) null) : executor;
    }

    final void g(ws wsVar) {
        bop bopVar = this.p;
        if (bopVar == null) {
            bopVar = new bop();
            this.p = bopVar;
        }
        o(bopVar, wsVar);
    }

    final void h(boolean z) {
        bop bopVar = this.r;
        if (bopVar == null) {
            bopVar = new bop();
            this.r = bopVar;
        }
        o(bopVar, Boolean.valueOf(z));
    }

    final void i(boolean z) {
        bop bopVar = this.v;
        if (bopVar == null) {
            bopVar = new bop();
            this.v = bopVar;
        }
        o(bopVar, Boolean.valueOf(z));
    }

    public final void j(CharSequence charSequence) {
        bop bopVar = this.y;
        if (bopVar == null) {
            bopVar = new bop();
            this.y = bopVar;
        }
        o(bopVar, charSequence);
    }

    public final void k(int i) {
        bop bopVar = this.x;
        if (bopVar == null) {
            bopVar = new bop();
            this.x = bopVar;
        }
        o(bopVar, Integer.valueOf(i));
    }

    final void l(boolean z) {
        bop bopVar = this.t;
        if (bopVar == null) {
            bopVar = new bop();
            this.t = bopVar;
        }
        o(bopVar, Boolean.valueOf(z));
    }

    public final void m(boolean z) {
        bop bopVar = this.s;
        if (bopVar == null) {
            bopVar = new bop();
            this.s = bopVar;
        }
        o(bopVar, Boolean.valueOf(z));
    }

    public final void n() {
        int i;
        eqf eqfVar = this.A;
        wb wbVar = this.b;
        if (eqfVar == null) {
            i = 0;
        } else {
            int i2 = wbVar != null ? 15 : 255;
            i = eqfVar.a ? 32768 | i2 : i2;
        }
        this.n = i;
    }

    public final vy p() {
        vy vyVar = this.z;
        if (vyVar != null) {
            return vyVar;
        }
        vy vyVar2 = new vy();
        this.z = vyVar2;
        return vyVar2;
    }

    final void q(aami aamiVar) {
        bop bopVar = this.o;
        if (bopVar == null) {
            bopVar = new bop();
            this.o = bopVar;
        }
        o(bopVar, aamiVar);
    }

    final aetn r() {
        aetn aetnVar = this.C;
        if (aetnVar != null) {
            return aetnVar;
        }
        aetn aetnVar2 = new aetn();
        this.C = aetnVar2;
        return aetnVar2;
    }
}
