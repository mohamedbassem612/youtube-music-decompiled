package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqie extends aihn implements aiis {
    public static final aqie a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public String i = "";
    public String j = "";
    public akgr k;
    public ancp l;
    public anhh m;

    static {
        aqie aqieVar = new aqie();
        a = aqieVar;
        aihn.registerDefaultInstance(aqie.class, aqieVar);
    }

    private aqie() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u001a\u000b\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005᠌\u0004\u0006ဇ\u0005\u0011ဈ\u0010\u0012ဈ\u0011\u0015ဉ\u0012\u0017ဉ\u0016\u001aဉ\u0014", new Object[]{"b", "c", "d", "e", "f", "g", aqgv.h, "h", "i", "j", "k", "m", "l"});
        }
        if (iOrdinal == 3) {
            return new aqie();
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
        return aihn.getParserForClass(aqie.class);
    }
}
