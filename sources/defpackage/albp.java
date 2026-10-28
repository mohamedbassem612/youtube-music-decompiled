package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class albp extends aihn implements aiis {
    public static final albp a;
    private int b;
    private alcj c;
    private alay d;
    private alay e;
    private alay f;
    private ajwo g;
    private byte h = 2;

    static {
        albp albpVar = new albp();
        a = albpVar;
        aihn.registerDefaultInstance(albp.class, albpVar);
    }

    private albp() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\t\u0005\u0000\u0000\u0005\u0002ᐉ\u0004\u0003ᐉ\u0001\u0004ᐉ\b\u0006ᐉ\u0007\tᐉ\u0000", new Object[]{"b", "e", "d", "g", "f", "c"});
            case 3:
                return new albp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(albp.class);
            default:
                return null;
        }
    }
}
