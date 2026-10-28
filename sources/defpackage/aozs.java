package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aozs extends aihn implements aiis {
    public static final aozs a;
    private int b;
    private apag c;
    private aozv d;
    private aivc e;
    private byte f = 2;

    static {
        aozs aozsVar = new aozs();
        a = aozsVar;
        aihn.registerDefaultInstance(aozs.class, aozsVar);
    }

    private aozs() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0006ᐉ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aozs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aozs.class);
            default:
                return null;
        }
    }
}
