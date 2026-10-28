package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class asmr extends aihn implements aiis {
    public static final asmr a;
    public static final aihl b;
    public asop c;
    public askm d;
    private int e;
    private byte f = 2;

    static {
        asmr asmrVar = new asmr();
        a = asmrVar;
        aihn.registerDefaultInstance(asmr.class, asmrVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), asmrVar, asmrVar, null, 206181248, aika.MESSAGE, asmr.class);
    }

    private asmr() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"e", "c", "d"});
            case 3:
                return new asmr();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(asmr.class);
            default:
                return null;
        }
    }
}
