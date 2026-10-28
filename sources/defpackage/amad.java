package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amad extends aihn implements aiis {
    public static final amad a;
    public int b;
    public int c;
    public InnertubeContext$InnerTubeContext d;
    public int i;
    public boolean k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean r;
    public boolean s;
    public alzy t;
    public boolean u;
    public amyf v;
    public apla w;
    public ajmm y;
    public boolean z;
    private byte A = 2;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String j = "";
    public String l = "";
    public int p = 1;
    public aihv q = emptyIntList();
    public aigj x = aigj.d;

    static {
        amad amadVar = new amad();
        a = amadVar;
        aihn.registerDefaultInstance(amad.class, amadVar);
    }

    private amad() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.A);
            case 1:
                this.A = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0017\u0000\u0002\u0001?\u0017\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0004ဈ\u0002\u0006ဈ\u0003\u0007ဋ\u0005\bဈ\u0004\tဇ\u0007\nဇ\u000b\u000e᠌\u000e\u000f\u0016\u0010ဈ\b\u0018ဇ\n\u0019ဇ\t\u001aဇ\u0014\u001eဇ\u0017\u001fဈ\u0006$ဉ\u001b/ဇ&0ဉ'1ဉ(2ည)4ᐉ+?ဇ1", new Object[]{"b", "c", "d", "e", "f", "g", "i", "h", "k", "o", "p", allf.i, "q", "l", "n", "m", "r", "s", "j", "t", "u", "v", "w", "x", "y", "z"});
            case 3:
                return new amad();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amad.class);
            default:
                return null;
        }
    }
}
