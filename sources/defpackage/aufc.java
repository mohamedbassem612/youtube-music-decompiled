package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aufc extends aihn implements aiis {
    public static final aufc a;
    public aiie b = emptyProtobufList();

    static {
        aufc aufcVar = new aufc();
        a = aufcVar;
        aihn.registerDefaultInstance(aufc.class, aufcVar);
    }

    private aufc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", ajgi.class});
        }
        if (iOrdinal == 3) {
            return new aufc();
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
        return aihn.getParserForClass(aufc.class);
    }
}
