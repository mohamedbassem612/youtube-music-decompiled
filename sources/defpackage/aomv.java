package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aomv extends aihn implements aiis {
    public static final aomv a;
    public static final aihl b;
    private int c;
    private ajwo d;
    private byte e = 2;

    static {
        aomv aomvVar = new aomv();
        a = aomvVar;
        aihn.registerDefaultInstance(aomv.class, aomvVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aomvVar, aomvVar, null, 100946440, aika.MESSAGE, aomv.class);
    }

    private aomv() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"c", "d"});
            case 3:
                return new aomv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aomv.class);
            default:
                return null;
        }
    }
}
