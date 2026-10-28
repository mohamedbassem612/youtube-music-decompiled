package defpackage;

import com.google.protos.youtube.api.innertube.MediaFetchHotConfigOuterClass$MediaFetchHotConfig;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anew extends aihn implements aiis {
    public static final anew a;
    public akwk b;
    public aojp c;
    public apbx d;
    public aomt e;
    public akwn f;
    public ajbv g;
    public anfe h;
    public aont i;
    public apbm j;
    public aple k;
    public MediaFetchHotConfigOuterClass$MediaFetchHotConfig l;
    private int m;
    private byte n = 2;

    static {
        anew anewVar = new anew();
        a = anewVar;
        aihn.registerDefaultInstance(anew.class, anewVar);
    }

    private anew() {
    }

    @Override // defpackage.aihn
    protected final Object dynamicMethod(aihm aihmVar, Object obj, Object obj2) {
        switch (aihmVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0003\uee52喠\u000b\u0000\u0000\u0001\u0003ဉ\f\u0004ဉ\r\u0005ဉ\u000e\u0006ဉ\u000f\bဉ\u0011麗䉳ဉ\u0001\ue99c䗄ᐉ\u0002\uee53䬕ဉ\u0007\ue0b1䭝ဉ\u0006\ue536冡ဉ\b\uee52喠ဉ\n", new Object[]{"m", "h", "i", "j", "k", "l", "b", "c", "e", "d", "f", "g"});
            case 3:
                return new anew();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(anew.class);
            default:
                return null;
        }
    }
}
