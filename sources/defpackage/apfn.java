package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apfn extends aihn implements aiis {
    public static final apfn a;
    public int b;
    public ajwo d;
    public long e;
    public long f;
    private byte g = 2;
    public String c = "";

    static {
        apfn apfnVar = new apfn();
        a = apfnVar;
        aihn.registerDefaultInstance(apfn.class, apfnVar);
    }

    private apfn() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0001\u0004ဂ\u0002\u0005ဂ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new apfn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apfn.class);
            default:
                return null;
        }
    }
}
