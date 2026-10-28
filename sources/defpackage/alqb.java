package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alqb extends aihn implements aiis {
    public static final alqb a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public int d;
    public alvr e;
    public boolean g;
    public boolean h;
    public alqg j;
    private byte k = 2;
    public String f = "";
    public String i = "";

    static {
        alqb alqbVar = new alqb();
        a = alqbVar;
        aihn.registerDefaultInstance(alqb.class, alqbVar);
    }

    private alqb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\t\b\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ဈ\u0003\u0004ဇ\u0004\u0005᠌\u0001\u0007ဇ\u0006\bဈ\u0007\tဉ\b", new Object[]{"b", "c", "e", "f", "g", "d", apdr.f, "h", "i", "j"});
            case 3:
                return new alqb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alqb.class);
            default:
                return null;
        }
    }
}
