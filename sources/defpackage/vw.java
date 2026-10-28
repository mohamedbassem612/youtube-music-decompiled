package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class vw implements Iterable {
    public vs a;
    public vs b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    public final vs a(Object obj) {
        vs vsVar = this.a;
        while (vsVar != null && !vsVar.a.equals(obj)) {
            vsVar = vsVar.c;
        }
        return vsVar;
    }

    public final Object b(Object obj, Object obj2) {
        vs vsVarA = a(obj);
        if (vsVarA != null) {
            return vsVarA.b;
        }
        vs vsVar = new vs(obj, obj2);
        this.d++;
        vs vsVar2 = this.b;
        if (vsVar2 == null) {
            this.a = vsVar;
        } else {
            vsVar2.c = vsVar;
            vsVar.d = vsVar2;
        }
        this.b = vsVar;
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vw) {
            vw vwVar = (vw) obj;
            if (this.d == vwVar.d) {
                Iterator it = iterator();
                Iterator it2 = vwVar.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object next = it2.next();
                    if (entry != null) {
                        if (entry != null || entry.equals(next)) {
                        }
                    } else if (next == null) {
                        next = null;
                        if (entry != null) {
                        }
                    }
                }
                if (!it.hasNext() && !it2.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        vu vuVar = new vu(this.a, this.b);
        this.c.put(vuVar, Boolean.FALSE);
        return vuVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
