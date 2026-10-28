package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atso extends aihi implements aihj {
    public static final atso a;
    public int b;
    public atsm c;
    public atsk d;
    public atsn e;
    private byte f = 2;

    static {
        atso atsoVar = new atso();
        a = atsoVar;
        aihn.registerDefaultInstance(atso.class, atsoVar);
    }

    private atso() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new atso();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atso.class);
            default:
                return null;
        }
    }
}
