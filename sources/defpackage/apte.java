package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apte extends aihn implements aiis {
    public static final apte a;
    public static final aihl b;
    public int c;
    public ajwo g;
    private byte h = 2;
    public String d = "";
    public String e = "";
    public int f = 1;

    static {
        apte apteVar = new apte();
        a = apteVar;
        aihn.registerDefaultInstance(apte.class, apteVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apteVar, apteVar, null, 90650344, aika.MESSAGE, apte.class);
    }

    private apte() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0006᠌\u0003\u0007ᐉ\u0004", new Object[]{"c", "d", "e", "f", apsb.f, "g"});
            case 3:
                return new apte();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apte.class);
            default:
                return null;
        }
    }
}
