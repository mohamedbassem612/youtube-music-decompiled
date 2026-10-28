package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apop extends aihn implements aiis {
    public static final apop a;
    public int b;
    public amjx c;
    public apkx d;
    public boolean e;
    private byte f = 2;

    static {
        apop apopVar = new apop();
        a = apopVar;
        aihn.registerDefaultInstance(apop.class, apopVar);
    }

    private apop() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0001\u0002ဉ\u0001\u0003ᐉ\u0000\u0004ဇ\u0002", new Object[]{"b", "d", "c", "e"});
            case 3:
                return new apop();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apop.class);
            default:
                return null;
        }
    }
}
