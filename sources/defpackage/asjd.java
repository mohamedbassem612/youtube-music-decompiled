package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asjd extends aihn implements aiis {
    public static final asjd a;
    public static final aihl b;
    private byte d = 2;
    public aiie c = emptyProtobufList();

    static {
        asjd asjdVar = new asjd();
        a = asjdVar;
        aihn.registerDefaultInstance(asjd.class, asjdVar);
        b = aihn.newSingularGeneratedExtension(aiov.a, asjdVar, asjdVar, null, 520452313, aika.MESSAGE, asjd.class);
    }

    private asjd() {
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
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"c", asjc.class});
            case 3:
                return new asjd();
            case 4:
                return new aihf((int[][]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asjd.class);
            default:
                return null;
        }
    }
}
