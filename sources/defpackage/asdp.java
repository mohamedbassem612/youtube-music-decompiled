package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asdp extends aihn implements aiis {
    public static final asdp a;
    public int b;
    public boolean c;
    public String d = "";

    static {
        asdp asdpVar = new asdp();
        a = asdpVar;
        aihn.registerDefaultInstance(asdp.class, asdpVar);
    }

    private asdp() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ለ\u0001", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new asdp();
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
        return aihn.getParserForClass(asdp.class);
    }
}
