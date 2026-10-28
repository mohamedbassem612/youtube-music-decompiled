package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahat extends aihn implements aiis {
    public static final ahat a;
    public int b;
    public aiie c = emptyProtobufList();
    public long d;
    public long e;

    static {
        ahat ahatVar = new ahat();
        a = ahatVar;
        aihn.registerDefaultInstance(ahat.class, ahatVar);
    }

    private ahat() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဃ\u0000\u0003ဃ\u0001", new Object[]{"b", "c", ahas.class, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new ahat();
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
        return aihn.getParserForClass(ahat.class);
    }
}
