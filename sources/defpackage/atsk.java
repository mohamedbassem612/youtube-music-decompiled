package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atsk extends aihn implements aiis {
    public static final atsk a;
    public aiie b = emptyProtobufList();

    static {
        atsk atskVar = new atsk();
        a = atskVar;
        aihn.registerDefaultInstance(atsk.class, atskVar);
    }

    private atsk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", atsj.class});
        }
        if (iOrdinal == 3) {
            return new atsk();
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
        return aihn.getParserForClass(atsk.class);
    }
}
