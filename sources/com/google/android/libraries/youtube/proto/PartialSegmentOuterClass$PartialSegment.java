package com.google.android.libraries.youtube.proto;

import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.apps.youtube.proto.streaming.TimeRangeOuterClass$TimeRange;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class PartialSegmentOuterClass$PartialSegment extends aihn implements aiis {
    public static final PartialSegmentOuterClass$PartialSegment a;
    public int b;
    public FormatIdOuterClass$FormatId c;
    public long d;
    public long e;
    public TimeRangeOuterClass$TimeRange f;
    public long g;

    static {
        PartialSegmentOuterClass$PartialSegment partialSegmentOuterClass$PartialSegment = new PartialSegmentOuterClass$PartialSegment();
        a = partialSegmentOuterClass$PartialSegment;
        aihn.registerDefaultInstance(PartialSegmentOuterClass$PartialSegment.class, partialSegmentOuterClass$PartialSegment);
    }

    private PartialSegmentOuterClass$PartialSegment() {
    }

    public static PartialSegmentOuterClass$PartialSegment getDefaultInstance() {
        return a;
    }

    public static PartialSegmentOuterClass$PartialSegment parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (PartialSegmentOuterClass$PartialSegment) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003\u0005ဂ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new PartialSegmentOuterClass$PartialSegment();
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
        return aihn.getParserForClass(PartialSegmentOuterClass$PartialSegment.class);
    }
}
