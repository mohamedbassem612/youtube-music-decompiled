package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arfk extends aihn implements aiis {
    public static final arfk a;
    private int b;
    private arfm c;
    private alay d;
    private alay e;
    private askp f;
    private alay g;
    private arfl h;
    private alay i;
    private alay j;
    private ajwo k;
    private ajwo l;
    private byte m = 2;

    static {
        arfk arfkVar = new arfk();
        a = arfkVar;
        aihn.registerDefaultInstance(arfk.class, arfkVar);
    }

    private arfk() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0005\u0006ᐉ\u0007\u0007ᐉ\b\fᐉ\u000b\u000eᐉ\f\u000fᐉ\u0003\u0011ᐉ\u0004", new Object[]{"b", "c", "d", "e", "h", "i", "j", "k", "l", "f", "g"});
            case 3:
                return new arfk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arfk.class);
            default:
                return null;
        }
    }
}
