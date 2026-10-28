package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ClientErrorOuterClass$ServiceTrackingData extends aihn implements aiis {
    public static final ClientErrorOuterClass$ServiceTrackingData a;
    public int b;
    public long c;
    public long d;
    public long f;
    public String e = "";
    public String g = "";

    static {
        ClientErrorOuterClass$ServiceTrackingData clientErrorOuterClass$ServiceTrackingData = new ClientErrorOuterClass$ServiceTrackingData();
        a = clientErrorOuterClass$ServiceTrackingData;
        aihn.registerDefaultInstance(ClientErrorOuterClass$ServiceTrackingData.class, clientErrorOuterClass$ServiceTrackingData);
    }

    private ClientErrorOuterClass$ServiceTrackingData() {
    }

    public static ClientErrorOuterClass$ServiceTrackingData getDefaultInstance() {
        return a;
    }

    public static ClientErrorOuterClass$ServiceTrackingData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientErrorOuterClass$ServiceTrackingData) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0006ဈ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new ClientErrorOuterClass$ServiceTrackingData();
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
        return aihn.getParserForClass(ClientErrorOuterClass$ServiceTrackingData.class);
    }
}
