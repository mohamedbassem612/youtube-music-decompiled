package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apcl extends aihn implements aiis {
    public static final apcl a;
    private int b;
    private alay c;
    private aovv d;
    private apji e;
    private apji f;
    private alay g;
    private ajwo h;
    private alay i;
    private alay j;
    private alay k;
    private angb l;
    private alay m;
    private aism n;
    private aism o;
    private alay p;
    private ajsc q;
    private byte r = 2;

    static {
        apcl apclVar = new apcl();
        a = apclVar;
        aihn.registerDefaultInstance(apcl.class, apclVar);
    }

    private apcl() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002 \u000f\u0000\u0000\u000f\u0002ᐉ\u0001\u0004ᐉ\u0006\u0005ᐉ\u0007\u0006ᐉ\b\rᐉ\u0016\u000eᐉ\t\u000fᐉ\u000b\u0012ᐉ\f\u0015ᐉ\u0017\u0016ᐉ\n\u0017ᐉ\u000e\u0018ᐉ\u000f\u001cᐉ\u0005\u001eᐉ\u0004 ᐉ\u0003", new Object[]{"b", "c", "g", "h", "i", "p", "j", "l", "m", "q", "k", "n", "o", "f", "e", "d"});
            case 3:
                return new apcl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apcl.class);
            default:
                return null;
        }
    }
}
