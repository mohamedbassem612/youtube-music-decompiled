package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aknu implements weh {
    static final aknt a;
    public static final weq b;
    private final aknw c;

    static {
        aknt akntVar = new aknt();
        a = akntVar;
        b = akntVar;
    }

    public aknu(aknw aknwVar) {
        this.c = aknwVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        aknw aknwVar = this.c;
        if ((aknwVar.c & 8) != 0) {
            agkxVar.c(aknwVar.h);
        }
        getErrorModel();
        agkxVar.j(new agkx().g());
        return agkxVar.g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.d;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new akns(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aknu) && this.c.equals(((aknu) obj).c);
    }

    public aknv getError() {
        aknv aknvVar = this.c.i;
        return aknvVar == null ? aknv.a : aknvVar;
    }

    public aknr getErrorModel() {
        aknv aknvVar = this.c.i;
        if (aknvVar == null) {
            aknvVar = aknv.a;
        }
        return new aknr((aknv) aknvVar.toBuilder().build());
    }

    public Long getLicenseExpirySeconds() {
        return Long.valueOf(this.c.g);
    }

    public List getLicenses() {
        return this.c.e;
    }

    public Long getPlaybackStartSeconds() {
        return Long.valueOf(this.c.f);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "DrmLicenseEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
