package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apbx extends aihn implements aiis {
    public static final aihw a = new qle(10);
    public static final apbx b;
    public int c;
    public boolean d;
    public boolean e;
    public amup f;
    public int g;
    public int h;
    public boolean i;
    public boolean k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public ajdf q;
    public aihv r;
    public boolean s;
    public boolean t;
    private int u;
    public String j = "";
    public String l = "";

    static {
        apbx apbxVar = new apbx();
        b = apbxVar;
        aihn.registerDefaultInstance(apbx.class, apbxVar);
    }

    private apbx() {
        emptyIntList();
        this.r = emptyIntList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u0011\u0000\u0002\u0001)\u0011\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0005᠌\u0004\u0007င\u0006\bဇ\u0007\tဈ\b\nဇ\t\u000bဈ\n\u001bဇ\u001a\u001dဇ\u001c\u001fဇ\u001e ဇ\u001f%ဉ#'ࠞ(ဇ%)ဇ&", new Object[]{"c", "u", "d", "e", "f", "g", ajhk.p, "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", aobi.r, "s", "t"});
        }
        if (iOrdinal == 3) {
            return new apbx();
        }
        if (iOrdinal == 4) {
            return new aihf(b);
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(apbx.class);
    }
}
