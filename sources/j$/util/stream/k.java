package j$.util.stream;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class k extends AbstractMap implements Map {
    public final Object a;
    public final Object b;

    public k(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new j(this);
    }
}
