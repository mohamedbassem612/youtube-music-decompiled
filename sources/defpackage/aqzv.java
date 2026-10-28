package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqzv extends aihn implements aiis {
    public static final aqzv a;
    public static final aihl b;
    public int c;
    public boolean d;
    public String e = "";
    public String f = "";

    static {
        aqzv aqzvVar = new aqzv();
        a = aqzvVar;
        aihn.registerDefaultInstance(aqzv.class, aqzvVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqzvVar, aqzvVar, null, 470342095, aika.MESSAGE, aqzv.class);
    }

    private aqzv() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new aqzv();
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
        return aihn.getParserForClass(aqzv.class);
    }
}
