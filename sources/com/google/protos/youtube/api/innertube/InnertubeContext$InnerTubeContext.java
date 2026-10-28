package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiie;
import defpackage.aiis;
import defpackage.aisj;
import defpackage.aloi;
import defpackage.aloo;
import defpackage.alor;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class InnertubeContext$InnerTubeContext extends aihn implements aiis {
    public static final InnertubeContext$InnerTubeContext a;
    public int b;
    public InnertubeContext$ClientInfo c;
    public InnertubeContext$ClientInfo d;
    public alor e;
    public aloo f;
    public InnertubeContext$ClickTrackingInfo g;
    public aloi i;
    private byte k = 2;
    public String h = "";
    public aiie j = emptyProtobufList();

    static {
        InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = new InnertubeContext$InnerTubeContext();
        a = innertubeContext$InnerTubeContext;
        aihn.registerDefaultInstance(InnertubeContext$InnerTubeContext.class, innertubeContext$InnerTubeContext);
    }

    private InnertubeContext$InnerTubeContext() {
    }

    public static InnertubeContext$InnerTubeContext getDefaultInstance() {
        return a;
    }

    public static InnertubeContext$InnerTubeContext parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (InnertubeContext$InnerTubeContext) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    public final void a() {
        aiie aiieVar = this.j;
        if (aiieVar.c()) {
            return;
        }
        this.j = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\f\b\u0000\u0001\u0004\u0001ᐉ\u0000\u0003ဉ\u0002\u0005ᐉ\u0004\u0006ဉ\u0005\bᐉ\u0001\tᐉ\b\u000bဈ\u0006\f\u001b", new Object[]{"b", "c", "e", "f", "g", "d", "i", "h", "j", aisj.class});
            case 3:
                return new InnertubeContext$InnerTubeContext();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(InnertubeContext$InnerTubeContext.class);
            default:
                return null;
        }
    }
}
