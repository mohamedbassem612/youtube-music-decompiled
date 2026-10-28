package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aamt implements aalx {
    public final aamo a;
    public final aohx b;
    public final int c;
    public final byte[] d;
    public final boolean e;
    public final long f;
    public final Instant g;
    public final long h;
    public final long i;
    public final Instant j;
    public final long k;
    public final long l;
    public final aams m;
    public final aamg n;
    public final aamn o;
    public final aamm p;
    public final aamw q;
    public final wjf r;
    private final alvl s;

    public aamt(aamo aamoVar, aohx aohxVar, int i, byte[] bArr, boolean z, long j, long j2, long j3, Instant instant, long j4, long j5, aams aamsVar, alvl alvlVar, aamg aamgVar, aamn aamnVar, aamm aammVar, aamw aamwVar, wjf wjfVar) {
        aamoVar.getClass();
        this.a = aamoVar;
        this.b = aohxVar;
        this.c = i;
        this.d = bArr;
        this.e = z;
        this.f = j;
        this.g = Instant.ofEpochMilli(j);
        this.h = j2;
        this.i = j3;
        this.j = instant;
        this.k = j4;
        this.l = j5;
        this.m = aamsVar;
        this.s = alvlVar;
        this.n = aamgVar;
        this.o = aamnVar;
        this.p = aammVar;
        this.q = aamwVar;
        this.r = wjfVar;
    }

    @Override // defpackage.aalx
    public final boolean a() {
        aamm aammVar = this.p;
        return (aammVar == null || aammVar.e) ? false : true;
    }

    @Override // defpackage.aalx
    public final String b() {
        return this.a.d();
    }

    @Override // defpackage.aalx
    public final boolean c() {
        return this.n == aamg.COMPLETE;
    }

    public final long d() {
        aamm aammVar = this.p;
        if (aammVar == null) {
            return 0L;
        }
        return aammVar.d;
    }

    public final long e() {
        aamm aammVar = this.p;
        if (aammVar == null) {
            return 0L;
        }
        return aammVar.c;
    }

    @Deprecated
    public final aamp f() {
        aamw aamwVar;
        aamw aamwVar2;
        aamg aamgVar = this.n;
        if (aamgVar == aamg.DELETED) {
            return aamp.DELETED;
        }
        if (l()) {
            if (t()) {
                return aamp.TRANSFER_PENDING_USER_APPROVAL;
            }
            if (i()) {
                return aamp.ERROR_PENDING_PLAYABILITY_ACTION;
            }
            if (m()) {
                return aamp.ERROR_NOT_PLAYABLE;
            }
            aams aamsVar = this.m;
            if (aamsVar != null && n()) {
                return aamsVar.e() ? aamp.ERROR_EXPIRED : aamp.ERROR_POLICY;
            }
            if (a()) {
                return aamp.ERROR_STREAMS_MISSING;
            }
            aamp aampVar = aamp.DELETED;
            int iOrdinal = aamgVar.ordinal();
            if (iOrdinal != 5) {
                return iOrdinal != 6 ? aamp.ERROR_GENERIC : aamp.ERROR_NETWORK;
            }
            return aamp.ERROR_DISK;
        }
        if (c()) {
            return aamp.PLAYABLE;
        }
        if (j()) {
            return aamp.CANDIDATE;
        }
        if (r()) {
            return aamp.TRANSFER_PAUSED;
        }
        if (p() && (aamwVar2 = this.q) != null && aamwVar2.b()) {
            return aamwVar2.g.o() ? aamp.ERROR_DISK_SD_CARD : aamp.TRANSFER_IN_PROGRESS;
        }
        if (s() && (aamwVar = this.q) != null) {
            int i = aamwVar.c;
            if ((i & 2) != 0) {
                return aamp.TRANSFER_PENDING_NETWORK;
            }
            if ((i & 8) != 0) {
                return aamp.TRANSFER_PENDING_WIFI;
            }
            if ((i & SemanticState.Obscured) != 0) {
                return aamp.TRANSFER_PENDING_STORAGE;
            }
        }
        return aamp.TRANSFER_WAITING_IN_QUEUE;
    }

    public final boolean g() {
        return this.r != null;
    }

    public final boolean h() {
        aamm aammVar = this.p;
        return aammVar != null && aammVar.e;
    }

    public final boolean i() {
        return m() && aaje.s(this.s);
    }

    public final boolean j() {
        return this.n == aamg.METADATA_ONLY;
    }

    public final boolean k() {
        wjf wjfVar = this.r;
        return wjfVar != null && wjfVar.Q();
    }

    @Deprecated
    public final boolean l() {
        if (p() || r() || j()) {
            return false;
        }
        return n() || m() || !c() || a();
    }

    public final boolean m() {
        alvl alvlVar = this.s;
        return (alvlVar == null || aaje.q(alvlVar)) ? false : true;
    }

    public final boolean n() {
        aams aamsVar = this.m;
        return (aamsVar == null || aamsVar.g()) ? false : true;
    }

    public final boolean o() {
        return (p() || n() || r() || this.n == aamg.CANNOT_OFFLINE || c()) ? false : true;
    }

    public final boolean p() {
        return this.n == aamg.ACTIVE;
    }

    public final boolean q() {
        aamm aammVar = this.p;
        return aammVar != null && aammVar.f;
    }

    public final boolean r() {
        return this.n == aamg.PAUSED;
    }

    public final boolean s() {
        aamw aamwVar;
        return p() && (aamwVar = this.q) != null && aamwVar.b == aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE;
    }

    public final boolean t() {
        return this.n == aamg.STREAM_DOWNLOAD_PENDING;
    }

    public final boolean u(vxz vxzVar) {
        aamg aamgVar;
        if (!vxzVar.l(142, 45632208L, false) || this.r != null || this.n == aamg.DELETED) {
            aams aamsVar = this.m;
            if (vxzVar.m(94, 45477963L)) {
                if (aamsVar != null && !TextUtils.isEmpty(aamsVar.c()) && this.n == aamg.DELETED) {
                    return false;
                }
            } else if (aamsVar == null || aamsVar.c() == null || (aamgVar = this.n) == aamg.DELETED || aamgVar == aamg.CANNOT_OFFLINE) {
                return false;
            }
        }
        return true;
    }
}
