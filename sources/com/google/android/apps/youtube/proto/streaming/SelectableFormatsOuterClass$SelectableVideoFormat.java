package com.google.android.apps.youtube.proto.streaming;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiis;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class SelectableFormatsOuterClass$SelectableVideoFormat extends aihn implements aiis {
    public static final SelectableFormatsOuterClass$SelectableVideoFormat a;
    public FormatIdOuterClass$FormatId b;
    private int c;

    static {
        SelectableFormatsOuterClass$SelectableVideoFormat selectableFormatsOuterClass$SelectableVideoFormat = new SelectableFormatsOuterClass$SelectableVideoFormat();
        a = selectableFormatsOuterClass$SelectableVideoFormat;
        aihn.registerDefaultInstance(SelectableFormatsOuterClass$SelectableVideoFormat.class, selectableFormatsOuterClass$SelectableVideoFormat);
    }

    private SelectableFormatsOuterClass$SelectableVideoFormat() {
    }

    public static SelectableFormatsOuterClass$SelectableVideoFormat getDefaultInstance() {
        return a;
    }

    public static SelectableFormatsOuterClass$SelectableVideoFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SelectableFormatsOuterClass$SelectableVideoFormat) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new SelectableFormatsOuterClass$SelectableVideoFormat();
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
        return aihn.getParserForClass(SelectableFormatsOuterClass$SelectableVideoFormat.class);
    }
}
