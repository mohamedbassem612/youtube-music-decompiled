package defpackage;

import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.protobuf.ExtensionRegistryLite;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jrm extends aihn implements aiis {
    public static final jrm a;
    public int b;
    public FormatIdOuterClass$FormatId c;
    public String d = "";

    static {
        jrm jrmVar = new jrm();
        a = jrmVar;
        aihn.registerDefaultInstance(jrm.class, jrmVar);
    }

    private jrm() {
    }

    public static jrm getDefaultInstance() {
        return a;
    }

    public static jrm parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jrm) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ለ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new jrm();
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
        return aihn.getParserForClass(jrm.class);
    }
}
