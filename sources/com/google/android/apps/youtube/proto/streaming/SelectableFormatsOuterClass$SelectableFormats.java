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
public final class SelectableFormatsOuterClass$SelectableFormats extends aihn implements aiis {
    public static final SelectableFormatsOuterClass$SelectableFormats a;
    public aiie b;
    public aiie c;

    static {
        SelectableFormatsOuterClass$SelectableFormats selectableFormatsOuterClass$SelectableFormats = new SelectableFormatsOuterClass$SelectableFormats();
        a = selectableFormatsOuterClass$SelectableFormats;
        aihn.registerDefaultInstance(SelectableFormatsOuterClass$SelectableFormats.class, selectableFormatsOuterClass$SelectableFormats);
    }

    private SelectableFormatsOuterClass$SelectableFormats() {
        emptyProtobufList();
        emptyProtobufList();
        this.b = emptyProtobufList();
        this.c = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    public static SelectableFormatsOuterClass$SelectableFormats getDefaultInstance() {
        return a;
    }

    public static SelectableFormatsOuterClass$SelectableFormats parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SelectableFormatsOuterClass$SelectableFormats) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0004\u0005\u0002\u0000\u0002\u0000\u0004\u001b\u0005\u001b", new Object[]{"b", SelectableFormatsOuterClass$SelectableVideoFormat.class, "c", SelectableFormatsOuterClass$SelectableAudioFormat.class});
        }
        if (iOrdinal == 3) {
            return new SelectableFormatsOuterClass$SelectableFormats();
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
        return aihn.getParserForClass(SelectableFormatsOuterClass$SelectableFormats.class);
    }
}
