package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiie;
import defpackage.aiis;
import defpackage.ajlr;
import defpackage.ajpr;
import defpackage.ajtw;
import defpackage.ajty;
import defpackage.aksg;
import defpackage.aned;
import defpackage.aokx;
import defpackage.aorb;
import defpackage.apeo;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ClientErrorOuterClass$ErrorMetaData extends aihn implements aiis {
    public static final ClientErrorOuterClass$ErrorMetaData a;
    public int b;
    public int c;
    public ClientErrorOuterClass$ServiceTrackingData d;
    public aiie e = emptyProtobufList();
    public aorb f;
    public int g;
    public String h;
    public ajlr i;
    public aksg j;
    public aned k;
    public int l;
    public apeo m;
    public aokx n;

    static {
        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData = new ClientErrorOuterClass$ErrorMetaData();
        a = clientErrorOuterClass$ErrorMetaData;
        aihn.registerDefaultInstance(ClientErrorOuterClass$ErrorMetaData.class, clientErrorOuterClass$ErrorMetaData);
    }

    private ClientErrorOuterClass$ErrorMetaData() {
        emptyLongList();
        this.h = "";
    }

    public static ClientErrorOuterClass$ErrorMetaData getDefaultInstance() {
        return a;
    }

    public static ClientErrorOuterClass$ErrorMetaData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientErrorOuterClass$ErrorMetaData) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u0014\f\u0000\u0001\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004\u001b\u0006ဉ\u0003\u0007᠌\u0004\bဈ\u0005\tဉ\u0007\nဉ\t\rင\f\u000fဉ\u000e\u0011ဉ\b\u0014ဉ\u0011", new Object[]{"b", "c", ajpr.m, "d", "e", ajty.class, "f", "g", ajtw.a, "h", "i", "k", "l", "m", "j", "n"});
        }
        if (iOrdinal == 3) {
            return new ClientErrorOuterClass$ErrorMetaData();
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
        return aihn.getParserForClass(ClientErrorOuterClass$ErrorMetaData.class);
    }
}
