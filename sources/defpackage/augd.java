package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class augd extends aihn implements aiis {
    public static final augd a;
    public aiip b = aiip.a;

    static {
        augd augdVar = new augd();
        a = augdVar;
        aihn.registerDefaultInstance(augd.class, augdVar);
    }

    private augd() {
    }

    public final aiip a() {
        aiip aiipVar = this.b;
        if (!aiipVar.b) {
            this.b = aiipVar.a();
        }
        return this.b;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new ahud(aika.INT64, (Object) 0L, aika.MESSAGE, (Object) augc.a)});
        }
        if (iOrdinal == 3) {
            return new augd();
        }
        if (iOrdinal == 4) {
            return new aihf((short[][]) null, (short[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(augd.class);
        }
        return null;
    }
}
