package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aoha extends aihn implements aiis {
    public static final aoha a;
    public int b;
    public aofe c;
    private aoey d;
    private byte e = 2;

    static {
        aoha aohaVar = new aoha();
        a = aohaVar;
        aihn.registerDefaultInstance(aoha.class, aohaVar);
    }

    private aoha() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\ueeeb㖧\ue462㧩\u0002\u0000\u0000\u0001\ueeeb㖧ဉ\u0000\ue462㧩ᐉ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new aoha();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(aoha.class);
            default:
                return null;
        }
    }
}
