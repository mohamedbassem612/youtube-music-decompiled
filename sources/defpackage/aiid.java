package defpackage;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiid extends AbstractMap {
    public final aihz a;
    private final Map b;

    public aiid(Map map, aihz aihzVar) {
        this.b = map;
        this.a = aihzVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new aiic(this, this.b.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2 = this.b.get(obj);
        if (obj2 == null) {
            return null;
        }
        return this.a.a(obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut = this.b.put(obj, Integer.valueOf(((aihr) obj2).getNumber()));
        if (objPut == null) {
            return null;
        }
        return this.a.a(objPut);
    }
}
