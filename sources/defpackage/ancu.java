package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ancu extends aihn implements aiis {
    public static final ancu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;

    static {
        ancu ancuVar = new ancu();
        a = ancuVar;
        aihn.registerDefaultInstance(ancu.class, ancuVar);
    }

    private ancu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bင\n", new Object[]{"b", "c", anbz.f, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        }
        if (iOrdinal == 3) {
            return new ancu();
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
        return aihn.getParserForClass(ancu.class);
    }
}
