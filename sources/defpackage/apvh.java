package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apvh extends aihn implements aiis {
    public static final apvh a;
    private aiip b = aiip.a;
    private byte c = 2;

    static {
        apvh apvhVar = new apvh();
        a = apvhVar;
        aihn.registerDefaultInstance(apvh.class, apvhVar);
    }

    private apvh() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0001\u0002в", new Object[]{"b", new ahud(aika.STRING, "", aika.MESSAGE, apvg.a)});
            case 3:
                return new apvh();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(apvh.class);
            default:
                return null;
        }
    }
}
