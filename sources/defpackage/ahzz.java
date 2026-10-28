package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahzz extends aihn implements aiis {
    public static final ahzz a;
    public int b;
    public int c;
    public int e;
    public int f;
    public int h;
    public ahyd i;
    public ahzo j;
    public int k;
    public int l;
    public int m;
    public int n;
    public ahzx o;
    public String d = "";
    public aiie g = emptyProtobufList();
    public aihv p = emptyIntList();

    static {
        ahzz ahzzVar = new ahzz();
        a = ahzzVar;
        aihn.registerDefaultInstance(ahzz.class, ahzzVar);
    }

    private ahzz() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\"\u000e\u0000\u0002\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0005ဉ\b\t᠌\u0002\n᠌\r\f\u001b\r᠌\u000e\u000eဉ\f\u000f᠌\u0010\u0013ဉ\u0012\u0014᠌\u000f\u0015᠌\u0003\u0016ࠬ\"᠌\u0007", new Object[]{"b", "c", ahzu.a, "d", "i", "e", ahzf.j, "k", ahzf.k, "g", ahzy.class, "l", ahxv.t, "j", "n", ahxv.m, "o", "m", ahzf.g, "f", ahzf.i, "p", ahxv.j, "h", ahxv.i});
        }
        if (iOrdinal == 3) {
            return new ahzz();
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
        return aihn.getParserForClass(ahzz.class);
    }
}
