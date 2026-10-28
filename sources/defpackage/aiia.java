package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aiia implements Map.Entry {
    final /* synthetic */ aiid a;
    private final Map.Entry b;

    public aiia(aiid aiidVar, Map.Entry entry) {
        this.a = aiidVar;
        this.b = entry;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Map.Entry) && getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a.a.a(this.b.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object value = this.b.setValue(Integer.valueOf(((aihr) obj).getNumber()));
        if (value == null) {
            return null;
        }
        return this.a.a.a(value);
    }
}
