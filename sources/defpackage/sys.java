package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class sys extends LinkedHashMap {
    final /* synthetic */ syt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sys(syt sytVar, int i) {
        super(i, 0.75f, true);
        this.a = sytVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        syt sytVar = this.a;
        if (sytVar.b.size() <= sytVar.a) {
            return false;
        }
        sytVar.d(entry.getKey());
        return false;
    }
}
