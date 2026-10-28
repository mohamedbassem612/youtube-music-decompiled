package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amyw extends aihn implements aiis {
    public static final amyw a;
    public boolean b;
    public aiie c = emptyProtobufList();
    private int d;

    static {
        amyw amywVar = new amyw();
        a = amywVar;
        aihn.registerDefaultInstance(amyw.class, amywVar);
    }

    private amyw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001b", new Object[]{"d", "b", "c", amyy.class});
        }
        if (iOrdinal == 3) {
            return new amyw();
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
        return aihn.getParserForClass(amyw.class);
    }
}
