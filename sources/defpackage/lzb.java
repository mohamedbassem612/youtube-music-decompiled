package defpackage;

import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lzb implements Map.Entry, Comparable {
    private final /* synthetic */ int $cid;
    public Object a;
    final /* synthetic */ AbstractMap b;
    public final Object c;

    public lzb(AbstractMap abstractMap, lxs lxsVar, Object obj, int i) {
        this.$cid = i;
        this.b = abstractMap;
        this.c = lxsVar;
        this.a = obj;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        if (this.$cid != 0) {
            Object obj2 = ((lzb) obj).c;
            throw null;
        }
        Object obj3 = ((lzb) obj).c;
        throw null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.$cid != 0) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (afxw.l(this.c, entry.getKey()) && afxw.l(this.a, entry.getValue())) {
                    return true;
                }
            }
        } else {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry2 = (Map.Entry) obj;
                if (afxw.l(this.c, entry2.getKey()) && afxw.l(this.a, entry2.getValue())) {
                    return true;
                }
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
        int iHashCode;
        int i = this.$cid;
        Object obj = this.c;
        int iHashCode2 = 0;
        if (i != 0) {
            iHashCode = ((lxs) obj).hashCode();
            Object obj2 = this.a;
            if (obj2 != null) {
                iHashCode2 = obj2.hashCode();
            }
        } else {
            iHashCode = ((lxs) obj).hashCode();
            Object obj3 = this.a;
            if (obj3 != null) {
                iHashCode2 = obj3.hashCode();
            }
        }
        return iHashCode ^ iHashCode2;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i = this.$cid;
        AbstractMap abstractMap = this.b;
        if (i != 0) {
            ((bjv) abstractMap).b();
            Object obj2 = this.a;
            this.a = obj;
            return obj2;
        }
        ((lzd) abstractMap).b();
        Object obj3 = this.a;
        this.a = obj;
        return obj3;
    }

    public final String toString() {
        int i = this.$cid;
        Object obj = this.c;
        if (i != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append('=');
            sb.append(this.a);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append('=');
        sb2.append(this.a);
        return sb2.toString();
    }
}
