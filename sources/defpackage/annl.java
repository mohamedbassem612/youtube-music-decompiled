package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class annl extends aihn implements aiis {
    public static final aihw a = new aiat(13);
    public static final annl b;
    public Object d;
    public aihv e;
    public int c = 0;
    private byte f = 2;

    static {
        annl annlVar = new annl();
        b = annlVar;
        aihn.registerDefaultInstance(annl.class, annlVar);
    }

    private annl() {
        aigj aigjVar = aigj.d;
        this.e = emptyIntList();
    }

    public final void a() {
        aihv aihvVar = this.e;
        if (aihvVar.c()) {
            return;
        }
        this.e = aihn.mutableCopy(aihvVar);
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
                return newMessageInfo(b, "\u0004\u0003\u0001\u0000\u0001\u0005\u0003\u0000\u0001\u0000\u0001;\u0000\u0002;\u0000\u0005ࠞ", new Object[]{"d", "c", "e", anms.d});
            case 3:
                return new annl();
            case 4:
                return new aihf((char[]) null, (int[]) null);
            case 5:
                return b;
            case 6:
                return aihn.getParserForClass(annl.class);
            default:
                return null;
        }
    }
}
