package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class altu extends aihn implements aiis {
    public static final altu a;
    public int b;
    public InnertubeContext$InnerTubeContext c;
    public boolean h;
    private byte i = 2;
    public aiie d = emptyProtobufList();
    public aiie e = emptyProtobufList();
    public aiie f = emptyProtobufList();
    public aiie g = emptyProtobufList();

    static {
        altu altuVar = new altu();
        a = altuVar;
        aihn.registerDefaultInstance(altu.class, altuVar);
    }

    private altu() {
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
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0004\u0001\u0001ᐉ\u0000\u0002\u001a\u0003\u001a\u0004ဇ\u0001\u0005\u001b\u0006\u001b", new Object[]{"b", "c", "d", "g", "h", "e", altx.class, "f", altw.class});
            case 3:
                return new altu();
            case 4:
                return new aihf(a);
            case 5:
                return a;
            case 6:
                return aihn.getParserForClass(altu.class);
            default:
                return null;
        }
    }
}
