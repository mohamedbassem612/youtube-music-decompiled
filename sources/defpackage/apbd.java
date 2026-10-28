package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apbd extends aihn implements aiis {
    public static final apbd a;
    private int b;
    private apai c;
    private apji d;
    private aivc e;
    private apji f;
    private byte g = 2;

    static {
        apbd apbdVar = new apbd();
        a = apbdVar;
        aihn.registerDefaultInstance(apbd.class, apbdVar);
    }

    private apbd() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0001\u0007ᐉ\u0003\bᐉ\u0006", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new apbd();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apbd.class);
            default:
                return null;
        }
    }
}
