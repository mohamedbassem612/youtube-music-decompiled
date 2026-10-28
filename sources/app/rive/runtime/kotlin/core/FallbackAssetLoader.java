package app.rive.runtime.kotlin.core;

import android.content.Context;
import app.rive.runtime.kotlin.RiveAnimationView;
import defpackage.awqx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class FallbackAssetLoader extends FileAssetLoader {
    public static final int $stable = NativeObject.$stable;
    private final List loaders;

    public FallbackAssetLoader(Context context, boolean z, FileAssetLoader fileAssetLoader) {
        context.getClass();
        this.loaders = new ArrayList();
        if (fileAssetLoader != null) {
            appendLoader(fileAssetLoader);
        }
        if (z) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            appendLoader(new CDNAssetLoader(applicationContext));
        }
    }

    private final void resetCDNLoader(boolean z, Context context) {
        int i;
        Iterator it = this.loaders.iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (((FileAssetLoader) it.next()) instanceof CDNAssetLoader) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            i = i2;
        } else if (z) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            appendLoader(new CDNAssetLoader(applicationContext));
            return;
        }
        if (i < 0 || z) {
            return;
        }
        FileAssetLoader fileAssetLoader = (FileAssetLoader) this.loaders.remove(i);
        getDependencies().remove(fileAssetLoader);
        fileAssetLoader.release();
    }

    public final void appendLoader(FileAssetLoader fileAssetLoader) {
        fileAssetLoader.getClass();
        this.loaders.add(fileAssetLoader);
        getDependencies().add(fileAssetLoader);
    }

    public final List getLoaders() {
        return this.loaders;
    }

    @Override // app.rive.runtime.kotlin.core.FileAssetLoader
    public boolean loadContents(FileAsset fileAsset, byte[] bArr) {
        fileAsset.getClass();
        bArr.getClass();
        List list = this.loaders;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((FileAssetLoader) it.next()).loadContents(fileAsset, bArr)) {
                return true;
            }
        }
        return false;
    }

    public final void prependLoader(FileAssetLoader fileAssetLoader) {
        fileAssetLoader.getClass();
        this.loaders.add(0, fileAssetLoader);
        getDependencies().add(fileAssetLoader);
    }

    public final void resetWith$third_party_java_android_libs_rive_rive_android(RiveAnimationView.Builder builder) {
        builder.getClass();
        FileAssetLoader assetLoader$third_party_java_android_libs_rive_rive_android = builder.getAssetLoader$third_party_java_android_libs_rive_rive_android();
        if (assetLoader$third_party_java_android_libs_rive_rive_android != null) {
            prependLoader(assetLoader$third_party_java_android_libs_rive_rive_android);
        }
        boolean shouldLoadCDNAssets$third_party_java_android_libs_rive_rive_android = builder.getShouldLoadCDNAssets$third_party_java_android_libs_rive_rive_android();
        Context applicationContext = builder.getContext$third_party_java_android_libs_rive_rive_android().getApplicationContext();
        applicationContext.getClass();
        resetCDNLoader(shouldLoadCDNAssets$third_party_java_android_libs_rive_rive_android, applicationContext);
    }

    public static /* synthetic */ void getLoaders$annotations() {
    }

    public /* synthetic */ FallbackAssetLoader(Context context, boolean z, FileAssetLoader fileAssetLoader, int i, awqx awqxVar) {
        this(context, (!((i & 2) == 0)) | z, (i & 4) != 0 ? null : fileAssetLoader);
    }
}
