package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agob extends aghe {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ agof b;

    public agob(Map.Entry entry, agof agofVar) {
        this.a = entry;
        this.b = agofVar;
    }

    @Override // defpackage.aghe, java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // defpackage.aghe, java.util.Map.Entry
    public final Object getValue() {
        Map.Entry entry = this.a;
        return this.b.a(entry.getKey(), entry.getValue());
    }
}
