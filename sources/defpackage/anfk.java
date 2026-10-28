package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class anfk extends aihn implements aiis {
    public static final anfk a;
    public int b;
    public alay c;
    public alja d;
    public ajng f;
    private byte h = 2;
    public aiie e = emptyProtobufList();
    public aigj g = aigj.d;

    static {
        anfk anfkVar = new anfk();
        a = anfkVar;
        aihn.registerDefaultInstance(anfk.class, anfkVar);
    }

    private anfk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005Л\u0006ᐉ\u0004\bည\u0007", new Object[]{"b", "c", "d", "e", alay.class, "f", "g"});
            case 3:
                return new anfk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anfk.class);
            default:
                return null;
        }
    }
}
