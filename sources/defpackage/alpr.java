package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alpr extends aihn implements aiis {
    public static final alpr a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public akoy d;
    private byte f = 2;
    public String e = "";

    static {
        alpr alprVar = new alpr();
        a = alprVar;
        aihn.registerDefaultInstance(alpr.class, alprVar);
    }

    private alpr() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0003\u0005ဈ\u0005", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new alpr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alpr.class);
            default:
                return null;
        }
    }
}
