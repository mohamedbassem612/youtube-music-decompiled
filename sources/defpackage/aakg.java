package defpackage;

import android.database.Cursor;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aakg implements aant {
    public final aart a;
    public final aanb b;
    public final aaqg c;
    public final vxz d;
    public final ci e;
    private final ahex f;
    private final ScheduledExecutorService g;
    private final tbt h;

    public aakg(aaqg aaqgVar, aanb aanbVar, abxu abxuVar, tbt tbtVar, aart aartVar, ci ciVar, vxz vxzVar, aauk aaukVar) {
        this.c = aaqgVar;
        this.b = aanbVar;
        boolean zA = aaukVar.A();
        abxu abxuVarW = abxuVar.w();
        this.f = (ahex) (zA ? abxuVarW.e : abxuVar.v().c);
        this.g = (ScheduledExecutorService) (zA ? abxuVarW.e : abxuVarW.c);
        this.h = tbtVar;
        this.a = aartVar;
        this.e = ciVar;
        this.d = vxzVar;
    }

    public static aamn d(aqpb aqpbVar) {
        if ((aqpbVar.c & SemanticState.Focused) == 0) {
            int iAU = a.aU(aqpbVar.h);
            return (iAU == 0 || iAU != 2) ? aamn.OFFLINE_IMMEDIATELY : aamn.AUTO_OFFLINE;
        }
        aofb aofbVarA = aofb.a(aqpbVar.i);
        if (aofbVarA == null) {
            aofbVarA = aofb.OFFLINE_TYPE_UNKNOWN;
        }
        aamn aamnVar = aamn.OFFLINE_IMMEDIATELY;
        int iOrdinal = aofbVarA.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return aamn.DEFER_FOR_DISCOUNTED_DATA;
            }
            if (iOrdinal == 3) {
                return aamn.OFFLINE_SHARING;
            }
            if (iOrdinal == 4) {
                return aamn.SIDELOAD;
            }
            if (iOrdinal == 5) {
                return aamn.AUTO_OFFLINE;
            }
            if (iOrdinal == 7) {
                return aamn.EMERGENCY_BUFFER;
            }
        }
        return aamn.OFFLINE_IMMEDIATELY;
    }

    @Override // defpackage.aant
    public final aans a(aofh aofhVar) {
        return aans.c;
    }

    @Override // defpackage.aant
    public final ListenableFuture b(final zwa zwaVar, aofh aofhVar) {
        final String strH = wfs.h(aofhVar.d);
        int iBc = a.bc(aofhVar.c);
        if (iBc == 0) {
            iBc = 1;
        }
        int i = iBc - 1;
        if (i == 1) {
            aofg aofgVar = aofhVar.e;
            if (aofgVar == null) {
                aofgVar = aofg.b;
            }
            return ahng.u(ahno.ap(new hlm((Object) this, zwaVar, strH, aofgVar, 16), this.f), 30L, TimeUnit.SECONDS, this.g);
        }
        if (i == 3) {
            aofg aofgVar2 = aofhVar.e;
            if (aofgVar2 == null) {
                aofgVar2 = aofg.b;
            }
            return ahng.u(ahno.ap(new hlm((Object) this, zwaVar, strH, aofgVar2, 15), this.f), 30L, TimeUnit.SECONDS, this.g);
        }
        if (i != 4) {
            aano aanoVar = new aano(aanp.c);
            aanoVar.d = 23;
            return ahng.n(aanoVar.a());
        }
        aofg aofgVar3 = aofhVar.e;
        if (aofgVar3 == null) {
            aofgVar3 = aofg.b;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqpb.b);
        aofgVar3.c(aihlVarCheckIsLite);
        Object objK = aofgVar3.j.k(aihlVarCheckIsLite.d);
        final aqpb aqpbVar = (aqpb) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        return ahng.u(ahno.ap(new Callable() { // from class: aakf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aodp aodpVarA;
                aqpb aqpbVar2 = aqpbVar;
                int iAS = a.aS(aqpbVar2.k);
                String str = strH;
                aakg aakgVar = this.a;
                if (iAS != 0) {
                    if (iAS != 1) {
                        zwa zwaVar2 = zwaVar;
                        aaqn aaqnVarB = aakgVar.b.b();
                        if (!zwaVar2.k().equals(aaqnVarB.s())) {
                            aano aanoVar2 = new aano(aanp.b);
                            aanoVar2.d = 35;
                            return aanoVar2.a();
                        }
                        aaew aaewVarD = aaqnVarB.d();
                        if (aaewVarD == null) {
                            aano aanoVar3 = new aano(aanp.b);
                            aanoVar3.d = 15;
                            return aanoVar3.a();
                        }
                        aerj aerjVarD = aaqnVarB instanceof aado ? ((aado) aaqnVarB).D() : null;
                        if (aerjVarD == null) {
                            return aanp.a;
                        }
                        aamt aamtVarF = aaewVarD.f(str);
                        if (aamtVarF == null) {
                            aano aanoVar4 = new aano(aanp.c);
                            aanoVar4.d = 26;
                            return aanoVar4.a();
                        }
                        int iAS2 = a.aS(aqpbVar2.k);
                        int i2 = iAS2 != 0 ? iAS2 : 1;
                        if (i2 == 2) {
                            if (!aamtVarF.p()) {
                                if (aamtVarF.r()) {
                                    return aanp.a;
                                }
                                aano aanoVar5 = new aano(aanp.c);
                                aanoVar5.d = 26;
                                return aanoVar5.a();
                            }
                            aaewVarD.S(aamtVarF.b(), aamg.PAUSED);
                            String strB = aamtVarF.b();
                            taq.c();
                            ((ci) aerjVarD.c).ax(aajc.e((String) aerjVarD.b, strB));
                            aakgVar.e(aamtVarF);
                            return aanp.a;
                        }
                        if (i2 != 3) {
                            aano aanoVar6 = new aano(aanp.c);
                            aanoVar6.d = 27;
                            return aanoVar6.a();
                        }
                        if (!aamtVarF.r()) {
                            if (aamtVarF.p()) {
                                return aanp.a;
                            }
                            aano aanoVar7 = new aano(aanp.c);
                            aanoVar7.d = 26;
                            return aanoVar7.a();
                        }
                        String strB2 = aamtVarF.b();
                        aaewVarD.S(aamtVarF.b(), aamg.ACTIVE);
                        if (aamtVarF.q != null) {
                            taq.c();
                            ((ci) aerjVarD.c).ay(aajc.e((String) aerjVarD.b, strB2));
                        } else {
                            aohx aohxVarAn = aaewVarD.an(strB2);
                            typ.f(strB2);
                            Cursor cursorQuery = aaewVarD.j.aa().query("videosV2", new String[]{gzj.OFFLINE_AUDIO_QUALITY}, "id = ?", new String[]{strB2}, null, null, null, null);
                            try {
                                if (!cursorQuery.moveToNext() || (aodpVarA = aodp.a(cursorQuery.getInt(0))) == null) {
                                    aodpVarA = aodp.OFFLINE_AUDIO_QUALITY_UNKNOWN;
                                }
                                cursorQuery.close();
                                aerjVarD.j(strB2, null, null, aohxVarAn, null, aodpVarA, aamtVarF.o, 0, false, false, false, aamtVarF.k(), 1);
                            } catch (Throwable th) {
                                cursorQuery.close();
                                throw th;
                            }
                        }
                        aakgVar.e(aamtVarF);
                        return aanp.a;
                    }
                }
                String strE = aajc.e(aakgVar.b.d(), str);
                aart aartVar = aakgVar.a;
                aartVar.g();
                aaro aaroVar = (aaro) aartVar.b(strE).f();
                if (aaroVar != null && aaroVar.j == aqpc.TRANSFER_STATE_WAITING_FOR_PLAYER_RESPONSE_REFRESH) {
                    aaroVar.j = aqpbVar2.f ? aqpc.TRANSFER_STATE_FAILED : aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE;
                    if (aaroVar.j == aqpc.TRANSFER_STATE_FAILED) {
                        aaroVar.k = aqpe.TRANSFER_FAILURE_REASON_PLAYABILITY;
                    }
                    aartVar.j(aaroVar);
                    if (aaroVar.j == aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE) {
                        aakgVar.e.az(strE);
                    } else {
                        aakgVar.e.aA(strE);
                    }
                }
                return aanp.a;
            }
        }, this.f), 30L, TimeUnit.SECONDS, this.g);
    }

    @Override // defpackage.aant
    public final ListenableFuture c(zwa zwaVar, agke agkeVar) {
        throw new UnsupportedOperationException();
    }

    public final void e(aamt aamtVar) {
        this.h.e(new aaif(aamtVar, aogv.UNKNOWN_FAILURE_REASON));
    }
}
