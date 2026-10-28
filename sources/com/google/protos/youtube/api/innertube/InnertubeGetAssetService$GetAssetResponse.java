package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiie;
import defpackage.aiis;
import defpackage.ajfr;
import defpackage.ajht;
import defpackage.ajhu;
import defpackage.ajhv;
import defpackage.albe;
import defpackage.alop;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class InnertubeGetAssetService$GetAssetResponse extends aihn implements aiis {
    public static final InnertubeGetAssetService$GetAssetResponse a;
    public alop b;
    public ajfr f;
    private int g;
    private albe h;
    private byte i = 2;
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();

    static {
        InnertubeGetAssetService$GetAssetResponse innertubeGetAssetService$GetAssetResponse = new InnertubeGetAssetService$GetAssetResponse();
        a = innertubeGetAssetService$GetAssetResponse;
        aihn.registerDefaultInstance(InnertubeGetAssetService$GetAssetResponse.class, innertubeGetAssetService$GetAssetResponse);
    }

    private InnertubeGetAssetService$GetAssetResponse() {
    }

    public static InnertubeGetAssetService$GetAssetResponse getDefaultInstance() {
        return a;
    }

    public static InnertubeGetAssetService$GetAssetResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (InnertubeGetAssetService$GetAssetResponse) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001̉\u0006\u0000\u0003\u0004\u0001ᐉ\u0000\u0002Л\u0003\u001b\u0004Л\u0005ဉ\u0001̉ᐉ\u0002", new Object[]{"g", "b", "c", ajhv.class, "d", ajhu.class, "e", ajht.class, "f", "h"});
            case 3:
                return new InnertubeGetAssetService$GetAssetResponse();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(InnertubeGetAssetService$GetAssetResponse.class);
            default:
                return null;
        }
    }
}
