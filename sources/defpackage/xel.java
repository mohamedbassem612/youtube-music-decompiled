package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xel {
    public final long a;
    public final Optional b;
    public final Optional c;
    public final boolean d;

    public xel(long j, Optional optional, Optional optional2, boolean z) {
        this.a = j;
        this.b = optional;
        this.c = optional2;
        this.d = z;
    }

    public static xek a() {
        xek xekVar = new xek();
        xekVar.d(-1L);
        xekVar.c(false);
        return xekVar;
    }

    public static xel b(boolean z) {
        xek xekVarA = a();
        xekVarA.c(z);
        return xekVarA.a();
    }

    public static xel c(long j) {
        xek xekVar = new xek();
        xekVar.d(j);
        xekVar.c(false);
        return xekVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xel) {
            xel xelVar = (xel) obj;
            if (this.a == xelVar.a && this.b.equals(xelVar.b) && this.c.equals(xelVar.c) && this.d == xelVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        Optional optional = this.c;
        return "ClientEventContext{timestamp=" + this.a + ", identity=" + String.valueOf(this.b) + ", visitorContext=" + String.valueOf(optional) + ", isPageSystem=" + this.d + '}';
    }

    public xel() {
        throw null;
    }
}
