package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alwr extends aihn implements aiis {
    public static final alwr a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public int e;
    private byte h = 2;
    public String d = "";
    public aigj f = aigj.d;
    public String g = "";

    static {
        alwr alwrVar = new alwr();
        a = alwrVar;
        aihn.registerDefaultInstance(alwr.class, alwrVar);
    }

    private alwr() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ည\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", aotj.e, "f", "g"});
            case 3:
                return new alwr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alwr.class);
            default:
                return null;
        }
    }
}
