package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aapd {
    private static final long a;
    private final awmd b;
    private final Executor c;
    private final ttm d;
    private final aaqj e;
    private final vyo f;
    private final agev g;
    private final aauk h;
    private final vxz i;
    private final vxz j;
    private final aehs k;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = 5000L;
    }

    public aapd(ScheduledExecutorService scheduledExecutorService, awmd awmdVar, aehs aehsVar, ttm ttmVar, aaqj aaqjVar, agev agevVar, vyo vyoVar, vxz vxzVar, vxz vxzVar2, aauk aaukVar) {
        this.c = scheduledExecutorService;
        this.b = awmdVar;
        this.k = aehsVar;
        this.d = ttmVar;
        this.e = aaqjVar;
        this.g = agevVar;
        this.f = vyoVar;
        this.i = vxzVar;
        this.j = vxzVar2;
        this.h = aaukVar;
    }

    private final aalx d(abnl abnlVar) {
        return a.I(this.e.a(abnlVar.u(), abnlVar.w()), abnlVar);
    }

    private final aalx e(String str) {
        try {
            agev agevVar = (agev) f().l().e(str).get(a, TimeUnit.MILLISECONDS);
            if (agevVar.g()) {
                return (aalx) agevVar.c();
            }
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
        }
        return null;
    }

    private final aaqn f() {
        return ((aanb) this.b.io()).b();
    }

    public final ListenableFuture a(abnl abnlVar) {
        sxv sxvVarC = sxv.c();
        this.c.execute(new aapc(this, abnlVar, sxvVarC, 2));
        return sxvVarC;
    }

    public final ListenableFuture b(abnl abnlVar) {
        sxv sxvVarC = sxv.c();
        this.c.execute(new aapc(this, abnlVar, sxvVarC, 0));
        return sxvVarC;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX WARN: Code duplicated, block: B:141:0x03cb A[Catch: aaio -> 0x03d3, aair -> 0x03d5, Exception -> 0x03dd, TryCatch #0 {Exception -> 0x03dd, blocks: (B:13:0x001f, B:15:0x002b, B:17:0x0031, B:19:0x0037, B:20:0x003b, B:22:0x0061, B:24:0x0067, B:26:0x006f, B:28:0x0077, B:30:0x008b, B:34:0x00b5, B:36:0x00bb, B:39:0x00c5, B:40:0x00ca, B:41:0x00cb, B:43:0x00d8, B:46:0x00f7, B:48:0x00fd, B:49:0x010d, B:51:0x0113, B:53:0x0121, B:54:0x0138, B:56:0x013e, B:58:0x014a, B:61:0x0165, B:64:0x016c, B:59:0x0157, B:65:0x0192, B:66:0x01a0, B:95:0x023a, B:98:0x0242, B:100:0x024c, B:103:0x025b, B:106:0x0263, B:107:0x0268, B:115:0x0284, B:109:0x026b, B:111:0x0271, B:113:0x027e, B:114:0x0283, B:116:0x0291, B:117:0x0296, B:101:0x0255, B:118:0x0297, B:121:0x02a7, B:123:0x02b1, B:127:0x02bd, B:129:0x02c5, B:131:0x02f6, B:133:0x031f, B:134:0x0330, B:136:0x033a, B:137:0x033c, B:139:0x03c6, B:69:0x01a9, B:70:0x01dd, B:71:0x01e2, B:72:0x01e3, B:73:0x01e8, B:44:0x00e7, B:74:0x01e9, B:75:0x01ee, B:77:0x01f1, B:78:0x01f6, B:84:0x0200, B:87:0x020e, B:89:0x0224, B:92:0x022c, B:93:0x0231, B:94:0x0232, B:141:0x03cb, B:142:0x03d2), top: B:165:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:159:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:161:0x0442  */
    /* JADX WARN: Code duplicated, block: B:163:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0200 A[Catch: aaio -> 0x03d7, aair -> 0x03da, Exception -> 0x03dd, TryCatch #0 {Exception -> 0x03dd, blocks: (B:13:0x001f, B:15:0x002b, B:17:0x0031, B:19:0x0037, B:20:0x003b, B:22:0x0061, B:24:0x0067, B:26:0x006f, B:28:0x0077, B:30:0x008b, B:34:0x00b5, B:36:0x00bb, B:39:0x00c5, B:40:0x00ca, B:41:0x00cb, B:43:0x00d8, B:46:0x00f7, B:48:0x00fd, B:49:0x010d, B:51:0x0113, B:53:0x0121, B:54:0x0138, B:56:0x013e, B:58:0x014a, B:61:0x0165, B:64:0x016c, B:59:0x0157, B:65:0x0192, B:66:0x01a0, B:95:0x023a, B:98:0x0242, B:100:0x024c, B:103:0x025b, B:106:0x0263, B:107:0x0268, B:115:0x0284, B:109:0x026b, B:111:0x0271, B:113:0x027e, B:114:0x0283, B:116:0x0291, B:117:0x0296, B:101:0x0255, B:118:0x0297, B:121:0x02a7, B:123:0x02b1, B:127:0x02bd, B:129:0x02c5, B:131:0x02f6, B:133:0x031f, B:134:0x0330, B:136:0x033a, B:137:0x033c, B:139:0x03c6, B:69:0x01a9, B:70:0x01dd, B:71:0x01e2, B:72:0x01e3, B:73:0x01e8, B:44:0x00e7, B:74:0x01e9, B:75:0x01ee, B:77:0x01f1, B:78:0x01f6, B:84:0x0200, B:87:0x020e, B:89:0x0224, B:92:0x022c, B:93:0x0231, B:94:0x0232, B:141:0x03cb, B:142:0x03d2), top: B:165:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:86:0x020c  */
    /* JADX WARN: Code duplicated, block: B:87:0x020e A[Catch: aaio -> 0x03d7, aair -> 0x03da, Exception -> 0x03dd, TryCatch #0 {Exception -> 0x03dd, blocks: (B:13:0x001f, B:15:0x002b, B:17:0x0031, B:19:0x0037, B:20:0x003b, B:22:0x0061, B:24:0x0067, B:26:0x006f, B:28:0x0077, B:30:0x008b, B:34:0x00b5, B:36:0x00bb, B:39:0x00c5, B:40:0x00ca, B:41:0x00cb, B:43:0x00d8, B:46:0x00f7, B:48:0x00fd, B:49:0x010d, B:51:0x0113, B:53:0x0121, B:54:0x0138, B:56:0x013e, B:58:0x014a, B:61:0x0165, B:64:0x016c, B:59:0x0157, B:65:0x0192, B:66:0x01a0, B:95:0x023a, B:98:0x0242, B:100:0x024c, B:103:0x025b, B:106:0x0263, B:107:0x0268, B:115:0x0284, B:109:0x026b, B:111:0x0271, B:113:0x027e, B:114:0x0283, B:116:0x0291, B:117:0x0296, B:101:0x0255, B:118:0x0297, B:121:0x02a7, B:123:0x02b1, B:127:0x02bd, B:129:0x02c5, B:131:0x02f6, B:133:0x031f, B:134:0x0330, B:136:0x033a, B:137:0x033c, B:139:0x03c6, B:69:0x01a9, B:70:0x01dd, B:71:0x01e2, B:72:0x01e3, B:73:0x01e8, B:44:0x00e7, B:74:0x01e9, B:75:0x01ee, B:77:0x01f1, B:78:0x01f6, B:84:0x0200, B:87:0x020e, B:89:0x0224, B:92:0x022c, B:93:0x0231, B:94:0x0232, B:141:0x03cb, B:142:0x03d2), top: B:165:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0224 A[Catch: aaio -> 0x03d7, aair -> 0x03da, Exception -> 0x03dd, TryCatch #0 {Exception -> 0x03dd, blocks: (B:13:0x001f, B:15:0x002b, B:17:0x0031, B:19:0x0037, B:20:0x003b, B:22:0x0061, B:24:0x0067, B:26:0x006f, B:28:0x0077, B:30:0x008b, B:34:0x00b5, B:36:0x00bb, B:39:0x00c5, B:40:0x00ca, B:41:0x00cb, B:43:0x00d8, B:46:0x00f7, B:48:0x00fd, B:49:0x010d, B:51:0x0113, B:53:0x0121, B:54:0x0138, B:56:0x013e, B:58:0x014a, B:61:0x0165, B:64:0x016c, B:59:0x0157, B:65:0x0192, B:66:0x01a0, B:95:0x023a, B:98:0x0242, B:100:0x024c, B:103:0x025b, B:106:0x0263, B:107:0x0268, B:115:0x0284, B:109:0x026b, B:111:0x0271, B:113:0x027e, B:114:0x0283, B:116:0x0291, B:117:0x0296, B:101:0x0255, B:118:0x0297, B:121:0x02a7, B:123:0x02b1, B:127:0x02bd, B:129:0x02c5, B:131:0x02f6, B:133:0x031f, B:134:0x0330, B:136:0x033a, B:137:0x033c, B:139:0x03c6, B:69:0x01a9, B:70:0x01dd, B:71:0x01e2, B:72:0x01e3, B:73:0x01e8, B:44:0x00e7, B:74:0x01e9, B:75:0x01ee, B:77:0x01f1, B:78:0x01f6, B:84:0x0200, B:87:0x020e, B:89:0x0224, B:92:0x022c, B:93:0x0231, B:94:0x0232, B:141:0x03cb, B:142:0x03d2), top: B:165:0x001f }] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, wco] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r3v56, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r4v20, types: [awmd, java.lang.Object] */
    public final void c(abnl abnlVar, sxu sxuVar) {
        boolean z;
        aihh aihhVar;
        ttm ttmVar;
        wjf wjiVar;
        aaqn aaqnVarB;
        aamt aamtVarA;
        aalx aalxVarD;
        alik alikVarB;
        if (abnlVar.J() || (alikVarB = this.f.b()) == null) {
            z = false;
        } else {
            aoqs aoqsVar = alikVarB.k;
            if (aoqsVar == null) {
                aoqsVar = aoqs.a;
            }
            if (aoqsVar.h) {
                z = true;
            } else {
                z = false;
            }
        }
        try {
            try {
                String strW = abnlVar.w();
                aauk aaukVar = this.h;
                if (aaukVar.i() && TextUtils.isEmpty(strW) && (aalxVarD = d(abnlVar)) != null) {
                    strW = aalxVarD.b();
                }
                aehs aehsVar = this.k;
                aoop aoopVar = (aoop) aehsVar.c.b(aehsVar.b.e()).g(wfs.g(119, strW)).g(aoop.class).E();
                try {
                    try {
                        if (aoopVar != null) {
                            try {
                                if (aoopVar.i()) {
                                    Object obj = aehsVar.d;
                                    aohk aohkVarE = aoopVar.e();
                                    if (aohkVarE != null && aohkVarE.getAction() == aohh.OFFLINE_VIDEO_POLICY_ACTION_OK) {
                                        mbc mbcVar = ((aaul) obj).b;
                                        long epochMilli = mbcVar.f().toEpochMilli();
                                        long millis = TimeUnit.SECONDS.toMillis(aohkVarE.getExpirationTimestamp().longValue());
                                        long epochMilli2 = mbcVar.f().toEpochMilli();
                                        long millis2 = TimeUnit.SECONDS.toMillis(aohkVarE.getLastUpdatedTimestampSeconds().longValue()) - aaul.a;
                                        if (millis > epochMilli2 && epochMilli >= millis2) {
                                            aqph aqphVarH = aoopVar.h();
                                            if (aqphVarH == null) {
                                                throw new aaim();
                                            }
                                            if (aqphVarH.getTransferState() != aqpc.TRANSFER_STATE_COMPLETE && z) {
                                                throw new aail();
                                            }
                                            ?? r3 = aehsVar.e;
                                            int i = tqr.a;
                                            int i2 = 1073828980;
                                            wjf wjfVarAk = r3.k(1073828980) ? wji.ak(aoopVar.getPlayerResponseBytes().G(), 0L) : wji.aj(aoopVar.getPlayerResponseBytes().G(), 0L);
                                            if (wjfVarAk == null) {
                                                throw new aaim();
                                            }
                                            wjf wjfVarA = aehsVar.a(aqphVarH, wjfVarAk);
                                            if (wjfVarA == null) {
                                                throw new aaim();
                                            }
                                            ArrayList arrayList = new ArrayList();
                                            for (amfb amfbVar : ((wji) wjfVarA).a.C) {
                                                if (amfbVar.b.size() != 0) {
                                                    aihf builder = amfbVar.toBuilder();
                                                    builder.copyOnWrite();
                                                    ((amfb) builder.instance).b = amfb.emptyProtobufList();
                                                    for (amfa amfaVar : amfbVar.b) {
                                                        wjf wjfVarAk2 = r3.k(i2) ? wji.ak(amfaVar.c.G(), 0L) : wji.aj(amfaVar.c.G(), 0L);
                                                        if (wjfVarAk2 != null) {
                                                            wjf wjfVarA2 = aehsVar.a(aqphVarH, wjfVarAk2);
                                                            if (wjfVarA2 != null) {
                                                                wjfVarAk2 = wjfVarA2;
                                                            }
                                                            aihh aihhVar2 = (aihh) amfa.a.createBuilder();
                                                            aigj byteString = ((wji) wjfVarAk2).a.toByteString();
                                                            aihhVar2.copyOnWrite();
                                                            amfa amfaVar2 = (amfa) aihhVar2.instance;
                                                            amfaVar2.b |= 1;
                                                            amfaVar2.c = byteString;
                                                            builder.bw(aihhVar2);
                                                            i2 = 1073828980;
                                                        }
                                                    }
                                                    arrayList.add((amfb) builder.build());
                                                    i2 = 1073828980;
                                                }
                                            }
                                            if (arrayList.isEmpty()) {
                                                wjiVar = wjfVarA;
                                            } else {
                                                aihh aihhVar3 = (aihh) ((wji) wjfVarA).a.toBuilder();
                                                aihhVar3.copyOnWrite();
                                                ((alvt) aihhVar3.instance).C = alvt.emptyProtobufList();
                                                aihhVar3.h(arrayList);
                                                wjiVar = new wji((alvt) aihhVar3.build(), aehsVar.a.b(), (wjb) aehsVar.i.io());
                                            }
                                        }
                                    }
                                    throw new aaip();
                                }
                                if (((aauk) aehsVar.f).i()) {
                                    aaqnVarB = ((aanb) aehsVar.h.io()).b();
                                    aamtVarA = aaqnVarB.l().a(strW);
                                    if (aamtVarA != null) {
                                        throw new aain();
                                    }
                                    if (aamtVarA.c() && z) {
                                        throw new aail();
                                    }
                                    wjiVar = aaqnVarB.k().a(aamtVarA);
                                } else {
                                    wjiVar = null;
                                }
                            } catch (aaio e) {
                                e = e;
                                if (!z) {
                                    sxuVar.iT(null, e);
                                    return;
                                }
                                aihf aihfVarCreateBuilder = alvw.a.createBuilder();
                                String strW2 = abnlVar.w();
                                aihfVarCreateBuilder.copyOnWrite();
                                alvw alvwVar = (alvw) aihfVarCreateBuilder.instance;
                                strW2.getClass();
                                alvwVar.b |= 1;
                                alvwVar.c = strW2;
                                aihfVarCreateBuilder.copyOnWrite();
                                alvw alvwVar2 = (alvw) aihfVarCreateBuilder.instance;
                                alvwVar2.b |= 2;
                                alvwVar2.d = "Unplayable Video";
                                alvw alvwVar3 = (alvw) aihfVarCreateBuilder.build();
                                aihhVar = (aihh) alvl.a.createBuilder();
                                aony aonyVar = aony.UNPLAYABLE;
                                aihhVar.copyOnWrite();
                                alvl alvlVar = (alvl) aihhVar.instance;
                                alvlVar.c = aonyVar.k;
                                alvlVar.b |= 1;
                                ttmVar = this.d;
                                if (ttmVar.b(e) != null) {
                                    String strB = ttmVar.b(e);
                                    aihhVar.copyOnWrite();
                                    alvl alvlVar2 = (alvl) aihhVar.instance;
                                    strB.getClass();
                                    alvlVar2.b |= 4;
                                    alvlVar2.e = strB;
                                }
                                aihf aihfVarCreateBuilder2 = aogq.a.createBuilder();
                                aogp aogpVar = aogp.OK;
                                aihfVarCreateBuilder2.copyOnWrite();
                                aogq aogqVar = (aogq) aihfVarCreateBuilder2.instance;
                                aogqVar.h = aogpVar.h;
                                aogqVar.b |= 8;
                                aogq aogqVar2 = (aogq) aihfVarCreateBuilder2.build();
                                aihh aihhVar4 = (aihh) alvt.a.createBuilder();
                                aihhVar4.copyOnWrite();
                                alvt alvtVar = (alvt) aihhVar4.instance;
                                alvwVar3.getClass();
                                alvtVar.g = alvwVar3;
                                alvtVar.b |= 8;
                                aihhVar4.copyOnWrite();
                                alvt alvtVar2 = (alvt) aihhVar4.instance;
                                alvl alvlVar3 = (alvl) aihhVar.build();
                                alvlVar3.getClass();
                                alvtVar2.f = alvlVar3;
                                alvtVar2.b |= 4;
                                aihhVar4.copyOnWrite();
                                alvt alvtVar3 = (alvt) aihhVar4.instance;
                                aogqVar2.getClass();
                                alvtVar3.l = aogqVar2;
                                alvtVar3.b |= SemanticState.Focused;
                                sxuVar.b(null, new wji((alvt) aihhVar4.build(), 0L, (wja) null));
                            } catch (aair e2) {
                                e = e2;
                                if (!z) {
                                    sxuVar.iT(null, e);
                                    return;
                                }
                                aihf aihfVarCreateBuilder3 = alvw.a.createBuilder();
                                String strW3 = abnlVar.w();
                                aihfVarCreateBuilder3.copyOnWrite();
                                alvw alvwVar4 = (alvw) aihfVarCreateBuilder3.instance;
                                strW3.getClass();
                                alvwVar4.b |= 1;
                                alvwVar4.c = strW3;
                                aihfVarCreateBuilder3.copyOnWrite();
                                alvw alvwVar5 = (alvw) aihfVarCreateBuilder3.instance;
                                alvwVar5.b |= 2;
                                alvwVar5.d = "Unplayable Video";
                                alvw alvwVar6 = (alvw) aihfVarCreateBuilder3.build();
                                aihhVar = (aihh) alvl.a.createBuilder();
                                aony aonyVar2 = aony.UNPLAYABLE;
                                aihhVar.copyOnWrite();
                                alvl alvlVar4 = (alvl) aihhVar.instance;
                                alvlVar4.c = aonyVar2.k;
                                alvlVar4.b |= 1;
                                ttmVar = this.d;
                                if (ttmVar.b(e) != null) {
                                    String strB2 = ttmVar.b(e);
                                    aihhVar.copyOnWrite();
                                    alvl alvlVar5 = (alvl) aihhVar.instance;
                                    strB2.getClass();
                                    alvlVar5.b |= 4;
                                    alvlVar5.e = strB2;
                                }
                                aihf aihfVarCreateBuilder4 = aogq.a.createBuilder();
                                aogp aogpVar2 = aogp.OK;
                                aihfVarCreateBuilder4.copyOnWrite();
                                aogq aogqVar3 = (aogq) aihfVarCreateBuilder4.instance;
                                aogqVar3.h = aogpVar2.h;
                                aogqVar3.b |= 8;
                                aogq aogqVar4 = (aogq) aihfVarCreateBuilder4.build();
                                aihh aihhVar5 = (aihh) alvt.a.createBuilder();
                                aihhVar5.copyOnWrite();
                                alvt alvtVar4 = (alvt) aihhVar5.instance;
                                alvwVar6.getClass();
                                alvtVar4.g = alvwVar6;
                                alvtVar4.b |= 8;
                                aihhVar5.copyOnWrite();
                                alvt alvtVar5 = (alvt) aihhVar5.instance;
                                alvl alvlVar6 = (alvl) aihhVar.build();
                                alvlVar6.getClass();
                                alvtVar5.f = alvlVar6;
                                alvtVar5.b |= 4;
                                aihhVar5.copyOnWrite();
                                alvt alvtVar6 = (alvt) aihhVar5.instance;
                                aogqVar4.getClass();
                                alvtVar6.l = aogqVar4;
                                alvtVar6.b |= SemanticState.Focused;
                                sxuVar.b(null, new wji((alvt) aihhVar5.build(), 0L, (wja) null));
                            }
                        } else if (((aauk) aehsVar.f).i()) {
                            wjiVar = null;
                        } else {
                            aaqnVarB = ((aanb) aehsVar.h.io()).b();
                            aamtVarA = aaqnVarB.l().a(strW);
                            if (aamtVarA != null) {
                                throw new aain();
                            }
                            if (aamtVarA.c()) {
                            }
                            wjiVar = aaqnVarB.k().a(aamtVarA);
                        }
                        if (!aaukVar.i() && wjiVar == null) {
                            aalx aalxVarE = !TextUtils.isEmpty(abnlVar.w()) ? e(abnlVar.w()) : d(abnlVar);
                            if (aalxVarE == null) {
                                throw new aain();
                            }
                            if (aalxVarE.c()) {
                                if (z && aalxVarE.a() && this.i.l(5, 45355600L, false)) {
                                    throw new aail();
                                }
                            } else if (z) {
                                throw new aail();
                            }
                            wjiVar = f().k().a(aalxVarE);
                        }
                        vxz vxzVar = this.j;
                        if (vxzVar.l(131, 45628518L, false) && wjiVar != null && !wjiVar.f().ap() && abnlVar.c() == 0) {
                            if (gzj.U(abnlVar.b)) {
                                long jLongValue = ((Long) tzk.c(((hlq) ((agfa) this.g).a).b.m(abnlVar.w())).w(new gnw(13)).E()).longValue();
                                if (jLongValue > 0) {
                                    aihf aihfVarCreateBuilder5 = arev.a.createBuilder();
                                    long millis3 = Duration.ofSeconds(jLongValue).toMillis();
                                    aihfVarCreateBuilder5.copyOnWrite();
                                    arev arevVar = (arev) aihfVarCreateBuilder5.instance;
                                    arevVar.b |= 1;
                                    arevVar.c = millis3;
                                    if (vxzVar.l(175, 45702256L, false)) {
                                        aihfVarCreateBuilder5.copyOnWrite();
                                        arev arevVar2 = (arev) aihfVarCreateBuilder5.instance;
                                        arevVar2.b |= 4;
                                        arevVar2.e = 0L;
                                    }
                                    aopd aopdVar = wjiVar.f().d.h;
                                    if (aopdVar == null) {
                                        aopdVar = aopd.a;
                                    }
                                    aihf builder2 = aopdVar.toBuilder();
                                    builder2.copyOnWrite();
                                    aopd aopdVar2 = (aopd) builder2.instance;
                                    arev arevVar3 = (arev) aihfVarCreateBuilder5.build();
                                    arevVar3.getClass();
                                    aopdVar2.c = arevVar3;
                                    aopdVar2.b |= 4;
                                    aopd aopdVar3 = (aopd) builder2.build();
                                    aihh aihhVar6 = (aihh) ((wji) wjiVar).a.toBuilder();
                                    aihf builder3 = wjiVar.f().d.toBuilder();
                                    builder3.copyOnWrite();
                                    aoqd aoqdVar = (aoqd) builder3.instance;
                                    aopdVar3.getClass();
                                    aoqdVar.h = aopdVar3;
                                    aoqdVar.b |= 64;
                                    aihhVar6.copyOnWrite();
                                    alvt alvtVar7 = (alvt) aihhVar6.instance;
                                    aoqd aoqdVar2 = (aoqd) builder3.build();
                                    aoqdVar2.getClass();
                                    alvtVar7.e = aoqdVar2;
                                    alvtVar7.b |= 2;
                                    alvt alvtVar8 = (alvt) aihhVar6.build();
                                    wjg wjgVar = new wjg();
                                    wjgVar.b = alvtVar8;
                                    wjgVar.d = ((wji) wjiVar).i;
                                    wjgVar.b(((wji) wjiVar).b);
                                    wjgVar.g = ((wji) wjiVar).c;
                                    wjiVar = wjgVar.a();
                                }
                            }
                        }
                        sxuVar.b(null, wjiVar);
                    } catch (aaio e3) {
                        e = e3;
                    } catch (aair e4) {
                        e = e4;
                    }
                } catch (aaio e5) {
                    e = e5;
                    if (!z) {
                        sxuVar.iT(null, e);
                        return;
                    }
                    aihf aihfVarCreateBuilder6 = alvw.a.createBuilder();
                    String strW4 = abnlVar.w();
                    aihfVarCreateBuilder6.copyOnWrite();
                    alvw alvwVar7 = (alvw) aihfVarCreateBuilder6.instance;
                    strW4.getClass();
                    alvwVar7.b |= 1;
                    alvwVar7.c = strW4;
                    aihfVarCreateBuilder6.copyOnWrite();
                    alvw alvwVar8 = (alvw) aihfVarCreateBuilder6.instance;
                    alvwVar8.b |= 2;
                    alvwVar8.d = "Unplayable Video";
                    alvw alvwVar9 = (alvw) aihfVarCreateBuilder6.build();
                    aihhVar = (aihh) alvl.a.createBuilder();
                    aony aonyVar3 = aony.UNPLAYABLE;
                    aihhVar.copyOnWrite();
                    alvl alvlVar7 = (alvl) aihhVar.instance;
                    alvlVar7.c = aonyVar3.k;
                    alvlVar7.b |= 1;
                    ttmVar = this.d;
                    if (ttmVar.b(e) != null) {
                        String strB3 = ttmVar.b(e);
                        aihhVar.copyOnWrite();
                        alvl alvlVar8 = (alvl) aihhVar.instance;
                        strB3.getClass();
                        alvlVar8.b |= 4;
                        alvlVar8.e = strB3;
                    }
                    aihf aihfVarCreateBuilder7 = aogq.a.createBuilder();
                    aogp aogpVar3 = aogp.OK;
                    aihfVarCreateBuilder7.copyOnWrite();
                    aogq aogqVar5 = (aogq) aihfVarCreateBuilder7.instance;
                    aogqVar5.h = aogpVar3.h;
                    aogqVar5.b |= 8;
                    aogq aogqVar6 = (aogq) aihfVarCreateBuilder7.build();
                    aihh aihhVar7 = (aihh) alvt.a.createBuilder();
                    aihhVar7.copyOnWrite();
                    alvt alvtVar9 = (alvt) aihhVar7.instance;
                    alvwVar9.getClass();
                    alvtVar9.g = alvwVar9;
                    alvtVar9.b |= 8;
                    aihhVar7.copyOnWrite();
                    alvt alvtVar10 = (alvt) aihhVar7.instance;
                    alvl alvlVar9 = (alvl) aihhVar.build();
                    alvlVar9.getClass();
                    alvtVar10.f = alvlVar9;
                    alvtVar10.b |= 4;
                    aihhVar7.copyOnWrite();
                    alvt alvtVar11 = (alvt) aihhVar7.instance;
                    aogqVar6.getClass();
                    alvtVar11.l = aogqVar6;
                    alvtVar11.b |= SemanticState.Focused;
                    sxuVar.b(null, new wji((alvt) aihhVar7.build(), 0L, (wja) null));
                } catch (aair e6) {
                    e = e6;
                    if (!z) {
                        sxuVar.iT(null, e);
                        return;
                    }
                    aihf aihfVarCreateBuilder8 = alvw.a.createBuilder();
                    String strW5 = abnlVar.w();
                    aihfVarCreateBuilder8.copyOnWrite();
                    alvw alvwVar10 = (alvw) aihfVarCreateBuilder8.instance;
                    strW5.getClass();
                    alvwVar10.b |= 1;
                    alvwVar10.c = strW5;
                    aihfVarCreateBuilder8.copyOnWrite();
                    alvw alvwVar11 = (alvw) aihfVarCreateBuilder8.instance;
                    alvwVar11.b |= 2;
                    alvwVar11.d = "Unplayable Video";
                    alvw alvwVar12 = (alvw) aihfVarCreateBuilder8.build();
                    aihhVar = (aihh) alvl.a.createBuilder();
                    aony aonyVar4 = aony.UNPLAYABLE;
                    aihhVar.copyOnWrite();
                    alvl alvlVar10 = (alvl) aihhVar.instance;
                    alvlVar10.c = aonyVar4.k;
                    alvlVar10.b |= 1;
                    ttmVar = this.d;
                    if (ttmVar.b(e) != null) {
                        String strB4 = ttmVar.b(e);
                        aihhVar.copyOnWrite();
                        alvl alvlVar11 = (alvl) aihhVar.instance;
                        strB4.getClass();
                        alvlVar11.b |= 4;
                        alvlVar11.e = strB4;
                    }
                    aihf aihfVarCreateBuilder9 = aogq.a.createBuilder();
                    aogp aogpVar4 = aogp.OK;
                    aihfVarCreateBuilder9.copyOnWrite();
                    aogq aogqVar7 = (aogq) aihfVarCreateBuilder9.instance;
                    aogqVar7.h = aogpVar4.h;
                    aogqVar7.b |= 8;
                    aogq aogqVar8 = (aogq) aihfVarCreateBuilder9.build();
                    aihh aihhVar8 = (aihh) alvt.a.createBuilder();
                    aihhVar8.copyOnWrite();
                    alvt alvtVar12 = (alvt) aihhVar8.instance;
                    alvwVar12.getClass();
                    alvtVar12.g = alvwVar12;
                    alvtVar12.b |= 8;
                    aihhVar8.copyOnWrite();
                    alvt alvtVar13 = (alvt) aihhVar8.instance;
                    alvl alvlVar12 = (alvl) aihhVar.build();
                    alvlVar12.getClass();
                    alvtVar13.f = alvlVar12;
                    alvtVar13.b |= 4;
                    aihhVar8.copyOnWrite();
                    alvt alvtVar14 = (alvt) aihhVar8.instance;
                    aogqVar8.getClass();
                    alvtVar14.l = aogqVar8;
                    alvtVar14.b |= SemanticState.Focused;
                    sxuVar.b(null, new wji((alvt) aihhVar8.build(), 0L, (wja) null));
                }
            } catch (Exception e7) {
                sxuVar.iT(null, e7);
            }
        } catch (aaio | aair e8) {
            e = e8;
        }
    }
}
