package defpackage;

import java.util.AbstractMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agnv extends AbstractMap.SimpleEntry {
    final /* synthetic */ agnw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agnv(agnw agnwVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.a = agnwVar;
    }

    @Override // java.util.AbstractMap.SimpleEntry, java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.a.put(getKey(), obj);
        return super.setValue(obj);
    }
}
