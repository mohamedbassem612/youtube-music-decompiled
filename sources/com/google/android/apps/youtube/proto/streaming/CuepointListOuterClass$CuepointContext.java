package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aigj;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import defpackage.atzu;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class CuepointListOuterClass$CuepointContext extends aihn implements aiis {
    public static final CuepointListOuterClass$CuepointContext a;
    public int b;
    public atzu c;
    public TimeRangeOuterClass$TimeRange d;
    public int e;
    private byte h = 2;
    public String f = "";
    public aigj g = aigj.d;

    static {
        CuepointListOuterClass$CuepointContext cuepointListOuterClass$CuepointContext = new CuepointListOuterClass$CuepointContext();
        a = cuepointListOuterClass$CuepointContext;
        aihn.registerDefaultInstance(CuepointListOuterClass$CuepointContext.class, cuepointListOuterClass$CuepointContext);
    }

    private CuepointListOuterClass$CuepointContext() {
    }

    public static CuepointListOuterClass$CuepointContext getDefaultInstance() {
        return a;
    }

    public static CuepointListOuterClass$CuepointContext parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (CuepointListOuterClass$CuepointContext) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဉ\u0003\u0006င\u0005\bለ\u0007\tည\b", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new CuepointListOuterClass$CuepointContext();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(CuepointListOuterClass$CuepointContext.class);
            default:
                return null;
        }
    }
}
