package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class augz extends aihn implements aiis {
    public static final augz a;
    public int b = 0;
    public Object c;

    static {
        augz augzVar = new augz();
        a = augzVar;
        aihn.registerDefaultInstance(augz.class, augzVar);
    }

    private augz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", auhk.class});
        }
        if (iOrdinal == 3) {
            return new augz();
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
        return aihn.getParserForClass(augz.class);
    }
}
