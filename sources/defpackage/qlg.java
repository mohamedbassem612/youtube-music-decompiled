package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qlg extends aihn implements aiis {
    public static final aihw a = new qle(2);
    public static final qlg b;
    public int c;
    public boolean e;
    public qlh j;
    public boolean k;
    public boolean l;
    public qld m;
    public boolean n;
    public aigj d = aigj.d;
    public String f = "";
    public aiie g = emptyProtobufList();
    public aiie h = emptyProtobufList();
    public aihv i = emptyIntList();

    static {
        qlg qlgVar = new qlg();
        b = qlgVar;
        aihn.registerDefaultInstance(qlg.class, qlgVar);
    }

    private qlg() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u000b\u0000\u0001\u0001\r\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006\rဇ\u0007", new Object[]{"c", "d", "e", "f", "g", "h", "i", fxi.o, "j", "k", "l", "m", "n"});
        }
        if (iOrdinal == 3) {
            return new qlg();
        }
        if (iOrdinal == 4) {
            return new aihf(b);
        }
        if (iOrdinal == 5) {
            return b;
        }
        if (iOrdinal != 6) {
            return null;
        }
        return aihn.getParserForClass(qlg.class);
    }
}
