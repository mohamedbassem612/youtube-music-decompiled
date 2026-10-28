package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fwz extends aihn implements aiis {
    public static final fwz a;
    public int b;
    public int c;
    public boolean f;
    public fxc h;
    public fxf i;
    public boolean d = true;
    public String e = "unknown_host";
    public boolean g = true;

    static {
        fwz fwzVar = new fwz();
        a = fwzVar;
        aihn.registerDefaultInstance(fwz.class, fwzVar);
    }

    private fwz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"b", "c", fxi.b, "d", "e", "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new fwz();
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
        return aihn.getParserForClass(fwz.class);
    }
}
