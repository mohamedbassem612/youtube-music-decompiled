package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alko extends aihn implements aiis {
    public static final alko a;
    private int b;
    private ajwo c;
    private ajwo d;
    private apji e;
    private aosm f;
    private alkv g;
    private alkv h;
    private alkv i;
    private apji j;
    private byte k = 2;

    static {
        alko alkoVar = new alko();
        a = alkoVar;
        aihn.registerDefaultInstance(alko.class, alkoVar);
    }

    private alko() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u001e\b\u0000\u0000\b\u0002ᐉ\u0001\u0003ᐉ\u0002\u0011ᐉ\u000e\u0015ᐉ\u0013\u0016ᐉ\u0014\u0018ᐉ\u0017\u0019ᐉ\u0015\u001eᐉ\u0012", new Object[]{"b", "c", "d", "e", "g", "h", "j", "i", "f"});
            case 3:
                return new alko();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alko.class);
            default:
                return null;
        }
    }
}
