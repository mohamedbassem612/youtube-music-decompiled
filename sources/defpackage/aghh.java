package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aghh implements agom {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agom) {
            return n().equals(((agom) obj).n());
        }
        return false;
    }

    public final int hashCode() {
        return n().hashCode();
    }

    public abstract Iterator k();

    public Iterator l() {
        throw null;
    }

    public final String toString() {
        return n().toString();
    }

    @Override // defpackage.agom
    public void u(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.agom
    public final boolean v(Object obj, Object obj2) {
        Collection collection = (Collection) n().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // defpackage.agom
    public boolean w() {
        return h() == 0;
    }

    @Override // defpackage.agom
    public boolean x(Object obj, Object obj2) {
        Collection collection = (Collection) n().get(obj);
        return collection != null && collection.remove(obj2);
    }

    @Override // defpackage.agom
    public void y(agom agomVar) {
        for (Map.Entry entry : agomVar.j()) {
            u(entry.getKey(), entry.getValue());
        }
    }
}
