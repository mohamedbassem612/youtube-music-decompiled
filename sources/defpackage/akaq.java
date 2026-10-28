package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akaq extends aihn implements aiis {
    public static final akaq a;
    private int b;
    private apji c;
    private apji d;
    private alay e;
    private apji f;
    private apji g;
    private alay h;
    private apji i;
    private byte j = 2;

    static {
        akaq akaqVar = new akaq();
        a = akaqVar;
        aihn.registerDefaultInstance(akaq.class, akaqVar);
    }

    private akaq() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new akaq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akaq.class);
            default:
                return null;
        }
    }
}
