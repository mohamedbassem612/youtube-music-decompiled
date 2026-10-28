package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apku extends aihn implements aiis {
    public static final apku a;
    public static final aihl b;
    public int c;
    public int d;
    public amjx e;
    private byte g = 2;
    public String f = "";

    static {
        apku apkuVar = new apku();
        a = apkuVar;
        aihn.registerDefaultInstance(apku.class, apkuVar);
        b = aihn.newSingularGeneratedExtension(akro.a, apkuVar, apkuVar, null, 523554294, aika.MESSAGE, apku.class);
    }

    private apku() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0003ᐉ\u0002\u0004ဈ\u0003", new Object[]{"c", "d", apep.m, "e", "f"});
            case 3:
                return new apku();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apku.class);
            default:
                return null;
        }
    }
}
