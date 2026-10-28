package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axha extends aihn implements aiis {
    public static final axha a;
    public aijp b;
    public aiie c;
    private int d;

    static {
        axha axhaVar = new axha();
        a = axhaVar;
        aihn.registerDefaultInstance(axha.class, axhaVar);
    }

    private axha() {
        emptyProtobufList();
        this.c = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0004\u0007\u0002\u0000\u0001\u0000\u0004ဉ\u0004\u0007\u001b", new Object[]{"d", "b", "c", axhe.class});
        }
        if (iOrdinal == 3) {
            return new axha();
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
        return aihn.getParserForClass(axha.class);
    }
}
