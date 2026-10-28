package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class arpl extends aihn implements aiis {
    public static final arpl a;
    public arpm b;
    public aiie c;
    public alay d;
    public aiie e;
    public aigj f;
    private int g;
    private alay h;
    private ajwo i;
    private alay j;
    private arpk k;
    private byte l = 2;

    static {
        arpl arplVar = new arpl();
        a = arplVar;
        aihn.registerDefaultInstance(arpl.class, arplVar);
    }

    private arpl() {
        emptyProtobufList();
        this.c = emptyProtobufList();
        this.e = emptyProtobufList();
        this.f = aigj.d;
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0002\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0006ᐉ\u0002\u0007ᐉ\u0003\bᐉ\u0004\nည\u0007\u000bЛ\fЛ\rᐉ\u0005", new Object[]{"g", "h", "b", "i", "j", "k", "f", "c", alay.class, "e", alay.class, "d"});
            case 3:
                return new arpl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arpl.class);
            default:
                return null;
        }
    }
}
