package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class armf extends aihn implements aiis {
    public static final armf a;
    public String b = "";
    public aiie c = emptyProtobufList();
    private int d;

    static {
        armf armfVar = new armf();
        a = armfVar;
        aihn.registerDefaultInstance(armf.class, armfVar);
    }

    private armf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "b", "c", arme.class});
        }
        if (iOrdinal == 3) {
            return new armf();
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
        return aihn.getParserForClass(armf.class);
    }
}
