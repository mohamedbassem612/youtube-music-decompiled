package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arox extends aihn implements aiis {
    public static final arox a;
    public static final aihl b;
    public int c;
    public int g;
    public aqoy h;
    public boolean i;
    public ajwn k;
    private byte l = 2;
    public String d = "";
    public String e = "";
    public aigj f = aigj.d;
    public aiie j = emptyProtobufList();

    static {
        arox aroxVar = new arox();
        a = aroxVar;
        aihn.registerDefaultInstance(arox.class, aroxVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, aroxVar, aroxVar, null, 165047913, aika.MESSAGE, arox.class);
    }

    private arox() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006\u001a\u0007ဇ\u0005\bᐉ\u0006", new Object[]{"c", "d", "e", "f", "g", aqkp.p, "h", "j", "i", "k"});
            case 3:
                return new arox();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arox.class);
            default:
                return null;
        }
    }
}
