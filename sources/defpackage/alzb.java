package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alzb extends aihn implements aiis {
    public static final alzb a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public aqzz f;
    private byte h = 2;
    public String d = "";
    public String e = "";
    public aigj g = aigj.d;

    static {
        alzb alzbVar = new alzb();
        a = alzbVar;
        aihn.registerDefaultInstance(alzb.class, alzbVar);
    }

    private alzb() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\f\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\tည\t\fᐉ\u0003", new Object[]{"b", "c", "d", "e", "g", "f"});
            case 3:
                return new alzb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alzb.class);
            default:
                return null;
        }
    }
}
