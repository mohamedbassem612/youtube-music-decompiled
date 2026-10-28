package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akwu extends aihn implements aiis {
    public static final akwu a;
    private int b;
    private alay c;
    private askp d;
    private askp e;
    private alay f;
    private alay g;
    private askp h;
    private alay i;
    private ajwo j;
    private byte k = 2;

    static {
        akwu akwuVar = new akwu();
        a = akwuVar;
        aihn.registerDefaultInstance(akwu.class, akwuVar);
    }

    private akwu() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u0019\b\u0000\u0000\b\u0001ᐉ\u0000\u0006ᐉ\t\u0007ᐉ\n\nᐉ\u0001\u000bᐉ\u000e\rᐉ\u000b\u0011ᐉ\u0012\u0019ᐉ\u0002", new Object[]{"b", "c", "f", "g", "d", "i", "h", "j", "e"});
            case 3:
                return new akwu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akwu.class);
            default:
                return null;
        }
    }
}
