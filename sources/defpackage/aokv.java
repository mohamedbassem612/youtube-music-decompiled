package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aokv extends aihn implements aiis {
    public static final aokv a;
    private int b;
    private apji c;
    private apji d;
    private apji e;
    private apji f;
    private apji g;
    private apji h;
    private apji i;
    private apji j;
    private apji k;
    private apji l;
    private apji m;
    private apji n;
    private byte o = 2;

    static {
        aokv aokvVar = new aokv();
        a = aokvVar;
        aihn.registerDefaultInstance(aokv.class, aokvVar);
    }

    private aokv() {
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0002\u001e\f\u0000\u0000\f\u0002ᐉ\u0004\u0004ᐉ\u0006\u0005ᐉ\b\u0006ᐉ\t\u0007ᐉ\n\nᐉ\u0003\u000bᐉ\u0002\u0012ᐉ\u0005\u0013ᐉ\u0007\u0014ᐉ\u000b\u001dᐉ\u0013\u001eᐉ\u0014", new Object[]{"b", "e", "g", "i", "j", "k", "d", "c", "f", "h", "l", "m", "n"});
            case 3:
                return new aokv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aokv.class);
            default:
                return null;
        }
    }
}
