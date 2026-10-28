package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aotc extends aihn implements aiis {
    public static final aotc a;
    private int b;
    private alay c;
    private byte d = 2;

    static {
        aotc aotcVar = new aotc();
        a = aotcVar;
        aihn.registerDefaultInstance(aotc.class, aotcVar);
    }

    private aotc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", "c"});
            case 3:
                return new aotc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aotc.class);
            default:
                return null;
        }
    }
}
