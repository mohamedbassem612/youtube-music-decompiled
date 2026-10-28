package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arpq extends aihn implements aiis {
    public static final arpq a;
    public static final aihl b;
    public int c;
    public String d = "";
    public aigj e = aigj.d;
    public long f;

    static {
        arpq arpqVar = new arpq();
        a = arpqVar;
        aihn.registerDefaultInstance(arpq.class, arpqVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, arpqVar, arpqVar, null, 191762785, aika.MESSAGE, arpq.class);
    }

    private arpq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဂ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (iOrdinal == 3) {
            return new arpq();
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
        return aihn.getParserForClass(arpq.class);
    }
}
