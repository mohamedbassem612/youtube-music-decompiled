package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alik extends aihn implements aiis {
    public static final alik a;
    public ajaa A;
    public aksj B;
    private amhl C;
    private arab D;
    private amft E;
    private byte F = 2;
    public int b;
    public int c;
    public amsq d;
    public amoo e;
    public amve f;
    public anin g;
    public anpk h;
    public aoev i;
    public anew j;
    public aoqs k;
    public apjp l;
    public amzd m;
    public amuh n;
    public aizx o;
    public aode p;
    public ardm q;
    public apdy r;
    public aomk s;
    public aqjb t;
    public apvx u;
    public akww v;
    public apmr w;
    public akjw x;
    public aqrv y;
    public ajdl z;

    static {
        alik alikVar = new alik();
        a = alikVar;
        aihn.registerDefaultInstance(alik.class, alikVar);
    }

    private alik() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.F);
            case 1:
                this.F = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u001c\u0000\u0002\u0004\ue6bb\ue925\u0007\u001c\u0000\u0000\u0005\u0004ဉ3︿Ḗᐉ\u0012\ue647㸷ᐉ\u0002\uef2e㻝ဉ\u0007\uee04㻱ဉ\t\ue698㼮ဉ\u0006\ue621㽲ᐉ\b\ue518䃘ဉ\u0004\ue61a䈏ᐉ\u000e\ue973䈱ဉ\u000f\ue40d䓘ဉ\u0010\ue58c䘐ဉ\u0011\ue8dd䘱ဉ\u0013\ue29c䪉ဉ\u0015\uf45e䴰ဉ\u0016\ue722俫ဉ\u0005\ue124八ဉ\u001a\ue662君ဉ\u001c\uea48摧ဉ\u001e\ue46e炂ဉ!\uf199疺ဉ$ﴌ蹎ဉ%\uefebꕋဉ'\ufaf1ꕋဉ(\ue537밄ᐉ*\ue22f쐋ဉ+\uf5e6﮷\u0006ဉ,\ue6bb\ue925\u0007ဉ0", new Object[]{"b", "c", "B", "D", "C", "g", "i", "f", "h", "d", "j", "k", "l", "m", "n", "o", "p", "e", "E", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A"});
            case 3:
                return new alik();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alik.class);
            default:
                return null;
        }
    }
}
