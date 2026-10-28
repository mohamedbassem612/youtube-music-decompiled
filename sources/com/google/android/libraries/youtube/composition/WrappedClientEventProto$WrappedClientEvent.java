package com.google.android.libraries.youtube.composition;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class WrappedClientEventProto$WrappedClientEvent extends aihn implements aiis {
    public static final WrappedClientEventProto$WrappedClientEvent a;
    private byte b = 2;

    static {
        WrappedClientEventProto$WrappedClientEvent wrappedClientEventProto$WrappedClientEvent = new WrappedClientEventProto$WrappedClientEvent();
        a = wrappedClientEventProto$WrappedClientEvent;
        aihn.registerDefaultInstance(WrappedClientEventProto$WrappedClientEvent.class, wrappedClientEventProto$WrappedClientEvent);
    }

    private WrappedClientEventProto$WrappedClientEvent() {
    }

    public static WrappedClientEventProto$WrappedClientEvent getDefaultInstance() {
        return a;
    }

    public static WrappedClientEventProto$WrappedClientEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (WrappedClientEventProto$WrappedClientEvent) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.b);
            case 1:
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0000", null);
            case 3:
                return new WrappedClientEventProto$WrappedClientEvent();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(WrappedClientEventProto$WrappedClientEvent.class);
            default:
                return null;
        }
    }
}
