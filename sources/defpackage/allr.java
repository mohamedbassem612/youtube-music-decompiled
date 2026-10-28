package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class allr extends aihn implements aiis {
    public static final allr a;
    public alop b;
    public int c;
    public int d;
    private int f;
    private albe g;
    private byte h = 2;
    public aiie e = emptyProtobufList();

    static {
        allr allrVar = new allr();
        a = allrVar;
        aihn.registerDefaultInstance(allr.class, allrVar);
    }

    private allr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001̉\u0005\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ဋ\u0001\u0003Л\u0005ဋ\u0002̉ᐉ\u0003", new Object[]{"f", "b", "c", "e", allo.class, "d", "g"});
            case 3:
                return new allr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(allr.class);
            default:
                return null;
        }
    }
}
