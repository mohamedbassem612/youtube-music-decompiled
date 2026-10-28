package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atpg extends aihn implements aiis {
    public static final atpg a;
    public int b;
    public long c;
    public int d;

    static {
        atpg atpgVar = new atpg();
        a = atpgVar;
        aihn.registerDefaultInstance(atpg.class, atpgVar);
    }

    private atpg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new atpg();
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
        return aihn.getParserForClass(atpg.class);
    }
}
