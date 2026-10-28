package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class audw extends aihn implements aiis {
    public static final audw a;
    public int b;
    public long c;
    public int d;
    public int e;
    public boolean f;
    public long g;

    static {
        audw audwVar = new audw();
        a = audwVar;
        aihn.registerDefaultInstance(audw.class, audwVar);
    }

    private audw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဃ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new audw();
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
        return aihn.getParserForClass(audw.class);
    }
}
