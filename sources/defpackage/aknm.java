package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aknm extends aihn implements aiis {
    public static final aknm a;
    public int b;
    public long c;
    public long d;
    public long e;
    public aiie f = emptyProtobufList();

    static {
        aknm aknmVar = new aknm();
        a = aknmVar;
        aihn.registerDefaultInstance(aknm.class, aknmVar);
    }

    private aknm() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004\u001b", new Object[]{"b", "c", "d", "e", "f", akne.class});
        }
        if (iOrdinal == 3) {
            return new aknm();
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
        return aihn.getParserForClass(aknm.class);
    }
}
