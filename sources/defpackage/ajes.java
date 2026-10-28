package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ajes extends aihn implements aiis {
    public static final ajes a;
    private int b;
    private alay c;
    private apji d;
    private alay e;
    private apji f;
    private apji g;
    private alay h;
    private ajwo i;
    private ajwo j;
    private apji k;
    private apji l;
    private angb m;
    private ajwo n;
    private apji o;
    private byte p = 2;

    static {
        ajes ajesVar = new ajes();
        a = ajesVar;
        aihn.registerDefaultInstance(ajes.class, ajesVar);
    }

    private ajes() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0017\r\u0000\u0000\r\u0001ᐉ\u0000\u0002ᐉ\u0002\u0005ᐉ\b\u0006ᐉ\t\u0007ᐉ\r\fᐉ\u0014\u000eᐉ\u0001\u000fᐉ\u0003\u0010ᐉ\u0005\u0013ᐉ\u000b\u0015ᐉ\f\u0016ᐉ\u000e\u0017ᐉ\n", new Object[]{"b", "c", "e", "h", "i", "m", "o", "d", "f", "g", "k", "l", "n", "j"});
            case 3:
                return new ajes();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajes.class);
            default:
                return null;
        }
    }
}
