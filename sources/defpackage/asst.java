package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asst extends aihn implements aiis {
    public static final asst a;
    public static final aihl b;
    public int c;
    public asmv d;
    public int e;
    public double f;
    public int g;
    public boolean h;
    public int i;
    private byte j = 2;

    static {
        asst asstVar = new asst();
        a = asstVar;
        aihn.registerDefaultInstance(asst.class, asstVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), asstVar, asstVar, null, 220544256, aika.MESSAGE, asst.class);
    }

    private asst() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0001\u0001ᐉ\u0000\u0002᠌\u0001\u0004က\u0003\u0006᠌\u0005\u0007ဇ\u0006\bင\u0007", new Object[]{"c", "d", "e", asmm.s, "f", "g", asmm.u, "h", "i"});
            case 3:
                return new asst();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asst.class);
            default:
                return null;
        }
    }
}
