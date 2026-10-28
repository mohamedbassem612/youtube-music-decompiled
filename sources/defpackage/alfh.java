package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alfh extends aihn implements aiis {
    public static final alfh a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private ajwo g;
    private ajwo h;
    private angb i;
    private ajng j;
    private byte k = 2;

    static {
        alfh alfhVar = new alfh();
        a = alfhVar;
        aihn.registerDefaultInstance(alfh.class, alfhVar);
    }

    private alfh() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0004\u000e\b\u0000\u0000\b\u0004ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000eᐉ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new alfh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alfh.class);
            default:
                return null;
        }
    }
}
