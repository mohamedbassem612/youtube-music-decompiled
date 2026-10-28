package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiji implements Map.Entry, Comparable {
    public Object a;
    final /* synthetic */ aijl b;
    public final aihk c;

    public aiji(aijl aijlVar, aihk aihkVar, Object obj) {
        this.b = aijlVar;
        this.c = aihkVar;
        this.a = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.c.compareTo(((aiji) obj).c);
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
        return this.c.toString() + '=' + String.valueOf(this.a);
    }
}
