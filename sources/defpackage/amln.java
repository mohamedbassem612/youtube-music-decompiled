package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amln extends aihn implements aiis {
    public static final amln a;
    private int b;
    private askp c;
    private askp d;
    private askp e;
    private apji f;
    private askp g;
    private apji h;
    private byte i = 2;

    static {
        amln amlnVar = new amln();
        a = amlnVar;
        aihn.registerDefaultInstance(amln.class, amlnVar);
    }

    private amln() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0017\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0006ᐉ\u0015\u0007ᐉ\u0006\u000fᐉ\u0005\u0017ᐉ\u0002", new Object[]{"b", "c", "d", "h", "g", "f", "e"});
            case 3:
                return new amln();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amln.class);
            default:
                return null;
        }
    }
}
