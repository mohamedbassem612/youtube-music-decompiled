package j$.util.stream;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class j extends AbstractSet {
    public final /* synthetic */ k a;

    public j(k kVar) {
        this.a = kVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Boolean bool = Boolean.FALSE;
        k kVar = this.a;
        return j$.desugar.sun.nio.fs.g.C(new Object[]{new AbstractMap.SimpleImmutableEntry(bool, kVar.b), new AbstractMap.SimpleImmutableEntry(Boolean.TRUE, kVar.a)}).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 2;
    }
}
