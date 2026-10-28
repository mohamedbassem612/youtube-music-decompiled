package com.google.protos.c2pa;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class GenerateManifestStoreRequest extends aihn implements aiis {
    public static final GenerateManifestStoreRequest a;

    static {
        GenerateManifestStoreRequest generateManifestStoreRequest = new GenerateManifestStoreRequest();
        a = generateManifestStoreRequest;
        aihn.registerDefaultInstance(GenerateManifestStoreRequest.class, generateManifestStoreRequest);
    }

    private GenerateManifestStoreRequest() {
        emptyProtobufList();
        emptyProtobufList();
    }

    public static GenerateManifestStoreRequest getDefaultInstance() {
        return a;
    }

    public static GenerateManifestStoreRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (GenerateManifestStoreRequest) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (iOrdinal == 3) {
            return new GenerateManifestStoreRequest();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(GenerateManifestStoreRequest.class);
        }
        return null;
    }
}
