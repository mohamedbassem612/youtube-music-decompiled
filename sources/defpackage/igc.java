package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class igc {
    public final long a;
    public final String b;

    public igc(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof igc) {
            igc igcVar = (igc) obj;
            if (this.a == igcVar.a && awrc.c(this.b, igcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (a.ak(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return this.b + ' ' + this.a;
    }
}
