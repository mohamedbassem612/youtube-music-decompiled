package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arff extends aihn implements aiis {
    public static final arff a;
    public int b;
    private byte d = 2;
    public String c = "";

    static {
        arff arffVar = new arff();
        a = arffVar;
        aihn.registerDefaultInstance(arff.class, arffVar);
    }

    private arff() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"b", "c"});
            case 3:
                return new arff();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arff.class);
            default:
                return null;
        }
    }
}
