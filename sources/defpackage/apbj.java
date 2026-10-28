package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class apbj extends aihn implements aiis {
    public static final apbj a;
    private int b;
    private alay c;
    private ajwo d;
    private byte e = 2;

    static {
        apbj apbjVar = new apbj();
        a = apbjVar;
        aihn.registerDefaultInstance(apbj.class, apbjVar);
    }

    private apbj() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0005ᐉ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new apbj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apbj.class);
            default:
                return null;
        }
    }
}
