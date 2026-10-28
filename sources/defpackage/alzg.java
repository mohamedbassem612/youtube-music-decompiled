package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alzg extends aihn implements aiis {
    public static final alzg a;
    public int b;
    public String c = "";
    public String d = "";
    public aihy e = emptyLongList();
    public boolean f;
    public aihy g;
    public aihy h;
    public aihy i;
    public aihy j;
    public aihy k;

    static {
        alzg alzgVar = new alzg();
        a = alzgVar;
        aihn.registerDefaultInstance(alzg.class, alzgVar);
    }

    private alzg() {
        emptyLongList();
        emptyLongList();
        emptyLongList();
        this.g = emptyLongList();
        this.h = emptyLongList();
        this.i = emptyLongList();
        this.j = emptyLongList();
        this.k = emptyLongList();
        emptyLongList();
        emptyLongList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0000\u0001\u0002D\t\u0000\u0006\u0000\u0002ဈ\u0001\u0005\u0015\u0006\u0015\u0007\u0015\b\u0015\t\u0015\n\u0015\u001bဇ\u0006Dဈ\u0002", new Object[]{"b", "c", "e", "g", "h", "i", "j", "k", "f", "d"});
        }
        if (iOrdinal == 3) {
            return new alzg();
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
        return aihn.getParserForClass(alzg.class);
    }
}
