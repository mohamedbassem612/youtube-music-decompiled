package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apbi extends aihn implements aiis {
    public static final apbi a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private alay h;
    private ajwo i;
    private ajwo j;
    private angb k;
    private apbh l;
    private aivc m;
    private ajkc n;
    private apji o;
    private ajwo p;
    private apji q;
    private byte r = 2;

    static {
        apbi apbiVar = new apbi();
        a = apbiVar;
        aihn.registerDefaultInstance(apbi.class, apbiVar);
    }

    private apbi() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aigj aigjVar = aigj.d;
        emptyProtobufList();
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0003$\u000f\u0000\u0000\u000f\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\u0007\tᐉ\t\rᐉ\u000e\u0012ᐉ\f\u0013ᐉ\r\u0014ᐉ\b\u0019ᐉ\u0015\u001fᐉ\u001b ᐉ\u001c\"ᐉ\u001d$ᐉ\u001f", new Object[]{"b", "c", "d", "e", "f", "g", "i", "l", "j", "k", "h", "m", "n", "o", "p", "q"});
            case 3:
                return new apbi();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apbi.class);
            default:
                return null;
        }
    }
}
