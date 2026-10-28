package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class tch extends avh {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/common/fileprovider/FileProviderCompat");
    private final int b = R.xml.file_provider_paths;

    @Override // defpackage.avh, android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        PackageManager packageManager = context.getPackageManager();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(providerInfo.authority, SemanticState.Focused);
        boolean z = false;
        if (providerInfoResolveContentProvider == null) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/common/fileprovider/FileProviderCompat", "isPatchingNecessary", 62, "FileProviderCompat.java")).t("isPatchingNecessary returned false; info == null");
        } else if (providerInfoResolveContentProvider.loadXmlMetaData(packageManager, "android.support.FILE_PROVIDER_PATHS") == null) {
            ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/common/fileprovider/FileProviderCompat", "isPatchingNecessary", 68, "FileProviderCompat.java")).w("isPatchingNecessary returned true and in == null: %b", Boolean.TRUE);
            z = true;
        }
        if (z) {
            Bundle bundle = new Bundle(1);
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", this.b);
            context = new tcg(context, new tci(context.getPackageManager(), new tld(providerInfo.authority, bundle)));
        }
        try {
            super.attachInfo(context, providerInfo);
        } catch (IllegalArgumentException e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/common/fileprovider/FileProviderCompat", "attachInfo", '3', "FileProviderCompat.java")).w("patch needed: %b but we still got an exception", Boolean.valueOf(z));
            throw e;
        }
    }
}
