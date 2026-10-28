package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jro extends aihn implements aiis {
    public static final jro a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public int k;

    static {
        jro jroVar = new jro();
        a = jroVar;
        aihn.registerDefaultInstance(jro.class, jroVar);
    }

    private jro() {
        emptyIntList();
    }

    public static jro getDefaultInstance() {
        return a;
    }

    public static jro parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jro) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u000bင\n\u000fဇ\r\u0010င\u000e", new Object[]{"b", "c", aiod.f, "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (iOrdinal == 3) {
            return new jro();
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
        return aihn.getParserForClass(jro.class);
    }
}
