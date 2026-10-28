package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apng extends aihi implements aihj {
    public static final apng a;
    public int b;
    public int d;
    public boolean g;
    public String h;
    public int i;
    private byte k = 2;
    public String c = "";
    public String e = "";
    public String f = "";

    static {
        apng apngVar = new apng();
        a = apngVar;
        aihn.registerDefaultInstance(apng.class, apngVar);
    }

    private apng() {
        aigj aigjVar = aigj.d;
        this.h = "";
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0019\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0006ဇ\b\tဈ\u000b\u0016᠌\u0001\u0018ဈ\u0004\u0019᠌\u0018", new Object[]{"b", "c", "e", "g", "h", "d", allf.g, "f", "i", allf.f});
            case 3:
                return new apng();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apng.class);
            default:
                return null;
        }
    }
}
