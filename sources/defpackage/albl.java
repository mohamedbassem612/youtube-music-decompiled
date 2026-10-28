package defpackage;

import com.google.protos.youtube.elements.IntersectionPropertiesOuterClass$IntersectionObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class albl extends aihn implements aiis {
    public static final albl a;
    public static final aihl b;
    public int c;
    public amud d;
    private byte e = 2;

    static {
        albl alblVar = new albl();
        a = alblVar;
        aihn.registerDefaultInstance(albl.class, alblVar);
        b = aihn.newSingularGeneratedExtension(IntersectionPropertiesOuterClass$IntersectionObserver.getDefaultInstance(), alblVar, alblVar, null, 424548931, aika.MESSAGE, albl.class);
    }

    private albl() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001ϧϧ\u0001\u0000\u0000\u0001ϧᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new albl();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(albl.class);
            default:
                return null;
        }
    }
}
