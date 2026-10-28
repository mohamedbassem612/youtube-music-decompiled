package com.google.android.libraries.youtube.media.interfaces;

import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.youtube.android.libraries.elements.StatusOr;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MediaCache {
    public abstract StatusOr getCachedBufferedRanges();

    public abstract StatusOr startRead(FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, TimeInterval timeInterval, MediaPushReceiver mediaPushReceiver, boolean z, boolean z2);

    public abstract void startReadFormatInitializationMetadatas(ArrayList arrayList, FormatInitializationMetadataReceiver formatInitializationMetadataReceiver);

    public abstract StatusOr startWrite();
}
