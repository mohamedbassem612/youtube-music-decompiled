package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apld extends aihn implements aiis {
    public static final apld a;
    public int b;
    public aiie c = emptyProtobufList();
    public aiie d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;

    static {
        apld apldVar = new apld();
        a = apldVar;
        aihn.registerDefaultInstance(apld.class, apldVar);
    }

    private apld() {
        emptyProtobufList();
        this.d = emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        int iOrdinal = aihmVar.ordinal();
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u0013\u000b\u0000\u0002\u0000\u0001\u001a\u0002င\u0000\u0003င\u0001\u0004ဇ\u0003\u0006ဇ\u0006\u0007ဇ\u0007\u000bဇ\r\rင\t\u0011ဇ\n\u0012ဇ\u000f\u0013\u001a", new Object[]{"b", "c", "e", "f", "g", "h", "i", "l", "j", "k", "m", "d"});
        }
        if (iOrdinal == 3) {
            return new apld();
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
        return aihn.getParserForClass(apld.class);
    }
}
