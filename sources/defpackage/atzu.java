package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atzu extends aihn implements aiis {
    public static final atzu a;
    public int b;
    public int c;
    public double d;
    public double e;
    public double h;
    private int i;
    private byte j = 2;
    public String f = "";
    public String g = "";

    static {
        atzu atzuVar = new atzu();
        a = atzuVar;
        aihn.registerDefaultInstance(atzu.class, atzuVar);
    }

    private atzu() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0004\u0001ᴌ\u0000\u0002ᴌ\u0001\u0003ᔀ\u0002\u0004ᔀ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007က\u0006", new Object[]{"b", "i", atxs.f, "c", atxs.e, "d", "e", "f", "g", "h"});
            case 3:
                return new atzu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atzu.class);
            default:
                return null;
        }
    }
}
