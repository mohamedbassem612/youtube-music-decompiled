package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amdm extends aihn implements aiis {
    public static final amdm a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        amdm amdmVar = new amdm();
        a = amdmVar;
        aihn.registerDefaultInstance(amdm.class, amdmVar);
    }

    private amdm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new amdm();
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
        return aihn.getParserForClass(amdm.class);
    }
}
