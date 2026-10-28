package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axfi extends axfm implements axff {
    public final awtr a;

    public axfi(boolean z) {
        super(1, z ? 1 : 0);
        this.a = new awtr(z ? null : axfj.a, awts.a);
    }

    @Override // defpackage.axff
    public final Object a(awoq awoqVar) throws awve {
        if (b()) {
            return awmy.a;
        }
        awud awudVarJ = awqx.j(JniZero.q(awoqVar));
        try {
            f(new axfh(this, awudVarJ));
            Object objJ = awudVarJ.j();
            awox awoxVar = awox.a;
            if (objJ == awoxVar) {
                awoqVar.getClass();
            } else {
                objJ = awmy.a;
            }
            return objJ != awoxVar ? awmy.a : objJ;
        } catch (Throwable th) {
            awudVarJ.y();
            throw th;
        }
    }

    @Override // defpackage.axff
    public final boolean b() {
        while (true) {
            awtp awtpVar = this.c;
            int i = this.b;
            int i2 = awtpVar.b;
            if (i2 > i) {
                super.g();
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (awtpVar.c(i2, i2 - 1)) {
                    boolean z = awuv.a;
                    this.a.c(null);
                    return true;
                }
            }
        }
    }

    @Override // defpackage.axff
    public final void c() {
        while (d()) {
            awtr awtrVar = this.a;
            Object obj = awtrVar.a;
            axdy axdyVar = axfj.a;
            if (obj != axdyVar && awtrVar.d(obj, axdyVar)) {
                h();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final boolean d() {
        return Math.max(this.c.b, 0) == 0;
    }

    public final String toString() {
        return "Mutex@" + awuw.b(this) + "[isLocked=" + d() + ",owner=" + this.a.a + ']';
    }
}
