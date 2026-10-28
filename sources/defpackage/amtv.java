package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amtv extends aihn implements aiis {
    public static final amtv a;
    public static final aihl b;
    public int c;
    public int d;
    private byte f = 2;
    public aigj e = aigj.d;

    static {
        amtv amtvVar = new amtv();
        a = amtvVar;
        aihn.registerDefaultInstance(amtv.class, amtvVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), amtvVar, amtvVar, null, 241780379, aika.MESSAGE, amtv.class);
    }

    private amtv() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ည\u0001", new Object[]{"c", "d", akjs.q, "e"});
            case 3:
                return new amtv();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amtv.class);
            default:
                return null;
        }
    }
}
