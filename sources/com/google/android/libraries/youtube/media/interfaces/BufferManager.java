package com.google.android.libraries.youtube.media.interfaces;

import com.google.android.apps.youtube.proto.FormatInitializationMetadataOuterClass$FormatInitializationMetadata;
import com.google.android.apps.youtube.proto.streaming.EndOfTrackOuterClass$EndOfTrack;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.protos.youtube.api.innertube.MediaSource$MediaSourceInfo;
import com.youtube.android.libraries.elements.StatusOr;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BufferManager {
    public abstract void clearPartialSegments(ArrayList arrayList);

    public abstract void discardBuffer();

    public abstract void discardBufferForTrack(int i);

    public abstract void donePushing(QoeError qoeError);

    public abstract BufferState getBufferState(int i);

    public abstract Time getBufferedPosition(int i);

    public abstract FormatInitializationMetadataOuterClass$FormatInitializationMetadata getFormatInitializationMetadata(FormatIdOuterClass$FormatId formatIdOuterClass$FormatId);

    public abstract void onEndOfTrack(EndOfTrackOuterClass$EndOfTrack endOfTrackOuterClass$EndOfTrack);

    public abstract StatusOr startPush(int i, String str, MediaSource$MediaSourceInfo mediaSource$MediaSourceInfo);
}
