package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class auhu extends aihn implements aiis {
    public static final auhu a;
    public int b;
    public akhc e;
    public aigu f;
    public long g;
    public aigu h;
    private byte i = 2;
    public String c = "";
    public String d = "";

    static {
        auhu auhuVar = new auhu();
        a = auhuVar;
        aihn.registerDefaultInstance(auhu.class, auhuVar);
    }

    private auhu() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0005ᐉ\u0004\u0006ဉ\u0005\u0007ဂ\u0006\bဉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new auhu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(auhu.class);
            default:
                return null;
        }
    }
}
