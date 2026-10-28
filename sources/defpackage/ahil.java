package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahil extends aihn implements aiis {
    public static final ahil a;
    public int b;
    public int c;
    public ahij d;
    public aigj e;
    public aigj f;

    static {
        ahil ahilVar = new ahil();
        a = ahilVar;
        aihn.registerDefaultInstance(ahil.class, ahilVar);
    }

    private ahil() {
        aigj aigjVar = aigj.d;
        this.e = aigjVar;
        this.f = aigjVar;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new ahil();
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
        return aihn.getParserForClass(ahil.class);
    }
}
