package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aknf extends aihn implements aiis {
    public static final aknf a;
    public int b;
    public int c;
    public int d;
    public akng e;

    static {
        aknf aknfVar = new aknf();
        a = aknfVar;
        aihn.registerDefaultInstance(aknf.class, aknfVar);
    }

    private aknf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", alip.a, "d", alip.c, "e"});
        }
        if (iOrdinal == 3) {
            return new aknf();
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
        return aihn.getParserForClass(aknf.class);
    }
}
