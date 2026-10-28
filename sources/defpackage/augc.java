package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class augc extends aihn implements aiis {
    public static final augc a;
    public int b;
    public boolean c;
    public boolean d;

    static {
        augc augcVar = new augc();
        a = augcVar;
        aihn.registerDefaultInstance(augc.class, augcVar);
    }

    private augc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဇ\u0000\u0004ဇ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new augc();
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
        return aihn.getParserForClass(augc.class);
    }
}
