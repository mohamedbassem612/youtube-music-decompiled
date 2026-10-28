package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class alyh extends aihi implements aihj {
    public static final alyh a;
    public int b;
    public Object d;
    public InnertubeContext$InnerTubeContext e;
    public alvr f;
    public int c = 0;
    private byte g = 2;

    static {
        alyh alyhVar = new alyh();
        a = alyhVar;
        aihn.registerDefaultInstance(alyh.class, alyhVar);
    }

    private alyh() {
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
                return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003м\u0000\u0004м\u0000", new Object[]{"d", "c", "b", "e", "f", amad.class, alqb.class});
            case 3:
                return new alyh();
            case 4:
                return new alyg();
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alyh.class);
            default:
                return null;
        }
    }
}
