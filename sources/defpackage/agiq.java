package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class agiq implements Comparable, Serializable {
    private static final long serialVersionUID = 0;
    final Comparable b;

    public agiq(Comparable comparable) {
        this.b = comparable;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(agiq agiqVar) {
        if (agiqVar == agio.a) {
            return 1;
        }
        if (agiqVar == agim.a) {
            return -1;
        }
        Comparable comparable = this.b;
        Comparable comparable2 = agiqVar.b;
        agpf agpfVar = agpf.a;
        int iCompareTo = comparable.compareTo(comparable2);
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof agin, agiqVar instanceof agin);
    }

    public Comparable b() {
        return this.b;
    }

    public abstract void c(StringBuilder sb);

    public abstract void d(StringBuilder sb);

    public abstract boolean e(Comparable comparable);

    public final boolean equals(Object obj) {
        if (!(obj instanceof agiq)) {
            return false;
        }
        try {
            return compareTo((agiq) obj) == 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public abstract int hashCode();
}
