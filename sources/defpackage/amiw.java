package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amiw extends aihn implements aiis {
    public static final amiw a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public String i = "";
    public aiie p = emptyProtobufList();

    static {
        amiw amiwVar = new amiw();
        a = amiwVar;
        aihn.registerDefaultInstance(amiw.class, amiwVar);
    }

    private amiw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u000e\u0000\u0001\u0001\u0015\u000e\u0000\u0001\u0000\u0001င\u0000\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0007င\u0006\b᠌\u0007\nဈ\t\u000bဇ\n\fဂ\u000b\rဇ\f\u000f᠌\u0012\u0010\u001b\u0014င\u000f\u0015င\u0010", new Object[]{"b", "c", "d", amjn.f, "e", amjn.h, "f", amjn.i, "g", "h", amjn.g, "i", "j", "k", "l", "o", amjn.m, "p", amiv.class, "m", "n"});
        }
        if (iOrdinal == 3) {
            return new amiw();
        }
        if (iOrdinal == 4) {
            return new aihf((int[][]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(amiw.class);
        }
        return null;
    }
}
