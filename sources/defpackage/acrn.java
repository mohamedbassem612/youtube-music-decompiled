package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ClientError;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ErrorMetaData;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$LogMessage;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acrn {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/reel/internal/pager/ReelSequenceController");
    private final List A;
    private final AtomicBoolean B;
    private final adif C;
    private final aesp D;
    public final acqz b;
    public final mbc c;
    public final Executor d;
    public final Executor e;
    public final actk f;
    public final Object g;
    public acrk h;
    public acrk i;
    public acrk j;
    public acrk k;
    public Optional l;
    public boolean m;
    public boolean n;
    public final AtomicBoolean o;
    public boolean p;
    public final AtomicBoolean q;
    public final hno r;
    private final acrq s;
    private final awmd t;
    private final zvl u;
    private final ttm v;
    private final xgm w;
    private final vxe x;
    private final tqj y;
    private ListenableFuture z;

    public acrn(acrq acrqVar, awmd awmdVar, mbc mbcVar, Executor executor, Executor executor2, hno hnoVar, zvl zvlVar, ttm ttmVar, xgm xgmVar, tqj tqjVar, actk actkVar, vxe vxeVar, adif adifVar, aesp aespVar, acqz acqzVar) {
        new AtomicLong(0L);
        this.g = new Object();
        acrt acrtVar = acrt.SHEDDABLE;
        this.h = new acrk(acrtVar, acrl.PREV);
        this.i = new acrk(acrtVar, acrl.NEXT);
        this.j = new acrk(acrtVar, acrl.REFRESH);
        this.k = new acrk(acrtVar, acrl.SOFT_REFRESH);
        this.l = Optional.empty();
        this.A = new ArrayList();
        this.o = new AtomicBoolean(false);
        this.q = new AtomicBoolean(false);
        this.B = new AtomicBoolean(false);
        this.s = acrqVar;
        this.b = acqzVar;
        this.t = awmdVar;
        this.r = hnoVar;
        this.c = mbcVar;
        this.d = executor;
        this.e = executor2;
        this.u = zvlVar;
        this.v = ttmVar;
        this.w = xgmVar;
        this.y = tqjVar;
        this.f = actkVar;
        this.x = vxeVar;
        this.C = adifVar;
        this.D = aespVar;
    }

    public final void a(Throwable th, acrk acrkVar, boolean z, boolean z2) {
        synchronized (this.g) {
            if (!this.r.V() || acrkVar.a) {
                acrkVar.a = false;
                ((agrc) ((agrc) ((agrc) a.b()).j(th)).k("com/google/android/libraries/youtube/reel/internal/pager/ReelSequenceController", "handleAsyncSequenceError", (char) 944, "ReelSequenceController.java")).t("ReelWatchSequence Error");
                f(th, acrkVar, z, z2);
            }
        }
    }

    public final void b(alql alqlVar, long j, acrk acrkVar, boolean z) {
        synchronized (this.g) {
            if (!this.r.V() || acrkVar.a) {
                g(alqlVar, j, acrkVar, z);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0271  */
    public final void c(acrk acrkVar, alql alqlVar, long j, boolean z) {
        int i;
        boolean z2;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        int i5;
        acra acraVarL;
        int i6;
        if (k()) {
            taq.d();
        }
        if (alqlVar == null) {
            this.l = Optional.empty();
        } else {
            this.l = Optional.of(alqlVar.n);
        }
        acrl acrlVar = acrkVar.d;
        acrl acrlVar2 = acrl.SOFT_REFRESH;
        int i7 = acrlVar != acrlVar2 ? 1 : 0;
        if (alqlVar != null) {
            if ((alqlVar.b & 16) != 0) {
                this.b.W = alqlVar.q;
            }
            if (alqlVar.m.size() > 0) {
                acqz acqzVar = this.b;
                aiie aiieVar = alqlVar.m;
                ArrayList arrayList2 = new ArrayList(aiieVar.size());
                i = 1;
                ArrayList arrayList3 = new ArrayList(aiieVar.size());
                for (alqj alqjVar : aguu.t(aiieVar)) {
                    if ((alqjVar.b & 1) != 0) {
                        ajwo ajwoVar = alqjVar.c;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                        ajwoVar.c(aihlVarCheckIsLite);
                        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                            ajwo ajwoVar2 = alqjVar.c;
                            if (ajwoVar2 == null) {
                                ajwoVar2 = ajwo.a;
                            }
                            arrayList2.add(ajwoVar2);
                            arrayList3.add(alqjVar.d.E() ? Optional.empty() : Optional.of(alqjVar.d));
                        }
                    }
                }
                long jC = acqzVar.c();
                acqzVar.u(arrayList2);
                acqh acqhVar = acqzVar.ag;
                if (acqhVar == null) {
                    i7 = i7;
                } else {
                    ahno.O(arrayList2.size() == arrayList3.size());
                    if (arrayList2.isEmpty()) {
                        i7 = i7;
                    } else {
                        apgj apgjVarQ = acqhVar.Q(arrayList2);
                        List listR = acqhVar.R(arrayList2);
                        synchronized (acqhVar.e) {
                            long j2 = acqhVar.f.isEmpty() ? 0L : ((acra) acqhVar.f.get(0)).b;
                            int size = listR.size();
                            long jB = acqhVar.k.b();
                            int i8 = size - 1;
                            long j3 = j2;
                            while (i8 >= 0) {
                                long j4 = j3;
                                ajwo ajwoVar3 = (ajwo) listR.get(i8);
                                ahno.O(aecm.aD(ajwoVar3));
                                long j5 = j4 - 1;
                                acqhVar.f.add(0, acqhVar.p.x(j5, j5, acqhVar.P(ajwoVar3), (aigj) ((Optional) arrayList3.get(i8)).orElse(null), jB, acqhVar.g.ak));
                                i8--;
                                j3 = j5;
                            }
                        }
                        acqhVar.jW();
                        aciz acizVarJ = acqhVar.o.j();
                        acizVarJ.k(12);
                        acizVarJ.h(adif.f(aawo.i(listR), apgjVarQ));
                        acizVarJ.g();
                    }
                    int iA = acqzVar.ag.A(jC);
                    if (iA != -1) {
                        acqzVar.Q = iA;
                        acqzVar.y.ab(iA);
                        acqx acqxVar = acqzVar.x;
                        if (acqxVar != null) {
                            acqz acqzVar2 = acqxVar.b;
                            if (acqzVar2.m.get() >= 0) {
                                acqzVar2.j.execute(afwl.i(new acqu(acqxVar, 2)));
                            }
                        }
                    }
                }
            } else {
                i7 = i7;
                i = 1;
            }
            if (acrlVar == acrlVar2) {
                acqz acqzVar3 = this.b;
                aiie aiieVar2 = alqlVar.l;
                String str = acrkVar.e;
                alqi alqiVar = alqlVar.p;
                if (alqiVar == null) {
                    alqiVar = alqi.a;
                }
                aciz acizVarJ2 = acqzVar3.au.j();
                acizVarJ2.k(3);
                if (aiieVar2.isEmpty()) {
                    acizVarJ2.i(adif.e(4));
                    acizVarJ2.g();
                } else {
                    acqh acqhVar2 = acqzVar3.ag;
                    acra acraVarK = acqhVar2 != null ? acqhVar2.K(acqzVar3.Q, str) : null;
                    if (acraVarK == null || !acraVarK.c().o.equals(str)) {
                        acizVarJ2.i(adif.e(3));
                        acizVarJ2.g();
                    } else {
                        acqh acqhVar3 = acqzVar3.ag;
                        Optional optionalJ = acqzVar3.j();
                        if (acqhVar3 == null || optionalJ.isEmpty()) {
                            acizVarJ2.i(adif.e(6));
                            acizVarJ2.g();
                        } else {
                            long j6 = ((acra) optionalJ.get()).b;
                            int iA2 = acqhVar3.A(acraVarK.b);
                            if (iA2 == -1 || (((acraVarL = acqhVar3.L(iA2 + 1)) != null && acraVarL.m) || acraVarK.b < j6)) {
                                acizVarJ2.i(adif.e(6));
                                acizVarJ2.g();
                            } else {
                                acqj acqjVar = acqj.b;
                                acqzVar3.p(acqjVar);
                                long j7 = acraVarK.b;
                                acqh acqhVar4 = acqzVar3.ag;
                                if (acqzVar3.Q() && acqzVar3.K() && acqhVar4 != null) {
                                    acqzVar3.p(acqjVar);
                                    synchronized (acqhVar4.e) {
                                        acqhVar4.X(acqhVar4.A(j7) + 1, acqhVar4.f.size(), 3);
                                    }
                                }
                                acqzVar3.W(aiieVar2, alqiVar, 3, false);
                                acizVarJ2.i(adif.e(2));
                                acizVarJ2.g();
                                i6 = alqlVar.l.isEmpty() ? 0 : i;
                            }
                        }
                        i7 = i6;
                    }
                }
                i7 = i6;
            } else {
                if (alqlVar.l.size() > 0) {
                    acqz acqzVar4 = this.b;
                    aiie aiieVar3 = alqlVar.l;
                    alqi alqiVar2 = alqlVar.p;
                    if (alqiVar2 == null) {
                        alqiVar2 = alqi.a;
                    }
                    acqzVar4.W(aiieVar3, alqiVar2, 9, z);
                }
                i7 = i7;
            }
            Optional optional = (Optional) this.t.io();
            if (optional.isPresent()) {
                ((acoz) optional.get()).e.b(j);
            }
        } else {
            i = 1;
        }
        String str2 = (alqlVar == null || (i5 = alqlVar.e) != 5) ? null : i5 == 5 ? (String) alqlVar.f : "";
        String str3 = (alqlVar == null || (i4 = alqlVar.c) != 3) ? null : i4 == 3 ? (String) alqlVar.d : "";
        String str4 = (alqlVar == null || (i3 = alqlVar.g) != 11) ? null : i3 == 11 ? (String) alqlVar.h : "";
        String str5 = (alqlVar == null || (i2 = alqlVar.i) != 13) ? null : i2 == 13 ? (String) alqlVar.j : "";
        synchronized (this.g) {
            z2 = acrkVar.f;
            acrkVar.f = false;
            acrkVar.a = false;
            acrkVar.b = null;
            acrkVar.e = "";
            acrkVar.c = acrt.SHEDDABLE;
            if (i7 != 0) {
                if (!ahno.aa(str2)) {
                    this.h.b = str2;
                }
                if (!ahno.aa(str3)) {
                    this.i.b = str3;
                }
                if (!ahno.aa(str4)) {
                    this.j.b = str4;
                }
                if (!ahno.aa(str5)) {
                    this.k.b = str5;
                }
            }
            this.m = !this.i.a();
        }
        this.b.F();
        synchronized (this.g) {
            List list = this.A;
            arrayList = new ArrayList(list);
            list.clear();
        }
        int size2 = arrayList.size();
        for (int i9 = 0; i9 < size2; i9++) {
            ((acrm) arrayList.get(i9)).b();
        }
        if (z2 && alqlVar != null && alqlVar.l.size() == i && acrkVar.d == acrl.NEXT) {
            tqj tqjVar = this.y;
            int i10 = tqr.a;
            if (tqjVar.l(1074025686, 2)) {
                if (tqjVar.l(1074025686, 8)) {
                    this.B.set(j());
                    e();
                } else if (j()) {
                    h(acrt.SHEDDABLE);
                }
            }
        }
    }

    public final void d(String str, aigj aigjVar, boolean z) {
        if (this.n || ahno.aa(str)) {
            return;
        }
        this.n = true;
        synchronized (this.g) {
            this.i.b = str;
        }
        l(this.i, null, true != z ? null : str, true == z ? null : str, aigjVar.E() ? Optional.empty() : Optional.of(aigjVar), z ? acrt.CRITICAL : acrt.SHEDDABLE, z, true);
    }

    public final void e() {
        int i = tqr.a;
        tqj tqjVar = this.y;
        if (tqjVar.l(1074025686, 2) && tqjVar.l(1074025686, 8)) {
            AtomicBoolean atomicBoolean = this.B;
            if (atomicBoolean.get() && this.q.get() && this.p) {
                atomicBoolean.set(false);
                if (j()) {
                    h(acrt.SHEDDABLE);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:46:0x012e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x017a  */
    public final void f(Throwable th, acrk acrkVar, boolean z, boolean z2) {
        ArrayList arrayList;
        acrt acrtVar;
        aihf aihfVarCreateBuilder;
        aihf aihfVarCreateBuilder2;
        boolean z3;
        aesp aespVar;
        int iOrdinal;
        vxz vxzVar;
        aihf aihfVarCreateBuilder3;
        boolean zL;
        synchronized (this.g) {
            List list = this.A;
            arrayList = new ArrayList(list);
            list.clear();
            acrtVar = acrkVar.c;
            acrkVar.c = acrt.SHEDDABLE;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((acrm) arrayList.get(i)).a();
        }
        if (acrtVar == acrt.CRITICAL) {
            hno hnoVar = this.r;
            vxz vxzVar2 = (vxz) hnoVar.m;
            int i2 = 2;
            if (!vxzVar2.l(108, 45824048L, false)) {
                if (z) {
                    zL = vxzVar2.l(107, 45824047L, false);
                } else {
                    int iC = (int) vxzVar2.c(5, 45834280L, 0L);
                    zL = iC != 1 ? iC == 2 : z2;
                }
                if (!zL) {
                    aihfVarCreateBuilder = ClientErrorOuterClass$ErrorMetaData.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.instance;
                    clientErrorOuterClass$ErrorMetaData.c = 22;
                    clientErrorOuterClass$ErrorMetaData.b |= 1;
                    aihfVarCreateBuilder.copyOnWrite();
                    ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData2 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.instance;
                    clientErrorOuterClass$ErrorMetaData2.g = 117;
                    clientErrorOuterClass$ErrorMetaData2.b |= 16;
                    aihfVarCreateBuilder2 = apeo.a.createBuilder();
                    if (z) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        apeo apeoVar = (apeo) aihfVarCreateBuilder2.instance;
                        apeoVar.d = 30;
                        apeoVar.b |= 2;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    aespVar = this.D;
                    iOrdinal = aespVar.l().ordinal();
                    if (iOrdinal == 0) {
                        i2 = 0;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            i2 = 3;
                        } else {
                            if (iOrdinal != 3) {
                                throw new RuntimeException(null, null);
                            }
                            i2 = 4;
                        }
                    }
                    if (i2 != 0) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        apeo apeoVar2 = (apeo) aihfVarCreateBuilder2.instance;
                        apeoVar2.e = i2 - 1;
                        apeoVar2.b |= 4;
                        z3 = true;
                    } else {
                        i2 = 0;
                    }
                    vxzVar = (vxz) hnoVar.k;
                    if (vxzVar.l(76, 45836239L, false)) {
                        aihfVarCreateBuilder3 = apen.a.createBuilder();
                        int i3 = aespVar.i();
                        aihfVarCreateBuilder3.copyOnWrite();
                        apen apenVar = (apen) aihfVarCreateBuilder3.instance;
                        apenVar.b |= SemanticState.Focused;
                        apenVar.h = i3;
                        int iJ = aespVar.j();
                        aihfVarCreateBuilder3.copyOnWrite();
                        apen apenVar2 = (apen) aihfVarCreateBuilder3.instance;
                        apenVar2.b |= SemanticState.LiveRegion;
                        apenVar2.j = iJ;
                        int iK = aespVar.k();
                        aihfVarCreateBuilder3.copyOnWrite();
                        apen apenVar3 = (apen) aihfVarCreateBuilder3.instance;
                        apenVar3.b |= SemanticState.ReadOnly;
                        apenVar3.k = iK;
                        if (i2 != 0) {
                            aihfVarCreateBuilder3.copyOnWrite();
                            apen apenVar4 = (apen) aihfVarCreateBuilder3.instance;
                            apenVar4.i = i2 - 1;
                            apenVar4.b |= SemanticState.Hidden;
                        }
                        apen apenVar5 = (apen) aihfVarCreateBuilder3.build();
                        aihfVarCreateBuilder2.copyOnWrite();
                        apeo apeoVar3 = (apeo) aihfVarCreateBuilder2.instance;
                        apenVar5.getClass();
                        apeoVar3.c = apenVar5;
                        apeoVar3.b |= 1;
                    } else {
                        if (z3) {
                        }
                        if (vxzVar.m(3, 45428720L)) {
                            String strI = this.w.hB().i();
                            aihfVarCreateBuilder.copyOnWrite();
                            ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData3 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.instance;
                            strI.getClass();
                            clientErrorOuterClass$ErrorMetaData3.b |= 32;
                            clientErrorOuterClass$ErrorMetaData3.h = strI;
                        }
                        twp twpVarA = this.v.a(th);
                        aihf aihfVarCreateBuilder4 = ClientErrorOuterClass$LogMessage.a.createBuilder();
                        Object obj = twpVarA.c;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder4.instance;
                        clientErrorOuterClass$LogMessage.b |= 1;
                        clientErrorOuterClass$LogMessage.c = (String) obj;
                        ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage2 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder4.build();
                        ajtx ajtxVar = (ajtx) ClientErrorOuterClass$ClientError.a.createBuilder();
                        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData4 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.build();
                        ajtxVar.copyOnWrite();
                        ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError = (ClientErrorOuterClass$ClientError) ajtxVar.instance;
                        clientErrorOuterClass$ErrorMetaData4.getClass();
                        clientErrorOuterClass$ClientError.c = clientErrorOuterClass$ErrorMetaData4;
                        clientErrorOuterClass$ClientError.b |= 1;
                        ajtxVar.copyOnWrite();
                        ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError2 = (ClientErrorOuterClass$ClientError) ajtxVar.instance;
                        clientErrorOuterClass$LogMessage2.getClass();
                        clientErrorOuterClass$ClientError2.e = clientErrorOuterClass$LogMessage2;
                        clientErrorOuterClass$ClientError2.b |= 4;
                        this.u.b((ClientErrorOuterClass$ClientError) ajtxVar.build());
                    }
                    apeo apeoVar4 = (apeo) aihfVarCreateBuilder2.build();
                    aihfVarCreateBuilder.copyOnWrite();
                    ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData5 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.instance;
                    apeoVar4.getClass();
                    clientErrorOuterClass$ErrorMetaData5.m = apeoVar4;
                    clientErrorOuterClass$ErrorMetaData5.b |= 16384;
                    if (vxzVar.m(3, 45428720L)) {
                        String strI2 = this.w.hB().i();
                        aihfVarCreateBuilder.copyOnWrite();
                        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData6 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.instance;
                        strI2.getClass();
                        clientErrorOuterClass$ErrorMetaData6.b |= 32;
                        clientErrorOuterClass$ErrorMetaData6.h = strI2;
                    }
                    twp twpVarA2 = this.v.a(th);
                    aihf aihfVarCreateBuilder5 = ClientErrorOuterClass$LogMessage.a.createBuilder();
                    Object obj2 = twpVarA2.c;
                    aihfVarCreateBuilder5.copyOnWrite();
                    ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage3 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder5.instance;
                    clientErrorOuterClass$LogMessage3.b |= 1;
                    clientErrorOuterClass$LogMessage3.c = (String) obj2;
                    ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage4 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder5.build();
                    ajtx ajtxVar2 = (ajtx) ClientErrorOuterClass$ClientError.a.createBuilder();
                    ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData7 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.build();
                    ajtxVar2.copyOnWrite();
                    ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError3 = (ClientErrorOuterClass$ClientError) ajtxVar2.instance;
                    clientErrorOuterClass$ErrorMetaData7.getClass();
                    clientErrorOuterClass$ClientError3.c = clientErrorOuterClass$ErrorMetaData7;
                    clientErrorOuterClass$ClientError3.b |= 1;
                    ajtxVar2.copyOnWrite();
                    ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError4 = (ClientErrorOuterClass$ClientError) ajtxVar2.instance;
                    clientErrorOuterClass$LogMessage4.getClass();
                    clientErrorOuterClass$ClientError4.e = clientErrorOuterClass$LogMessage4;
                    clientErrorOuterClass$ClientError4.b |= 4;
                    this.u.b((ClientErrorOuterClass$ClientError) ajtxVar2.build());
                } else if (this.p) {
                    aihfVarCreateBuilder = ClientErrorOuterClass$ErrorMetaData.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData8 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.instance;
                    clientErrorOuterClass$ErrorMetaData8.c = 22;
                    clientErrorOuterClass$ErrorMetaData8.b |= 1;
                    aihfVarCreateBuilder.copyOnWrite();
                    ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData9 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.instance;
                    clientErrorOuterClass$ErrorMetaData9.g = 117;
                    clientErrorOuterClass$ErrorMetaData9.b |= 16;
                    aihfVarCreateBuilder2 = apeo.a.createBuilder();
                    if (z) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        apeo apeoVar5 = (apeo) aihfVarCreateBuilder2.instance;
                        apeoVar5.d = 30;
                        apeoVar5.b |= 2;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    aespVar = this.D;
                    iOrdinal = aespVar.l().ordinal();
                    if (iOrdinal == 0) {
                        i2 = 0;
                    } else if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            i2 = 3;
                        } else {
                            if (iOrdinal != 3) {
                                throw new RuntimeException(null, null);
                            }
                            i2 = 4;
                        }
                    }
                    if (i2 != 0) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        apeo apeoVar6 = (apeo) aihfVarCreateBuilder2.instance;
                        apeoVar6.e = i2 - 1;
                        apeoVar6.b |= 4;
                        z3 = true;
                    } else {
                        i2 = 0;
                    }
                    vxzVar = (vxz) hnoVar.k;
                    if (vxzVar.l(76, 45836239L, false)) {
                        aihfVarCreateBuilder3 = apen.a.createBuilder();
                        int i4 = aespVar.i();
                        aihfVarCreateBuilder3.copyOnWrite();
                        apen apenVar6 = (apen) aihfVarCreateBuilder3.instance;
                        apenVar6.b |= SemanticState.Focused;
                        apenVar6.h = i4;
                        int iJ2 = aespVar.j();
                        aihfVarCreateBuilder3.copyOnWrite();
                        apen apenVar7 = (apen) aihfVarCreateBuilder3.instance;
                        apenVar7.b |= SemanticState.LiveRegion;
                        apenVar7.j = iJ2;
                        int iK2 = aespVar.k();
                        aihfVarCreateBuilder3.copyOnWrite();
                        apen apenVar8 = (apen) aihfVarCreateBuilder3.instance;
                        apenVar8.b |= SemanticState.ReadOnly;
                        apenVar8.k = iK2;
                        if (i2 != 0) {
                            aihfVarCreateBuilder3.copyOnWrite();
                            apen apenVar9 = (apen) aihfVarCreateBuilder3.instance;
                            apenVar9.i = i2 - 1;
                            apenVar9.b |= SemanticState.Hidden;
                        }
                        apen apenVar10 = (apen) aihfVarCreateBuilder3.build();
                        aihfVarCreateBuilder2.copyOnWrite();
                        apeo apeoVar7 = (apeo) aihfVarCreateBuilder2.instance;
                        apenVar10.getClass();
                        apeoVar7.c = apenVar10;
                        apeoVar7.b |= 1;
                    } else {
                        if (z3) {
                        }
                        if (vxzVar.m(3, 45428720L)) {
                            String strI3 = this.w.hB().i();
                            aihfVarCreateBuilder.copyOnWrite();
                            ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData10 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.instance;
                            strI3.getClass();
                            clientErrorOuterClass$ErrorMetaData10.b |= 32;
                            clientErrorOuterClass$ErrorMetaData10.h = strI3;
                        }
                        twp twpVarA3 = this.v.a(th);
                        aihf aihfVarCreateBuilder6 = ClientErrorOuterClass$LogMessage.a.createBuilder();
                        Object obj3 = twpVarA3.c;
                        aihfVarCreateBuilder6.copyOnWrite();
                        ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage5 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder6.instance;
                        clientErrorOuterClass$LogMessage5.b |= 1;
                        clientErrorOuterClass$LogMessage5.c = (String) obj3;
                        ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage6 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder6.build();
                        ajtx ajtxVar3 = (ajtx) ClientErrorOuterClass$ClientError.a.createBuilder();
                        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData11 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.build();
                        ajtxVar3.copyOnWrite();
                        ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError5 = (ClientErrorOuterClass$ClientError) ajtxVar3.instance;
                        clientErrorOuterClass$ErrorMetaData11.getClass();
                        clientErrorOuterClass$ClientError5.c = clientErrorOuterClass$ErrorMetaData11;
                        clientErrorOuterClass$ClientError5.b |= 1;
                        ajtxVar3.copyOnWrite();
                        ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError6 = (ClientErrorOuterClass$ClientError) ajtxVar3.instance;
                        clientErrorOuterClass$LogMessage6.getClass();
                        clientErrorOuterClass$ClientError6.e = clientErrorOuterClass$LogMessage6;
                        clientErrorOuterClass$ClientError6.b |= 4;
                        this.u.b((ClientErrorOuterClass$ClientError) ajtxVar3.build());
                    }
                    apeo apeoVar8 = (apeo) aihfVarCreateBuilder2.build();
                    aihfVarCreateBuilder.copyOnWrite();
                    ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData12 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.instance;
                    apeoVar8.getClass();
                    clientErrorOuterClass$ErrorMetaData12.m = apeoVar8;
                    clientErrorOuterClass$ErrorMetaData12.b |= 16384;
                    if (vxzVar.m(3, 45428720L)) {
                        String strI4 = this.w.hB().i();
                        aihfVarCreateBuilder.copyOnWrite();
                        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData13 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.instance;
                        strI4.getClass();
                        clientErrorOuterClass$ErrorMetaData13.b |= 32;
                        clientErrorOuterClass$ErrorMetaData13.h = strI4;
                    }
                    twp twpVarA4 = this.v.a(th);
                    aihf aihfVarCreateBuilder7 = ClientErrorOuterClass$LogMessage.a.createBuilder();
                    Object obj4 = twpVarA4.c;
                    aihfVarCreateBuilder7.copyOnWrite();
                    ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage7 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder7.instance;
                    clientErrorOuterClass$LogMessage7.b |= 1;
                    clientErrorOuterClass$LogMessage7.c = (String) obj4;
                    ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage8 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder7.build();
                    ajtx ajtxVar4 = (ajtx) ClientErrorOuterClass$ClientError.a.createBuilder();
                    ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData14 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.build();
                    ajtxVar4.copyOnWrite();
                    ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError7 = (ClientErrorOuterClass$ClientError) ajtxVar4.instance;
                    clientErrorOuterClass$ErrorMetaData14.getClass();
                    clientErrorOuterClass$ClientError7.c = clientErrorOuterClass$ErrorMetaData14;
                    clientErrorOuterClass$ClientError7.b |= 1;
                    ajtxVar4.copyOnWrite();
                    ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError8 = (ClientErrorOuterClass$ClientError) ajtxVar4.instance;
                    clientErrorOuterClass$LogMessage8.getClass();
                    clientErrorOuterClass$ClientError8.e = clientErrorOuterClass$LogMessage8;
                    clientErrorOuterClass$ClientError8.b |= 4;
                    this.u.b((ClientErrorOuterClass$ClientError) ajtxVar4.build());
                }
            } else if (this.p) {
                aihfVarCreateBuilder = ClientErrorOuterClass$ErrorMetaData.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData15 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.instance;
                clientErrorOuterClass$ErrorMetaData15.c = 22;
                clientErrorOuterClass$ErrorMetaData15.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData16 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.instance;
                clientErrorOuterClass$ErrorMetaData16.g = 117;
                clientErrorOuterClass$ErrorMetaData16.b |= 16;
                aihfVarCreateBuilder2 = apeo.a.createBuilder();
                if (z) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    apeo apeoVar9 = (apeo) aihfVarCreateBuilder2.instance;
                    apeoVar9.d = 30;
                    apeoVar9.b |= 2;
                    z3 = true;
                } else {
                    z3 = false;
                }
                aespVar = this.D;
                iOrdinal = aespVar.l().ordinal();
                if (iOrdinal == 0) {
                    i2 = 0;
                } else if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        i2 = 3;
                    } else {
                        if (iOrdinal != 3) {
                            throw new RuntimeException(null, null);
                        }
                        i2 = 4;
                    }
                }
                if (i2 != 0) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    apeo apeoVar10 = (apeo) aihfVarCreateBuilder2.instance;
                    apeoVar10.e = i2 - 1;
                    apeoVar10.b |= 4;
                    z3 = true;
                } else {
                    i2 = 0;
                }
                vxzVar = (vxz) hnoVar.k;
                if (vxzVar.l(76, 45836239L, false)) {
                    aihfVarCreateBuilder3 = apen.a.createBuilder();
                    int i5 = aespVar.i();
                    aihfVarCreateBuilder3.copyOnWrite();
                    apen apenVar11 = (apen) aihfVarCreateBuilder3.instance;
                    apenVar11.b |= SemanticState.Focused;
                    apenVar11.h = i5;
                    int iJ3 = aespVar.j();
                    aihfVarCreateBuilder3.copyOnWrite();
                    apen apenVar12 = (apen) aihfVarCreateBuilder3.instance;
                    apenVar12.b |= SemanticState.LiveRegion;
                    apenVar12.j = iJ3;
                    int iK3 = aespVar.k();
                    aihfVarCreateBuilder3.copyOnWrite();
                    apen apenVar13 = (apen) aihfVarCreateBuilder3.instance;
                    apenVar13.b |= SemanticState.ReadOnly;
                    apenVar13.k = iK3;
                    if (i2 != 0) {
                        aihfVarCreateBuilder3.copyOnWrite();
                        apen apenVar14 = (apen) aihfVarCreateBuilder3.instance;
                        apenVar14.i = i2 - 1;
                        apenVar14.b |= SemanticState.Hidden;
                    }
                    apen apenVar15 = (apen) aihfVarCreateBuilder3.build();
                    aihfVarCreateBuilder2.copyOnWrite();
                    apeo apeoVar11 = (apeo) aihfVarCreateBuilder2.instance;
                    apenVar15.getClass();
                    apeoVar11.c = apenVar15;
                    apeoVar11.b |= 1;
                } else {
                    if (z3) {
                    }
                    if (vxzVar.m(3, 45428720L)) {
                        String strI5 = this.w.hB().i();
                        aihfVarCreateBuilder.copyOnWrite();
                        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData17 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.instance;
                        strI5.getClass();
                        clientErrorOuterClass$ErrorMetaData17.b |= 32;
                        clientErrorOuterClass$ErrorMetaData17.h = strI5;
                    }
                    twp twpVarA5 = this.v.a(th);
                    aihf aihfVarCreateBuilder8 = ClientErrorOuterClass$LogMessage.a.createBuilder();
                    Object obj5 = twpVarA5.c;
                    aihfVarCreateBuilder8.copyOnWrite();
                    ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage9 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder8.instance;
                    clientErrorOuterClass$LogMessage9.b |= 1;
                    clientErrorOuterClass$LogMessage9.c = (String) obj5;
                    ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage10 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder8.build();
                    ajtx ajtxVar5 = (ajtx) ClientErrorOuterClass$ClientError.a.createBuilder();
                    ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData18 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.build();
                    ajtxVar5.copyOnWrite();
                    ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError9 = (ClientErrorOuterClass$ClientError) ajtxVar5.instance;
                    clientErrorOuterClass$ErrorMetaData18.getClass();
                    clientErrorOuterClass$ClientError9.c = clientErrorOuterClass$ErrorMetaData18;
                    clientErrorOuterClass$ClientError9.b |= 1;
                    ajtxVar5.copyOnWrite();
                    ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError10 = (ClientErrorOuterClass$ClientError) ajtxVar5.instance;
                    clientErrorOuterClass$LogMessage10.getClass();
                    clientErrorOuterClass$ClientError10.e = clientErrorOuterClass$LogMessage10;
                    clientErrorOuterClass$ClientError10.b |= 4;
                    this.u.b((ClientErrorOuterClass$ClientError) ajtxVar5.build());
                }
                apeo apeoVar12 = (apeo) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder.copyOnWrite();
                ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData19 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.instance;
                apeoVar12.getClass();
                clientErrorOuterClass$ErrorMetaData19.m = apeoVar12;
                clientErrorOuterClass$ErrorMetaData19.b |= 16384;
                if (vxzVar.m(3, 45428720L)) {
                    String strI6 = this.w.hB().i();
                    aihfVarCreateBuilder.copyOnWrite();
                    ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData110 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.instance;
                    strI6.getClass();
                    clientErrorOuterClass$ErrorMetaData110.b |= 32;
                    clientErrorOuterClass$ErrorMetaData110.h = strI6;
                }
                twp twpVarA6 = this.v.a(th);
                aihf aihfVarCreateBuilder9 = ClientErrorOuterClass$LogMessage.a.createBuilder();
                Object obj6 = twpVarA6.c;
                aihfVarCreateBuilder9.copyOnWrite();
                ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage11 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder9.instance;
                clientErrorOuterClass$LogMessage11.b |= 1;
                clientErrorOuterClass$LogMessage11.c = (String) obj6;
                ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage12 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder9.build();
                ajtx ajtxVar6 = (ajtx) ClientErrorOuterClass$ClientError.a.createBuilder();
                ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData111 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.build();
                ajtxVar6.copyOnWrite();
                ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError11 = (ClientErrorOuterClass$ClientError) ajtxVar6.instance;
                clientErrorOuterClass$ErrorMetaData111.getClass();
                clientErrorOuterClass$ClientError11.c = clientErrorOuterClass$ErrorMetaData111;
                clientErrorOuterClass$ClientError11.b |= 1;
                ajtxVar6.copyOnWrite();
                ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError12 = (ClientErrorOuterClass$ClientError) ajtxVar6.instance;
                clientErrorOuterClass$LogMessage12.getClass();
                clientErrorOuterClass$ClientError12.e = clientErrorOuterClass$LogMessage12;
                clientErrorOuterClass$ClientError12.b |= 4;
                this.u.b((ClientErrorOuterClass$ClientError) ajtxVar6.build());
            }
            m();
            this.B.set(false);
        }
    }

    public final void g(alql alqlVar, long j, acrk acrkVar, boolean z) {
        if (alqlVar != null) {
            Iterator it = alqlVar.o.iterator();
            while (it.hasNext()) {
                this.x.a((ajwo) it.next());
            }
        }
        if (k() && a.x()) {
            c(acrkVar, alqlVar, this.c.b() - j, z);
        } else {
            this.d.execute(afwl.i(new acri(this, acrkVar, alqlVar, j, z, 0)));
        }
    }

    public final void h(acrt acrtVar) {
        String str;
        this.B.set(false);
        synchronized (this.g) {
            str = this.i.b;
        }
        if (ahno.aa(str)) {
            return;
        }
        l(this.i, null, null, str, this.l, acrtVar, false, false);
    }

    public final boolean i(acrm acrmVar) {
        synchronized (this.g) {
            if (!this.i.a && !this.h.a && !this.j.a && !this.k.a) {
                return false;
            }
            this.A.add(acrmVar);
            return true;
        }
    }

    public final boolean j() {
        boolean zA;
        synchronized (this.g) {
            zA = this.i.a();
        }
        return zA;
    }

    public final boolean k() {
        int i = tqr.a;
        tqj tqjVar = this.y;
        return tqjVar.k(1073830478) || tqjVar.l(1074025686, 2);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:53:0x0109  */
    /* JADX WARN: Code duplicated, block: B:73:0x013f  */
    /* JADX WARN: Code duplicated, block: B:76:0x014c  */
    /* JADX WARN: Code duplicated, block: B:87:0x015d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0186  */
    /* JADX WARN: Code duplicated, block: B:99:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void l(final acrk acrkVar, String str, String str2, String str3, Optional optional, acrt acrtVar, final boolean z, final boolean z2) {
        boolean z3;
        acrq acrqVar;
        Executor executor;
        boolean zAa;
        final long jB;
        apfu apfuVarH;
        acux acuxVarB;
        tqj tqjVar;
        boolean z4;
        ListenableFuture listenableFutureD;
        ListenableFuture listenableFuture;
        Object obj = this.g;
        synchronized (obj) {
            if (acrtVar.c > acrkVar.c.c) {
                acrkVar.c = acrtVar;
            }
            if (this.r.V()) {
                synchronized (obj) {
                    try {
                        acrk acrkVar2 = (acrk) Stream.CC.of((Object[]) new acrk[]{this.j, this.i, this.h, this.k}).filter(new aaep(19)).findFirst().orElse(null);
                        if (acrkVar2 != null) {
                            acrl acrlVar = acrkVar.d;
                            acrl acrlVar2 = acrkVar2.d;
                            if (acrlVar.f > acrlVar2.f) {
                                acrkVar2.a = false;
                                if (acrkVar2.equals(this.i)) {
                                    this.o.set(false);
                                }
                                z3 = acrlVar2 == acrl.SOFT_REFRESH;
                                this.A.clear();
                                ListenableFuture listenableFuture2 = this.z;
                                if (listenableFuture2 != null) {
                                    listenableFuture2.cancel(false);
                                    this.z = null;
                                }
                            } else {
                                ahng.m(new IllegalStateException("Request is already in flight"));
                            }
                        }
                        acrkVar.a = true;
                        if (z3) {
                            aciz acizVarJ = this.C.j();
                            acizVarJ.k(3);
                            acizVarJ.i(adif.e(8));
                            acizVarJ.g();
                        }
                        mbc mbcVar = this.c;
                        acqz acqzVar = this.b;
                        acrqVar = this.s;
                        executor = this.d;
                        zAa = ahno.aa(str);
                        jB = mbcVar.b();
                        apfuVarH = acqzVar.h();
                        if (!zAa) {
                            acrqVar.g.d(acrqVar.a.a(), str, apfuVarH);
                        }
                        acuxVarB = acrqVar.b(str2, str3, optional, apfuVarH);
                        tqjVar = acrqVar.c;
                        int i = tqr.a;
                        if (tqjVar.a(1073894514) <= 0 || tqjVar.a(1073829819) > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        AtomicBoolean atomicBoolean = acrqVar.e;
                        atomicBoolean.toString();
                        if (z4 || !atomicBoolean.compareAndSet(true, false)) {
                            listenableFutureD = acrqVar.d(acuxVarB, executor);
                        } else {
                            String strY = acuxVarB.Y();
                            synchronized (acrqVar.f) {
                                listenableFutureD = acrqVar.e(strY);
                                if (listenableFutureD != null) {
                                    acrqVar.d.f("r_sqch");
                                    if (tqjVar.k(1073830486)) {
                                        acrqVar.f();
                                    }
                                } else {
                                    listenableFutureD = acrqVar.d(acuxVarB, executor);
                                }
                            }
                        }
                        listenableFuture = listenableFutureD;
                        if (this.r.V()) {
                            synchronized (this.g) {
                                this.z = listenableFuture;
                            }
                        }
                        if (k()) {
                            taf.i(listenableFuture, this.d, new tab() { // from class: acrg
                                @Override // defpackage.twi
                                /* JADX INFO: renamed from: b */
                                public final void a(Throwable th) {
                                    this.a.a(th, acrkVar, z, z2);
                                }
                            }, new tae() { // from class: acrh
                                @Override // defpackage.tae, defpackage.twi
                                public final void a(Object obj2) {
                                    this.a.b((alql) obj2, jB, acrkVar, z);
                                }
                            }, null);
                            return;
                        }
                        agek agekVarA = afwl.a(new agek() { // from class: acre
                            @Override // defpackage.agek
                            public final Object apply(Object obj2) {
                                alql alqlVar = (alql) obj2;
                                this.a.b(alqlVar, jB, acrkVar, z);
                                return alqlVar;
                            }
                        });
                        Executor executor2 = this.d;
                        ahbz.f(ahcs.e(listenableFuture, agekVarA, executor2), Throwable.class, afwl.d(new acrf(this, acrkVar, z, z2, 0)), executor2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            if (this.h.a || this.i.a || this.j.a || this.k.a) {
                ahng.m(new IllegalStateException("Request is already in flight"));
                return;
            }
            z3 = false;
            acrkVar.a = true;
            if (z3) {
                aciz acizVarJ2 = this.C.j();
                acizVarJ2.k(3);
                acizVarJ2.i(adif.e(8));
                acizVarJ2.g();
            }
            mbc mbcVar2 = this.c;
            acqz acqzVar2 = this.b;
            acrqVar = this.s;
            executor = this.d;
            zAa = ahno.aa(str);
            jB = mbcVar2.b();
            apfuVarH = acqzVar2.h();
            if (!zAa) {
                acrqVar.g.d(acrqVar.a.a(), str, apfuVarH);
            }
            acuxVarB = acrqVar.b(str2, str3, optional, apfuVarH);
            tqjVar = acrqVar.c;
            int i2 = tqr.a;
            if (tqjVar.a(1073894514) <= 0) {
                z4 = true;
            } else {
                z4 = true;
            }
            AtomicBoolean atomicBoolean2 = acrqVar.e;
            atomicBoolean2.toString();
            if (z4) {
                listenableFutureD = acrqVar.d(acuxVarB, executor);
            } else {
                listenableFutureD = acrqVar.d(acuxVarB, executor);
            }
            listenableFuture = listenableFutureD;
            if (this.r.V()) {
                synchronized (this.g) {
                    this.z = listenableFuture;
                }
            }
            if (k()) {
                taf.i(listenableFuture, this.d, new tab() { // from class: acrg
                    @Override // defpackage.twi
                    /* JADX INFO: renamed from: b */
                    public final void a(Throwable th2) {
                        this.a.a(th2, acrkVar, z, z2);
                    }
                }, new tae() { // from class: acrh
                    @Override // defpackage.tae, defpackage.twi
                    public final void a(Object obj2) {
                        this.a.b((alql) obj2, jB, acrkVar, z);
                    }
                }, null);
                return;
            }
            agek agekVarA2 = afwl.a(new agek() { // from class: acre
                @Override // defpackage.agek
                public final Object apply(Object obj2) {
                    alql alqlVar = (alql) obj2;
                    this.a.b(alqlVar, jB, acrkVar, z);
                    return alqlVar;
                }
            });
            Executor executor3 = this.d;
            ahbz.f(ahcs.e(listenableFuture, agekVarA2, executor3), Throwable.class, afwl.d(new acrf(this, acrkVar, z, z2, 0)), executor3);
        }
    }

    public final void m() {
        this.o.set(false);
    }
}
