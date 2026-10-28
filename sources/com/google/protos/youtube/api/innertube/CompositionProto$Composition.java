package com.google.protos.youtube.api.innertube;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aihf;
import defpackage.aihm;
import defpackage.aihn;
import defpackage.aiie;
import defpackage.aiis;
import defpackage.akcw;
import defpackage.aqot;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class CompositionProto$Composition extends aihn implements aiis {
    public static final CompositionProto$Composition a;
    public aiie c;
    private byte d = 2;
    public aiie b = emptyProtobufList();

    static {
        CompositionProto$Composition compositionProto$Composition = new CompositionProto$Composition();
        a = compositionProto$Composition;
        aihn.registerDefaultInstance(CompositionProto$Composition.class, compositionProto$Composition);
    }

    private CompositionProto$Composition() {
        emptyProtobufList();
        this.c = emptyProtobufList();
    }

    public static CompositionProto$Composition getDefaultInstance() {
        return a;
    }

    public static CompositionProto$Composition parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (CompositionProto$Composition) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    public final void a() {
        aiie aiieVar = this.c;
        if (aiieVar.c()) {
            return;
        }
        this.c = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0002\u0001Л\u0003Л", new Object[]{"b", aqot.class, "c", akcw.class});
            case 3:
                return new CompositionProto$Composition();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(CompositionProto$Composition.class);
            default:
                return null;
        }
    }
}
