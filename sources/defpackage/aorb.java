package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aorb extends aihn implements aiis {
    public static final aorb a;
    public int b;
    public aihv c = emptyIntList();
    public String d = "";

    static {
        aorb aorbVar = new aorb();
        a = aorbVar;
        aihn.registerDefaultInstance(aorb.class, aorbVar);
    }

    private aorb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ࠬ\u0002ဈ\u0000", new Object[]{"b", "c", aomi.q, "d"});
        }
        if (iOrdinal == 3) {
            return new aorb();
        }
        if (iOrdinal == 4) {
            return new aihf((char[]) null, (char[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(aorb.class);
        }
        return null;
    }
}
