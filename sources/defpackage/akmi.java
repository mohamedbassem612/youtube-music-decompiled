package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akmi extends aihn implements aiis {
    public static final akmi a;
    private int b;
    private aiss c;
    private alay d;
    private apji e;
    private aitu f;
    private alay g;
    private apji h;
    private apji i;
    private aivc j;
    private ajwo k;
    private byte l = 2;

    static {
        akmi akmiVar = new akmi();
        a = akmiVar;
        aihn.registerDefaultInstance(akmi.class, akmiVar);
    }

    private akmi() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\fᐉ\b\rᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new akmi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akmi.class);
            default:
                return null;
        }
    }
}
