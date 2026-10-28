package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apeh extends aihn implements aiis {
    public static final apeh a;
    public int b;
    public apmn c;
    public apeg d;
    public apji f;
    private apji g;
    private byte h = 2;
    public String e = "";

    static {
        apeh apehVar = new apeh();
        a = apehVar;
        aihn.registerDefaultInstance(apeh.class, apehVar);
    }

    private apeh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "g", "d", "e", "f"});
            case 3:
                return new apeh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apeh.class);
            default:
                return null;
        }
    }
}
