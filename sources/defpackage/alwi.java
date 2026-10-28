package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alwi extends aihn implements aiis {
    public static final alwi a;
    public alop b;
    public aiie c;
    private int d;
    private albe e;
    private byte f = 2;

    static {
        alwi alwiVar = new alwi();
        a = alwiVar;
        aihn.registerDefaultInstance(alwi.class, alwiVar);
    }

    private alwi() {
        emptyProtobufList();
        this.c = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001̉\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0006Л̉ᐉ\u0006", new Object[]{"d", "b", "c", ajwo.class, "e"});
            case 3:
                return new alwi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alwi.class);
            default:
                return null;
        }
    }
}
