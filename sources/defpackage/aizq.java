package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aizq extends aihn implements aiis {
    public static final aihw a = new qle(3);
    public static final aizq b;
    public aiie c = emptyProtobufList();
    public aihv d = emptyIntList();
    public aisp e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    private int n;
    private int o;
    private int p;

    static {
        aizq aizqVar = new aizq();
        b = aizqVar;
        aihn.registerDefaultInstance(aizq.class, aizqVar);
    }

    private aizq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(b, "\u0004\u000b\u0000\u0003\u0002b\u000b\u0000\u0002\u0000\u0002\u001b\u0005ࠞ\rဉ\t\u001bဇ\u0017 ဇ\u001b.ဇ(@ဇ9YဇR[ဇT_ဇXbဇ[", new Object[]{"n", "o", "p", "c", ajcl.class, "d", aibu.m, "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        }
        if (iOrdinal == 3) {
            return new aizq();
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
        return aihn.getParserForClass(aizq.class);
    }
}
