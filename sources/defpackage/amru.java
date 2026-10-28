package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class amru extends aihn implements aiis {
    public static final amru a;
    private int b;
    private amqm c;
    private amrr d;
    private amrw e;
    private angy f;
    private amrq g;
    private amrt h;
    private byte i = 2;

    static {
        amru amruVar = new amru();
        a = amruVar;
        aihn.registerDefaultInstance(amru.class, amruVar);
    }

    private amru() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001﵇Ὲﱉ䒃\u0006\u0000\u0000\u0006﵇Ὲᐉ\t\ue90f⡜ᐉ\u0006\ue0de⤦ᐉ\b\uf02dⴱᐉ\u000b\ue55b㟮ᐉ\u0000ﱉ䒃ᐉ\f", new Object[]{"b", "f", "d", "e", "g", "c", "h"});
            case 3:
                return new amru();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(amru.class);
            default:
                return null;
        }
    }
}
