package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alvn extends aihn implements aiis {
    public static final alvn a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        alvn alvnVar = new alvn();
        a = alvnVar;
        aihn.registerDefaultInstance(alvn.class, alvnVar);
    }

    private alvn() {
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
                return newMessageInfo(a, "\u0001\u000b\u0001\u0000\ue18fᝊ﹝\uf556\u0007\u000b\u0000\u0000\n\ue18fᝊм\u0000ﮱ᪢<\u0000\ue67dḘм\u0000\ue62eḠм\u0000\ue5be⡱м\u0000\ue63d⨕м\u0000\ue162⪂м\u0000\uedf4⺙м\u0000\uec93怉м\u0000\ueffb냧м\u0000﹝\uf556\u0007м\u0000", new Object[]{"c", "b", argr.class, aoqw.class, alvp.class, arbo.class, aisu.class, aitw.class, aiwa.class, aiut.class, aiud.class, aitb.class, aiux.class});
            case 3:
                return new alvn();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alvn.class);
            default:
                return null;
        }
    }
}
