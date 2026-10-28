package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amtq extends aihn implements aiis {
    public static final amtq a;
    public static final aihl b;
    public int c;
    public int d;
    public boolean f;
    public boolean g;
    public float h;
    public int i;
    private byte j = 2;
    public aigj e = aigj.d;

    static {
        amtq amtqVar = new amtq();
        a = amtqVar;
        aihn.registerDefaultInstance(amtq.class, amtqVar);
        b = aihn.newSingularGeneratedExtension(CommandOuterClass$Command.getDefaultInstance(), amtqVar, amtqVar, null, 314600826, aika.MESSAGE, amtq.class);
    }

    private amtq() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ည\u0001\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005\u0007ဋ\u0006", new Object[]{"c", "d", akjs.p, "e", "f", "g", "h", "i"});
            case 3:
                return new amtq();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amtq.class);
            default:
                return null;
        }
    }
}
