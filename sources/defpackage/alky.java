package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alky extends aihn implements aiis {
    public static final alky a;
    public int b;
    public Object d;
    public InnertubeContext$InnerTubeContext e;
    public int f;
    public aiie h;
    private ajwo i;
    public int c = 0;
    private byte j = 2;
    public String g = "";

    static {
        alky alkyVar = new alky();
        a = alkyVar;
        aihn.registerDefaultInstance(alky.class, alkyVar);
    }

    private alky() {
        aigj aigjVar = aigj.d;
        this.h = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0001\u0001\u0001\u000e\b\u0000\u0001\u0003\u0001ᐉ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004Л\u0005ᐉ\u0005\f<\u0000\r;\u0000\u000e;\u0000", new Object[]{"d", "c", "b", "e", "f", alip.o, "g", "h", aisd.class, "i", akkv.class});
            case 3:
                return new alky();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alky.class);
            default:
                return null;
        }
    }
}
