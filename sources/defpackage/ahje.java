package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahje extends aihn implements aiis {
    public static final ahje a;
    public int b;
    public int c;
    public ahjc d;
    public aigj e;
    public aigj f;

    static {
        ahje ahjeVar = new ahje();
        a = ahjeVar;
        aihn.registerDefaultInstance(ahje.class, ahjeVar);
    }

    private ahje() {
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
            return new ahje();
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
        return aihn.getParserForClass(ahje.class);
    }
}
