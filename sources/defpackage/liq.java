package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class liq extends aihn implements aiis {
    public static final liq a;
    public int b;
    public aiie c = emptyProtobufList();
    public String d = "";
    public String e = "";

    static {
        liq liqVar = new liq();
        a = liqVar;
        aihn.registerDefaultInstance(liq.class, liqVar);
    }

    private liq() {
    }

    public final void a() {
        aiie aiieVar = this.c;
        if (aiieVar.c()) {
            return;
        }
        this.c = aihn.mutableCopy(aiieVar);
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\b\u0003\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001", new Object[]{"b", "c", lir.class, "d", "e"});
        }
        if (iOrdinal == 3) {
            return new liq();
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
        return aihn.getParserForClass(liq.class);
    }
}
