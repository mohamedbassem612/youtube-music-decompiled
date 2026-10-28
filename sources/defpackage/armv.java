package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class armv extends aihn implements aiis {
    public static final armv a;
    public aiie b = emptyProtobufList();

    static {
        armv armvVar = new armv();
        a = armvVar;
        aihn.registerDefaultInstance(armv.class, armvVar);
    }

    private armv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", armw.class});
        }
        if (iOrdinal == 3) {
            return new armv();
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
        return aihn.getParserForClass(armv.class);
    }
}
