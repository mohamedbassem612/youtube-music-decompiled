package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akci extends aihi implements aihj {
    public static final akci a;
    private int b;
    private int c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private alay i;
    private alay k;
    private ajwo l;
    private ajwo m;
    private ajwo n;
    private aqyz o;
    private ajkl p;
    private ajkl q;
    private ajkl r;
    private ajkl s;
    private akch t;
    private ajwo u;
    private angb v;
    private alcj w;
    private apji x;
    private byte y = 2;

    static {
        akci akciVar = new akci();
        a = akciVar;
        aihn.registerDefaultInstance(akci.class, akciVar);
    }

    private akci() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.y);
            case 1:
                this.y = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0002\u00033\u0014\u0000\u0000\u0014\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0007\u0006ᐉ\b\u0007ᐉ\n\bᐉ\u000b\nᐉ\u0003\fᐉ\u000e\u0011ᐉ\u0013\u0017ᐉ\t\u0018ᐉ\u0019\u0019ᐉ\u001a\u001cᐉ\u0010\u001dᐉ\u001e!ᐉ\u000f\"ᐉ\u0011+ᐉ\r,ᐉ\u0012.ᐉ%3ᐉ\f", new Object[]{"b", "c", "d", "e", "g", "h", "k", "l", "f", "o", "t", "i", "u", "v", "q", "w", "p", "r", "n", "s", "x", "m"});
            case 3:
                return new akci();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akci.class);
            default:
                return null;
        }
    }
}
