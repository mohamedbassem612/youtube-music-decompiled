package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqaj extends aihn implements aiis {
    public static final aqaj a;
    private int b;
    private alay c;
    private alay d;
    private alay e;
    private alay f;
    private ajwo g;
    private apji h;
    private apji i;
    private apji j;
    private apji k;
    private byte l = 2;

    static {
        aqaj aqajVar = new aqaj();
        a = aqajVar;
        aihn.registerDefaultInstance(aqaj.class, aqajVar);
    }

    private aqaj() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\u001a\t\u0000\u0000\t\u0002ᐉ\u0001\u0003ᐉ\u000b\u0007ᐉ\u0010\bᐉ\u0011\tᐉ\u0005\nᐉ\u0006\u000fᐉ\u0002\u0018ᐉ\u0012\u001aᐉ\r", new Object[]{"b", "c", "g", "i", "j", "e", "f", "d", "k", "h"});
            case 3:
                return new aqaj();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aqaj.class);
            default:
                return null;
        }
    }
}
