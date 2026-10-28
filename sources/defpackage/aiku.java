package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aiku implements Map.Entry, awrp {
    private final /* synthetic */ Map.Entry a;

    public aiku(Map.Entry entry) {
        entry.getClass();
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        return a.bs();
    }
}
