package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alps extends aihn implements aiis {
    public static final alps a;
    public int b;
    public alop c;
    public ajwo e;
    public apji f;
    public amud g;
    private ajwo h;
    private ajwo i;
    private albe j;
    private byte k = 2;
    public aiie d = emptyProtobufList();

    static {
        alps alpsVar = new alps();
        a = alpsVar;
        aihn.registerDefaultInstance(alps.class, alpsVar);
    }

    private alps() {
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
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001ϧ\b\u0000\u0001\b\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0007ᐉ\u0005̉ᐉ\u0006ϧᐉ\u0007", new Object[]{"b", "c", "d", akgn.class, "h", "i", "e", "f", "j", "g"});
            case 3:
                return new alps();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alps.class);
            default:
                return null;
        }
    }
}
