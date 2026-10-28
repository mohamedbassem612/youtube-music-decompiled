package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apaw extends aihn implements aiis {
    public static final apaw a;
    private int b;
    private apji c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private apji i;
    private ajwo j;
    private apji k;
    private byte l = 2;

    static {
        apaw apawVar = new apaw();
        a = apawVar;
        aihn.registerDefaultInstance(apaw.class, apawVar);
    }

    private apaw() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\u0014\t\u0000\u0000\t\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\u000bᐉ\n\u0014ᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "k", "g"});
            case 3:
                return new apaw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apaw.class);
            default:
                return null;
        }
    }
}
