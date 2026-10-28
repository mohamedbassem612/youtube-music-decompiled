package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awoc implements Map.Entry, awrp {
    private final awog a;
    private final int b;
    private final int c;

    public awoc(awog awogVar, int i) {
        this.a = awogVar;
        this.b = i;
        this.c = awogVar.f;
    }

    private final void a() {
        if (this.a.f != this.c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (awrc.c(entry.getKey(), getKey()) && awrc.c(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.a.b[this.b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.a.c;
        objArr.getClass();
        return objArr[this.b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        awog awogVar = this.a;
        awogVar.f();
        Object[] objArrK = awogVar.k();
        int i = this.b;
        Object obj2 = objArrK[i];
        objArrK[i] = obj;
        return obj2;
    }

    public final String toString() {
        Object key = getKey();
        Object value = getValue();
        StringBuilder sb = new StringBuilder();
        sb.append(key);
        sb.append('=');
        sb.append(value);
        return sb.toString();
    }
}
