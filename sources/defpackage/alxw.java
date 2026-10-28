package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alxw extends aihn implements aiis {
    public static final alxw a;
    public int b;
    public Object d;
    public InnertubeContext$InnerTubeContext e;
    public int c = 0;
    private byte h = 2;
    public aigj f = aigj.d;
    public String g = "";

    static {
        alxw alxwVar = new alxw();
        a = alxwVar;
        aihn.registerDefaultInstance(alxw.class, alxwVar);
    }

    private alxw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ည\u0001\u0004;\u0000\u0005ဈ\u0002\u0006<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", amqw.class});
            case 3:
                return new alxw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alxw.class);
            default:
                return null;
        }
    }
}
