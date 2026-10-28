package com.google.android.libraries.youtube.media.player.exo2.platypus;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class AsyncMediaFetchControllerWrapper$$ExternalSyntheticLambda5 implements Consumer {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        ((PlaybackControllerWrapper) obj).close();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
