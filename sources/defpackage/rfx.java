package defpackage;

import android.util.Size;
import j$.util.Optional;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rfx {
    public final Size a;
    public final Optional b;
    public final long c;
    public final long d;
    public final long e;
    public final UUID f;
    public final Optional g;
    public final bru h;
    public final Optional i;

    public rfx(Size size, Optional optional, long j, long j2, long j3, UUID uuid, Optional optional2, bru bruVar, Optional optional3) {
        this.a = size;
        this.b = optional;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = uuid;
        this.g = optional2;
        this.h = bruVar;
        this.i = optional3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rfx) {
            rfx rfxVar = (rfx) obj;
            if (this.a.equals(rfxVar.a) && this.b.equals(rfxVar.b) && this.c == rfxVar.c && this.d == rfxVar.d && this.e == rfxVar.e && this.f.equals(rfxVar.f) && this.g.equals(rfxVar.g) && this.h.equals(rfxVar.h) && this.i.equals(rfxVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        long j = this.e;
        UUID uuid = this.f;
        long j2 = (j >>> 32) ^ j;
        long j3 = this.d;
        long j4 = (j3 >>> 32) ^ j3;
        long j5 = this.c;
        return (((((((((((((iHashCode * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ ((int) j4)) * 1000003) ^ ((int) j2)) * 1000003) ^ uuid.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        Optional optional = this.i;
        bru bruVar = this.h;
        Optional optional2 = this.g;
        UUID uuid = this.f;
        Optional optional3 = this.b;
        return "PendingTextureInfo{textureSize=" + String.valueOf(this.a) + ", preCropSize=" + String.valueOf(optional3) + ", textureTimestamp=" + this.c + ", presentationTimestamp=" + this.d + ", sourceTimestamp=" + this.e + ", referenceId=" + String.valueOf(uuid) + ", releaseTime=" + String.valueOf(optional2) + ", colorInfo=" + String.valueOf(bruVar) + ", cropRect=" + String.valueOf(optional) + '}';
    }

    public rfx() {
        throw null;
    }
}
