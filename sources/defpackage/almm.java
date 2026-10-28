package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class almm extends aihn implements aiis {
    public static final almm a;
    public int b;
    public InnertubeContext$InnerTubeContext d;
    public alml f;
    public arrc i;
    private byte j = 2;
    public int c = 1;
    public aigj e = aigj.d;
    public String g = "";
    public String h = "";

    static {
        almm almmVar = new almm();
        a = almmVar;
        aihn.registerDefaultInstance(almm.class, almmVar);
    }

    private almm() {
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
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0003\u0001ᐉ\u0001\u0003ည\u0002\u0004ဈ\u0004\u0005ဈ\u0005\nᐉ\u0006\u000bᐉ\u0003\r᠌\u0000", new Object[]{"b", "d", "e", "g", "h", "i", "f", "c", ajpr.e});
            case 3:
                return new almm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(almm.class);
            default:
                return null;
        }
    }
}
