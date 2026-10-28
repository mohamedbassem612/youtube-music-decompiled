package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akbq extends aihi implements aihj {
    public static final akbq a;
    private int b;
    private aovv c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private ajwo i;
    private alay k;
    private amkt l;
    private alay m;
    private angb n;
    private alcj o;
    private akbp p;
    private aktx q;
    private ajsc r;
    private ajwo s;
    private byte t = 2;

    static {
        akbq akbqVar = new akbq();
        a = akbqVar;
        aihn.registerDefaultInstance(akbq.class, akbqVar);
    }

    private akbq() {
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
                return Byte.valueOf(this.t);
            case 1:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0003\u001f\u0010\u0000\u0000\u0010\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ᐉ\b\bᐉ\t\tᐉ\u0007\u000bᐉ\u000f\u000fᐉ\u0010\u0011ᐉ\u0013\u0012ᐉ\u0011\u0014ᐉ\u0001\u0015ᐉ\u0005\u0017ᐉ\u0012\u0018ᐉ\u0014\u001dᐉ\u0017\u001fᐉ\u0019", new Object[]{"b", "d", "e", "g", "i", "k", "h", "l", "m", "p", "n", "c", "f", "o", "q", "r", "s"});
            case 3:
                return new akbq();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akbq.class);
            default:
                return null;
        }
    }
}
