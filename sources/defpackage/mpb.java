package defpackage;

import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mpb extends BlockRegistryProvider {
    final /* synthetic */ agfr a;

    public mpb(agfr agfrVar) {
        this.a = agfrVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.BlockRegistryProvider
    public final String getOrCreateBlockRegistryRef() {
        return ahno.Z((String) this.a.io());
    }
}
