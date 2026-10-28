package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class apmh implements weh {
    static final apmg a;
    public static final weq b;
    private final apmi c;

    static {
        apmg apmgVar = new apmg();
        a = apmgVar;
        b = apmgVar;
    }

    public apmh(apmi apmiVar) {
        this.c = apmiVar;
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
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final apmf d() {
        return new apmf(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof apmh) && this.c.equals(((apmh) obj).c);
    }

    public List getPlaylistIds() {
        return this.c.d;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "SaveToPlaylistListEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
