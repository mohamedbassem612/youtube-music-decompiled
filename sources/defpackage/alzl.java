package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class alzl extends aihn implements aiis {
    public static final alzl a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    private byte d = 2;

    static {
        alzl alzlVar = new alzl();
        a = alzlVar;
        aihn.registerDefaultInstance(alzl.class, alzlVar);
    }

    private alzl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new alzl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alzl.class);
            default:
                return null;
        }
    }
}
