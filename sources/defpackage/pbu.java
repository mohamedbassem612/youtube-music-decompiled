package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pbu extends aihn implements aiis {
    public static final pbu a;
    public int b;
    public pbv c;
    public aiip d = aiip.a;

    static {
        pbu pbuVar = new pbu();
        a = pbuVar;
        aihn.registerDefaultInstance(pbu.class, pbuVar);
    }

    private pbu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"b", "c", "d", new ahud(aika.STRING, "", aika.MESSAGE, pbv.a)});
        }
        if (iOrdinal == 3) {
            return new pbu();
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
        return aihn.getParserForClass(pbu.class);
    }
}
