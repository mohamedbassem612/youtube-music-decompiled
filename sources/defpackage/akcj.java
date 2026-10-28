package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akcj extends aihn implements aiis {
    public static final akcj a;
    private int b;
    private alay c;
    private apji d;
    private alay e;
    private apji f;
    private apji g;
    private ajwo h;
    private angb i;
    private apji j;
    private ajwo k;
    private apji l;
    private byte m = 2;

    static {
        akcj akcjVar = new akcj();
        a = akcjVar;
        aihn.registerDefaultInstance(akcj.class, akcjVar);
    }

    private akcj() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0002\u0015\n\u0000\u0000\n\u0002ᐉ\u0001\u0003ᐉ\u0003\u0005ᐉ\u0007\u0007ᐉ\t\rᐉ\u000e\u000fᐉ\u0002\u0010ᐉ\u0004\u0011ᐉ\u0006\u0014ᐉ\u000b\u0015ᐉ\r", new Object[]{"b", "c", "e", "h", "i", "l", "d", "f", "g", "j", "k"});
            case 3:
                return new akcj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akcj.class);
            default:
                return null;
        }
    }
}
