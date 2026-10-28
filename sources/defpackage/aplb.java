package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aplb extends aihn implements aiis {
    public static final aplb a;
    public int b;
    public Object d;
    public int f;
    public long g;
    public int c = 0;
    public String e = "";

    static {
        aplb aplbVar = new aplb();
        a = aplbVar;
        aihn.registerDefaultInstance(aplb.class, aplbVar);
    }

    private aplb() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဃ\u0002\u0004<\u0000\u0005<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", apkz.class, apky.class});
        }
        if (iOrdinal == 3) {
            return new aplb();
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
        return aihn.getParserForClass(aplb.class);
    }
}
