package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aoth extends aihn implements aiis {
    public static final aoth a;
    public static final aihl b;
    public String c = "";
    public boolean d;
    private int e;

    static {
        aoth aothVar = new aoth();
        a = aothVar;
        aihn.registerDefaultInstance(aoth.class, aothVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aothVar, aothVar, null, 93440769, aika.MESSAGE, aoth.class);
    }

    private aoth() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"e", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new aoth();
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
        return aihn.getParserForClass(aoth.class);
    }
}
