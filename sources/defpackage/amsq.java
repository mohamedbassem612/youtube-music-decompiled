package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amsq extends aihn implements aiis {
    public static final amsq a;
    public boolean b;
    private int c;

    static {
        amsq amsqVar = new amsq();
        a = amsqVar;
        aihn.registerDefaultInstance(amsq.class, amsqVar);
    }

    private amsq() {
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u001a\u001a\u0001\u0000\u0000\u0000\u001aဇ\u0019", new Object[]{"c", "b"});
        }
        if (iOrdinal == 3) {
            return new amsq();
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
        return aihn.getParserForClass(amsq.class);
    }
}
