package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class aqal extends aihi implements aihj {
    public static final aqal a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private ajkl f;
    private ajkl g;
    private alay h;
    private aqak i;
    private alay k;
    private alay l;
    private ajwo m;
    private apji n;
    private byte o = 2;

    static {
        aqal aqalVar = new aqal();
        a = aqalVar;
        aihn.registerDefaultInstance(aqal.class, aqalVar);
    }

    private aqal() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0003\u0018\u000b\u0000\u0000\u000b\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\bᐉ\t\tᐉ\u000b\fᐉ\u0006\rᐉ\u0005\u000fᐉ\n\u0012ᐉ\r\u0016ᐉ\u0010\u0018ᐉ\u0007", new Object[]{"b", "c", "d", "e", "i", "l", "g", "f", "k", "m", "n", "h"});
            case 3:
                return new aqal();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqal.class);
            default:
                return null;
        }
    }
}
