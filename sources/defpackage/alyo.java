package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alyo extends aihn implements aiis {
    public static final alyo a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public alyn d;
    public int e;
    private byte f = 2;

    static {
        alyo alyoVar = new alyo();
        a = alyoVar;
        aihn.registerDefaultInstance(alyo.class, alyoVar);
    }

    private alyo() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0004᠌\u0002", new Object[]{"b", "c", "d", "e", alre.n});
            case 3:
                return new alyo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alyo.class);
            default:
                return null;
        }
    }
}
