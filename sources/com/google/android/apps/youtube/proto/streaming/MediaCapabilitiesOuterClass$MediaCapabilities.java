package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiie;
import defpackage.aiis;
import defpackage.jrn;
import defpackage.jro;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class MediaCapabilitiesOuterClass$MediaCapabilities extends aihn implements aiis {
    public static final MediaCapabilitiesOuterClass$MediaCapabilities a;
    public int b;
    public aiie c = emptyProtobufList();
    public aiie d = emptyProtobufList();
    public int e;

    static {
        MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities = new MediaCapabilitiesOuterClass$MediaCapabilities();
        a = mediaCapabilitiesOuterClass$MediaCapabilities;
        aihn.registerDefaultInstance(MediaCapabilitiesOuterClass$MediaCapabilities.class, mediaCapabilitiesOuterClass$MediaCapabilities);
    }

    private MediaCapabilitiesOuterClass$MediaCapabilities() {
        emptyIntList();
    }

    public static MediaCapabilitiesOuterClass$MediaCapabilities getDefaultInstance() {
        return a;
    }

    public static MediaCapabilitiesOuterClass$MediaCapabilities parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (MediaCapabilitiesOuterClass$MediaCapabilities) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0005င\u0001", new Object[]{"b", "c", jro.class, "d", jrn.class, "e"});
        }
        if (iOrdinal == 3) {
            return new MediaCapabilitiesOuterClass$MediaCapabilities();
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
        return aihn.getParserForClass(MediaCapabilitiesOuterClass$MediaCapabilities.class);
    }
}
