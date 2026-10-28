package androidx.work;

import defpackage.dov;
import defpackage.dyp;
import defpackage.dyx;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends dyx {
    @Override // defpackage.dyx
    public final dyp a(List list) {
        dov dovVar = new dov((byte[]) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((dyp) it.next()).b);
            mapUnmodifiableMap.getClass();
            linkedHashMap.putAll(mapUnmodifiableMap);
        }
        dovVar.i(linkedHashMap);
        return dovVar.g();
    }
}
