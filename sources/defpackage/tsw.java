package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tsw extends tub {
    private final String a;
    private final apho b;
    private final ajwo c;
    private final Optional d;
    private final int e;
    private final String f;
    private final aigj g;
    private final acjw h;

    private tsw(String str, apho aphoVar, ajwo ajwoVar, Optional optional, int i, String str2, aigj aigjVar, acjw acjwVar) {
        this.a = str;
        this.b = aphoVar;
        this.c = ajwoVar;
        this.d = optional;
        this.e = i;
        this.f = str2;
        this.g = aigjVar;
        this.h = acjwVar;
    }

    @Override // defpackage.tub
    public final int a() {
        return this.e;
    }

    @Override // defpackage.tub
    public final acjw b() {
        return this.h;
    }

    @Override // defpackage.tub
    public final aigj c() {
        return this.g;
    }

    @Override // defpackage.tub
    public final ajwo d() {
        return this.c;
    }

    @Override // defpackage.tub
    public final apho e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        apho aphoVar;
        ajwo ajwoVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tub) {
            tub tubVar = (tub) obj;
            if (this.a.equals(tubVar.h()) && ((aphoVar = this.b) != null ? aphoVar.equals(tubVar.e()) : tubVar.e() == null) && ((ajwoVar = this.c) != null ? ajwoVar.equals(tubVar.d()) : tubVar.d() == null) && this.d.equals(tubVar.f()) && this.e == tubVar.a() && this.f.equals(tubVar.g()) && this.g.equals(tubVar.c()) && this.h.equals(tubVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tub
    public final Optional f() {
        return this.d;
    }

    @Override // defpackage.tub
    public final String g() {
        return this.f;
    }

    @Override // defpackage.tub
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        apho aphoVar = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (aphoVar == null ? 0 : aphoVar.hashCode())) * 1000003;
        ajwo ajwoVar = this.c;
        return ((((((((((iHashCode2 ^ (ajwoVar != null ? ajwoVar.hashCode() : 0)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        acjw acjwVar = this.h;
        aigj aigjVar = this.g;
        Optional optional = this.d;
        ajwo ajwoVar = this.c;
        return "SectionListContinuationEvent{targetId=" + this.a + ", reloadContinuationData=" + String.valueOf(this.b) + ", command=" + String.valueOf(ajwoVar) + ", preloadContent=" + String.valueOf(optional) + ", pageType=" + this.e + ", continuation=" + this.f + ", trackingParams=" + aigjVar.toString() + ", continuationType=" + acjwVar.toString() + '}';
    }

    public /* synthetic */ tsw(String str, apho aphoVar, ajwo ajwoVar, Optional optional, int i, String str2, aigj aigjVar, acjw acjwVar, tsv tsvVar) {
        this(str, aphoVar, ajwoVar, optional, i, str2, aigjVar, acjwVar);
    }
}
