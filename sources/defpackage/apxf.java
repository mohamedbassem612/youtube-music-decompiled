package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class apxf extends aihn implements aiis {
    public static final apxf a;
    public int b;
    public int c;
    public apji d;
    private byte f = 2;
    public String e = "";

    static {
        apxf apxfVar = new apxf();
        a = apxfVar;
        aihn.registerDefaultInstance(apxf.class, apxfVar);
    }

    private apxf() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002ᐉ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", arfr.g, "d", "e"});
            case 3:
                return new apxf();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apxf.class);
            default:
                return null;
        }
    }
}
