package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akay extends aihi implements aihj {
    public static final akay a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private ajwo g;
    private aqev h;
    private akaz i;
    private ajkl k;
    private angb l;
    private alcj m;
    private apji n;
    private byte o = 2;

    static {
        akay akayVar = new akay();
        a = akayVar;
        aihn.registerDefaultInstance(akay.class, akayVar);
    }

    private akay() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0003\u0016\u000b\u0000\u0000\u000b\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\bᐉ\u0007\tᐉ\u0003\u000bᐉ\b\u0011ᐉ\u0010\u0013ᐉ\n\u0015ᐉ\u0012\u0016ᐉ\t", new Object[]{"b", "c", "e", "f", "g", "h", "d", "i", "m", "l", "n", "k"});
            case 3:
                return new akay();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akay.class);
            default:
                return null;
        }
    }
}
