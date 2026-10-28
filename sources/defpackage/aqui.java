package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aqui extends aihn implements aiis {
    public static final aqui a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private alay j;
    private alay k;
    private angb l;
    private ajwo m;
    private ajkc n;
    private ajkc o;
    private ajkc p;
    private ajkc q;
    private ajwo r;
    private ajwo s;
    private byte t = 2;

    static {
        aqui aquiVar = new aqui();
        a = aquiVar;
        aihn.registerDefaultInstance(aqui.class, aquiVar);
    }

    private aqui() {
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
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0003$\u0011\u0000\u0000\u0011\u0003ᐉ\t\u0004ᐉ\n\u0005ᐉ\u000b\u0006ᐉ\f\u0007ᐉ\r\bᐉ\u000e\tᐉ\u000f\rᐉ\u0011\u000eᐉ\u0005\u000fᐉ\u0006\u0012ᐉ\u0007\u0017ᐉ\u0012\u0018ᐉ\u0014\u0019ᐉ\b\u001bᐉ\u0015#ᐉ\u001e$ᐉ\u001f", new Object[]{"b", "g", "h", "i", "j", "k", "l", "m", "n", "c", "d", "e", "o", "p", "f", "q", "r", "s"});
            case 3:
                return new aqui();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqui.class);
            default:
                return null;
        }
    }
}
