package defpackage;

import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mmx extends BlockRegistryProvider {
    private final WeakReference a;

    public mmx(BlockRegistryProvider blockRegistryProvider) {
        this.a = new WeakReference(blockRegistryProvider);
    }

    @Override // com.google.android.libraries.elements.interfaces.BlockRegistryProvider
    public final String getOrCreateBlockRegistryRef() {
        BlockRegistryProvider blockRegistryProvider = (BlockRegistryProvider) this.a.get();
        return blockRegistryProvider != null ? blockRegistryProvider.getOrCreateBlockRegistryRef() : "java_weak_ref_null";
    }
}
