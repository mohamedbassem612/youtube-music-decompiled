package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class altl extends aihn implements aiis {
    public static final altl a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public altk e;
    private byte f = 2;
    public aigj d = aigj.d;

    static {
        altl altlVar = new altl();
        a = altlVar;
        aihn.registerDefaultInstance(altl.class, altlVar);
    }

    private altl() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ည\u0001\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new altl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(altl.class);
            default:
                return null;
        }
    }
}
