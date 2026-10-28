package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajkl extends aihn implements aiis {
    public static final ajkl a;
    private int b;
    private ajko c;
    private ajkn d;
    private ajkm e;
    private angv f;
    private ajkp g;
    private byte h = 2;

    static {
        ajkl ajklVar = new ajkl();
        a = ajklVar;
        aihn.registerDefaultInstance(ajkl.class, ajklVar);
    }

    private ajkl() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\ue5d8ᡈ\ue496㴵\u0005\u0000\u0000\u0005\ue5d8ᡈᐉ\u0004\uf03a⮔ᐉ\u0000ﭥ㇃ᐉ\u0001\ue5b3㇊ᐉ\u0002\ue496㴵ᐉ\u0003", new Object[]{"b", "g", "c", "d", "e", "f"});
            case 3:
                return new ajkl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(ajkl.class);
            default:
                return null;
        }
    }
}
