package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class SelectableFormatsOuterClass$SelectableAudioFormat extends aihn implements aiis {
    public static final SelectableFormatsOuterClass$SelectableAudioFormat a;
    public FormatIdOuterClass$FormatId b;
    private int c;

    static {
        SelectableFormatsOuterClass$SelectableAudioFormat selectableFormatsOuterClass$SelectableAudioFormat = new SelectableFormatsOuterClass$SelectableAudioFormat();
        a = selectableFormatsOuterClass$SelectableAudioFormat;
        aihn.registerDefaultInstance(SelectableFormatsOuterClass$SelectableAudioFormat.class, selectableFormatsOuterClass$SelectableAudioFormat);
    }

    private SelectableFormatsOuterClass$SelectableAudioFormat() {
    }

    public static SelectableFormatsOuterClass$SelectableAudioFormat getDefaultInstance() {
        return a;
    }

    public static SelectableFormatsOuterClass$SelectableAudioFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SelectableFormatsOuterClass$SelectableAudioFormat) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new SelectableFormatsOuterClass$SelectableAudioFormat();
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
        return aihn.getParserForClass(SelectableFormatsOuterClass$SelectableAudioFormat.class);
    }
}
