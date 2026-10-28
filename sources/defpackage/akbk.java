package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akbk extends aihn implements aiis {
    public static final akbk a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private ajng g;
    private alay h;
    private alay i;
    private alay j;
    private alay k;
    private alay l;
    private alay m;
    private alay n;
    private ajwo o;
    private ajkl p;
    private ajkl q;
    private ajkl r;
    private angb s;
    private byte t = 2;

    static {
        akbk akbkVar = new akbk();
        a = akbkVar;
        aihn.registerDefaultInstance(akbk.class, akbkVar);
    }

    private akbk() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0003\"\u0011\u0000\u0000\u0011\u0003ᐉ\u0003\u0004ᐉ\t\u0005ᐉ\n\u0007ᐉ\f\bᐉ\r\tᐉ\u0010\nᐉ\u0011\u0012ᐉ\u000e\u0013ᐉ\u0015\u0014ᐉ\u0013\u0015ᐉ\u0012\u0016ᐉ\u0014\u0019ᐉ\u0004\u001aᐉ\u0005\u001bᐉ\u0006 ᐉ\u000f\"ᐉ\b", new Object[]{"b", "c", "h", "i", "j", "k", "n", "o", "l", "s", "q", "p", "r", "d", "e", "f", "m", "g"});
            case 3:
                return new akbk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akbk.class);
            default:
                return null;
        }
    }
}
