package com.google.android.libraries.youtube.composition.logger;

import com.google.android.libraries.youtube.composition.WrappedClientEventProto$WrappedClientEvent;
import com.google.android.libraries.youtube.composition.WrappedMediaEngineMetadataProto$WrappedMediaEngineMetadata;
import io.grpc.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ClientLogger {
    public abstract void logError(Status status);

    public abstract void logErrorWithMetadata(Status status, WrappedMediaEngineMetadataProto$WrappedMediaEngineMetadata wrappedMediaEngineMetadataProto$WrappedMediaEngineMetadata);

    public abstract void logEvent(WrappedClientEventProto$WrappedClientEvent wrappedClientEventProto$WrappedClientEvent);
}
