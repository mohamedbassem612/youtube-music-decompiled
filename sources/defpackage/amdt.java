package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amdt extends aihn implements aiis {
    public static final amdt a;
    public int b;
    public int c;

    static {
        amdt amdtVar = new amdt();
        a = amdtVar;
        aihn.registerDefaultInstance(amdt.class, amdtVar);
    }

    private amdt() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", amed.j});
        }
        if (iOrdinal == 3) {
            return new amdt();
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
        return aihn.getParserForClass(amdt.class);
    }
}
