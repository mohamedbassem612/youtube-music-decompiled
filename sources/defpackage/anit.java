package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anit extends aihn implements aiis {
    public static final anit a;
    public aiie b;
    private int c;
    private alay d;
    private ajwo e;
    private akle f;
    private apji g;
    private apji h;
    private byte i = 2;

    static {
        anit anitVar = new anit();
        a = anitVar;
        aihn.registerDefaultInstance(anit.class, anitVar);
    }

    private anit() {
        aigj aigjVar = aigj.d;
        this.b = emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0001\u0006\u0001ᐉ\u0000\u0004Л\u0007ᐉ\u0003\bᐉ\u0007\tᐉ\u0006\nᐉ\b", new Object[]{"c", "d", "b", anis.class, "e", "g", "f", "h"});
            case 3:
                return new anit();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anit.class);
            default:
                return null;
        }
    }
}
