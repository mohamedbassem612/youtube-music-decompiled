package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class albd extends aihn implements aiis {
    public static final albd a;
    public static final aihl b;
    public int c;
    public String d = "";
    public aigj e = aigj.d;
    public aiie f = emptyProtobufList();
    public long g;

    static {
        albd albdVar = new albd();
        a = albdVar;
        aihn.registerDefaultInstance(albd.class, albdVar);
        b = aihn.newSingularGeneratedExtension(aksn.a, albdVar, albdVar, null, 426171394, aika.MESSAGE, albd.class);
    }

    private albd() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003\u001a\u0004ဂ\u0002", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (iOrdinal == 3) {
            return new albd();
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
        return aihn.getParserForClass(albd.class);
    }
}
