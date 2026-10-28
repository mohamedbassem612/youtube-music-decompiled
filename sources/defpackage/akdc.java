package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class akdc extends aihn implements aiis {
    public static final akdc a;
    public int b;
    public akdd c;
    private byte d = 2;

    static {
        akdc akdcVar = new akdc();
        a = akdcVar;
        aihn.registerDefaultInstance(akdc.class, akdcVar);
    }

    private akdc() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf321Ẑ\uf321Ẑ\u0001\u0000\u0000\u0001\uf321Ẑᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new akdc();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akdc.class);
            default:
                return null;
        }
    }
}
