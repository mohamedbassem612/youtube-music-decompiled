package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class assq extends aihn implements aiis {
    public static final assq a;
    public static final aihl b;
    public int c;
    public assr d;
    public int e;
    public CommandOuterClass$Command f;
    public CommandOuterClass$Command g;
    private byte h = 2;

    static {
        assq assqVar = new assq();
        a = assqVar;
        aihn.registerDefaultInstance(assq.class, assqVar);
        b = aihn.newSingularGeneratedExtension(asow.a, assqVar, assqVar, null, 525000038, aika.MESSAGE, assq.class);
    }

    private assq() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002᠌\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"c", "d", "e", assp.a, "f", "g"});
            case 3:
                return new assq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(assq.class);
            default:
                return null;
        }
    }
}
