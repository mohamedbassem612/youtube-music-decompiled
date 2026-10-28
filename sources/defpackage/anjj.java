package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class anjj extends aihn implements aiis {
    public static final anjj a;
    public static final aihl b;
    public int c;
    public apji e;
    private ajwo f;
    private byte g = 2;
    public String d = "";

    static {
        anjj anjjVar = new anjj();
        a = anjjVar;
        aihn.registerDefaultInstance(anjj.class, anjjVar);
        b = aihn.newSingularGeneratedExtension(apji.a, anjjVar, anjjVar, null, 166494362, aika.MESSAGE, anjj.class);
    }

    private anjj() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new anjj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anjj.class);
            default:
                return null;
        }
    }
}
