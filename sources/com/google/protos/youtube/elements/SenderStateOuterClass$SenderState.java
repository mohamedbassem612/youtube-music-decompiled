package com.google.protos.youtube.elements;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihh;
import defpackage.aihi;
import defpackage.aihj;
import defpackage.aihm;
import defpackage.aihn;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class SenderStateOuterClass$SenderState extends aihi implements aihj {
    public static final SenderStateOuterClass$SenderState a;
    private byte b = 2;

    static {
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = new SenderStateOuterClass$SenderState();
        a = senderStateOuterClass$SenderState;
        aihn.registerDefaultInstance(SenderStateOuterClass$SenderState.class, senderStateOuterClass$SenderState);
    }

    private SenderStateOuterClass$SenderState() {
    }

    public static SenderStateOuterClass$SenderState getDefaultInstance() {
        return a;
    }

    public static SenderStateOuterClass$SenderState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SenderStateOuterClass$SenderState) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new SenderStateOuterClass$SenderState();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(SenderStateOuterClass$SenderState.class);
            default:
                return null;
        }
    }
}
