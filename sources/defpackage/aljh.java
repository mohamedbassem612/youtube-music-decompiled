package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aljh extends aihn implements aiis {
    public static final aljh a;
    private aiip b = aiip.a;
    private byte c = 2;

    static {
        aljh aljhVar = new aljh();
        a = aljhVar;
        aihn.registerDefaultInstance(aljh.class, aljhVar);
    }

    private aljh() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0001\u0002в", new Object[]{"b", new ahud(aika.STRING, "", aika.MESSAGE, ajwo.a)});
            case 3:
                return new aljh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aljh.class);
            default:
                return null;
        }
    }
}
