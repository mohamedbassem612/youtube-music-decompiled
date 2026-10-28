package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqzp implements weh {
    static final aqzo a;
    public static final weq b;
    private final aqzq c;

    static {
        aqzo aqzoVar = new aqzo();
        a = aqzoVar;
        b = aqzoVar;
    }

    public aqzp(aqzq aqzqVar) {
        this.c = aqzqVar;
    }

    public static aqzn e(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = aqzq.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aqzq aqzqVar = (aqzq) aihfVarCreateBuilder.instance;
        aqzqVar.b |= 1;
        aqzqVar.c = str;
        return new aqzn(aihfVarCreateBuilder);
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
        return new aqzn(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aqzp) && this.c.equals(((aqzp) obj).c);
    }

    public String getDeletedStatusMessage() {
        return this.c.d;
    }

    public Integer getDeletedStatusMessageUtf16Length() {
        return Integer.valueOf(this.c.h);
    }

    public String getHideOriginalContentMessage() {
        return this.c.g;
    }

    public Integer getHideOriginalContentMessageUtf16Length() {
        return Integer.valueOf(this.c.j);
    }

    public Boolean getShouldShowOriginalContent() {
        return Boolean.valueOf(this.c.f);
    }

    public String getShowOriginalContentMessage() {
        return this.c.e;
    }

    public Integer getShowOriginalContentMessageUtf16Length() {
        return Integer.valueOf(this.c.i);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "UpdateLiveChatItemEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
