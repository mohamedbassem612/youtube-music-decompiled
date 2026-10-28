package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alxi extends aihn implements aiis {
    public static final alxi a;
    public int b;
    public alop c;
    public alxj d;
    public apjh e;
    public aigj f;
    private alxn g;
    private alxd h;
    private albe i;
    private apji j;
    private apji k;
    private apnf l;
    private byte m = 2;

    static {
        alxi alxiVar = new alxi();
        a = alxiVar;
        aihn.registerDefaultInstance(alxi.class, alxiVar);
    }

    private alxi() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
        this.f = aigj.d;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001̉\n\u0000\u0000\t\u0001ᐉ\u0001\u0004ᐉ\u0003\u0007ᐉ\u0005\tည\t\u0010ᐉ\u000b\u001bᐉ\r\"ᐉ\u001a#ᐉ\u001b$ᐉ\u001c̉ᐉ\u0012", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "i"});
            case 3:
                return new alxi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alxi.class);
            default:
                return null;
        }
    }
}
