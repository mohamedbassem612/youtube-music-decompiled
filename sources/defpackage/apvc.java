package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apvc extends aihn implements aiis {
    public static final apvc a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private alay g;
    private apvb h;
    private apji i;
    private apji j;
    private apji k;
    private byte l = 2;

    static {
        apvc apvcVar = new apvc();
        a = apvcVar;
        aihn.registerDefaultInstance(apvc.class, apvcVar);
    }

    private apvc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0003\u000f\t\u0000\u0000\t\u0003ᐉ\u0003\u0004ᐉ\u0006\u0005ᐉ\u0007\u0007ᐉ\t\bᐉ\n\tᐉ\u0002\u000bᐉ\u000b\rᐉ\u0004\u000fᐉ\b", new Object[]{"b", "d", "f", "g", "i", "j", "c", "k", "e", "h"});
            case 3:
                return new apvc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apvc.class);
            default:
                return null;
        }
    }
}
