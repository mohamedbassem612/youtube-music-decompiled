package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ando extends aihn implements aiis {
    public static final ando a;
    public aiie b = emptyProtobufList();
    public aiie c = emptyProtobufList();

    static {
        ando andoVar = new ando();
        a = andoVar;
        aihn.registerDefaultInstance(ando.class, andoVar);
    }

    private ando() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", andw.class, "c", andx.class});
        }
        if (iOrdinal == 3) {
            return new ando();
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
        return aihn.getParserForClass(ando.class);
    }
}
