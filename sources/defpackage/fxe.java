package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fxe extends aihn implements aiis {
    public static final fxe a;
    public int b;
    public long c;
    public long d;
    public int e;
    public long h;
    public String f = "";
    public String g = "";
    public String i = "";

    static {
        fxe fxeVar = new fxe();
        a = fxeVar;
        aihn.registerDefaultInstance(fxe.class, fxeVar);
    }

    private fxe() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"b", "c", "d", "e", fxd.c, "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new fxe();
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
        return aihn.getParserForClass(fxe.class);
    }
}
