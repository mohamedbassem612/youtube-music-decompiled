package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aigj;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import defpackage.akux;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class InnertubeDrmService$AuthorizedFormat extends aihn implements aiis {
    public static final InnertubeDrmService$AuthorizedFormat a;
    public int b;
    public int c;
    public aigj d = aigj.d;
    public boolean e;

    static {
        InnertubeDrmService$AuthorizedFormat innertubeDrmService$AuthorizedFormat = new InnertubeDrmService$AuthorizedFormat();
        a = innertubeDrmService$AuthorizedFormat;
        aihn.registerDefaultInstance(InnertubeDrmService$AuthorizedFormat.class, innertubeDrmService$AuthorizedFormat);
    }

    private InnertubeDrmService$AuthorizedFormat() {
    }

    public static InnertubeDrmService$AuthorizedFormat getDefaultInstance() {
        return a;
    }

    public static InnertubeDrmService$AuthorizedFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (InnertubeDrmService$AuthorizedFormat) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ည\u0001\u0003ဇ\u0002", new Object[]{"b", "c", akux.f, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new InnertubeDrmService$AuthorizedFormat();
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
        return aihn.getParserForClass(InnertubeDrmService$AuthorizedFormat.class);
    }
}
