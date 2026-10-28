package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class apsh extends aihn implements aiis {
    public static final apsh a;
    public int b;
    public aigu c;
    public aigu d;
    public aigu e;
    public aiie f = emptyProtobufList();

    static {
        apsh apshVar = new apsh();
        a = apshVar;
        aihn.registerDefaultInstance(apsh.class, apshVar);
    }

    private apsh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b", new Object[]{"b", "c", "d", "e", "f", apsi.class});
        }
        if (iOrdinal == 3) {
            return new apsh();
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
        return aihn.getParserForClass(apsh.class);
    }
}
