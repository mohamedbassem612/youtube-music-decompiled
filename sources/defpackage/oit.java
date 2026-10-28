package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oit extends aihn implements aiis {
    public static final oit a;
    public int b;
    public oiw c;
    public long d;
    public String e = "";
    public int f;
    public long g;
    public long h;

    static {
        oit oitVar = new oit();
        a = oitVar;
        aihn.registerDefaultInstance(oit.class, oitVar);
    }

    private oit() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003င\u0003\u0004ဂ\u0004\u0005ဂ\u0005\u0006ဈ\u0002", new Object[]{"b", "c", "d", "f", "g", "h", "e"});
        }
        if (iOrdinal == 3) {
            return new oit();
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
        return aihn.getParserForClass(oit.class);
    }
}
