package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class almp extends aihn implements aiis {
    public static final almp a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public int e;
    public boolean f;
    public boolean g;
    private byte h = 2;
    public aigj d = aigj.d;

    static {
        almp almpVar = new almp();
        a = almpVar;
        aihn.registerDefaultInstance(almp.class, almpVar);
    }

    private almp() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ည\u0001\u0004᠌\u0002\u0007ဇ\u0005\bဇ\u0006", new Object[]{"b", "c", "d", "e", ajhk.k, "f", "g"});
            case 3:
                return new almp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(almp.class);
            default:
                return null;
        }
    }
}
