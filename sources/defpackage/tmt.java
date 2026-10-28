package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tmt {
    public static final tmt a = a().a();
    public final agke b;
    public final agkj c;
    public final String d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final Optional i;
    public final ainp j;
    public final int k;

    public tmt(agke agkeVar, agkj agkjVar, String str, long j, long j2, long j3, long j4, Optional optional, ainp ainpVar, int i) {
        this.b = agkeVar;
        this.c = agkjVar;
        this.d = str;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = optional;
        this.j = ainpVar;
        this.k = i;
    }

    public static tms a() {
        tms tmsVar = new tms();
        tmsVar.e(0L);
        tmsVar.b(0L);
        tmsVar.g(0L);
        tmsVar.f(0L);
        tmsVar.a = null;
        tmsVar.b = Optional.empty();
        tmsVar.d(agpn.b);
        tmsVar.c = null;
        tmsVar.d = 1;
        tmsVar.c(agpi.a);
        return tmsVar;
    }

    public final boolean b(mbc mbcVar) {
        return this.g < mbcVar.f().toEpochMilli();
    }

    public final boolean c(mbc mbcVar) {
        return this.h < mbcVar.f().toEpochMilli();
    }

    public final boolean equals(Object obj) {
        String str;
        ainp ainpVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tmt) {
            tmt tmtVar = (tmt) obj;
            if (aguu.v(this.b, tmtVar.b) && aguu.q(this.c, tmtVar.c) && ((str = this.d) != null ? str.equals(tmtVar.d) : tmtVar.d == null) && this.e == tmtVar.e && this.f == tmtVar.f && this.g == tmtVar.g && this.h == tmtVar.h && this.i.equals(tmtVar.i) && ((ainpVar = this.j) != null ? ainpVar.equals(tmtVar.j) : tmtVar.j == null)) {
                int i = this.k;
                int i2 = tmtVar.k;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
        String str = this.d;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.e;
        int i = ((((iHashCode * 1000003) ^ iHashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        long j2 = this.f;
        int i2 = (i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        long j3 = this.g;
        int i3 = (i2 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        long j4 = this.h;
        int iHashCode3 = (((i3 ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ this.i.hashCode()) * 1000003;
        ainp ainpVar = this.j;
        int iHashCode4 = ainpVar != null ? ainpVar.hashCode() : 0;
        int i4 = this.k;
        a.bj(i4);
        return ((iHashCode3 ^ iHashCode4) * 1000003) ^ i4;
    }

    public final String toString() {
        String str;
        int i = this.k;
        ainp ainpVar = this.j;
        Optional optional = this.i;
        agkj agkjVar = this.c;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(agkjVar);
        String strValueOf3 = String.valueOf(optional);
        String strValueOf4 = String.valueOf(ainpVar);
        if (i != 1) {
            str = i != 2 ? "null" : "PAGE";
        } else {
            str = "DEFAULT";
        }
        long j = this.h;
        long j2 = this.g;
        long j3 = this.f;
        long j4 = this.e;
        return "CacheMetadata{pageScopedDeferredChunkKeys=" + strValueOf + ", responseHeaders=" + strValueOf2 + ", etag=" + this.d + ", serverDate=" + j4 + ", lastModified=" + j3 + ", ttl=" + j2 + ", softTtl=" + j + ", monitoringKey=" + strValueOf3 + ", sharedData=" + strValueOf4 + ", scope=" + str + '}';
    }

    public tmt() {
        throw null;
    }
}
