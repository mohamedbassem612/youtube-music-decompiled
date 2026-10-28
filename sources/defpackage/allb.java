package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class allb extends aihn implements aiis {
    public static final allb a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public long e;
    public int f;
    public aooi g;
    public long j;
    public long k;
    public aldg l;
    public boolean n;
    public aigj o;
    public aigj p;
    public aigj q;
    public int r;
    private byte s = 2;
    public String d = "";
    public String h = "";
    public String i = "";
    public String m = "";

    static {
        allb allbVar = new allb();
        a = allbVar;
        aihn.registerDefaultInstance(allb.class, allbVar);
    }

    private allb() {
        aigj aigjVar = aigj.d;
        this.o = aigjVar;
        this.p = aigjVar;
        this.q = aigjVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0010\u0000\u0001\u0001 \u0010\u0000\u0000\u0003\u0001ᐉ\u0001\u0002ဈ\u0002\u0003ဂ\u0003\u0004င\u0004\u0005ᐉ\u0005\u0006ဈ\u0006\u000fဈ\n\u0010ဃ\u000b\u0016ဂ\u0010\u0018ᐉ\u0011\u001bဈ\u0013\u001cဇ\u0014\u001dည\u0015\u001eည\u0016\u001fည\u0017 ᠌\u0018", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", aiod.t});
            case 3:
                return new allb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(allb.class);
            default:
                return null;
        }
    }
}
