package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class toi {
    public final int a;
    public final long b;
    private final aobk c;

    public toi(int i, long j, aobk aobkVar) {
        this.a = i;
        this.b = j;
        this.c = aobkVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof toi) {
            toi toiVar = (toi) obj;
            if (this.a == toiVar.a && this.b == toiVar.b && this.c.equals(toiVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((((this.a ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CronetRttObservation{rttMs=" + this.a + ", whenMs=" + this.b + ", source=" + String.valueOf(this.c) + '}';
    }

    public toi() {
        throw null;
    }
}
