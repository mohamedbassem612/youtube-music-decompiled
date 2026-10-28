package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alrs extends aihn implements aiis {
    public static final alrs a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    private byte e = 2;
    public aigj d = aigj.d;

    static {
        alrs alrsVar = new alrs();
        a = alrsVar;
        aihn.registerDefaultInstance(alrs.class, alrsVar);
    }

    private alrs() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ည\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new alrs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alrs.class);
            default:
                return null;
        }
    }
}
