package com.google.net.util.proto2api;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import defpackage.aiov;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class Status$StatusProto extends aihn implements aiis {
    public static final Status$StatusProto a;
    public int b;
    public int c;
    public int f;
    public aiov g;
    private byte h = 2;
    public String d = "";
    public String e = "";

    static {
        Status$StatusProto status$StatusProto = new Status$StatusProto();
        a = status$StatusProto;
        aihn.registerDefaultInstance(Status$StatusProto.class, status$StatusProto);
    }

    private Status$StatusProto() {
    }

    public static Status$StatusProto getDefaultInstance() {
        return a;
    }

    public static Status$StatusProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Status$StatusProto) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ᐉ\u0004\u0006င\u0003", new Object[]{"b", "c", "d", "e", "g", "f"});
            case 3:
                return new Status$StatusProto();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(Status$StatusProto.class);
            default:
                return null;
        }
    }
}
