package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apxe extends aihn implements aiis {
    public static final apxe a;
    public aigu b;
    public aigu c;
    private int d;

    static {
        apxe apxeVar = new apxe();
        a = apxeVar;
        aihn.registerDefaultInstance(apxe.class, apxeVar);
    }

    private apxe() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "b", "c"});
        }
        if (iOrdinal == 3) {
            return new apxe();
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
        return aihn.getParserForClass(apxe.class);
    }
}
