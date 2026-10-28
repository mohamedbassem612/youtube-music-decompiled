package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class allj extends aihn implements aiis {
    public static final allj a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public apmm d;
    public aigj e;
    public String f;
    public boolean g;
    public arno h;
    public int i;
    public float j;
    public allh k;
    public alli l;
    public aigj m;
    public String n;
    private byte o = 2;

    static {
        allj alljVar = new allj();
        a = alljVar;
        aihn.registerDefaultInstance(allj.class, alljVar);
    }

    private allj() {
        aigj aigjVar = aigj.d;
        this.e = aigjVar;
        this.f = "";
        emptyProtobufList();
        emptyProtobufList();
        this.m = aigjVar;
        emptyIntList();
        this.n = "";
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\f\u0000\u0001\u0001&\f\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0004\u0004ဇ\u0006\u0006ည\u0002\nဉ\f\u000b᠌\r\rခ\u000e\u0013ဉ\u0012\u0018ဉ\u0015\u001eည\u0018&ဈ\u001f", new Object[]{"b", "c", "d", "f", "g", "e", "h", "i", allf.a, "j", "k", "l", "m", "n"});
            case 3:
                return new allj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(allj.class);
            default:
                return null;
        }
    }
}
