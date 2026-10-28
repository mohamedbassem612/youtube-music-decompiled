package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akew extends aihn implements aiis {
    public static final akew a;
    private int b;
    private alay c;
    private angb d;
    private akfc e;
    private akey f;
    private akfb g;
    private ajwo h;
    private ajwo i;
    private ajwo j;
    private alay k;
    private alay l;
    private ajwo m;
    private byte n = 2;

    static {
        akew akewVar = new akew();
        a = akewVar;
        aihn.registerDefaultInstance(akew.class, akewVar);
    }

    private akew() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0005\u001b\u000b\u0000\u0000\u000b\u0005ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0007\fᐉ\u000b\rᐉ\f\u0010ᐉ\u000f\u0011ᐉ\u0010\u0015ᐉ\u0014\u0017ᐉ\u0016\u0018ᐉ\u0017\u001bᐉ\u001a", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case 3:
                return new akew();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akew.class);
            default:
                return null;
        }
    }
}
