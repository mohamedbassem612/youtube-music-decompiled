package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aive extends aihn implements aiis {
    public static final aive a;
    public aiie b;
    public aiie c;
    public int d;
    private int e;

    static {
        aive aiveVar = new aive();
        a = aiveVar;
        aihn.registerDefaultInstance(aive.class, aiveVar);
    }

    private aive() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.b = emptyProtobufList();
        this.c = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0005\u0007\u0003\u0000\u0002\u0000\u0005\u001b\u0006\u001b\u0007᠌\u0000", new Object[]{"e", "b", aivk.class, "c", aivk.class, "d", aiwd.b});
        }
        if (iOrdinal == 3) {
            return new aive();
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
        return aihn.getParserForClass(aive.class);
    }
}
