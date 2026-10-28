package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apzs extends aihn implements aiis {
    public static final apzs a;
    public int b;
    public askp c;
    public int d;
    private byte e = 2;

    static {
        apzs apzsVar = new apzs();
        a = apzsVar;
        aihn.registerDefaultInstance(apzs.class, apzsVar);
    }

    private apzs() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", apsb.t});
            case 3:
                return new apzs();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apzs.class);
            default:
                return null;
        }
    }
}
