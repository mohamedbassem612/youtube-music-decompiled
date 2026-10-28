package com.google.protos.youtube.client.composition.runtime.api;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import defpackage.atxs;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ClientDescriptorProto$ClientDescriptor extends aihn implements aiis {
    public static final ClientDescriptorProto$ClientDescriptor a;
    public int b;
    public int c;
    public int d;

    static {
        ClientDescriptorProto$ClientDescriptor clientDescriptorProto$ClientDescriptor = new ClientDescriptorProto$ClientDescriptor();
        a = clientDescriptorProto$ClientDescriptor;
        aihn.registerDefaultInstance(ClientDescriptorProto$ClientDescriptor.class, clientDescriptorProto$ClientDescriptor);
    }

    private ClientDescriptorProto$ClientDescriptor() {
    }

    public static ClientDescriptorProto$ClientDescriptor getDefaultInstance() {
        return a;
    }

    public static ClientDescriptorProto$ClientDescriptor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientDescriptorProto$ClientDescriptor) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", atxs.r, "d", atxs.s});
        }
        if (iOrdinal == 3) {
            return new ClientDescriptorProto$ClientDescriptor();
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
        return aihn.getParserForClass(ClientDescriptorProto$ClientDescriptor.class);
    }
}
