package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aodc extends aihn implements aiis {
    public static final aodc a;
    public int b;
    public akxd c;

    static {
        aodc aodcVar = new aodc();
        a = aodcVar;
        aihn.registerDefaultInstance(aodc.class, aodcVar);
    }

    private aodc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0003", new Object[]{"b", "c"});
        }
        if (iOrdinal == 3) {
            return new aodc();
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
        return aihn.getParserForClass(aodc.class);
    }
}
