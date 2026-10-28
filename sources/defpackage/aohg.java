package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aohg extends aihn implements aiis {
    public static final aohg a;
    public alop b;
    public boolean c;
    public long d;
    private int f;
    private albe g;
    private byte h = 2;
    public aiie e = emptyProtobufList();

    static {
        aohg aohgVar = new aohg();
        a = aohgVar;
        aihn.registerDefaultInstance(aohg.class, aohgVar);
    }

    private aohg() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001̉\u0005\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004\u001b̉ᐉ\u0003", new Object[]{"f", "b", "c", "d", "e", aohe.class, "g"});
            case 3:
                return new aohg();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aohg.class);
            default:
                return null;
        }
    }
}
