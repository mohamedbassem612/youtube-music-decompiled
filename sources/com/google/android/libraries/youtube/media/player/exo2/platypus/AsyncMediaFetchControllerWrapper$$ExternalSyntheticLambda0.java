package com.google.android.libraries.youtube.media.player.exo2.platypus;

import com.google.android.libraries.youtube.media.interfaces.MediaFetchController;
import com.google.protos.youtube.api.innertube.MediaFetchHotConfigOuterClass$MediaFetchHotConfig;
import defpackage.avni;
import defpackage.zik;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda0 implements avni {
    public final /* synthetic */ AsyncMediaFetchControllerWrapper a;

    public /* synthetic */ AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda0(AsyncMediaFetchControllerWrapper asyncMediaFetchControllerWrapper) {
        this.a = asyncMediaFetchControllerWrapper;
    }

    @Override // defpackage.avni
    public final void a(Object obj) {
        AsyncMediaFetchControllerWrapper asyncMediaFetchControllerWrapper = this.a;
        MediaFetchHotConfigOuterClass$MediaFetchHotConfig mediaFetchHotConfigOuterClass$MediaFetchHotConfig = (MediaFetchHotConfigOuterClass$MediaFetchHotConfig) obj;
        synchronized (zik.class) {
            MediaFetchController mediaFetchController = asyncMediaFetchControllerWrapper.a;
            if (mediaFetchController != null) {
                mediaFetchController.onHotConfig(mediaFetchHotConfigOuterClass$MediaFetchHotConfig);
            }
        }
    }
}
