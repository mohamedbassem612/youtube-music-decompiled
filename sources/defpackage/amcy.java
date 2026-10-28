package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amcy extends aihn implements aiis {
    public static final amcy a;
    public static final aihl b;
    public int c;
    public int d = -1;
    public int e = -1;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    static {
        amcy amcyVar = new amcy();
        a = amcyVar;
        aihn.registerDefaultInstance(amcy.class, amcyVar);
        b = aihn.newSingularGeneratedExtension(ajwp.a, amcyVar, amcyVar, null, 288976216, aika.MESSAGE, amcy.class);
    }

    private amcy() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\f᠌\u000b", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", akjs.f});
        }
        if (iOrdinal == 3) {
            return new amcy();
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
        return aihn.getParserForClass(amcy.class);
    }
}
