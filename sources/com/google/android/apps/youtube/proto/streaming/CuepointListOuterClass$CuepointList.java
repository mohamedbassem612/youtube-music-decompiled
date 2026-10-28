package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiie;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class CuepointListOuterClass$CuepointList extends aihn implements aiis {
    public static final CuepointListOuterClass$CuepointList a;
    private byte c = 2;
    public aiie b = emptyProtobufList();

    static {
        CuepointListOuterClass$CuepointList cuepointListOuterClass$CuepointList = new CuepointListOuterClass$CuepointList();
        a = cuepointListOuterClass$CuepointList;
        aihn.registerDefaultInstance(CuepointListOuterClass$CuepointList.class, cuepointListOuterClass$CuepointList);
    }

    private CuepointListOuterClass$CuepointList() {
    }

    public static CuepointListOuterClass$CuepointList getDefaultInstance() {
        return a;
    }

    public static CuepointListOuterClass$CuepointList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (CuepointListOuterClass$CuepointList) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", CuepointListOuterClass$CuepointContext.class});
            case 3:
                return new CuepointListOuterClass$CuepointList();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(CuepointListOuterClass$CuepointList.class);
            default:
                return null;
        }
    }
}
