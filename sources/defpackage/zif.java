package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zif extends aihn implements aiis {
    public static final zif a;
    public long b;
    public int c;
    public long d;

    static {
        zif zifVar = new zif();
        a = zifVar;
        aihn.registerDefaultInstance(zif.class, zifVar);
    }

    private zif() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0002", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new zif();
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
        return aihn.getParserForClass(zif.class);
    }
}
