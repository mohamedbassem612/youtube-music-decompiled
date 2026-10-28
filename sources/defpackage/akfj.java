package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akfj extends aihn implements aiis {
    public static final akfj a;
    private int b;
    private alay c;
    private angb d;
    private akfc e;
    private alay f;
    private akey g;
    private akfb h;
    private ajwo i;
    private ajwo j;
    private alay k;
    private ajwo l;
    private byte m = 2;

    static {
        akfj akfjVar = new akfj();
        a = akfjVar;
        aihn.registerDefaultInstance(akfj.class, akfjVar);
    }

    private akfj() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\n\u0000\u0001\u0002\u0018\n\u0000\u0000\n\u0002ᐉ\u0004\u0004ᐉ\b\u0007ᐉ\u000b\tᐉ\u0006\fᐉ\u000e\rᐉ\u000f\u0012ᐉ\u0007\u0013ᐉ\n\u0016ᐉ\u0014\u0018ᐉ\u0015", new Object[]{"b", "c", "f", "h", "d", "i", "j", "e", "g", "k", "l"});
            case 3:
                return new akfj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akfj.class);
            default:
                return null;
        }
    }
}
