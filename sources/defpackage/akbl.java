package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akbl extends aihn implements aiis {
    public static final akbl a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private ajkl f;
    private alay g;
    private alay h;
    private alay i;
    private ajng j;
    private byte k = 2;

    static {
        akbl akblVar = new akbl();
        a = akblVar;
        aihn.registerDefaultInstance(akbl.class, akblVar);
    }

    private akbl() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\b\u0001ᐉ\u0000\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\t\nᐉ\u0007\u000bᐉ\b\fᐉ\u0001", new Object[]{"b", "c", "e", "f", "g", "j", "h", "i", "d"});
            case 3:
                return new akbl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akbl.class);
            default:
                return null;
        }
    }
}
