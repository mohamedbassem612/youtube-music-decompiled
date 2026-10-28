package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiej extends aihn implements aiis {
    public static final aiej a;
    public aihy b = emptyLongList();

    static {
        aiej aiejVar = new aiej();
        a = aiejVar;
        aihn.registerDefaultInstance(aiej.class, aiejVar);
    }

    private aiej() {
    }

    public final void a() {
        aihy aihyVar = this.b;
        if (aihyVar.c()) {
            return;
        }
        this.b = aihn.mutableCopy(aihyVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0015", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new aiej();
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
        return aihn.getParserForClass(aiej.class);
    }
}
