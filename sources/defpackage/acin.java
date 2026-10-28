package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acin {
    public final long a;
    public final String b;

    public acin(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acin) {
            acin acinVar = (acin) obj;
            if (this.a == acinVar.a && awrc.c(this.b, acinVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (a.ak(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LocalVideoTime(timeMillis=" + this.a + ", cpn=" + this.b + ')';
    }
}
