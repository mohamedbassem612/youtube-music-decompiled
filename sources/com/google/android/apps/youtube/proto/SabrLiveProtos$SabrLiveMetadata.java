package com.google.android.apps.youtube.proto;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class SabrLiveProtos$SabrLiveMetadata extends aihn implements aiis {
    public static final SabrLiveProtos$SabrLiveMetadata a;
    public long b;
    public long c;
    public long d;
    public boolean e;
    public long f;
    public int g;
    public long h;
    public int i;
    private int j;

    static {
        SabrLiveProtos$SabrLiveMetadata sabrLiveProtos$SabrLiveMetadata = new SabrLiveProtos$SabrLiveMetadata();
        a = sabrLiveProtos$SabrLiveMetadata;
        aihn.registerDefaultInstance(SabrLiveProtos$SabrLiveMetadata.class, sabrLiveProtos$SabrLiveMetadata);
    }

    private SabrLiveProtos$SabrLiveMetadata() {
    }

    public static SabrLiveProtos$SabrLiveMetadata getDefaultInstance() {
        return a;
    }

    public static SabrLiveProtos$SabrLiveMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SabrLiveProtos$SabrLiveMetadata) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0003\u000f\b\u0000\u0000\u0000\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\bဇ\u0006\fဂ\n\rင\u000b\u000eဂ\f\u000fင\r", new Object[]{"j", "b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new SabrLiveProtos$SabrLiveMetadata();
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
        return aihn.getParserForClass(SabrLiveProtos$SabrLiveMetadata.class);
    }
}
