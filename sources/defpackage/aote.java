package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aote extends aihn implements aiis {
    public static final aote a;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public String f = "";
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public int l;
    public String m;
    public boolean n;
    public aotx o;
    public int p;
    public int q;
    public boolean r;

    static {
        aote aoteVar = new aote();
        a = aoteVar;
        aihn.registerDefaultInstance(aote.class, aoteVar);
    }

    private aote() {
        emptyProtobufList();
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        aigj aigjVar = aigj.d;
        this.m = "";
        emptyProtobufList();
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000f\u0000\u0002\u0002B\u000f\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0005\u0005ဈ\t\u0006᠌\u0000\nဈ\u000b\u000bဈ\f\r᠌\u000e\u000eဋ\u000f\u0011ဈ\u0013\u001dဇ\u001c\u001eဈ\u0007)ဉ&/᠌*1ဇ,B᠌+", new Object[]{"b", "c", "e", "f", "h", "d", aobi.j, "i", "j", "k", aobi.o, "l", "m", "n", "g", "o", "p", aobi.l, "r", "q", aobi.k});
        }
        if (iOrdinal == 3) {
            return new aote();
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
        return aihn.getParserForClass(aote.class);
    }
}
