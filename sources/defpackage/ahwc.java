package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahwc extends aihn implements aiis {
    public static final ahwc a;
    public aiie b = emptyProtobufList();

    static {
        ahwc ahwcVar = new ahwc();
        a = ahwcVar;
        aihn.registerDefaultInstance(ahwc.class, ahwcVar);
    }

    private ahwc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new ahwc();
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
        return aihn.getParserForClass(ahwc.class);
    }
}
