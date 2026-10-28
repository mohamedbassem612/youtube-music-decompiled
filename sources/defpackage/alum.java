package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alum extends aihn implements aiis {
    public static final alum a;
    public int b;
    public Object d;
    public InnertubeContext$InnerTubeContext e;
    public aigj f;
    public aigj g;
    public aigj h;
    public boolean i;
    public String j;
    public int c = 0;
    private byte k = 2;

    static {
        alum alumVar = new alum();
        a = alumVar;
        aihn.registerDefaultInstance(alum.class, alumVar);
    }

    private alum() {
        aigj aigjVar = aigj.d;
        this.f = aigjVar;
        this.g = aigjVar;
        this.h = aigjVar;
        this.j = "";
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
                return newMessageInfo(a, "\u0004\b\u0001\u0001\u0001\u0010\b\u0000\u0000\u0001\u0001ᐉ\u0000\u0002=\u0000\u0005ည\u0003\u0006ည\u0001\u0007ည\u0002\bဇ\u0004\tဈ\u0006\u0010=\u0000", new Object[]{"d", "c", "b", "e", "h", "f", "g", "i", "j"});
            case 3:
                return new alum();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alum.class);
            default:
                return null;
        }
    }
}
