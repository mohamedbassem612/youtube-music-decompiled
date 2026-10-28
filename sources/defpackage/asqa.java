package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asqa extends aihn implements aiis {
    public static final asqa a;
    private int b;
    private CommandOuterClass$Command c;
    private CommandOuterClass$Command d;
    private byte e = 2;

    static {
        asqa asqaVar = new asqa();
        a = asqaVar;
        aihn.registerDefaultInstance(asqa.class, asqaVar);
    }

    private asqa() {
        aigj aigjVar = aigj.d;
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0006\u000f\u0002\u0000\u0000\u0002\u0006ᐉ\u0001\u000fᐉ\u000b", new Object[]{"b", "c", "d"});
            case 3:
                return new asqa();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asqa.class);
            default:
                return null;
        }
    }
}
