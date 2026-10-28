package defpackage;

import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acxj extends BlockRegistryProvider {
    public final agfr a;
    private final agfr b = aguu.al(new yyp(this, 14));

    public acxj(agfr agfrVar) {
        this.a = aguu.al(agfrVar);
    }

    @Override // com.google.android.libraries.elements.interfaces.BlockRegistryProvider
    public final String getOrCreateBlockRegistryRef() {
        return (String) this.b.io();
    }
}
