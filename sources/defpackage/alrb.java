package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alrb extends aihn implements aiis {
    public static final alrb a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public aiie f = emptyProtobufList();

    static {
        alrb alrbVar = new alrb();
        a = alrbVar;
        aihn.registerDefaultInstance(alrb.class, alrbVar);
    }

    private alrb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0001\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006\u001a", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new alrb();
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
        return aihn.getParserForClass(alrb.class);
    }
}
