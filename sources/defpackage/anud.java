package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class anud extends aihn implements aiis {
    public static final anud a;
    public int b;
    public String c = "";
    public aiie d;
    public long e;
    public anxf f;
    public int g;
    public long h;
    public long i;

    static {
        anud anudVar = new anud();
        a = anudVar;
        aihn.registerDefaultInstance(anud.class, anudVar);
    }

    private anud() {
        aigj aigjVar = aigj.d;
        this.d = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u001a\u0004ဂ\u0002\u0006ဉ\u0003\u0007᠌\u0004\bဂ\u0005\tဂ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", akjs.i, "h", "i"});
        }
        if (iOrdinal == 3) {
            return new anud();
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
        return aihn.getParserForClass(anud.class);
    }
}
