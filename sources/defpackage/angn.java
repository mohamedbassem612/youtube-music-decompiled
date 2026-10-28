package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class angn extends aihn implements aiis {
    public static final angn a;
    public int b;
    public Object d;
    public alay e;
    public angq f;
    public ango g;
    public ajng h;
    public ajng i;
    private alay j;
    public int c = 0;
    private byte k = 2;

    static {
        angn angnVar = new angn();
        a = angnVar;
        aihn.registerDefaultInstance(angn.class, angnVar);
    }

    private angn() {
        aigj aigjVar = aigj.d;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\f\t\u0000\u0000\u0007\u0001ᐉ\u0000\u0002<\u0000\u0005ᐉ\u0004\u0006ᐉ\u0001\u0007м\u0000\bဉ\u0003\tᐉ\u0005\u000bм\u0000\fᐉ\u0002", new Object[]{"d", "c", "b", "e", angt.class, "h", "f", angs.class, "g", "i", angm.class, "j"});
            case 3:
                return new angn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(angn.class);
            default:
                return null;
        }
    }
}
