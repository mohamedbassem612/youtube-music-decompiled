package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class htf implements aalx {
    public final String a;
    public final anyx b;
    public final Optional c;
    private final String d;
    private final boolean e;

    public htf(String str, String str2, boolean z, anyx anyxVar, Optional optional) {
        this.a = str;
        this.d = str2;
        this.e = z;
        this.b = anyxVar;
        this.c = optional;
    }

    @Override // defpackage.aalx
    public final /* synthetic */ boolean a() {
        return !this.e;
    }

    @Override // defpackage.aalx
    public final String b() {
        return this.a;
    }

    @Override // defpackage.aalx
    public final boolean c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof htf) {
            htf htfVar = (htf) obj;
            if (this.a.equals(htfVar.a) && this.d.equals(htfVar.d) && this.e == htfVar.e && this.b.equals(htfVar.b) && this.c.equals(htfVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        return "MusicDownloadedVideo{videoId=" + this.a + ", title=" + this.d + ", streamComplete=" + this.e + ", musicTrackEntity=" + String.valueOf(this.b) + ", playbackDataEntity=" + String.valueOf(optional) + '}';
    }

    public htf() {
        throw null;
    }
}
