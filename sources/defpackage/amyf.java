package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amyf extends aihn implements aiis {
    public static final amyf a;
    public int b;
    public amyl d;
    public int e;
    public int f;
    public amyk j;
    public aiie c = emptyProtobufList();
    public aiie g = emptyProtobufList();
    public aiie h = emptyProtobufList();
    public String i = "";
    public String k = "";

    static {
        amyf amyfVar = new amyf();
        a = amyfVar;
        aihn.registerDefaultInstance(amyf.class, amyfVar);
    }

    private amyf() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဋ\u0001\u0004ဋ\u0002\u0005\u001b\u0006ဈ\u0003\u0007ဉ\u0004\bဈ\u0005\t\u001b", new Object[]{"b", "c", amyl.class, "d", "e", "f", "g", amyq.class, "i", "j", "k", "h", amyp.class});
        }
        if (iOrdinal == 3) {
            return new amyf();
        }
        if (iOrdinal == 4) {
            return new aihf((byte[][][]) null, (byte[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal == 6) {
            return aihn.getParserForClass(amyf.class);
        }
        return null;
    }
}
