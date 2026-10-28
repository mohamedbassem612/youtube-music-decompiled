package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class asnp extends aihn implements aiis {
    public static final asnp a;
    public int b;
    public int c;
    private CommandOuterClass$Command d;
    private CommandOuterClass$Command e;
    private CommandOuterClass$Command f;
    private CommandOuterClass$Command g;
    private byte h = 2;

    static {
        asnp asnpVar = new asnp();
        a = asnpVar;
        aihn.registerDefaultInstance(asnp.class, asnpVar);
    }

    private asnp() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0007\u000b\u0005\u0000\u0000\u0004\u0007᠌\u0004\bᐉ\u0005\tᐉ\u0006\nᐉ\u0007\u000bᐉ\b", new Object[]{"b", "c", asmm.h, "d", "e", "f", "g"});
            case 3:
                return new asnp();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asnp.class);
            default:
                return null;
        }
    }
}
