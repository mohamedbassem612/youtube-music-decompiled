package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alsb extends aihn implements aiis {
    public static final alsb a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public String d;
    public amnx e;
    private alsj f;
    private byte g = 2;

    static {
        alsb alsbVar = new alsb();
        a = alsbVar;
        aihn.registerDefaultInstance(alsb.class, alsbVar);
    }

    private alsb() {
        aigj aigjVar = aigj.d;
        this.d = "";
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u000b\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဈ\u0002\nဉ\n\u000bဉ\u0003", new Object[]{"b", "c", "d", "f", "e"});
            case 3:
                return new alsb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alsb.class);
            default:
                return null;
        }
    }
}
