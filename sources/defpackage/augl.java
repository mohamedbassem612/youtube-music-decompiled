package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class augl extends aihn implements aiis {
    public static final augl a;
    public static final aihl b;
    public aiie c = emptyProtobufList();

    static {
        augl auglVar = new augl();
        a = auglVar;
        aihn.registerDefaultInstance(augl.class, auglVar);
        b = aihn.newSingularGeneratedExtension(aufs.a, auglVar, auglVar, null, 1005, aika.MESSAGE, augl.class);
    }

    private augl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"c", augk.class});
        }
        if (iOrdinal == 3) {
            return new augl();
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
        return aihn.getParserForClass(augl.class);
    }
}
