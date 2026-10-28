package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aprc extends aihn implements aiis {
    public static final aprc a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private ajwo f;
    private alay g;
    private alay h;
    private alay i;
    private byte j = 2;

    static {
        aprc aprcVar = new aprc();
        a = aprcVar;
        aihn.registerDefaultInstance(aprc.class, aprcVar);
    }

    private aprc() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\t\u0007\u0000\u0000\u0007\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\u0003\tᐉ\u0006", new Object[]{"b", "c", "d", "e", "g", "h", "f", "i"});
            case 3:
                return new aprc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aprc.class);
            default:
                return null;
        }
    }
}
