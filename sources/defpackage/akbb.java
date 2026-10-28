package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akbb extends aihn implements aiis {
    public static final akbb a;
    private int b;
    private akba c;
    private akba d;
    private apji e;
    private apji f;
    private apji g;
    private ajwo h;
    private apji i;
    private ajwo j;
    private byte k = 2;

    static {
        akbb akbbVar = new akbb();
        a = akbbVar;
        aihn.registerDefaultInstance(akbb.class, akbbVar);
    }

    private akbb() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u000f\b\u0000\u0000\b\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0006ᐉ\u0007\u0007ᐉ\b\u000bᐉ\u0006\u000eᐉ\u0004\u000fᐉ\t", new Object[]{"b", "c", "d", "e", "h", "i", "g", "f", "j"});
            case 3:
                return new akbb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akbb.class);
            default:
                return null;
        }
    }
}
