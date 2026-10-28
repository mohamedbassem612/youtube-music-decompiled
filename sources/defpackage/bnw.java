package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bnw implements Map.Entry, awrp {
    public final Object a;
    public bnw b;
    public bnw c;
    public boolean d;
    private final Object e;

    public bnw(Object obj, Object obj2) {
        this.e = obj;
        this.a = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bnw) {
            bnw bnwVar = (bnw) obj;
            if (awrc.c(this.e, bnwVar.e) && awrc.c(this.a, bnwVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return (this.e.hashCode() * 31) + this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        return a.bs();
    }

    public final String toString() {
        return "Entry(key=" + this.e + ", value=" + this.a + ')';
    }
}
