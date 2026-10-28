package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alkt extends aihn implements aiis {
    public static final alkt a;
    private int b;
    private aism c;
    private apji d;
    private alay e;
    private alks f;
    private ajwo g;
    private ajwo h;
    private ajwo i;
    private apji j;
    private apji k;
    private byte l = 2;

    static {
        alkt alktVar = new alkt();
        a = alktVar;
        aihn.registerDefaultInstance(alkt.class, alktVar);
    }

    private alkt() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\u0019\t\u0000\u0000\t\u0002ᐉ\u0004\u0003ᐉ\u0005\u0006ᐉ\b\bᐉ\t\tᐉ\u000b\u000fᐉ\u0003\u0011ᐉ\u0010\u0016ᐉ\u0000\u0019ᐉ\u0016", new Object[]{"b", "e", "f", "g", "h", "i", "d", "j", "c", "k"});
            case 3:
                return new alkt();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alkt.class);
            default:
                return null;
        }
    }
}
