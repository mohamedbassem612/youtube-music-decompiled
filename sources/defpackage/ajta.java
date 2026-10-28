package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajta extends aihn implements aiis {
    public static final ajta a;
    public int b;
    public boolean e;
    public int f;
    private alay g;
    private apji h;
    private apji i;
    private aism j;
    private byte k = 2;
    public aiie c = emptyProtobufList();
    public aigj d = aigj.d;

    static {
        ajta ajtaVar = new ajta();
        a = ajtaVar;
        aihn.registerDefaultInstance(ajta.class, ajtaVar);
    }

    private ajta() {
    }

    public final void a() {
        aiie aiieVar = this.c;
        if (aiieVar.c()) {
            return;
        }
        this.c = aihn.mutableCopy(aiieVar);
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0001\u0005\u0001Л\u0004ည\u0003\u0005ဇ\u0005\u0006ᐉ\u0006\bᐉ\b\tᐉ\t\u000bᐉ\n\r᠌\f", new Object[]{"b", "c", ajtb.class, "d", "e", "g", "h", "i", "j", "f", ajhk.l});
            case 3:
                return new ajta();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajta.class);
            default:
                return null;
        }
    }
}
