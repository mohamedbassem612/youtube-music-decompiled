package com.google.android.apps.youtube.proto;

import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.apps.youtube.proto.streaming.TimeRangeOuterClass$TimeRange;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class MediaHeaderOuterClass$MediaHeader extends aihn implements aiis {
    public static final MediaHeaderOuterClass$MediaHeader a;
    public int b;
    public String c = "";
    public long d;
    public long e;
    public boolean f;
    public long g;
    public FormatIdOuterClass$FormatId h;
    public TimeRangeOuterClass$TimeRange i;
    public long j;
    public long k;

    static {
        MediaHeaderOuterClass$MediaHeader mediaHeaderOuterClass$MediaHeader = new MediaHeaderOuterClass$MediaHeader();
        a = mediaHeaderOuterClass$MediaHeader;
        aihn.registerDefaultInstance(MediaHeaderOuterClass$MediaHeader.class, mediaHeaderOuterClass$MediaHeader);
    }

    private MediaHeaderOuterClass$MediaHeader() {
    }

    public static MediaHeaderOuterClass$MediaHeader getDefaultInstance() {
        return a;
    }

    public static MediaHeaderOuterClass$MediaHeader parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (MediaHeaderOuterClass$MediaHeader) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0002\u0011\t\u0000\u0000\u0000\u0002ဈ\u0001\u0006ဂ\u0005\bဇ\t\tဂ\n\rဉ\u000e\u000eဂ\u0006\u000fဉ\u000f\u0010ဃ\u0010\u0011ဂ\u0011", new Object[]{"b", "c", "d", "f", "g", "h", "e", "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new MediaHeaderOuterClass$MediaHeader();
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
        return aihn.getParserForClass(MediaHeaderOuterClass$MediaHeader.class);
    }
}
