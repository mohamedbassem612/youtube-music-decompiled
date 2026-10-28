package defpackage;

import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ore extends BlockRegistryProvider {
    final /* synthetic */ agfr a;

    public ore(agfr agfrVar) {
        this.a = agfrVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.BlockRegistryProvider
    public final String getOrCreateBlockRegistryRef() {
        String str = (String) this.a.io();
        return str == null ? "" : str;
    }
}
