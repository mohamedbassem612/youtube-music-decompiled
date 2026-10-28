package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alob extends aihn implements aiis {
    public static final alob a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    private byte g = 2;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        alob alobVar = new alob();
        a = alobVar;
        aihn.registerDefaultInstance(alob.class, alobVar);
    }

    private alob() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0006ဈ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new alob();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alob.class);
            default:
                return null;
        }
    }
}
