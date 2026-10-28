package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class akte extends aihn implements aiis {
    public static final akte a;
    private int b;
    private aktg c;
    private aktf d;
    private byte e = 2;

    static {
        akte akteVar = new akte();
        a = akteVar;
        aihn.registerDefaultInstance(akte.class, akteVar);
    }

    private akte() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\uf339ᜈ\uf395ᜈ\u0002\u0000\u0000\u0002\uf339ᜈᐉ\u0001\uf395ᜈᐉ\u0000", new Object[]{"b", "d", "c"});
            case 3:
                return new akte();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(akte.class);
            default:
                return null;
        }
    }
}
