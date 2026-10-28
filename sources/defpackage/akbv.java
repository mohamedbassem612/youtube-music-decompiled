package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akbv extends aihi implements aihj {
    public static final akbv a;
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
    private akbu n;
    private apji o;
    private byte p = 2;

    static {
        akbv akbvVar = new akbv();
        a = akbvVar;
        aihn.registerDefaultInstance(akbv.class, akbvVar);
    }

    private akbv() {
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0003\u001a\f\u0000\u0000\f\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\fᐉ\u000b\u000eᐉ\f\u0012ᐉ\u0012\u0015ᐉ\u0010\u001aᐉ\u0015", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "k", "l", "n", "m", "o"});
            case 3:
                return new akbv();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akbv.class);
            default:
                return null;
        }
    }
}
