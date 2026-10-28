package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amyl extends aihn implements aiis {
    public static final amyl a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public boolean h;
    public int i;

    static {
        amyl amylVar = new amyl();
        a = amylVar;
        aihn.registerDefaultInstance(amyl.class, amylVar);
    }

    private amyl() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဈ\u0004\u0004ဇ\u0005\u0005ဋ\u0006\u0006ဈ\u0001\u0007ဈ\u0002", new Object[]{"b", "c", "f", "g", "h", "i", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new amyl();
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
        return aihn.getParserForClass(amyl.class);
    }
}
