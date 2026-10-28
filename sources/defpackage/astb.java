package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class astb extends aihn implements aiis {
    public static final astb a;
    public static final aihl b;
    public CommandOuterClass$Command c;
    public CommandOuterClass$Command d;
    public CommandOuterClass$Command e;
    public CommandOuterClass$Command f;
    private int g;
    private byte h = 2;

    static {
        astb astbVar = new astb();
        a = astbVar;
        aihn.registerDefaultInstance(astb.class, astbVar);
        b = aihn.newSingularGeneratedExtension(asow.a, astbVar, astbVar, null, 525000006, aika.MESSAGE, astb.class);
    }

    private astb() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"g", "c", "d", "e", "f"});
            case 3:
                return new astb();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(astb.class);
            default:
                return null;
        }
    }
}
