package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class appm extends aihn implements aiis {
    public static final appm a;
    public static final aihl b;
    private int f;
    private byte g = 2;
    public aigj c = aigj.d;
    public aiie d = emptyProtobufList();
    public String e = "";

    static {
        appm appmVar = new appm();
        a = appmVar;
        aihn.registerDefaultInstance(appm.class, appmVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, appmVar, appmVar, null, 120929770, aika.MESSAGE, appm.class);
    }

    private appm() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ည\u0000\u0002Л\u0003ဈ\u0001", new Object[]{"f", "c", "d", ajwo.class, "e"});
            case 3:
                return new appm();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(appm.class);
            default:
                return null;
        }
    }
}
