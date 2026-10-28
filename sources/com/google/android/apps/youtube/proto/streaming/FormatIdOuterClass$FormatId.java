package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class FormatIdOuterClass$FormatId extends aihn implements aiis {
    public static final FormatIdOuterClass$FormatId a;
    public int b;
    public int c;
    public long d;
    public String e = "";

    static {
        FormatIdOuterClass$FormatId formatIdOuterClass$FormatId = new FormatIdOuterClass$FormatId();
        a = formatIdOuterClass$FormatId;
        aihn.registerDefaultInstance(FormatIdOuterClass$FormatId.class, formatIdOuterClass$FormatId);
    }

    private FormatIdOuterClass$FormatId() {
    }

    public static FormatIdOuterClass$FormatId getDefaultInstance() {
        return a;
    }

    public static FormatIdOuterClass$FormatId parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (FormatIdOuterClass$FormatId) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဃ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new FormatIdOuterClass$FormatId();
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
        return aihn.getParserForClass(FormatIdOuterClass$FormatId.class);
    }
}
