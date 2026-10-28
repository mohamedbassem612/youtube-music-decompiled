package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class htc extends hth {
    private final Optional a;
    private final Optional b;
    private final Optional c;
    private final Optional d;
    private final Optional e;
    private final Optional f;
    private volatile transient Optional g;

    public htc(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6) {
        if (optional == null) {
            throw new NullPointerException("Null backingModel");
        }
        this.a = optional;
        if (optional2 == null) {
            throw new NullPointerException("Null downloadMetadata");
        }
        this.b = optional2;
        if (optional3 == null) {
            throw new NullPointerException("Null playbackData");
        }
        this.c = optional3;
        if (optional4 == null) {
            throw new NullPointerException("Null transfer");
        }
        this.d = optional4;
        if (optional5 == null) {
            throw new NullPointerException("Null offlineVideoPolicy");
        }
        this.e = optional5;
        if (optional6 == null) {
            throw new NullPointerException("Null offlineVideoStreams");
        }
        this.f = optional6;
    }

    @Override // defpackage.hth
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.hth
    public final Optional b() {
        return this.b;
    }

    @Override // defpackage.hth
    public final Optional c() {
        return this.e;
    }

    @Override // defpackage.hth
    public final Optional d() {
        return this.f;
    }

    @Override // defpackage.hth
    public final Optional e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hth) {
            hth hthVar = (hth) obj;
            if (this.a.equals(hthVar.a()) && this.b.equals(hthVar.b()) && this.c.equals(hthVar.e()) && this.d.equals(hthVar.f()) && this.e.equals(hthVar.c()) && this.f.equals(hthVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hth
    public final Optional f() {
        return this.d;
    }

    @Override // defpackage.hth
    public final Optional g() {
        if (this.g == null) {
            synchronized (this) {
                if (this.g == null) {
                    Optional optionalOfNullable = this.c;
                    if (true == optionalOfNullable.isPresent()) {
                        optionalOfNullable = Optional.ofNullable((alvt) wjr.F(((aoop) optionalOfNullable.get()).getPlayerResponseBytes().G(), alvt.a));
                    }
                    this.g = optionalOfNullable;
                    if (this.g == null) {
                        throw new NullPointerException("playerResponse() cannot return null");
                    }
                }
            }
        }
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Optional optional = this.f;
        Optional optional2 = this.e;
        Optional optional3 = this.d;
        Optional optional4 = this.c;
        Optional optional5 = this.b;
        return "OfflinePlaybackDataModel{backingModel=" + this.a.toString() + ", downloadMetadata=" + optional5.toString() + ", playbackData=" + optional4.toString() + ", transfer=" + optional3.toString() + ", offlineVideoPolicy=" + optional2.toString() + ", offlineVideoStreams=" + optional.toString() + '}';
    }
}
