package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aoxv extends aihn implements aiis {
    public static final aoxv a;
    public static final aihl b;
    public Object d;
    public int c = 0;
    private byte e = 2;

    static {
        aoxv aoxvVar = new aoxv();
        a = aoxvVar;
        aihn.registerDefaultInstance(aoxv.class, aoxvVar);
        b = aihn.newSingularGeneratedExtension(apji.a, aoxvVar, aoxvVar, null, 2430, aika.MESSAGE, aoxv.class);
    }

    private aoxv() {
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
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001м\u0000\u0002м\u0000", new Object[]{"d", "c", aoxu.class, aoxt.class});
            case 3:
                return new aoxv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoxv.class);
            default:
                return null;
        }
    }
}
