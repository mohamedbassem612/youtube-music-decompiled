package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amkh extends aihn implements aiis {
    public static final amkh a;
    private int b;
    private askp c;
    private askp d;
    private askp e;
    private askp f;
    private askp g;
    private apji h;
    private askp i;
    private apji j;
    private askp k;
    private askp l;
    private byte m = 2;

    static {
        amkh amkhVar = new amkh();
        a = amkhVar;
        aihn.registerDefaultInstance(amkh.class, amkhVar);
    }

    private amkh() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\nᐉ\b\fᐉ\t\rᐉ\n\u000eᐉ\u000b\u000fᐉ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new amkh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amkh.class);
            default:
                return null;
        }
    }
}
