package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aocu extends aihn implements aiis {
    public static final aocu a;
    public int b;
    public boolean d;
    public boolean e;
    public int h;
    public int i;
    public aoms j;
    public aigj c = aigj.d;
    public String f = "";
    public aiie g = emptyProtobufList();

    static {
        aocu aocuVar = new aocu();
        a = aocuVar;
        aihn.registerDefaultInstance(aocu.class, aocuVar);
    }

    private aocu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0006\u001b\u0007င\u0004\bင\u0005\tဉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", aoct.class, "h", "i", "j"});
        }
        if (iOrdinal == 3) {
            return new aocu();
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
        return aihn.getParserForClass(aocu.class);
    }
}
