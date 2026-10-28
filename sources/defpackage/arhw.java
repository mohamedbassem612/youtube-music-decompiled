package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class arhw extends aihn implements aiis {
    public static final arhw a;
    private int b;
    private alay c;
    private ajwo d;
    private arhv e;
    private alay f;
    private angb g;
    private byte h = 2;

    static {
        arhw arhwVar = new arhw();
        a = arhwVar;
        aihn.registerDefaultInstance(arhw.class, arhwVar);
    }

    private arhw() {
        emptyProtobufList();
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u000b\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0002\u0005ᐉ\u0004\bᐉ\u0007\u000bᐉ\b", new Object[]{"b", "c", "d", "e", "f", "g"});
            case 3:
                return new arhw();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(arhw.class);
            default:
                return null;
        }
    }
}
