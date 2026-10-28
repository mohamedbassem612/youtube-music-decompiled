package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amyy extends aihn implements aiis {
    public static final amyy a;
    public int b;
    public int c;
    public aiie d;

    static {
        amyy amyyVar = new amyy();
        a = amyyVar;
        aihn.registerDefaultInstance(amyy.class, amyyVar);
    }

    private amyy() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.d = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0005\u001b", new Object[]{"b", "c", amyr.d, "d", amyx.class});
        }
        if (iOrdinal == 3) {
            return new amyy();
        }
        if (iOrdinal == 4) {
            return new aihf((short[][]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(amyy.class);
        }
        return null;
    }
}
