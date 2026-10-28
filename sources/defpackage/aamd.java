package defpackage;

import app.rive.semantics.SemanticState;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aamd {
    public static final /* synthetic */ int b = 0;
    private static final long c;
    public final aamm a;
    private final String d;
    private final mbc e;
    private final aoop f;
    private final aohk g;
    private final aknu h;
    private final aqph i;
    private final agke j;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        c = 43200L;
    }

    public aamd(String str, mbc mbcVar, aoop aoopVar, aohk aohkVar, aknu aknuVar, aqph aqphVar, agke agkeVar) {
        Object next;
        agkeVar.getClass();
        this.d = str;
        this.e = mbcVar;
        this.f = aoopVar;
        this.g = aohkVar;
        this.h = aknuVar;
        this.i = aqphVar;
        this.j = agkeVar;
        agqs agqsVarListIterator = agkeVar.listIterator(0);
        do {
            if (!agqsVarListIterator.hasNext()) {
                next = null;
                break;
            }
            next = agqsVarListIterator.next();
        } while (!awrc.c(wfs.h(((aohq) next).b()), this.d));
        aohq aohqVar = (aohq) next;
        this.a = aohqVar != null ? aamm.e(this.d, aohqVar) : null;
    }

    public final boolean a() {
        aony aonyVarA;
        Object next;
        aqph aqphVar = this.i;
        if (aqphVar != null && aqphVar.getTransferState() != aqpc.TRANSFER_STATE_UNKNOWN && aqphVar.getTransferState() != aqpc.TRANSFER_STATE_COMPLETE && aqphVar.getTransferState() != aqpc.TRANSFER_STATE_FAILED) {
            return false;
        }
        if (aqphVar != null && aqphVar.getTransferState() == aqpc.TRANSFER_STATE_PAUSED_BY_USER) {
            return false;
        }
        if (b()) {
            aoop aoopVar = this.f;
            if (aoopVar.j()) {
                aonyVarA = aoopVar.getPlayerResponsePlayabilityCanPlayStatus();
            } else {
                aonyVarA = aony.a(aoopVar.getOfflinePlayabilityStatus().c);
                if (aonyVarA == null) {
                    aonyVarA = aony.OK;
                }
            }
            if (aaje.r(aonyVarA) && aqphVar != null && aqphVar.getTransferState() == aqpc.TRANSFER_STATE_COMPLETE) {
                aknu aknuVar = this.h;
                if (aknuVar == null) {
                    return false;
                }
                List licenses = aknuVar.getLicenses();
                licenses.getClass();
                Iterator it = licenses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    aknx aknxVar = (aknx) next;
                    if ((aknxVar.b & SemanticState.Focused) != 0 && aknxVar.f.equals(this.d)) {
                        break;
                    }
                }
                aknx aknxVar2 = (aknx) next;
                if (aknxVar2 == null || aknxVar2.d) {
                    return false;
                }
                Instant instantF = this.e.f();
                if (!(aknuVar.getPlaybackStartSeconds().longValue() > 0 ? instantF.isAfter(Instant.ofEpochSecond(aknuVar.getPlaybackStartSeconds().longValue() + aknxVar2.c)) : instantF.isAfter(Instant.ofEpochSecond(aknuVar.getLicenseExpirySeconds().longValue())))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean b() {
        aohk aohkVar = this.g;
        if (aohkVar != null && aohkVar.getAction() == aohh.OFFLINE_VIDEO_POLICY_ACTION_OK) {
            mbc mbcVar = this.e;
            Instant instantF = mbcVar.f();
            instantF.getClass();
            double dA = ahbu.a(instantF);
            double dLongValue = aohkVar.getExpirationTimestamp().longValue();
            Double.valueOf(dLongValue).getClass();
            if (dA < dLongValue) {
                Instant instantF2 = mbcVar.f();
                instantF2.getClass();
                if (ahbu.a(instantF2) >= aohkVar.getLastUpdatedTimestampSeconds().longValue() - c) {
                    return true;
                }
            }
        }
        return false;
    }
}
