package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqrr extends aihn implements aiis {
    public static final aqrr a;
    public static final aihl b;
    private int d;
    private byte e = 2;
    public String c = "";

    static {
        aqrr aqrrVar = new aqrr();
        a = aqrrVar;
        aihn.registerDefaultInstance(aqrr.class, aqrrVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aqrrVar, aqrrVar, null, 75948536, aika.MESSAGE, aqrr.class);
    }

    private aqrr() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "c"});
            case 3:
                return new aqrr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqrr.class);
            default:
                return null;
        }
    }
}
