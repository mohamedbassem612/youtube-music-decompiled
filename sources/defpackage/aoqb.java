package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoqb extends aihn implements aiis {
    public static final aoqb a;
    public long b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public ajdr g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    private int l;
    private int m;

    static {
        aoqb aoqbVar = new aoqb();
        a = aoqbVar;
        aihn.registerDefaultInstance(aoqb.class, aoqbVar);
    }

    private aoqb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0000\u0002\u0012\uf119觉\n\u0000\u0000\u0000\u0012ဂ\u0010\u0019င\u0015\u001fဇ\u001b$ဇ\u001f)ဇ#.ဇ(/ဇ)?ဇ8Eဇ>\uf119觉ဉ%", new Object[]{"l", "m", "b", "c", "d", "e", "f", "h", "i", "j", "k", "g"});
        }
        if (iOrdinal == 3) {
            return new aoqb();
        }
        if (iOrdinal == 4) {
            return new aihf(a);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(aoqb.class);
    }
}
