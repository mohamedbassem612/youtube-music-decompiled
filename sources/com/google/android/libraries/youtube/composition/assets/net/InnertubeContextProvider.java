package com.google.android.libraries.youtube.composition.assets.net;

import com.google.android.libraries.youtube.composition.common.types.StatusOr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class InnertubeContextProvider {
    public abstract StatusOr getContext(InnertubeServiceType innertubeServiceType);

    public abstract StatusOr getDataSyncId();
}
