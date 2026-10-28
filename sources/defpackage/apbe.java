package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apbe extends aihn implements aiis {
    public static final apbe a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private apji f;
    private ajwo g;
    private ajwo h;
    private ajwo i;
    private angb j;
    private aivc k;
    private apji l;
    private apji m;
    private apji n;
    private apji o;
    private byte p = 2;

    static {
        apbe apbeVar = new apbe();
        a = apbeVar;
        aihn.registerDefaultInstance(apbe.class, apbeVar);
    }

    private apbe() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0003\u0019\r\u0000\u0000\r\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\nᐉ\t\u000bᐉ\n\u0011ᐉ\b\u0012ᐉ\u0010\u0013ᐉ\u0011\u0016ᐉ\u0007\u0017ᐉ\u0014\u0019ᐉ\u0016", new Object[]{"b", "c", "d", "e", "f", "g", "j", "k", "i", "l", "m", "h", "n", "o"});
            case 3:
                return new apbe();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apbe.class);
            default:
                return null;
        }
    }
}
