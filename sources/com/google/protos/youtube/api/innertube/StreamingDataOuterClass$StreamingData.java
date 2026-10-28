package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aihv;
import defpackage.aihw;
import defpackage.aiie;
import defpackage.aiis;
import defpackage.akux;
import defpackage.alaw;
import defpackage.anha;
import defpackage.apej;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class StreamingDataOuterClass$StreamingData extends aihn implements aiis {
    public static final aihw a = new apej(4);
    public static final StreamingDataOuterClass$StreamingData b;
    public int c;
    public long d;
    public aiie g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public aihv m;
    private byte n = 2;
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();

    static {
        StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData = new StreamingDataOuterClass$StreamingData();
        b = streamingDataOuterClass$StreamingData;
        aihn.registerDefaultInstance(StreamingDataOuterClass$StreamingData.class, streamingDataOuterClass$StreamingData);
    }

    private StreamingDataOuterClass$StreamingData() {
        emptyProtobufList();
        this.g = emptyProtobufList();
        this.h = "";
        this.i = "";
        this.j = "";
        emptyProtobufList();
        this.k = "";
        this.l = "";
        this.m = emptyIntList();
    }

    public static StreamingDataOuterClass$StreamingData getDefaultInstance() {
        return b;
    }

    public static StreamingDataOuterClass$StreamingData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (StreamingDataOuterClass$StreamingData) aihn.parseFrom(b, byteBuffer, extensionRegistryLite);
    }

    public final void a() {
        aiie aiieVar = this.f;
        if (aiieVar.c()) {
            return;
        }
        this.f = aihn.mutableCopy(aiieVar);
    }

    public final void b() {
        aiie aiieVar = this.e;
        if (aiieVar.c()) {
            return;
        }
        this.e = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(b, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0004\u0003\u0001ဂ\u0000\u0002Л\u0003Л\u0004ဈ\u0001\u0005ဈ\u0002\u0007ဈ\u0004\u000eဈ\u0005\u000fဈ\b\u0010Л\u0011ࠞ", new Object[]{"c", "d", "e", alaw.class, "f", alaw.class, "h", "i", "j", "k", "l", "g", anha.class, "m", akux.f});
            case 3:
                return new StreamingDataOuterClass$StreamingData();
            case 4:
                return new aihf((char[][]) null, (byte[]) null);
            case 5:
                return b;
            case 6:
                return aihn.getParserForClass(StreamingDataOuterClass$StreamingData.class);
            default:
                return null;
        }
    }
}
