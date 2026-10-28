package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arlz extends aihn implements aiis {
    public static final arlz a;
    public aiie b = emptyProtobufList();
    public aiie c = emptyProtobufList();

    static {
        arlz arlzVar = new arlz();
        a = arlzVar;
        aihn.registerDefaultInstance(arlz.class, arlzVar);
    }

    private arlz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", arlp.class, "c", armc.class});
        }
        if (iOrdinal == 3) {
            return new arlz();
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
        return aihn.getParserForClass(arlz.class);
    }
}
