package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alxf extends aihn implements aiis {
    public static final alxf a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public boolean g;
    public int i;
    public int j;
    private byte k = 2;
    public String d = "";
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        alxf alxfVar = new alxf();
        a = alxfVar;
        aihn.registerDefaultInstance(alxf.class, alxfVar);
    }

    private alxf() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u0011\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006ဇ\u0004\bဈ\u0005\u0010᠌\r\u0011᠌\u000e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", allf.g, "j", allf.f});
            case 3:
                return new alxf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alxf.class);
            default:
                return null;
        }
    }
}
