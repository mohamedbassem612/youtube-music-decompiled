package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aqph implements weh {
    static final aqpg a;
    public static final weq b;
    public final wek c;
    public final aqpi d;

    static {
        aqpg aqpgVar = new aqpg();
        a = aqpgVar;
        b = aqpgVar;
    }

    public aqph(aqpi aqpiVar, wek wekVar) {
        this.d = aqpiVar;
        this.c = wekVar;
    }

    public static aqpf f(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihh aihhVar = (aihh) aqpi.b.createBuilder();
        aihhVar.copyOnWrite();
        aqpi aqpiVar = (aqpi) aihhVar.instance;
        aqpiVar.c |= 1;
        aqpiVar.d = str;
        return new aqpf(aihhVar);
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        aqpi aqpiVar = this.d;
        if (aqpiVar.i.size() > 0) {
            agkxVar.j(aqpiVar.i);
        }
        if (aqpiVar.o.size() > 0) {
            agkxVar.j(aqpiVar.o);
        }
        return agkxVar.g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.d.d;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.d.toByteArray();
    }

    @Deprecated
    public final agke e() {
        aqpi aqpiVar = this.d;
        if (aqpiVar.i.size() == 0) {
            return agpi.a;
        }
        agjz agjzVar = new agjz(4);
        Iterator it = aqpiVar.i.iterator();
        while (it.hasNext()) {
            weh wehVarD = this.c.d((String) it.next());
            if (wehVarD != null) {
                if (!(wehVarD instanceof aohq)) {
                    throw new IllegalArgumentException(a.cs(wehVarD, "Entity ", " is not a OfflineVideoStreamsEntityModel"));
                }
                agjzVar.h((aohq) wehVarD);
            }
        }
        return agjzVar.g();
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof aqph) && this.d.equals(((aqph) obj).d);
    }

    @Override // defpackage.weh
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final aqpf d() {
        return new aqpf((aihh) this.d.toBuilder());
    }

    public String getCotn() {
        return this.d.k;
    }

    public Long getEnqueuedTimestampMs() {
        return Long.valueOf(this.d.l);
    }

    public aqpe getFailureReason() {
        aqpe aqpeVarA = aqpe.a(this.d.h);
        return aqpeVarA == null ? aqpe.TRANSFER_FAILURE_REASON_UNKNOWN : aqpeVarA;
    }

    public Boolean getHasLoggedFirstStarted() {
        return Boolean.valueOf(this.d.r);
    }

    public Boolean getIsExternalMedia() {
        return Boolean.valueOf(this.d.t);
    }

    public Boolean getIsRefresh() {
        return Boolean.valueOf(this.d.q);
    }

    public Long getLastProgressTimeMs() {
        return Long.valueOf(this.d.s);
    }

    public aohx getMaximumDownloadQuality() {
        aohx aohxVarA = aohx.a(this.d.m);
        return aohxVarA == null ? aohx.UNKNOWN_FORMAT_TYPE : aohxVarA;
    }

    public String getPreferredAudioTrack() {
        return this.d.n;
    }

    public List getStreamProgress() {
        return this.d.g;
    }

    public Integer getTransferRetryCount() {
        return Integer.valueOf(this.d.p);
    }

    public aqpc getTransferState() {
        aqpc aqpcVarA = aqpc.a(this.d.e);
        return aqpcVarA == null ? aqpc.TRANSFER_STATE_UNKNOWN : aqpcVarA;
    }

    public List getTransferStatusReason() {
        return new aihx(this.d.f, aqpi.a);
    }

    public final List h() {
        return this.d.o;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.d.hashCode() ^ 1008001;
    }

    public final List i() {
        return this.d.i;
    }

    public final String toString() {
        return "TransferEntityModel{" + String.valueOf(this.d) + '}';
    }

    public weq getType() {
        return b;
    }
}
