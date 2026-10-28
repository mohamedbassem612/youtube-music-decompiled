package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alja extends aihi implements aihj {
    public static final alja a;
    public int b;
    public int c;
    private byte d = 2;

    static {
        alja aljaVar = new alja();
        a = aljaVar;
        aihn.registerDefaultInstance(alja.class, aljaVar);
    }

    private alja() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", akvb.u});
            case 3:
                return new alja();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alja.class);
            default:
                return null;
        }
    }
}
