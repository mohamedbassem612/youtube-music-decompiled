package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aigj;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiie;
import defpackage.aiis;
import defpackage.akux;
import defpackage.alop;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class InnertubeDrmService$LicenseResponse extends aihn implements aiis {
    public static final InnertubeDrmService$LicenseResponse a;
    public alop b;
    public int c;
    public boolean e;
    public boolean h;
    private int i;
    private byte j = 2;
    public String d = "";
    public aigj f = aigj.d;
    public aiie g = emptyProtobufList();

    static {
        InnertubeDrmService$LicenseResponse innertubeDrmService$LicenseResponse = new InnertubeDrmService$LicenseResponse();
        a = innertubeDrmService$LicenseResponse;
        aihn.registerDefaultInstance(InnertubeDrmService$LicenseResponse.class, innertubeDrmService$LicenseResponse);
    }

    private InnertubeDrmService$LicenseResponse() {
    }

    public static InnertubeDrmService$LicenseResponse getDefaultInstance() {
        return a;
    }

    public static InnertubeDrmService$LicenseResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (InnertubeDrmService$LicenseResponse) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0001\u0001ᐉ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ည\u0004\u0006\u001b\u000bဇ\t", new Object[]{"i", "b", "c", akux.h, "d", "e", "f", "g", InnertubeDrmService$AuthorizedFormat.class, "h"});
            case 3:
                return new InnertubeDrmService$LicenseResponse();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(InnertubeDrmService$LicenseResponse.class);
            default:
                return null;
        }
    }
}
