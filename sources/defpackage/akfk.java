package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akfk extends aihn implements aiis {
    public static final akfk a;
    private int b;
    private alay c;
    private angb d;
    private akfc e;
    private akfe f;
    private alay g;
    private alay h;
    private akey i;
    private akfb j;
    private ajwo k;
    private ajwo l;
    private alay m;
    private alay n;
    private ajwo o;
    private byte p = 2;

    static {
        akfk akfkVar = new akfk();
        a = akfkVar;
        aihn.registerDefaultInstance(akfk.class, akfkVar);
    }

    private akfk() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\r\u0000\u0001\u0002\u001a\r\u0000\u0000\r\u0002ᐉ\u0004\u0005ᐉ\t\u0006ᐉ\n\bᐉ\r\tᐉ\u0006\fᐉ\u0010\rᐉ\u0011\u000fᐉ\u0013\u0010ᐉ\u000b\u0013ᐉ\u0007\u0014ᐉ\f\u0018ᐉ\u0016\u001aᐉ\u0017", new Object[]{"b", "c", "f", "g", "j", "d", "k", "l", "m", "h", "e", "i", "n", "o"});
            case 3:
                return new akfk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akfk.class);
            default:
                return null;
        }
    }
}
