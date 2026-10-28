package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alpv extends aihn implements aiis {
    public static final alpv a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public int d;
    public boolean f;
    public int g;
    private byte h = 2;
    public String e = "";

    static {
        alpv alpvVar = new alpv();
        a = alpvVar;
        aihn.registerDefaultInstance(alpv.class, alpvVar);
    }

    private alpv() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဋ\u0001\u0003ဈ\u0002\u0005ဇ\u0003\u0006᠌\u0004", new Object[]{"b", "c", "d", "e", "f", "g", aram.p});
            case 3:
                return new alpv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alpv.class);
            default:
                return null;
        }
    }
}
