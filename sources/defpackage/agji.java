package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agji extends AbstractMap implements Serializable, aghp {
    final agjo a;
    private transient Set b;

    public agji(agjo agjoVar) {
        this.a = agjoVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.a.g = this;
    }

    @Override // defpackage.aghp
    public final aghp a() {
        throw null;
    }

    @Override // defpackage.aghp
    /* JADX INFO: renamed from: b */
    public final Set values() {
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        agjj agjjVar = new agjj(this.a);
        this.b = agjjVar;
        return agjjVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        agjo agjoVar = this.a;
        int iE = agjoVar.e(obj);
        if (iE == -1) {
            return null;
        }
        return agjoVar.a[iE];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.a.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.a.l(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        agjo agjoVar = this.a;
        int iX = aguu.X(obj);
        int iF = agjoVar.f(obj, iX);
        if (iF == -1) {
            return null;
        }
        Object obj2 = agjoVar.a[iF];
        agjoVar.j(iF, iX);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return this.a.keySet();
    }
}
