package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asnw extends aihi implements aihj {
    public static final asnw a;
    public static final aihl b;
    public int c;
    public asnv e;
    private byte f = 2;
    public String d = "";

    static {
        asnw asnwVar = new asnw();
        a = asnwVar;
        aihn.registerDefaultInstance(asnw.class, asnwVar);
        b = aihn.newSingularGeneratedExtension(asod.a, asnwVar, asnwVar, null, 255496645, aika.MESSAGE, asnw.class);
    }

    private asnw() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဉ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new asnw();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asnw.class);
            default:
                return null;
        }
    }
}
