package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class augm extends aihn implements aiis {
    public static final augm a;
    public static final aihl b;
    public int c;
    public aigu d;
    public int e;
    public boolean f;

    static {
        augm augmVar = new augm();
        a = augmVar;
        aihn.registerDefaultInstance(augm.class, augmVar);
        b = aihn.newSingularGeneratedExtension(aufs.a, augmVar, augmVar, null, 1009, aika.MESSAGE, augm.class);
    }

    private augm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0004င\u0003\u0005ဇ\u0004", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new augm();
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
        return aihn.getParserForClass(augm.class);
    }
}
