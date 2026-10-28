package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akla extends aihn implements aiis {
    public static final akla a;
    private int b;
    private akle c;
    private aklc d;
    private apji e;
    private apji f;
    private apji g;
    private apji h;
    private apji i;
    private apji j;
    private byte k = 2;

    static {
        akla aklaVar = new akla();
        a = aklaVar;
        aihn.registerDefaultInstance(akla.class, aklaVar);
    }

    private akla() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\tᐉ\u0007\u000bᐉ\b\fᐉ\t\rᐉ\n\u000eᐉ\u000b\u000fᐉ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new akla();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akla.class);
            default:
                return null;
        }
    }
}
