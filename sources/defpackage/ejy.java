package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ejy {
    public Object a;
    public Object b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof axq)) {
            return false;
        }
        axq axqVar = (axq) obj;
        return a.ae(axqVar.a, this.a) && a.ae(axqVar.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.a) + ' ' + String.valueOf(this.b) + '}';
    }
}
