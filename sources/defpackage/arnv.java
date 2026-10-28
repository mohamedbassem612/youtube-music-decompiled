package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arnv extends aihn implements aiis {
    public static final arnv a;
    private int b;
    private arnw c;
    private byte d = 2;

    static {
        arnv arnvVar = new arnv();
        a = arnvVar;
        aihn.registerDefaultInstance(arnv.class, arnvVar);
    }

    private arnv() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0011\u0011\u0001\u0000\u0000\u0001\u0011ᐉ\r", new Object[]{"b", "c"});
            case 3:
                return new arnv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arnv.class);
            default:
                return null;
        }
    }
}
