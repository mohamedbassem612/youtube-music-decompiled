package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amuz extends aihn implements aiis {
    public static final amuz a;
    private int b;
    private apji c;
    private CommandOuterClass$Command d;
    private byte e = 2;

    static {
        amuz amuzVar = new amuz();
        a = amuzVar;
        aihn.registerDefaultInstance(amuz.class, amuzVar);
    }

    private amuz() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0007\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0007ᐉ\u0006", new Object[]{"b", "c", "d"});
            case 3:
                return new amuz();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amuz.class);
            default:
                return null;
        }
    }
}
