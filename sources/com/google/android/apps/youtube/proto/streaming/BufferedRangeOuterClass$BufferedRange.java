package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import defpackage.fxd;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class BufferedRangeOuterClass$BufferedRange extends aihn implements aiis {
    public static final BufferedRangeOuterClass$BufferedRange a;
    public int b;
    public FormatIdOuterClass$FormatId c;
    public long d;
    public long e;
    public TimeRangeOuterClass$TimeRange f;
    public int g;
    public long h;

    static {
        BufferedRangeOuterClass$BufferedRange bufferedRangeOuterClass$BufferedRange = new BufferedRangeOuterClass$BufferedRange();
        a = bufferedRangeOuterClass$BufferedRange;
        aihn.registerDefaultInstance(BufferedRangeOuterClass$BufferedRange.class, bufferedRangeOuterClass$BufferedRange);
    }

    private BufferedRangeOuterClass$BufferedRange() {
    }

    public static BufferedRangeOuterClass$BufferedRange getDefaultInstance() {
        return a;
    }

    public static BufferedRangeOuterClass$BufferedRange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (BufferedRangeOuterClass$BufferedRange) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\r\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဉ\u0005\u0007᠌\u0006\rဂ\f", new Object[]{"b", "c", "d", "e", "f", "g", fxd.g, "h"});
        }
        if (iOrdinal == 3) {
            return new BufferedRangeOuterClass$BufferedRange();
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
        return aihn.getParserForClass(BufferedRangeOuterClass$BufferedRange.class);
    }
}
