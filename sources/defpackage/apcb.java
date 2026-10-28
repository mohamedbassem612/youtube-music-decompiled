package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apcb extends aihn implements aiis {
    public static final apcb a;
    public static final aihl b;
    public int c;
    public apcd d;
    public aigj e;
    public int f;
    public aiie g;
    private byte h = 2;

    static {
        apcb apcbVar = new apcb();
        a = apcbVar;
        aihn.registerDefaultInstance(apcb.class, apcbVar);
        b = aihn.newSingularGeneratedExtension(ajwo.a, apcbVar, apcbVar, null, 163162354, aika.MESSAGE, apcb.class);
    }

    private apcb() {
        emptyProtobufList();
        this.e = aigj.d;
        this.g = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0002\u0001ᐉ\u0000\u0002᠌\u0002\u0003Л\u0005ည\u0001", new Object[]{"c", "d", "f", aobi.s, "g", ajwo.class, "e"});
            case 3:
                return new apcb();
            case 4:
                return new aihf((float[][]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apcb.class);
            default:
                return null;
        }
    }
}
