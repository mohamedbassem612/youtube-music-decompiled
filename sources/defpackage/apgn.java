package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apgn extends aihn implements aiis {
    public static final apgn a;
    public int b;
    public aiie c = emptyProtobufList();
    public int d;

    static {
        apgn apgnVar = new apgn();
        a = apgnVar;
        aihn.registerDefaultInstance(apgn.class, apgnVar);
    }

    private apgn() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002᠌\u0000", new Object[]{"b", "c", apgk.class, "d", apep.k});
        }
        if (iOrdinal == 3) {
            return new apgn();
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
        return aihn.getParserForClass(apgn.class);
    }
}
