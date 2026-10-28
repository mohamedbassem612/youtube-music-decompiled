package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aicw extends aihn implements aiis {
    public static final aicw a;
    public int b;
    public String c = "";
    public aieq d;
    public aiec e;
    public aifa f;
    public aieo g;

    static {
        aicw aicwVar = new aicw();
        a = aicwVar;
        aihn.registerDefaultInstance(aicw.class, aicwVar);
    }

    private aicw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0006ဉ\u0001\u0007ဉ\u0004", new Object[]{"b", "c", "e", "f", "d", "g"});
        }
        if (iOrdinal == 3) {
            return new aicw();
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
        return aihn.getParserForClass(aicw.class);
    }
}
