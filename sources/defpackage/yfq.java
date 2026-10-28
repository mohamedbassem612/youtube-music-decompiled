package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yfq {
    public final long a;
    final long b;
    public final long c;
    public final long d;

    public yfq(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yfq) {
            yfq yfqVar = (yfq) obj;
            if (this.a == yfqVar.a && this.b == yfqVar.b && this.c == yfqVar.c && this.d == yfqVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d));
    }
}
