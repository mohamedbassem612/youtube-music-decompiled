package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anwl extends aihn implements aiis {
    public static final anwl a;
    public anwj b;
    private int c;

    static {
        anwl anwlVar = new anwl();
        a = anwlVar;
        aihn.registerDefaultInstance(anwl.class, anwlVar);
    }

    private anwl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue713㽔\ue713㽔\u0001\u0000\u0000\u0000\ue713㽔ဉ\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new anwl();
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
        return aihn.getParserForClass(anwl.class);
    }
}
