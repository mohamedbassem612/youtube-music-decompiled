package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asgf extends aihn implements aiis {
    public static final asgf a;
    public long b;
    public long c;
    private int d;
    private byte e = 2;

    static {
        asgf asgfVar = new asgf();
        a = asgfVar;
        aihn.registerDefaultInstance(asgf.class, asgfVar);
    }

    private asgf() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"d", "b", "c"});
            case 3:
                return new asgf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asgf.class);
            default:
                return null;
        }
    }
}
