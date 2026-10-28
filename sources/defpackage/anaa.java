package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anaa extends aihn implements aiis {
    public static final anaa a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public amzm e;
    public int f;
    private byte g = 2;
    public String d = "";

    static {
        anaa anaaVar = new anaa();
        a = anaaVar;
        aihn.registerDefaultInstance(anaa.class, anaaVar);
    }

    private anaa() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", anbz.q});
            case 3:
                return new anaa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anaa.class);
            default:
                return null;
        }
    }
}
