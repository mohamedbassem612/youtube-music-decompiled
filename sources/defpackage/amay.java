package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amay extends aihn implements aiis {
    public static final amay a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public long e;
    public ajnr g;
    public aqoy h;
    private amas j;
    private byte k = 2;
    public String d = "";
    public String f = "";
    public String i = "";

    static {
        amay amayVar = new amay();
        a = amayVar;
        aihn.registerDefaultInstance(amay.class, amayVar);
    }

    private amay() {
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
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဈ\u0007", new Object[]{"b", "c", "d", "e", "f", "j", "g", "h", "i"});
            case 3:
                return new amay();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amay.class);
            default:
                return null;
        }
    }
}
