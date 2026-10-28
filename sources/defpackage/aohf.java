package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aohf extends aihn implements aiis {
    public static final aohf a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public long e;
    public long f;
    private byte g = 2;
    public aiie d = emptyProtobufList();

    static {
        aohf aohfVar = new aohf();
        a = aohfVar;
        aihn.registerDefaultInstance(aohf.class, aohfVar);
    }

    private aohf() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0003ဂ\u0001\u0004ဂ\u0002", new Object[]{"b", "c", "d", areu.class, "e", "f"});
            case 3:
                return new aohf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aohf.class);
            default:
                return null;
        }
    }
}
