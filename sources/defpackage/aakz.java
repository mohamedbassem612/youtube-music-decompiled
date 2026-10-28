package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aakz implements aant {
    public final wco a;
    public final txp b;
    public final awmd c;
    public final abxv d;
    public final ci e;
    private final ahex f;
    private final ScheduledExecutorService g;

    public aakz(wco wcoVar, abxv abxvVar, txp txpVar, awmd awmdVar, ci ciVar, abxu abxuVar, aauk aaukVar) {
        this.a = wcoVar;
        this.d = abxvVar;
        this.b = txpVar;
        this.c = awmdVar;
        this.e = ciVar;
        boolean zA = aaukVar.A();
        abxu abxuVarW = abxuVar.w();
        this.f = (ahex) (zA ? abxuVarW.e : abxuVar.v().c);
        this.g = (ScheduledExecutorService) (zA ? abxuVarW.e : abxuVarW.c);
    }

    public static String d(aqpb aqpbVar, txp txpVar) {
        return (aqpbVar.c & SemanticState.ReadOnly) != 0 ? aqpbVar.l : txpVar.a();
    }

    public static aogy e(int i, aohx aohxVar, aofb aofbVar, String str, aamb aambVar) {
        aihf aihfVarCreateBuilder = aogy.a.createBuilder();
        String strE = aarq.e(aambVar);
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar = (aogy) aihfVarCreateBuilder.instance;
        aogyVar.b |= 1;
        aogyVar.d = strE;
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar2 = (aogy) aihfVarCreateBuilder.instance;
        aogyVar2.h = i - 1;
        aogyVar2.b |= 16;
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar3 = (aogy) aihfVarCreateBuilder.instance;
        aogyVar3.t = aohxVar.l;
        aogyVar3.b |= 1048576;
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar4 = (aogy) aihfVarCreateBuilder.instance;
        aogyVar4.r = aofbVar.i;
        aogyVar4.b |= 65536;
        int iBg = a.bg(aambVar.b("transfer_type", 0));
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar5 = (aogy) aihfVarCreateBuilder.instance;
        if (iBg == 0) {
            throw null;
        }
        aogyVar5.x = iBg - 1;
        aogyVar5.c |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar6 = (aogy) aihfVarCreateBuilder.instance;
        aogyVar6.g = 1;
        aogyVar6.b |= 8;
        aihfVarCreateBuilder.copyOnWrite();
        aogy aogyVar7 = (aogy) aihfVarCreateBuilder.instance;
        str.getClass();
        aogyVar7.b |= 2;
        aogyVar7.e = str;
        byte[] bArrN = aambVar.n("logging_params");
        if (bArrN != null) {
            aigj aigjVarV = aigj.v(bArrN);
            aihfVarCreateBuilder.copyOnWrite();
            aogy aogyVar8 = (aogy) aihfVarCreateBuilder.instance;
            aigjVarV.getClass();
            aogyVar8.c |= 32;
            aogyVar8.z = aigjVarV;
        }
        return (aogy) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.aant
    public final aans a(aofh aofhVar) {
        return aans.c;
    }

    @Override // defpackage.aant
    public final ListenableFuture b(final zwa zwaVar, aofh aofhVar) {
        int iBc = a.bc(aofhVar.c);
        if (iBc == 0) {
            iBc = 1;
        }
        int i = iBc - 1;
        if (i == 1) {
            final String str = aofhVar.d;
            final aofg aofgVar = aofhVar.e;
            if (aofgVar == null) {
                aofgVar = aofg.b;
            }
            return ahng.u(ahno.ap(new Callable() { // from class: aaky
                /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, mbc] */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int iOrdinal;
                    aakz aakzVar = this.a;
                    wcn wcnVarB = aakzVar.a.b(zwaVar);
                    String str2 = str;
                    aqph aqphVar = (aqph) wcnVarB.g(str2).g(aqph.class).E();
                    if (aqphVar != null && ((iOrdinal = aqphVar.getTransferState().ordinal()) == 1 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 6 || iOrdinal == 7)) {
                        return aanp.a;
                    }
                    aofg aofgVar2 = aofgVar;
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(aqpb.b);
                    aofgVar2.c(aihlVarCheckIsLite);
                    Object objK = aofgVar2.j.k(aihlVarCheckIsLite.d);
                    aqpb aqpbVar = (aqpb) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
                    if ((aqpbVar.c & SemanticState.Multiline) != 0) {
                        aqpf aqpfVarF = aqph.f(str2);
                        aqpfVarF.as(aqpc.TRANSFER_STATE_FAILED);
                        aqpe aqpeVarA = aqpe.a(aqpbVar.o);
                        if (aqpeVarA == null) {
                            aqpeVarA = aqpe.TRANSFER_FAILURE_REASON_UNKNOWN;
                        }
                        aqpfVarF.aq(aqpeVarA);
                        aqph aqphVarI = aqpfVarF.I(wcnVarB);
                        wer werVarE = wcnVarB.e();
                        werVarE.e(aqphVarI);
                        werVarE.b().G();
                        return aanp.a;
                    }
                    txp txpVar = aakzVar.b;
                    aqpf aqpfVarF2 = aqph.f(str2);
                    aqpfVarF2.ap(aakz.d(aqpbVar, txpVar));
                    aqpfVarF2.as(aqpc.TRANSFER_STATE_TRANSFER_IN_QUEUE);
                    aohx aohxVarA = aohx.a(aqpbVar.d);
                    if (aohxVarA == null) {
                        aohxVarA = aohx.UNKNOWN_FORMAT_TYPE;
                    }
                    aqpfVarF2.ar(aohxVarA);
                    boolean z = aqpbVar.n;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    aihh aihhVar = aqpfVarF2.a;
                    boolValueOf.getClass();
                    aihhVar.copyOnWrite();
                    aqpi aqpiVar = (aqpi) aihhVar.instance;
                    aihw aihwVar = aqpi.a;
                    aqpiVar.c |= SemanticState.Modal;
                    aqpiVar.t = z;
                    aqph aqphVarI2 = aqpfVarF2.I(wcnVarB);
                    abxv abxvVar = aakzVar.d;
                    String strH = wfs.h(aqphVarI2.b());
                    aohx aohxVarA2 = aohx.a(aqpbVar.d);
                    if (aohxVarA2 == null) {
                        aohxVarA2 = aohx.UNKNOWN_FORMAT_TYPE;
                    }
                    aama aamaVar = new aama(wej.a);
                    int iA = aaus.a(aohxVarA2, 360);
                    long j = aarq.a;
                    aamaVar.j("stream_quality", iA);
                    aarq.h(aamaVar, ((aaqg) abxvVar.c).d(aohxVarA2));
                    if ((aqpbVar.c & 2) != 0) {
                        aamaVar.l("audio_track_id", aqpbVar.e);
                    }
                    aamaVar.l("video_id", strH);
                    if ((aqpbVar.c & 8) != 0) {
                        aamaVar.l("playlist_id", aqpbVar.g);
                    }
                    if ((aqpbVar.c & SemanticState.Focused) != 0) {
                        aofb aofbVarA = aofb.a(aqpbVar.i);
                        if (aofbVarA == null) {
                            aofbVarA = aofb.OFFLINE_TYPE_UNKNOWN;
                        }
                        aarq.i(aamaVar, aofbVarA);
                        aofb aofbVarA2 = aofb.a(aqpbVar.i);
                        if (aofbVarA2 == null) {
                            aofbVarA2 = aofb.OFFLINE_TYPE_UNKNOWN;
                        }
                        aamaVar.h("user_triggered", aofbVarA2 == aofb.OFFLINE_NOW);
                    } else {
                        aamaVar.h("user_triggered", true);
                    }
                    if ((aqpbVar.c & SemanticState.Hidden) != 0) {
                        int iAS = a.aS(aqpbVar.j);
                        aamaVar.j("download_constraint", (iAS != 0 ? iAS : 1) - 1);
                    }
                    aamaVar.h("triggered_by_refresh", false);
                    aamaVar.h("is_sync", false);
                    aamaVar.k("transfer_added_time_millis", abxvVar.a.f().toEpochMilli());
                    aamaVar.l("transfer_nonce", aqphVarI2.getCotn());
                    if ((aqpbVar.c & SemanticState.Obscured) != 0) {
                        aamaVar.h("is_external_media_source", aqpbVar.n);
                    }
                    aaek aaekVar = (aaek) abxvVar.b;
                    aamaVar.j("retry_strategy", aaekVar.b);
                    aamaVar.j("max_retries", aaekVar.c);
                    aamaVar.k("base_retry_milli_secs", aaekVar.d);
                    aamaVar.k("max_retry_milli_secs", aaekVar.e);
                    alik alikVarB = ((vyo) abxvVar.d).b();
                    aoev aoevVar = alikVarB.i;
                    if (aoevVar == null) {
                        aoevVar = aoev.a;
                    }
                    if (aoevVar.i) {
                        aoev aoevVar2 = alikVarB.i;
                        if (aoevVar2 == null) {
                            aoevVar2 = aoev.a;
                        }
                        aamaVar.j("offline_digest_store_level", aoevVar2.j);
                    }
                    aoop aoopVarE = abxv.e(wcnVarB, aqphVarI2.b());
                    if (aoopVarE != null) {
                        abxv.f(aoopVarE, aamaVar);
                    }
                    aamaVar.j("transfer_type", 4);
                    wer werVarE2 = wcnVarB.e();
                    werVarE2.f(aqphVarI2, aamaVar.e());
                    werVarE2.b().G();
                    aohx aohxVarA3 = aohx.a(aqpbVar.d);
                    if (aohxVarA3 == null) {
                        aohxVarA3 = aohx.UNKNOWN_FORMAT_TYPE;
                    }
                    aofb aofbVarA3 = aofb.a(aqpbVar.i);
                    if (aofbVarA3 == null) {
                        aofbVarA3 = aofb.OFFLINE_TYPE_UNKNOWN;
                    }
                    ((aalv) aakzVar.c.io()).d(aakz.e(2, aohxVarA3, aofbVarA3, aqphVarI2.getCotn(), aamaVar));
                    aakzVar.e.aw(str2);
                    return aanp.a;
                }
            }, this.f), 30L, TimeUnit.SECONDS, this.g);
        }
        if (i == 2) {
            return ahng.u(ahno.ap(new vtq((Object) this, zwaVar, aofhVar.d, 13), this.f), 30L, TimeUnit.SECONDS, this.g);
        }
        if (i == 3) {
            String str2 = aofhVar.d;
            aofg aofgVar2 = aofhVar.e;
            if (aofgVar2 == null) {
                aofgVar2 = aofg.b;
            }
            return ahng.u(ahno.ap(new hlm((Object) this, zwaVar, str2, aofgVar2, 19), this.f), 30L, TimeUnit.SECONDS, this.g);
        }
        if (i != 4) {
            aano aanoVar = new aano(aanp.c);
            aanoVar.d = 23;
            return ahng.n(aanoVar.a());
        }
        String str3 = aofhVar.d;
        aofg aofgVar3 = aofhVar.e;
        if (aofgVar3 == null) {
            aofgVar3 = aofg.b;
        }
        return ahng.u(ahno.ap(new hlm((Object) this, zwaVar, str3, aofgVar3, 18), this.f), 30L, TimeUnit.SECONDS, this.g);
    }

    @Override // defpackage.aant
    public final ListenableFuture c(zwa zwaVar, agke agkeVar) {
        throw new UnsupportedOperationException();
    }
}
