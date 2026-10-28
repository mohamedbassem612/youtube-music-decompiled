package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class tci extends tcf {
    public static final agrf b = agrf.h("com/google/android/libraries/youtube/common/fileprovider/PatchedPackageManager");
    private final tld c;

    public tci(PackageManager packageManager, tld tldVar) {
        super(packageManager);
        this.c = tldVar;
    }

    @Override // defpackage.tcf, android.content.pm.PackageManager
    public final ProviderInfo resolveContentProvider(String str, int i) {
        tld tldVar = this.c;
        ProviderInfo providerInfoResolveContentProvider = super.resolveContentProvider(str, i);
        if (tldVar.b(providerInfoResolveContentProvider, i)) {
            Bundle bundle = providerInfoResolveContentProvider.metaData;
            agrf agrfVar = b;
            if (bundle == null) {
                ((agrc) ((agrc) agrfVar.c()).k("com/google/android/libraries/youtube/common/fileprovider/PatchedPackageManager$ProviderInfoMetadataPatcher", "patch", 51, "PatchedPackageManager.java")).t("patching ProviderInfo. Metadata was null");
                providerInfoResolveContentProvider.metaData = new Bundle((Bundle) tldVar.a);
            } else {
                ((agrc) ((agrc) agrfVar.c()).k("com/google/android/libraries/youtube/common/fileprovider/PatchedPackageManager$ProviderInfoMetadataPatcher", "patch", 54, "PatchedPackageManager.java")).t("patching ProviderInfo. Metadata was not null");
                providerInfoResolveContentProvider.metaData.putAll((Bundle) tldVar.a);
            }
        }
        if (tldVar.b(providerInfoResolveContentProvider, i)) {
            ((agrc) ((agrc) b.c()).k("com/google/android/libraries/youtube/common/fileprovider/PatchedPackageManager", "resolveContentProvider", 33, "PatchedPackageManager.java")).y("resolveContentProvider flags: %d ret: %s", i, providerInfoResolveContentProvider);
        }
        return providerInfoResolveContentProvider;
    }
}
