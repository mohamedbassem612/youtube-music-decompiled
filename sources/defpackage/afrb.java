package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afrb {
    public final long a;
    public final long b;
    public final Map c;

    public afrb(long j, long j2, Map map) {
        this.a = j;
        this.b = j2;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afrb) {
            afrb afrbVar = (afrb) obj;
            if (this.a == afrbVar.a && this.b == afrbVar.b && aguu.q(this.c, afrbVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((((((((int) ((j2 >>> 32) ^ j2)) ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "SyncConfig{minSyncInterval=" + this.a + ", timeout=" + this.b + ", constraints=" + aguu.n(this.c) + ", allowMultiprocess=false}";
    }

    public afrb() {
        throw null;
    }
}
