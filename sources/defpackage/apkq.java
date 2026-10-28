package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apkq extends aihn implements aiis {
    public static final apkq a;
    public static final aihl b;
    public aiie c = emptyProtobufList();
    public String d = "";
    public boolean e;
    private int f;

    static {
        apkq apkqVar = new apkq();
        a = apkqVar;
        aihn.registerDefaultInstance(apkq.class, apkqVar);
        b = aihn.newSingularGeneratedExtension(aksn.a, apkqVar, apkqVar, null, 328964737, aika.MESSAGE, apkq.class);
    }

    private apkq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"f", "c", apkp.class, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new apkq();
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
        return aihn.getParserForClass(apkq.class);
    }
}
