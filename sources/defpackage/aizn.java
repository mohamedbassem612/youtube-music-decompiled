package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aizn extends aihn implements aiis {
    public static final aizn a;
    public int b = 0;
    public Object c;

    static {
        aizn aiznVar = new aizn();
        a = aiznVar;
        aihn.registerDefaultInstance(aizn.class, aiznVar);
    }

    private aizn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002;\u0000", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new aizn();
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
        return aihn.getParserForClass(aizn.class);
    }
}
