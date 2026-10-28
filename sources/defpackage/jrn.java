package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jrn extends aihn implements aiis {
    public static final jrn a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        jrn jrnVar = new jrn();
        a = jrnVar;
        aihn.registerDefaultInstance(jrn.class, jrnVar);
    }

    private jrn() {
    }

    public static jrn getDefaultInstance() {
        return a;
    }

    public static jrn parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jrn) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0005င\u0004\u0006င\u0005", new Object[]{"b", "c", aiod.e, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new jrn();
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
        return aihn.getParserForClass(jrn.class);
    }
}
