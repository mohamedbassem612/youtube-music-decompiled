package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lht extends aihn implements aiis {
    public static final lht a;
    public int b;
    public int c;
    public String d = "";
    public aiie e = emptyProtobufList();
    public lhv f;
    public boolean g;
    public boolean h;
    public boolean i;

    static {
        lht lhtVar = new lht();
        a = lhtVar;
        aihn.registerDefaultInstance(lht.class, lhtVar);
    }

    private lht() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"b", "c", "d", "e", lhu.class, "f", "g", "h", "i"});
        }
        if (iOrdinal == 3) {
            return new lht();
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
        return aihn.getParserForClass(lht.class);
    }
}
