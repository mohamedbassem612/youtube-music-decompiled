package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apre extends aihn implements aiis {
    public static final apre a;
    public int b;
    public int c;
    public alay d;
    public alay e;
    private apqx h;
    private ajng i;
    private ajwo j;
    private byte k = 2;
    public aiie f = emptyProtobufList();
    public aiie g = emptyProtobufList();

    static {
        apre apreVar = new apre();
        a = apreVar;
        aihn.registerDefaultInstance(apre.class, apreVar);
    }

    private apre() {
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u000e\b\u0000\u0002\u0006\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0006\u001b\tᐉ\u0006\n᠌\u0000\u000bᐉ\u0007\u000eᐉ\t", new Object[]{"b", "d", "e", "f", apra.class, "g", apru.class, "h", "c", apsb.b, "i", "j"});
            case 3:
                return new apre();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apre.class);
            default:
                return null;
        }
    }
}
