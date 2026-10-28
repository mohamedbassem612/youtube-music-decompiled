package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aueh extends aihn implements aiis {
    public static final aueh a;
    public aiie b = emptyProtobufList();
    public aiie c = emptyProtobufList();

    static {
        aueh auehVar = new aueh();
        a = auehVar;
        aihn.registerDefaultInstance(aueh.class, auehVar);
    }

    private aueh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", auen.class, "c", aueo.class});
        }
        if (iOrdinal == 3) {
            return new aueh();
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
        return aihn.getParserForClass(aueh.class);
    }
}
