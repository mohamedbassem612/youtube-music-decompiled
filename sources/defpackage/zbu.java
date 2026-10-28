package defpackage;

import com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zbu extends zbx {
    public final zjv a;
    public final int b;
    public final wgs c;
    public final bse d;
    public final String e;
    public final boolean f;
    public final MediaCapabilitiesOuterClass$MediaCapabilities g;
    private volatile transient bto h;
    private volatile transient cqs i;

    public zbu(zjv zjvVar, int i, wgs wgsVar, bse bseVar, String str, boolean z, MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities) {
        this.a = zjvVar;
        this.b = i;
        this.c = wgsVar;
        this.d = bseVar;
        this.e = str;
        this.f = z;
        this.g = mediaCapabilitiesOuterClass$MediaCapabilities;
    }

    @Override // defpackage.zbx
    public final int a() {
        return this.b;
    }

    @Override // defpackage.zbx
    public final bse b() {
        return this.d;
    }

    @Override // defpackage.zbx
    public final MediaCapabilitiesOuterClass$MediaCapabilities c() {
        return this.g;
    }

    @Override // defpackage.zbx
    public final wgs d() {
        return this.c;
    }

    @Override // defpackage.zbx
    public final zjv e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zbx) {
            zbx zbxVar = (zbx) obj;
            if (this.a.equals(zbxVar.e()) && this.b == zbxVar.a() && this.c.equals(zbxVar.d()) && this.d.equals(zbxVar.b()) && ((str = this.e) != null ? str.equals(zbxVar.f()) : zbxVar.f() == null) && this.f == zbxVar.g()) {
                MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities = this.g;
                if (mediaCapabilitiesOuterClass$MediaCapabilities == null) {
                    if (zbxVar.c() == null) {
                        return true;
                    }
                } else if (mediaCapabilitiesOuterClass$MediaCapabilities.equals(zbxVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.zbx
    public final String f() {
        return this.e;
    }

    @Override // defpackage.zbx
    public final boolean g() {
        return this.f;
    }

    @Override // defpackage.zbx
    public final bto h() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    this.h = new bto("", this.d);
                    if (this.h == null) {
                        throw new NullPointerException("trackGroup() cannot return null");
                    }
                }
            }
        }
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        String str = this.e;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities = this.g;
        return iHashCode2 ^ (mediaCapabilitiesOuterClass$MediaCapabilities != null ? mediaCapabilitiesOuterClass$MediaCapabilities.hashCode() : 0);
    }

    @Override // defpackage.zbx
    public final cqs i() {
        if (this.i == null) {
            synchronized (this) {
                if (this.i == null) {
                    this.i = new cqt(h(), 0, 0, null);
                    if (this.i == null) {
                        throw new NullPointerException("trackSelection() cannot return null");
                    }
                }
            }
        }
        return this.i;
    }

    public final String toString() {
        MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities = this.g;
        bse bseVar = this.d;
        wgs wgsVar = this.c;
        return "AudioFormatAndRendererInformation{trackRendererType=" + this.a.toString() + ", rendererIndexWithoutAudioOffload=" + this.b + ", compatibleFormatStream=" + wgsVar.toString() + ", exoFormat=" + bseVar.toString() + ", trackId=" + this.e + ", drcEnabled=" + this.f + ", mediaCapabilities=" + String.valueOf(mediaCapabilitiesOuterClass$MediaCapabilities) + '}';
    }
}
