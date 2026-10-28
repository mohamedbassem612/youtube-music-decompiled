package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apkb extends aihn implements aiis {
    public static final apkb a;
    public int b;
    public askp d;
    public long e;
    private byte g = 2;
    public String c = "";
    public String f = "";

    static {
        apkb apkbVar = new apkb();
        a = apkbVar;
        aihn.registerDefaultInstance(apkb.class, apkbVar);
    }

    private apkb() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new apkb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apkb.class);
            default:
                return null;
        }
    }
}
