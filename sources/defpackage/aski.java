package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aski extends aihn implements aiis {
    public static final aski a;
    public int b;
    public aijp c;
    public aigu d;
    public aigu e;
    public aigu f;
    public aiie g = emptyProtobufList();
    public long h;

    static {
        aski askiVar = new aski();
        a = askiVar;
        aihn.registerDefaultInstance(aski.class, askiVar);
    }

    private aski() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006ဂ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", apsi.class, "h"});
        }
        if (iOrdinal == 3) {
            return new aski();
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
        return aihn.getParserForClass(aski.class);
    }
}
