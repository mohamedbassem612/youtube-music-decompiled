package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class amaw extends aihn implements aiis {
    public static final amaw a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public aigj e;
    public String f;
    public String g;
    public String h;
    public alnt i;
    public aigj j;
    public String k;
    public ajuh l;
    private byte m = 2;
    public String d = "";

    static {
        amaw amawVar = new amaw();
        a = amawVar;
        aihn.registerDefaultInstance(amaw.class, amawVar);
    }

    private amaw() {
        aigj aigjVar = aigj.d;
        this.e = aigjVar;
        this.f = "";
        this.g = "";
        this.h = "";
        this.j = aigjVar;
        this.k = "";
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0005ᐉ\u0006\u0007ည\u0007\bည\u0002\tဈ\b\u000bဈ\u0005\fဉ\t", new Object[]{"b", "c", "d", "f", "g", "i", "j", "e", "k", "h", "l"});
            case 3:
                return new amaw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amaw.class);
            default:
                return null;
        }
    }
}
