package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alzq extends aihn implements aiis {
    public static final alzq a;
    public int b;
    public alzp c;
    public apji d;
    public apji e;
    private byte f = 2;

    static {
        alzq alzqVar = new alzq();
        a = alzqVar;
        aihn.registerDefaultInstance(alzq.class, alzqVar);
    }

    private alzq() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\b\u0003\u0000\u0000\u0003\u0002ᐉ\u0001\u0007ᐉ\u0006\bᐉ\u0007", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new alzq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alzq.class);
            default:
                return null;
        }
    }
}
