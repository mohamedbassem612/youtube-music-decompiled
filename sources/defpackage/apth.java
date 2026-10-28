package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apth extends aihn implements aiis {
    public static final apth a;
    public static final aihl b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        apth apthVar = new apth();
        a = apthVar;
        aihn.registerDefaultInstance(apth.class, apthVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apthVar, apthVar, null, 73844191, aika.MESSAGE, apth.class);
    }

    private apth() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဈ\u0004", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new apth();
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
        return aihn.getParserForClass(apth.class);
    }
}
