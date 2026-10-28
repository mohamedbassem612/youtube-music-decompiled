package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apaj extends aihn implements aiis {
    public static final apaj a;
    private int b;
    private apji c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private apji i;
    private apji j;
    private ajwo k;
    private apji l;
    private byte m = 2;

    static {
        apaj apajVar = new apaj();
        a = apajVar;
        aihn.registerDefaultInstance(apaj.class, apajVar);
    }

    private apaj() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0003\u0019\n\u0000\u0000\n\u0003ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\b\tᐉ\t\nᐉ\n\u000bᐉ\u000f\rᐉ\u0010\u0012ᐉ\u000b\u0019ᐉ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "k", "l", "i", "j"});
            case 3:
                return new apaj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apaj.class);
            default:
                return null;
        }
    }
}
