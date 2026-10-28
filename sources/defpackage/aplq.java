package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aplq extends aihn implements aiis {
    public static final aplq a;
    public Object c;
    private int e;
    private CommandOuterClass$Command f;
    public int b = 0;
    private byte g = 2;
    public String d = "";

    static {
        aplq aplqVar = new aplq();
        a = aplqVar;
        aihn.registerDefaultInstance(aplq.class, aplqVar);
    }

    private aplq() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ဈ\u0000\u00023\u0000\u0003;\u0000\u0004:\u0000\u00057\u0000\u0006м\u0000\u0007ᐉ\u0001", new Object[]{"c", "b", "e", "d", asno.class, "f"});
            case 3:
                return new aplq();
            case 4:
                return new aihf((short[]) null, (int[]) null);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aplq.class);
            default:
                return null;
        }
    }
}
