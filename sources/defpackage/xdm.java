package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xdm {
    public final amej a;
    public final String b;
    public final long c;
    public final int d;
    public zs e;

    public xdm(zs zsVar, amej amejVar, long j) {
        this.e = zsVar;
        this.a = amejVar;
        this.b = yno.du(amejVar).e;
        this.c = j;
        this.d = yno.du(amejVar).h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xdm) {
            xdm xdmVar = (xdm) obj;
            if (Objects.equals(xdmVar.a, this.a) && Objects.equals(xdmVar.b, this.b) && xdmVar.c == this.c && xdmVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Long.valueOf(this.c), Integer.valueOf(this.d));
    }
}
