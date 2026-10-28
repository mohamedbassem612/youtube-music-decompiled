package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alpm extends aihn implements aiis {
    public static final alpm a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public amyf f;
    private byte g = 2;
    public String d = "";
    public String e = "";

    static {
        alpm alpmVar = new alpm();
        a = alpmVar;
        aihn.registerDefaultInstance(alpm.class, alpmVar);
    }

    private alpm() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new alpm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alpm.class);
            default:
                return null;
        }
    }
}
