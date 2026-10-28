package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aivp extends aihn implements aiis {
    public static final aivp a;
    public int b;
    public int c;
    public boolean d;
    public float e;
    public int f;
    private int g;
    private int h;

    static {
        aivp aivpVar = new aivp();
        a = aivpVar;
        aihn.registerDefaultInstance(aivp.class, aivpVar);
    }

    private aivp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0002\u0007E\u0005\u0000\u0000\u0000\u0007င\u0005A᠌;Cဇ=Dခ>Eင?", new Object[]{"g", "h", "b", "c", aibu.l, "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aivp();
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
        return aihn.getParserForClass(aivp.class);
    }
}
