package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jrt extends aihn implements aiis {
    public static final jrt a;
    public int b;
    public InnertubeContext$ClientInfo c;
    public aigj d;
    public aigj e;
    public aigj f;
    private byte g = 2;

    static {
        jrt jrtVar = new jrt();
        a = jrtVar;
        aihn.registerDefaultInstance(jrt.class, jrtVar);
    }

    private jrt() {
        aigj aigjVar = aigj.d;
        this.d = aigjVar;
        this.e = aigjVar;
        this.f = aigjVar;
        emptyProtobufList();
        emptyIntList();
    }

    public static jrt getDefaultInstance() {
        return a;
    }

    public static jrt parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jrt) aihn.parseFrom(a, byteBuffer, extensionRegistryLite);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ည\u0001\u0003ည\u0003\u0004ည\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new jrt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(jrt.class);
            default:
                return null;
        }
    }
}
