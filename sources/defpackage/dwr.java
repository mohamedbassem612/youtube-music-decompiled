package defpackage;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dwr {
    public final dwp a;
    private final dwd b;
    private final dwq c;

    public dwr(dwd dwdVar, dwq dwqVar, dwp dwpVar) {
        this.b = dwdVar;
        this.c = dwqVar;
        this.a = dwpVar;
        if (dwdVar.b() == 0 && dwdVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (dwdVar.a != 0 && dwdVar.b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final Rect a() {
        return this.b.c();
    }

    public final dwo b() {
        dwd dwdVar = this.b;
        return dwdVar.b() > dwdVar.a() ? dwo.b : dwo.a;
    }

    public final boolean c() {
        dwq dwqVar = this.c;
        if (awrc.c(dwqVar, dwq.b)) {
            return true;
        }
        return awrc.c(dwqVar, dwq.a) && awrc.c(this.a, dwp.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (awrc.c(getClass(), obj != null ? obj.getClass() : null)) {
            obj.getClass();
            dwr dwrVar = (dwr) obj;
            if (awrc.c(this.b, dwrVar.b) && awrc.c(this.c, dwrVar.c) && awrc.c(this.a, dwrVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "dwr { " + this.b + ", type=" + this.c + ", state=" + this.a + " }";
    }
}
