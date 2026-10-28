package com.google.android.libraries.youtube.media.player.exo2.platypus;

import com.google.android.libraries.youtube.media.interfaces.MediaFetchController;
import defpackage.avni;
import defpackage.zik;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda1 implements avni {
    public final /* synthetic */ AsyncMediaFetchControllerWrapper a;

    public /* synthetic */ AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda1(AsyncMediaFetchControllerWrapper asyncMediaFetchControllerWrapper) {
        this.a = asyncMediaFetchControllerWrapper;
    }

    @Override // defpackage.avni
    public final void a(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        AsyncMediaFetchControllerWrapper asyncMediaFetchControllerWrapper = this.a;
        synchronized (zik.class) {
            MediaFetchController mediaFetchController = asyncMediaFetchControllerWrapper.a;
            if (mediaFetchController != null) {
                mediaFetchController.onNetworkStatusChange(iIntValue != 2, iIntValue);
            }
        }
    }
}
