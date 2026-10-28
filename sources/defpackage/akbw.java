package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akbw extends aihn implements aiis {
    public static final akbw a;
    private int b;
    private alay c;
    private ajwo d;
    private ajwo e;
    private angb f;
    private alay g;
    private alay h;
    private alay i;
    private alay j;
    private amkt k;
    private ajwo l;
    private alay m;
    private ajsc n;
    private byte o = 2;

    static {
        akbw akbwVar = new akbw();
        a = akbwVar;
        aihn.registerDefaultInstance(akbw.class, akbwVar);
    }

    private akbw() {
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0003\u0018\f\u0000\u0000\f\u0003ᐉ\u0002\u0005ᐉ\u0004\u0007ᐉ\b\tᐉ\u0005\nᐉ\n\u000bᐉ\u000b\u000eᐉ\u0012\u000fᐉ\t\u0010ᐉ\f\u0012ᐉ\u0006\u0017ᐉ\u000f\u0018ᐉ\u0014", new Object[]{"b", "c", "d", "g", "e", "i", "j", "m", "h", "k", "f", "l", "n"});
            case 3:
                return new akbw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akbw.class);
            default:
                return null;
        }
    }
}
