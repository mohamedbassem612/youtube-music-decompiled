package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zfh extends LinkedHashMap {
    final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfh(int i, int i2) {
        super(i, 0.75f, true);
        this.a = i2;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        boolean z = size() > this.a;
        if (z) {
            zfj.l((zfi) entry.getValue());
        }
        return z;
    }
}
