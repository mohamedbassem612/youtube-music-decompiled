package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alrh extends aihn implements aiis {
    public static final alrh a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public amlh d;
    public apkf f;
    private byte g = 2;
    public String e = "";

    static {
        alrh alrhVar = new alrh();
        a = alrhVar;
        aihn.registerDefaultInstance(alrh.class, alrhVar);
    }

    private alrh() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new alrh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alrh.class);
            default:
                return null;
        }
    }
}
