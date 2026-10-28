package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apls extends aihn implements aiis {
    public static final apls a;
    public int b;
    public int c;
    public amud d;
    private byte e = 2;

    static {
        apls aplsVar = new apls();
        a = aplsVar;
        aihn.registerDefaultInstance(apls.class, aplsVar);
    }

    private apls() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0000\u0001\u0001᠌\u0000ϧᐉ\u0001", new Object[]{"b", "c", aixp.o, "d"});
            case 3:
                return new apls();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apls.class);
            default:
                return null;
        }
    }
}
