package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alxz extends aihn implements aiis {
    public static final alxz a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public alxy e;
    private byte f = 2;
    public String d = "";

    static {
        alxz alxzVar = new alxz();
        a = alxzVar;
        aihn.registerDefaultInstance(alxz.class, alxzVar);
    }

    private alxz() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဈ\u0001\u0005ဉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new alxz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alxz.class);
            default:
                return null;
        }
    }
}
