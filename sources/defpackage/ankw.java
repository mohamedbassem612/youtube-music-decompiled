package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ankw extends aihn implements aiis {
    public static final ankw a;
    public int b;
    public aqmh f;
    public long j;
    private byte k = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String g = "";
    public String h = "";
    public String i = "";

    static {
        ankw ankwVar = new ankw();
        a = ankwVar;
        aihn.registerDefaultInstance(ankw.class, ankwVar);
    }

    private ankw() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0002\u0003ᐉ\u0003\u0004ဈ\u0001\u0005ဈ\u0006\u0006ဂ\u0007\bဈ\u0004\nဈ\u0005", new Object[]{"b", "c", "e", "f", "d", "i", "j", "g", "h"});
            case 3:
                return new ankw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ankw.class);
            default:
                return null;
        }
    }
}
