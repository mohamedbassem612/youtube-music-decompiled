package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atxu extends aihi implements aihj {
    public static final atxu a;
    public int b;
    public boolean e;
    private byte f = 2;
    public String c = "";
    public boolean d = true;

    static {
        atxu atxuVar = new atxu();
        a = atxuVar;
        aihn.registerDefaultInstance(atxu.class, atxuVar);
    }

    private atxu() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0003", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new atxu();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atxu.class);
            default:
                return null;
        }
    }
}
