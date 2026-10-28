package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class djs extends azt {
    private final djk a;

    public djs(djk djkVar) {
        this.a = djkVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && awrc.c(this.a, ((djs) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.a + ", direction=-1)";
    }
}
