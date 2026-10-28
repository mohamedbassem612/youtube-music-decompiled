package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alur extends aihn implements aiis {
    public static final alur a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public int g;
    public aluq i;
    public ajgu j;
    private byte k = 2;
    public String d = "";
    public String e = "";
    public String f = "";
    public aigj h = aigj.d;

    static {
        alur alurVar = new alur();
        a = alurVar;
        aihn.registerDefaultInstance(alur.class, alurVar);
    }

    private alur() {
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
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0006ဈ\u0004\u0007င\u0005\bည\u0006\tဉ\u0007\nဉ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new alur();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alur.class);
            default:
                return null;
        }
    }
}
