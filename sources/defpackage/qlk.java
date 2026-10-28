package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qlk extends aihn implements aiis {
    public static final qlk a;
    public int b;
    public aiie c = emptyProtobufList();
    public String d = "";

    static {
        qlk qlkVar = new qlk();
        a = qlkVar;
        aihn.registerDefaultInstance(qlk.class, qlkVar);
    }

    private qlk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new qlk();
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
        return aihn.getParserForClass(qlk.class);
    }
}
