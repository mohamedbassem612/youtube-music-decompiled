package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alkz extends aihn implements aiis {
    public static final alkz a;
    public int b;
    public alop c;
    public ajwo e;
    public apjh f;
    public apji h;
    private alay i;
    private ajwo j;
    private apji k;
    private byte l = 2;
    public aiie d = emptyProtobufList();
    public aigj g = aigj.d;

    static {
        alkz alkzVar = new alkz();
        a = alkzVar;
        aihn.registerDefaultInstance(alkz.class, alkzVar);
    }

    private alkz() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\u0012\t\u0000\u0001\b\u0001ᐉ\u0001\u0003Л\u0004ᐉ\u0003\bᐉ\u0004\nᐉ\u0006\u000bᐉ\u0005\fည\u0007\u0010ᐉ\t\u0012ᐉ\u000b", new Object[]{"b", "c", "d", alla.class, "i", "e", "f", "j", "g", "k", "h"});
            case 3:
                return new alkz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alkz.class);
            default:
                return null;
        }
    }
}
