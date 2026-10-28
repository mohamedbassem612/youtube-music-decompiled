package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class csn implements Spatializer$OnSpatializerStateChangedListener {
    final /* synthetic */ Runnable a;

    public csn(Runnable runnable) {
        this.a = runnable;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.a.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.a.run();
    }
}
