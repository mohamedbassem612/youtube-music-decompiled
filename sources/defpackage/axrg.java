package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axrg implements Map.Entry, Comparable {
    public Object a;
    final /* synthetic */ axri b;
    public final lxs c;

    public axrg(axri axriVar, lxs lxsVar, Object obj) {
        this.b = axriVar;
        this.c = lxsVar;
        this.a = obj;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        lxs lxsVar = ((axrg) obj).c;
        throw null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (afxw.l(this.c, entry.getKey()) && afxw.l(this.a, entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int iHashCode = this.c.hashCode();
        Object obj = this.a;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.b.b();
        Object obj2 = this.a;
        this.a = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append('=');
        sb.append(this.a);
        return sb.toString();
    }
}
