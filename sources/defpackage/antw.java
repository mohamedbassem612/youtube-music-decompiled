package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class antw implements weh {
    static final antv a;
    public static final weq b;
    private final antx c;

    static {
        antv antvVar = new antv();
        a = antvVar;
        b = antvVar;
    }

    public antw(antx antxVar) {
        this.c = antxVar;
    }

    public static antu e(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = antx.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        antx antxVar = (antx) aihfVarCreateBuilder.instance;
        antxVar.b |= 1;
        antxVar.c = str;
        return new antu(aihfVarCreateBuilder);
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.c;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new antu(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof antw) && this.c.equals(((antw) obj).c);
    }

    public anty getNowPlayingItem() {
        anty antyVar = this.c.e;
        return antyVar == null ? anty.a : antyVar;
    }

    public antt getPlaybackState() {
        antt anttVarA = antt.a(this.c.d);
        return anttVarA == null ? antt.MUSIC_PLAYBACK_STATE_UNKNOWN : anttVarA;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "MusicPlayerEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
