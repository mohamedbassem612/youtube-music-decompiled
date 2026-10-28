package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qlf extends aihn implements aiis {
    public static final aihw a = new qle(0);
    public static final qlf b;
    public int c;
    public boolean e;
    public long g;
    public qlh k;
    public boolean l;
    public boolean m;
    public qld n;
    public boolean o;
    public aigj d = aigj.d;
    public String f = "";
    public aiie h = emptyProtobufList();
    public aiie i = emptyProtobufList();
    public aihv j = emptyIntList();

    static {
        qlf qlfVar = new qlf();
        b = qlfVar;
        aihn.registerDefaultInstance(qlf.class, qlfVar);
    }

    private qlf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\f\u0000\u0001\u0001\r\f\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007\rဇ\b", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", fxi.o, "k", "l", "m", "n", "o"});
        }
        if (iOrdinal == 3) {
            return new qlf();
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
        return aihn.getParserForClass(qlf.class);
    }
}
