package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abup {
    public final abul a;
    public final abun b;
    public final boolean c;

    public abup(abul abulVar, abun abunVar, boolean z) {
        this.a = abulVar;
        this.b = abunVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof abup) {
            abup abupVar = (abup) obj;
            if (awrc.c(this.a, abupVar.a) && awrc.c(this.b, abupVar.b) && this.c == abupVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.aj(this.c);
    }

    public final String toString() {
        return "PrefetchItem(index=" + this.a + ", sequenceItem=" + this.b + ", isNext=" + this.c + ')';
    }
}
