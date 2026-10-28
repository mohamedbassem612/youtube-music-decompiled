package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atos extends aihn implements aiis {
    public static final atos a;
    public int b;
    public int c;
    public aiip d = aiip.a;

    static {
        atos atosVar = new atos();
        a = atosVar;
        aihn.registerDefaultInstance(atos.class, atosVar);
    }

    private atos() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001င\u0000\u00022", new Object[]{"b", "c", "d", new ahud(aika.STRING, (Object) "", aika.INT32, (Object) 0)});
        }
        if (iOrdinal == 3) {
            return new atos();
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
        return aihn.getParserForClass(atos.class);
    }
}
