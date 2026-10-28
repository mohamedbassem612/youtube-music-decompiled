package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amdr extends aihn implements aiis {
    public static final amdr a;
    public int b;
    public amdq c;

    static {
        amdr amdrVar = new amdr();
        a = amdrVar;
        aihn.registerDefaultInstance(amdr.class, amdrVar);
    }

    private amdr() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0017\u0017\u0001\u0000\u0000\u0000\u0017ဉ\u0018", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new amdr();
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
        return aihn.getParserForClass(amdr.class);
    }
}
