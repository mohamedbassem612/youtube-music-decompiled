package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aqms extends aihn implements aiis {
    public static final aqms a;
    public int b;
    private alay c;
    private long d;
    private long e;
    private byte f = 2;

    static {
        aqms aqmsVar = new aqms();
        a = aqmsVar;
        aihn.registerDefaultInstance(aqms.class, aqmsVar);
    }

    private aqms() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new aqms();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqms.class);
            default:
                return null;
        }
    }
}
