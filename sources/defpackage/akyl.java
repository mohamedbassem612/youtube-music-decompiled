package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akyl extends aihn implements aiis {
    public static final akyl a;
    private int b;
    private alay c;
    private alay d;
    private ajng e;
    private ajng f;
    private ajng g;
    private ajng h;
    private ajwo i;
    private byte j = 2;

    static {
        akyl akylVar = new akyl();
        a = akylVar;
        aihn.registerDefaultInstance(akyl.class, akylVar);
    }

    private akyl() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0003\u0015\u0007\u0000\u0000\u0007\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\b\bᐉ\n\u0015ᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "h", "i", "g"});
            case 3:
                return new akyl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akyl.class);
            default:
                return null;
        }
    }
}
