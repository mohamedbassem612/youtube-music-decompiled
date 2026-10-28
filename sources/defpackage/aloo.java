package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aloo extends aihn implements aiis {
    public static final aloo a;
    public int b;
    public boolean c;
    public aiie d;
    public apcu e;
    public alyr f;
    public ajgu g;
    private ahaa h;
    private ahaa i;
    private byte j = 2;

    static {
        aloo alooVar = new aloo();
        a = alooVar;
        aihn.registerDefaultInstance(aloo.class, alooVar);
    }

    private aloo() {
        emptyProtobufList();
        this.d = emptyProtobufList();
        emptyIntList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0005\"\u0007\u0000\u0001\u0002\u0005ᐉ\u0000\u000eဇ\n\u0011ᐉ\u000b\u001a\u001b\u001dဉ\u0011!ဉ\u0014\"ဉ\u0015", new Object[]{"b", "h", "c", "i", "d", akdv.class, "e", "f", "g"});
            case 3:
                return new aloo();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aloo.class);
            default:
                return null;
        }
    }
}
