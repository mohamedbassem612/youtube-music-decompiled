package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.google.android.libraries.multiplatform.elements.image.fetcher.ImageResourceFetcher;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oue implements ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        ImageResourceFetcher.a.evictAll();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 10) {
            ImageResourceFetcher.a.evictAll();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
