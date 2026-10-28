package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qwz {
    public final String a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;
    public final Optional i;
    private final bse j;

    public qwz(String str, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, bse bseVar) {
        this.a = str;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
        this.e = optional4;
        this.f = optional5;
        this.g = optional6;
        this.h = optional7;
        this.i = optional8;
        this.j = bseVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qwz) {
            qwz qwzVar = (qwz) obj;
            if (this.a.equals(qwzVar.a) && this.b.equals(qwzVar.b) && this.c.equals(qwzVar.c) && this.d.equals(qwzVar.d) && this.e.equals(qwzVar.e) && this.f.equals(qwzVar.f) && this.g.equals(qwzVar.g) && this.h.equals(qwzVar.h) && this.i.equals(qwzVar.i) && this.j.equals(qwzVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    public final String toString() {
        bse bseVar = this.j;
        Optional optional = this.i;
        Optional optional2 = this.h;
        Optional optional3 = this.g;
        Optional optional4 = this.f;
        Optional optional5 = this.e;
        Optional optional6 = this.d;
        Optional optional7 = this.c;
        return "Track{mimeType=" + this.a + ", channelCount=" + this.b.toString() + ", sampleRate=" + optional7.toString() + ", duration=" + optional6.toString() + ", width=" + optional5.toString() + ", height=" + optional4.toString() + ", colorStandard=" + optional3.toString() + ", colorTransfer=" + optional2.toString() + ", colorRange=" + optional.toString() + ", format=" + bseVar.toString() + '}';
    }

    public qwz() {
        throw null;
    }
}
