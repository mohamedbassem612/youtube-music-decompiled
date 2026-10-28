package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class asnm extends aihn implements aiis {
    public static final asnm a;
    public int b;
    public int d;
    public boolean e;
    public int f;
    private asnn g;
    private byte h = 2;
    public aiie c = emptyProtobufList();

    static {
        asnm asnmVar = new asnm();
        a = asnmVar;
        aihn.registerDefaultInstance(asnm.class, asnmVar);
    }

    private asnm() {
        aigj aigjVar = aigj.d;
    }

    public final void a() {
        aiie aiieVar = this.c;
        if (aiieVar.c()) {
            return;
        }
        this.c = aihn.mutableCopy(aiieVar);
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001Л\u0002᠌\u0000\u0003ᐉ\u0001\u0004ဇ\u0002\u0005᠌\u0003", new Object[]{"b", "c", asno.class, "d", asmm.f, "g", "e", "f", asmm.g});
            case 3:
                return new asnm();
            case 4:
                return new aihf((byte[][]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asnm.class);
            default:
                return null;
        }
    }
}
