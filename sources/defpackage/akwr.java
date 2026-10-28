package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akwr extends aihn implements aiis {
    public static final akwr a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private ajwo g;
    private alay h;
    private ajwo i;
    private alay j;
    private byte k = 2;

    static {
        akwr akwrVar = new akwr();
        a = akwrVar;
        aihn.registerDefaultInstance(akwr.class, akwrVar);
    }

    private akwr() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\b\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ᐉ\b\bᐉ\u000b\u000bᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", "i"});
            case 3:
                return new akwr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akwr.class);
            default:
                return null;
        }
    }
}
