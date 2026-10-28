package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alti extends aihn implements aiis {
    public static final alti a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public aigj d;
    public aigj e;
    private byte f = 2;

    static {
        alti altiVar = new alti();
        a = altiVar;
        aihn.registerDefaultInstance(alti.class, altiVar);
    }

    private alti() {
        aigj aigjVar = aigj.d;
        this.d = aigjVar;
        this.e = aigjVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ည\u0002\u0005ည\u0005", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new alti();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alti.class);
            default:
                return null;
        }
    }
}
