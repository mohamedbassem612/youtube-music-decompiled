package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ardi extends aihn implements aiis {
    public static final ardi a;
    public int b;
    public aiie c = emptyProtobufList();
    public ardh d;

    static {
        ardi ardiVar = new ardi();
        a = ardiVar;
        aihn.registerDefaultInstance(ardi.class, ardiVar);
    }

    private ardi() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new ardi();
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
        return aihn.getParserForClass(ardi.class);
    }
}
