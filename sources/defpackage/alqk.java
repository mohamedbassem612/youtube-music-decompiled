package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class alqk extends aihn implements aiis {
    public static final alqk a;
    public int b;
    public Object d;
    public InnertubeContext$InnerTubeContext e;
    public aooi f;
    public boolean g;
    public int h;
    public alqg i;
    public int c = 0;
    private byte j = 2;

    static {
        alqk alqkVar = new alqk();
        a = alqkVar;
        aihn.registerDefaultInstance(alqk.class, alqkVar);
    }

    private alqk() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\f\u0007\u0000\u0000\u0002\u0001ᐉ\u0000\u0003;\u0000\u0004;\u0000\bᐉ\u0004\nဇ\u0006\u000b᠌\u0007\fဉ\b", new Object[]{"d", "c", "b", "e", "f", "g", "h", aotj.s, "i"});
            case 3:
                return new alqk();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(alqk.class);
            default:
                return null;
        }
    }
}
