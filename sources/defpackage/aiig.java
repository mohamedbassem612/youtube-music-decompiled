package defpackage;

import com.google.protobuf.MessageLite;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aiig implements Map.Entry {
    public final Map.Entry a;

    public aiig(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        aiii aiiiVar = (aiii) this.a.getValue();
        if (aiiiVar == null) {
            return null;
        }
        return aiiiVar.b();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof MessageLite)) {
            throw new IllegalArgumentException("Lazy field only supports MessageLite values.");
        }
        Map.Entry entry = this.a;
        MessageLite messageLite = ((aiii) entry.getValue()).b;
        entry.setValue(new aiii((MessageLite) obj));
        return messageLite;
    }
}
