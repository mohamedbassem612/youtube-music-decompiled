package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atxv extends aihi implements aihj {
    public static final atxv a;
    public int b;
    public int c;
    private int e;
    private byte f = 2;
    public String d = "";

    static {
        atxv atxvVar = new atxv();
        a = atxvVar;
        aihn.registerDefaultInstance(atxv.class, atxvVar);
    }

    private atxv() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"e", "b", atxs.c, "c", "d"});
            case 3:
                return new atxv();
            case 4:
                return new aihh(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(atxv.class);
            default:
                return null;
        }
    }
}
