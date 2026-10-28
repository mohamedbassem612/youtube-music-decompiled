package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akbt extends aihi implements aihj {
    public static final akbt a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private ajwo f;
    private ajng g;
    private ajng h;
    private ajwo i;
    private apji k;
    private byte l = 2;

    static {
        akbt akbtVar = new akbt();
        a = akbtVar;
        aihn.registerDefaultInstance(akbt.class, akbtVar);
    }

    private akbt() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u000f\b\u0000\u0000\b\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0006\fᐉ\u0005\u000fᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "i", "h", "k"});
            case 3:
                return new akbt();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akbt.class);
            default:
                return null;
        }
    }
}
