package com.google.android.libraries.youtube.composition;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class WrappedMediaEngineMetadataProto$WrappedMediaEngineMetadata extends aihn implements aiis {
    public static final WrappedMediaEngineMetadataProto$WrappedMediaEngineMetadata a;

    static {
        WrappedMediaEngineMetadataProto$WrappedMediaEngineMetadata wrappedMediaEngineMetadataProto$WrappedMediaEngineMetadata = new WrappedMediaEngineMetadataProto$WrappedMediaEngineMetadata();
        a = wrappedMediaEngineMetadataProto$WrappedMediaEngineMetadata;
        aihn.registerDefaultInstance(WrappedMediaEngineMetadataProto$WrappedMediaEngineMetadata.class, wrappedMediaEngineMetadataProto$WrappedMediaEngineMetadata);
    }

    private WrappedMediaEngineMetadataProto$WrappedMediaEngineMetadata() {
    }

    public static WrappedMediaEngineMetadataProto$WrappedMediaEngineMetadata getDefaultInstance() {
        return a;
    }

    public static WrappedMediaEngineMetadataProto$WrappedMediaEngineMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (WrappedMediaEngineMetadataProto$WrappedMediaEngineMetadata) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new WrappedMediaEngineMetadataProto$WrappedMediaEngineMetadata();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(WrappedMediaEngineMetadataProto$WrappedMediaEngineMetadata.class);
        }
        return null;
    }
}
