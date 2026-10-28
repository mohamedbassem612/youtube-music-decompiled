package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apnh extends aihn implements aiis {
    public static final apnh a;
    public int b;
    public boolean c;
    public boolean d = true;

    static {
        apnh apnhVar = new apnh();
        a = apnhVar;
        aihn.registerDefaultInstance(apnh.class, apnhVar);
    }

    private apnh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဇ\u0001\u0004ဇ\u0003", new Object[]{"b", "c", "d"});
        }
        if (iOrdinal == 3) {
            return new apnh();
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
        return aihn.getParserForClass(apnh.class);
    }
}
