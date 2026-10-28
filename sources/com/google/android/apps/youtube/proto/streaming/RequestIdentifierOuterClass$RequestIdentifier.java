package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class RequestIdentifierOuterClass$RequestIdentifier extends aihn implements aiis {
    public static final RequestIdentifierOuterClass$RequestIdentifier a;
    public String b = "";
    private int c;

    static {
        RequestIdentifierOuterClass$RequestIdentifier requestIdentifierOuterClass$RequestIdentifier = new RequestIdentifierOuterClass$RequestIdentifier();
        a = requestIdentifierOuterClass$RequestIdentifier;
        aihn.registerDefaultInstance(RequestIdentifierOuterClass$RequestIdentifier.class, requestIdentifierOuterClass$RequestIdentifier);
    }

    private RequestIdentifierOuterClass$RequestIdentifier() {
    }

    public static RequestIdentifierOuterClass$RequestIdentifier getDefaultInstance() {
        return a;
    }

    public static RequestIdentifierOuterClass$RequestIdentifier parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (RequestIdentifierOuterClass$RequestIdentifier) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new RequestIdentifierOuterClass$RequestIdentifier();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(RequestIdentifierOuterClass$RequestIdentifier.class);
    }
}
