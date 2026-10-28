package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apll extends aihn implements aiis {
    public static final apll a;
    private int b;
    private alay c;
    private alay d;
    private ajwo e;
    private apji f;
    private apji g;
    private apji h;
    private apji i;
    private apji j;
    private apji k;
    private byte l = 2;

    static {
        apll apllVar = new apll();
        a = apllVar;
        aihn.registerDefaultInstance(apll.class, apllVar);
    }

    private apll() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0019\t\u0000\u0000\t\u0001ᐉ\u0001\bᐉ\u0002\nᐉ\u0006\u000bᐉ\u0007\fᐉ\u000b\u0013ᐉ\f\u0014ᐉ\b\u0018ᐉ\t\u0019ᐉ\n", new Object[]{"b", "c", "d", "e", "f", "j", "k", "g", "h", "i"});
            case 3:
                return new apll();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apll.class);
            default:
                return null;
        }
    }
}
