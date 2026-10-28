package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amdn extends aihn implements aiis {
    public static final amdn a;
    public int b;
    public int c;

    static {
        amdn amdnVar = new amdn();
        a = amdnVar;
        aihn.registerDefaultInstance(amdn.class, amdnVar);
    }

    private amdn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", amed.f});
        }
        if (iOrdinal == 3) {
            return new amdn();
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
        return aihn.getParserForClass(amdn.class);
    }
}
