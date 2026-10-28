package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class anaj extends aihn implements aiis {
    public static final anaj a;
    public int b;
    public aiie c = emptyProtobufList();
    public anan d;

    static {
        anaj anajVar = new anaj();
        a = anajVar;
        aihn.registerDefaultInstance(anaj.class, anajVar);
    }

    private anaj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"b", "c", anak.class, "d"});
        }
        if (iOrdinal == 3) {
            return new anaj();
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
        return aihn.getParserForClass(anaj.class);
    }
}
