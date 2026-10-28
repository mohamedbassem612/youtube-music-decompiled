package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alzi extends aihn implements aiis {
    public static final alzi a;
    public alop b;
    private int f;
    private apji g;
    private byte h = 2;
    public aiie c = emptyProtobufList();
    public String d = "";
    public aigj e = aigj.d;

    static {
        alzi alziVar = new alzi();
        a = alziVar;
        aihn.registerDefaultInstance(alzi.class, alziVar);
    }

    private alzi() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0003\u0001ᐉ\u0000\u0002Л\u0004ည\u0005\u0005ဈ\u0001\u0006ᐉ\u0002", new Object[]{"f", "b", "c", apji.class, "e", "d", "g"});
            case 3:
                return new alzi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alzi.class);
            default:
                return null;
        }
    }
}
