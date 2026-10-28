package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arcy extends aihn implements aiis {
    public static final arcy a;
    private int b;
    private askp c;
    private alay d;
    private ajwo e;
    private apji f;
    private apji g;
    private apji h;
    private byte i = 2;

    static {
        arcy arcyVar = new arcy();
        a = arcyVar;
        aihn.registerDefaultInstance(arcy.class, arcyVar);
    }

    private arcy() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\u000f\u0006\u0000\u0000\u0006\u0003ᐉ\u0006\u0004ᐉ\u0007\u0007ᐉ\u0002\tᐉ\u0004\rᐉ\u0005\u000fᐉ\u0000", new Object[]{"b", "g", "h", "d", "e", "f", "c"});
            case 3:
                return new arcy();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arcy.class);
            default:
                return null;
        }
    }
}
