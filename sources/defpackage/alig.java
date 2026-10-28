package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alig extends aihi implements aihj {
    public static final alig a;
    public int b;
    public int d;
    public int e;
    public alay f;
    private ajwo g;
    private aism h;
    private apji i;
    private apji k;
    private byte l = 2;
    public aiie c = emptyProtobufList();

    static {
        alig aligVar = new alig();
        a = aligVar;
        aihn.registerDefaultInstance(alig.class, aligVar);
    }

    private alig() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0001\u0006\u0001Л\u0003ᐉ\u0004\u0006င\u0000\u0007င\u0001\bᐉ\u0005\u000bᐉ\b\fᐉ\t\rᐉ\u0007", new Object[]{"b", "c", alih.class, "f", "d", "e", "g", "i", "k", "h"});
            case 3:
                return new alig();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alig.class);
            default:
                return null;
        }
    }
}
