package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class TimeRangeOuterClass$TimeRange extends aihn implements aiis {
    public static final TimeRangeOuterClass$TimeRange a;
    public int b;
    public long c;
    public long d;
    public int e;

    static {
        TimeRangeOuterClass$TimeRange timeRangeOuterClass$TimeRange = new TimeRangeOuterClass$TimeRange();
        a = timeRangeOuterClass$TimeRange;
        aihn.registerDefaultInstance(TimeRangeOuterClass$TimeRange.class, timeRangeOuterClass$TimeRange);
    }

    private TimeRangeOuterClass$TimeRange() {
    }

    public static TimeRangeOuterClass$TimeRange getDefaultInstance() {
        return a;
    }

    public static TimeRangeOuterClass$TimeRange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TimeRangeOuterClass$TimeRange) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new TimeRangeOuterClass$TimeRange();
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
        return aihn.getParserForClass(TimeRangeOuterClass$TimeRange.class);
    }
}
