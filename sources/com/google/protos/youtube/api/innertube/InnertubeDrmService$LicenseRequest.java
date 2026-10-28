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
public final class InnertubeDrmService$LicenseRequest extends aihn implements aiis {
    public static final InnertubeDrmService$LicenseRequest a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public int e;
    public boolean j;
    public int k;
    public int l;
    private byte m = 2;
    public String d = "";
    public aigj f = aigj.d;
    public String g = "";
    public String h = "";
    public String i = "";

    static {
        InnertubeDrmService$LicenseRequest innertubeDrmService$LicenseRequest = new InnertubeDrmService$LicenseRequest();
        a = innertubeDrmService$LicenseRequest;
        aihn.registerDefaultInstance(InnertubeDrmService$LicenseRequest.class, innertubeDrmService$LicenseRequest);
    }

    private InnertubeDrmService$LicenseRequest() {
    }

    public static InnertubeDrmService$LicenseRequest getDefaultInstance() {
        return a;
    }

    public static InnertubeDrmService$LicenseRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (InnertubeDrmService$LicenseRequest) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\n\u0000\u0001\u0001\u000e\n\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဇ\u0007\tဋ\b\u000e᠌\r", new Object[]{"b", "c", "d", "e", akux.e, "f", "g", "h", "i", "j", "k", "l", akux.g});
            case 3:
                return new InnertubeDrmService$LicenseRequest();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(InnertubeDrmService$LicenseRequest.class);
            default:
                return null;
        }
    }
}
