package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiux extends aihn implements aiis {
    public static final aiux a;
    public static final aihl b;
    public int c;
    private ajwo d;
    private byte e = 2;

    static {
        aiux aiuxVar = new aiux();
        a = aiuxVar;
        aihn.registerDefaultInstance(aiux.class, aiuxVar);
        b = aihn.newSingularGeneratedExtension(apji.a, aiuxVar, aiuxVar, null, 514514525, aika.MESSAGE, aiux.class);
    }

    private aiux() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new aiux();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aiux.class);
            default:
                return null;
        }
    }
}
