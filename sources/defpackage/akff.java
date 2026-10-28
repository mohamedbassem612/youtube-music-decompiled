package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akff extends aihn implements aiis {
    public static final akff a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private ajwo f;
    private byte g = 2;

    static {
        akff akffVar = new akff();
        a = akffVar;
        aihn.registerDefaultInstance(akff.class, akffVar);
    }

    private akff() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0004\f\u0004\u0000\u0000\u0004\u0004ᐉ\u0003\u0007ᐉ\u0006\bᐉ\u0007\fᐉ\b", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new akff();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akff.class);
            default:
                return null;
        }
    }
}
