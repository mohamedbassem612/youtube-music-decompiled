package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aivw extends aihi implements aihj {
    public static final aivw a;
    private int c;
    private aitu d;
    private aivf e;
    private byte f = 2;
    public String b = "";

    static {
        aivw aivwVar = new aivw();
        a = aivwVar;
        aihn.registerDefaultInstance(aivw.class, aivwVar);
    }

    private aivw() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0006ᐉ\u0005\tᐉ\u0007", new Object[]{"c", "b", "d", "e"});
            case 3:
                return new aivw();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aivw.class);
            default:
                return null;
        }
    }
}
