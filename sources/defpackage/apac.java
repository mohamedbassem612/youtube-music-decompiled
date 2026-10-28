package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apac extends aihn implements aiis {
    public static final apac a;
    private int b;
    private alay c;
    private apji d;
    private apji e;
    private ajwo f;
    private ajwo g;
    private apji h;
    private alay i;
    private byte j = 2;

    static {
        apac apacVar = new apac();
        a = apacVar;
        aihn.registerDefaultInstance(apac.class, apacVar);
    }

    private apac() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000f\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0004ᐉ\u0003\bᐉ\u0007\tᐉ\b\u000bᐉ\t\fᐉ\n\u000fᐉ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new apac();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apac.class);
            default:
                return null;
        }
    }
}
