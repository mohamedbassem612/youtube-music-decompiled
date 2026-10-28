package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class alfn extends aihi implements aihj {
    public static final alfn a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private ajwo i;
    private ajwo k;
    private angb l;
    private aivc m;
    private alfm n;
    private byte o = 2;

    static {
        alfn alfnVar = new alfn();
        a = alfnVar;
        aihn.registerDefaultInstance(alfn.class, alfnVar);
    }

    private alfn() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0003\u0015\u000b\u0000\u0000\u000b\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\fᐉ\u000b\u000eᐉ\f\u0012ᐉ\u0013\u0015ᐉ\u0011", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "k", "l", "n", "m"});
            case 3:
                return new alfn();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alfn.class);
            default:
                return null;
        }
    }
}
