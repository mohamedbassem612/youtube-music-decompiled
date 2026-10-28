package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ldz implements leb {
    public final ldr t;

    protected ldz(ldr ldrVar) {
        if (ldrVar == null) {
            throw new NullPointerException("null reference");
        }
        this.t = ldrVar;
    }

    public final lbt G() {
        return this.t.c;
    }

    public final lby H() {
        return this.t.d();
    }

    public final lcu I() {
        return this.t.h;
    }

    public final ldl J() {
        return this.t.g();
    }

    public final lev K() {
        return this.t.j();
    }

    public final lga L() {
        return this.t.l();
    }

    public final void M() {
        if (Thread.currentThread() != this.t.aU().c) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // defpackage.leb
    public final Context aS() {
        return this.t.a;
    }

    @Override // defpackage.leb
    public final lcz aT() {
        return this.t.aT();
    }

    @Override // defpackage.leb
    public final lha aU() {
        return this.t.aU();
    }

    @Override // defpackage.leb
    public final ksr aV() {
        return this.t.x;
    }

    public void o() {
        this.t.aU().o();
    }

    @Override // defpackage.leb
    public final void aW() {
    }
}
