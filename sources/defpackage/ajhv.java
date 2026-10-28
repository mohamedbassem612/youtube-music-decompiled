package defpackage;

import com.google.protos.youtube.api.innertube.AssetDetail;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ajhv extends aihn implements aiis {
    public static final ajhv a;
    public Object c;
    public AssetDetail d;
    private int f;
    private apji g;
    public int b = 0;
    private byte h = 2;
    public String e = "";

    static {
        ajhv ajhvVar = new ajhv();
        a = ajhvVar;
        aihn.registerDefaultInstance(ajhv.class, ajhvVar);
    }

    private ajhv() {
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
                return newMessageInfo(a, "\u0004\n\u0001\u0001\u0001\n\n\u0000\u0000\u0002\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005м\u0000\u0006ဈ\u0002\u0007<\u0000\bᐉ\u0003\t<\u0000\n<\u0000", new Object[]{"c", "b", "f", "d", ajhz.class, ajib.class, ajia.class, arlj.class, "e", ajhw.class, "g", ajhy.class, ajhx.class});
            case 3:
                return new ajhv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajhv.class);
            default:
                return null;
        }
    }
}
