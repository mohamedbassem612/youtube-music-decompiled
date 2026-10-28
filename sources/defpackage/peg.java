package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.protobuf.MessageLite;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class peg implements pdr {
    private static final agsn a = agsn.h("GnpSdk");
    private final pdu b;
    private final pep c;
    private final pav d;
    private final awmd e;
    private final omr f;
    private final isi g;
    private final isi h;
    private final isi i;
    private final kjc j;

    public peg(pdu pduVar, kjc kjcVar, isi isiVar, qnl qnlVar, isi isiVar2, qnl qnlVar2, isi isiVar3, omr omrVar, pep pepVar, qnl qnlVar3, qnl qnlVar4, pav pavVar, awmd awmdVar) {
        pduVar.getClass();
        kjcVar.getClass();
        isiVar.getClass();
        qnlVar.getClass();
        isiVar2.getClass();
        qnlVar2.getClass();
        isiVar3.getClass();
        omrVar.getClass();
        pepVar.getClass();
        qnlVar3.getClass();
        qnlVar4.getClass();
        pavVar.getClass();
        awmdVar.getClass();
        this.b = pduVar;
        this.j = kjcVar;
        this.i = isiVar;
        this.h = isiVar2;
        this.g = isiVar3;
        this.f = omrVar;
        this.c = pepVar;
        this.d = pavVar;
        this.e = awmdVar;
    }

    private final void l(plx plxVar, qau qauVar, ahyy ahyyVar) {
        if (qauVar.a()) {
            paw pawVarA = this.d.a(ahyyVar);
            pawVarA.f(plxVar);
            Throwable th = qauVar.c;
            if (th != null) {
                String simpleName = th.getClass().getSimpleName();
                simpleName.getClass();
                ((pbc) pawVarA).m = simpleName;
            }
            pawVarA.a();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0127  */
    /* JADX WARN: Code duplicated, block: B:42:0x0150  */
    /* JADX WARN: Code duplicated, block: B:44:0x0156  */
    /* JADX WARN: Code duplicated, block: B:47:0x016c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0174  */
    /* JADX WARN: Code duplicated, block: B:50:0x0176  */
    /* JADX WARN: Code duplicated, block: B:52:0x017e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0181  */
    /* JADX WARN: Code duplicated, block: B:55:0x0189  */
    /* JADX WARN: Code duplicated, block: B:56:0x018b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0193  */
    /* JADX WARN: Code duplicated, block: B:59:0x0195  */
    /* JADX WARN: Code duplicated, block: B:61:0x019b  */
    /* JADX WARN: Code duplicated, block: B:62:0x019e  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:72:0x0224  */
    /* JADX WARN: Code duplicated, block: B:75:0x0277  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:89:0x027d A[SYNTHETIC] */
    @Override // defpackage.pdr
    public final Object a(plx plxVar, List list, aieu aieuVar, awoq awoqVar) throws Throwable {
        pdw pdwVar;
        plx plxVar2;
        aiar aiarVar;
        int i;
        aiby aibyVarA;
        aihf aihfVarCreateBuilder;
        int i2;
        int iBh;
        aiaq aiaqVar;
        aiie aiieVar;
        aiar aiarVar2;
        aiie aiieVar2;
        if (awoqVar instanceof pdw) {
            pdwVar = (pdw) awoqVar;
            int i3 = pdwVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pdwVar.c = i3 - Integer.MIN_VALUE;
            } else {
                pdwVar = new pdw(this, awoqVar);
            }
        } else {
            pdwVar = new pdw(this, awoqVar);
        }
        pdw pdwVar2 = pdwVar;
        Object objP = pdwVar2.a;
        awox awoxVar = awox.a;
        int i4 = pdwVar2.c;
        int i5 = 1;
        if (i4 == 0) {
            atqp.j(objP);
            pdu pduVar = this.b;
            plxVar.getClass();
            list.getClass();
            aieuVar.getClass();
            aihf aihfVarCreateBuilder2 = aiar.a.createBuilder();
            aihfVarCreateBuilder2.getClass();
            String str = pduVar.a.a;
            str.getClass();
            aihfVarCreateBuilder2.copyOnWrite();
            aiar aiarVar3 = (aiar) aihfVarCreateBuilder2.instance;
            aiarVar3.b |= 1;
            aiarVar3.c = str;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                pzo pzoVar = (pzo) it.next();
                List listUnmodifiableList = DesugarCollections.unmodifiableList(((aiar) aihfVarCreateBuilder2.instance).d);
                listUnmodifiableList.getClass();
                new aikl(listUnmodifiableList);
                aihf aihfVarCreateBuilder3 = aiaq.a.createBuilder();
                aihfVarCreateBuilder3.getClass();
                aiff aiffVar = pzoVar.d;
                if (aiffVar == null) {
                    aiffVar = aiff.a;
                }
                aiffVar.getClass();
                aihfVarCreateBuilder3.copyOnWrite();
                aiaq aiaqVar2 = (aiaq) aihfVarCreateBuilder3.instance;
                aiaqVar2.d = aiffVar;
                aiaqVar2.b |= i5;
                String str2 = pzoVar.f;
                str2.getClass();
                String str3 = pzoVar.j;
                str3.getClass();
                int iBc = a.bc(pzoVar.e);
                if (iBc == 0) {
                    iBc = i5;
                }
                int iAT = a.aT(pzoVar.h);
                if (iAT == 0) {
                    iAT = i5;
                }
                int iA = aewp.A(pzoVar.k);
                if (iA == 0) {
                    iA = i5;
                }
                aihf aihfVarCreateBuilder4 = aiad.a.createBuilder();
                aihfVarCreateBuilder4.getClass();
                Iterator it2 = it;
                if (iAT == 4) {
                    try {
                        aibyVarA = pduVar.b.a(plxVar);
                    } catch (pqh unused) {
                        i = 4;
                        String str4 = String.format("Chime Android SDK - Client Id [%s]", Arrays.copyOf(new Object[]{pduVar.a.a}, 1));
                        str4.getClass();
                        aihfVarCreateBuilder4.copyOnWrite();
                        aiad aiadVar = (aiad) aihfVarCreateBuilder4.instance;
                        aiadVar.b = 1;
                        aiadVar.c = str4;
                        if (str3.length() > 0) {
                            aihf aihfVarCreateBuilder5 = aiac.a.createBuilder();
                            aihfVarCreateBuilder5.getClass();
                            aewp.y(iBc, aihfVarCreateBuilder5);
                            aewp.x(10, aihfVarCreateBuilder5);
                            aihfVarCreateBuilder5.copyOnWrite();
                            aiac aiacVar = (aiac) aihfVarCreateBuilder5.instance;
                            aiacVar.b |= 8;
                            aiacVar.f = str3;
                            aewp.z(aewp.w(aihfVarCreateBuilder5), aihfVarCreateBuilder4);
                        } else if (str2.length() > 0) {
                            aihfVarCreateBuilder = aiac.a.createBuilder();
                            aihfVarCreateBuilder.getClass();
                            aewp.y(iBc, aihfVarCreateBuilder);
                            switch (str2) {
                                case "com.google.android.libraries.notifications.NOTIFICATION_DROPPED":
                                    i2 = 14;
                                    break;
                                case "com.google.android.libraries.notifications.NOTIFICATION_SHOWN":
                                    i2 = 6;
                                    break;
                                case "com.google.android.libraries.notifications.NOTIFICATION_EXPIRED":
                                    i2 = 5;
                                    break;
                                case "com.google.android.libraries.notifications.NOTIFICATION_DISMISSED":
                                    i2 = i;
                                    break;
                                case "com.google.android.libraries.notifications.NOTIFICATION_CLICKED":
                                    i2 = 3;
                                    break;
                                default:
                                    aihfVarCreateBuilder.copyOnWrite();
                                    aiac aiacVar2 = (aiac) aihfVarCreateBuilder.instance;
                                    aiacVar2.b |= 2;
                                    aiacVar2.d = str2;
                                    i2 = 2;
                                    break;
                            }
                            aewp.x(i2, aihfVarCreateBuilder);
                            if (awrc.c(str2, "com.google.android.libraries.notifications.NOTIFICATION_DROPPED")) {
                                aihfVarCreateBuilder.copyOnWrite();
                                aiac aiacVar3 = (aiac) aihfVarCreateBuilder.instance;
                                aiacVar3.g = iA - 1;
                                aiacVar3.b |= 16;
                            }
                            aewp.z(aewp.w(aihfVarCreateBuilder), aihfVarCreateBuilder4);
                        }
                        aihn aihnVarBuild = aihfVarCreateBuilder4.build();
                        aihnVarBuild.getClass();
                        aihfVarCreateBuilder3.copyOnWrite();
                        aiaq aiaqVar3 = (aiaq) aihfVarCreateBuilder3.instance;
                        aiaqVar3.e = (aiad) aihnVarBuild;
                        aiaqVar3.b |= 2;
                        iBh = a.bh(pzoVar.g);
                        if (iBh == 0) {
                            iBh = 1;
                        }
                        aihfVarCreateBuilder3.copyOnWrite();
                        aiaq aiaqVar4 = (aiaq) aihfVarCreateBuilder3.instance;
                        aiaqVar4.f = iBh - 1;
                        aiaqVar4.b |= 8;
                        List listUnmodifiableList2 = DesugarCollections.unmodifiableList(aiaqVar4.c);
                        listUnmodifiableList2.getClass();
                        new aikl(listUnmodifiableList2);
                        aiie aiieVar3 = pzoVar.c;
                        aiieVar3.getClass();
                        aihfVarCreateBuilder3.copyOnWrite();
                        aiaqVar = (aiaq) aihfVarCreateBuilder3.instance;
                        aiieVar = aiaqVar.c;
                        if (!aiieVar.c()) {
                            aiaqVar.c = aihn.mutableCopy(aiieVar);
                        }
                        aifs.addAll(aiieVar3, aiaqVar.c);
                        long j = pzoVar.i;
                        aihfVarCreateBuilder3.copyOnWrite();
                        aiaq aiaqVar5 = (aiaq) aihfVarCreateBuilder3.instance;
                        aiaqVar5.b |= 16;
                        aiaqVar5.g = j;
                        long micros = TimeUnit.MILLISECONDS.toMicros(pduVar.c.f().toEpochMilli());
                        aihfVarCreateBuilder3.copyOnWrite();
                        aiaq aiaqVar6 = (aiaq) aihfVarCreateBuilder3.instance;
                        aiaqVar6.b |= 32;
                        aiaqVar6.h = micros;
                        aihn aihnVarBuild2 = aihfVarCreateBuilder3.build();
                        aihnVarBuild2.getClass();
                        aiaq aiaqVar7 = (aiaq) aihnVarBuild2;
                        aihfVarCreateBuilder2.copyOnWrite();
                        aiarVar2 = (aiar) aihfVarCreateBuilder2.instance;
                        aiieVar2 = aiarVar2.d;
                        if (!aiieVar2.c()) {
                            aiarVar2.d = aihn.mutableCopy(aiieVar2);
                        }
                        aiarVar2.d.add(aiaqVar7);
                        it = it2;
                        i5 = 1;
                    }
                } else {
                    aibyVarA = pduVar.b.b(plxVar);
                }
                aihfVarCreateBuilder4.copyOnWrite();
                i = 4;
                try {
                    aiad aiadVar2 = (aiad) aihfVarCreateBuilder4.instance;
                    aiadVar2.c = aibyVarA;
                    aiadVar2.b = 2;
                } catch (pqh unused2) {
                    String str5 = String.format("Chime Android SDK - Client Id [%s]", Arrays.copyOf(new Object[]{pduVar.a.a}, 1));
                    str5.getClass();
                    aihfVarCreateBuilder4.copyOnWrite();
                    aiad aiadVar3 = (aiad) aihfVarCreateBuilder4.instance;
                    aiadVar3.b = 1;
                    aiadVar3.c = str5;
                }
                if (str3.length() > 0) {
                    aihf aihfVarCreateBuilder6 = aiac.a.createBuilder();
                    aihfVarCreateBuilder6.getClass();
                    aewp.y(iBc, aihfVarCreateBuilder6);
                    aewp.x(10, aihfVarCreateBuilder6);
                    aihfVarCreateBuilder6.copyOnWrite();
                    aiac aiacVar4 = (aiac) aihfVarCreateBuilder6.instance;
                    aiacVar4.b |= 8;
                    aiacVar4.f = str3;
                    aewp.z(aewp.w(aihfVarCreateBuilder6), aihfVarCreateBuilder4);
                } else if (str2.length() > 0) {
                    aihfVarCreateBuilder = aiac.a.createBuilder();
                    aihfVarCreateBuilder.getClass();
                    aewp.y(iBc, aihfVarCreateBuilder);
                    switch (str2) {
                        case -1582032946:
                            if (str2.equals("com.google.android.libraries.notifications.NOTIFICATION_DROPPED")) {
                                aihfVarCreateBuilder.copyOnWrite();
                                aiac aiacVar5 = (aiac) aihfVarCreateBuilder.instance;
                                aiacVar5.b |= 2;
                                aiacVar5.d = str2;
                                i2 = 2;
                            } else {
                                i2 = 14;
                            }
                            break;
                        case -783620961:
                            if (str2.equals("com.google.android.libraries.notifications.NOTIFICATION_SHOWN")) {
                                aihfVarCreateBuilder.copyOnWrite();
                                aiac aiacVar6 = (aiac) aihfVarCreateBuilder.instance;
                                aiacVar6.b |= 2;
                                aiacVar6.d = str2;
                                i2 = 2;
                            } else {
                                i2 = 6;
                            }
                            break;
                        case -522037453:
                            if (str2.equals("com.google.android.libraries.notifications.NOTIFICATION_EXPIRED")) {
                                aihfVarCreateBuilder.copyOnWrite();
                                aiac aiacVar7 = (aiac) aihfVarCreateBuilder.instance;
                                aiacVar7.b |= 2;
                                aiacVar7.d = str2;
                                i2 = 2;
                            } else {
                                i2 = 5;
                            }
                            break;
                        case 742466871:
                            if (str2.equals("com.google.android.libraries.notifications.NOTIFICATION_DISMISSED")) {
                                aihfVarCreateBuilder.copyOnWrite();
                                aiac aiacVar8 = (aiac) aihfVarCreateBuilder.instance;
                                aiacVar8.b |= 2;
                                aiacVar8.d = str2;
                                i2 = 2;
                            } else {
                                i2 = i;
                            }
                            break;
                        case 1647722549:
                            if (str2.equals("com.google.android.libraries.notifications.NOTIFICATION_CLICKED")) {
                                aihfVarCreateBuilder.copyOnWrite();
                                aiac aiacVar9 = (aiac) aihfVarCreateBuilder.instance;
                                aiacVar9.b |= 2;
                                aiacVar9.d = str2;
                                i2 = 2;
                            } else {
                                i2 = 3;
                            }
                            break;
                        default:
                            aihfVarCreateBuilder.copyOnWrite();
                            aiac aiacVar10 = (aiac) aihfVarCreateBuilder.instance;
                            aiacVar10.b |= 2;
                            aiacVar10.d = str2;
                            i2 = 2;
                            break;
                    }
                    aewp.x(i2, aihfVarCreateBuilder);
                    if (awrc.c(str2, "com.google.android.libraries.notifications.NOTIFICATION_DROPPED")) {
                        aihfVarCreateBuilder.copyOnWrite();
                        aiac aiacVar11 = (aiac) aihfVarCreateBuilder.instance;
                        aiacVar11.g = iA - 1;
                        aiacVar11.b |= 16;
                    }
                    aewp.z(aewp.w(aihfVarCreateBuilder), aihfVarCreateBuilder4);
                }
                aihn aihnVarBuild3 = aihfVarCreateBuilder4.build();
                aihnVarBuild3.getClass();
                aihfVarCreateBuilder3.copyOnWrite();
                aiaq aiaqVar8 = (aiaq) aihfVarCreateBuilder3.instance;
                aiaqVar8.e = (aiad) aihnVarBuild3;
                aiaqVar8.b |= 2;
                iBh = a.bh(pzoVar.g);
                if (iBh == 0) {
                    iBh = 1;
                }
                aihfVarCreateBuilder3.copyOnWrite();
                aiaq aiaqVar9 = (aiaq) aihfVarCreateBuilder3.instance;
                aiaqVar9.f = iBh - 1;
                aiaqVar9.b |= 8;
                List listUnmodifiableList3 = DesugarCollections.unmodifiableList(aiaqVar9.c);
                listUnmodifiableList3.getClass();
                new aikl(listUnmodifiableList3);
                aiie aiieVar4 = pzoVar.c;
                aiieVar4.getClass();
                aihfVarCreateBuilder3.copyOnWrite();
                aiaqVar = (aiaq) aihfVarCreateBuilder3.instance;
                aiieVar = aiaqVar.c;
                if (!aiieVar.c()) {
                    aiaqVar.c = aihn.mutableCopy(aiieVar);
                }
                aifs.addAll(aiieVar4, aiaqVar.c);
                long j2 = pzoVar.i;
                aihfVarCreateBuilder3.copyOnWrite();
                aiaq aiaqVar10 = (aiaq) aihfVarCreateBuilder3.instance;
                aiaqVar10.b |= 16;
                aiaqVar10.g = j2;
                long micros2 = TimeUnit.MILLISECONDS.toMicros(pduVar.c.f().toEpochMilli());
                aihfVarCreateBuilder3.copyOnWrite();
                aiaq aiaqVar11 = (aiaq) aihfVarCreateBuilder3.instance;
                aiaqVar11.b |= 32;
                aiaqVar11.h = micros2;
                aihn aihnVarBuild4 = aihfVarCreateBuilder3.build();
                aihnVarBuild4.getClass();
                aiaq aiaqVar12 = (aiaq) aihnVarBuild4;
                aihfVarCreateBuilder2.copyOnWrite();
                aiarVar2 = (aiar) aihfVarCreateBuilder2.instance;
                aiieVar2 = aiarVar2.d;
                if (!aiieVar2.c()) {
                    aiarVar2.d = aihn.mutableCopy(aiieVar2);
                }
                aiarVar2.d.add(aiaqVar12);
                it = it2;
                i5 = 1;
            }
            aihfVarCreateBuilder2.copyOnWrite();
            aiar aiarVar4 = (aiar) aihfVarCreateBuilder2.instance;
            aiarVar4.e = aieuVar;
            aiarVar4.b |= 4;
            aihn aihnVarBuild5 = aihfVarCreateBuilder2.build();
            aihnVarBuild5.getClass();
            kjc kjcVar = this.j;
            aiar aiarVar5 = (aiar) aihnVarBuild5;
            pdwVar2.e = plxVar;
            pdwVar2.d = aiarVar5;
            pdwVar2.c = 1;
            aias aiasVar = aias.a;
            aiasVar.getClass();
            qbf qbfVar = (qbf) kjcVar.a;
            objP = awro.p(qbfVar.t, new pqd(qbfVar, "/v1/batchupdatethreadstate", plxVar, aiarVar5, aiasVar, awnp.a, (awoq) null, 2), pdwVar2);
            if (objP == awoxVar) {
                return awoxVar;
            }
            plxVar2 = plxVar;
            aiarVar = aiarVar5;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aiarVar = pdwVar2.d;
            plxVar2 = pdwVar2.e;
            atqp.j(objP);
        }
        qau qauVar = (qau) objP;
        l(plxVar2, qauVar, ahyy.FAILED_TO_UPDATE_THREAD_STATE);
        return pdq.a(aiarVar, qauVar);
    }

    @Override // defpackage.pdr
    public final Object b(plx plxVar, long j, aidy aidyVar, aieu aieuVar, awoq awoqVar) {
        if (!new aihx(auvs.a.io().a().c, poy.a).contains(aidyVar)) {
            return i(plxVar, j, aidyVar, aieuVar, awoqVar);
        }
        qat qatVarC = pdq.c();
        qatVarC.b = new pdv(aidyVar);
        qatVarC.f(false);
        return qatVarC.d();
    }

    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.pdr
    public final Object c(plx plxVar, long j, List list, aidy aidyVar, aieu aieuVar, awoq awoqVar) throws Throwable {
        pdy pdyVar;
        plx plxVar2;
        aiaw aiawVar;
        plx plxVar3;
        if (awoqVar instanceof pdy) {
            pdyVar = (pdy) awoqVar;
            int i = pdyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pdyVar.c = i - Integer.MIN_VALUE;
            } else {
                pdyVar = new pdy(this, awoqVar);
            }
        } else {
            pdyVar = new pdy(this, awoqVar);
        }
        pdy pdyVar2 = pdyVar;
        Object objT = pdyVar2.a;
        Object obj = awox.a;
        int i2 = pdyVar2.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    plxVar2 = pdyVar2.e;
                    atqp.j(objT);
                } else if (i2 == 2) {
                    aiawVar = pdyVar2.d;
                    plxVar3 = pdyVar2.e;
                    atqp.j(objT);
                    pdyVar2.e = plxVar3;
                    pdyVar2.d = aiawVar;
                    pdyVar2.c = 3;
                    objT = h((qau) objT, plxVar3, pdyVar2);
                    if (objT == obj) {
                        return obj;
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aiawVar = pdyVar2.d;
                    plxVar3 = pdyVar2.e;
                    atqp.j(objT);
                }
                qau qauVar = (qau) objT;
                l(plxVar3, qauVar, ahyy.FAILED_TO_FETCH_UPDATED_NOTIFICATIONS);
                return pdq.a(aiawVar, qauVar);
            }
            atqp.j(objT);
            if (new aihx(auvs.a.io().b().c, poy.a).contains(aidyVar)) {
                qat qatVarC = pdq.c();
                qatVarC.b = new pdv(aidyVar);
                qatVarC.f(false);
                return qatVarC.d();
            }
            isi isiVar = this.h;
            pdyVar2.e = plxVar;
            pdyVar2.c = 1;
            objT = isiVar.t(plxVar, j, list, aidyVar, aieuVar, pdyVar2);
            if (objT == obj) {
                return obj;
            }
            plxVar2 = plxVar;
            aiaw aiawVar2 = (aiaw) objT;
            aiawVar2.getClass();
            ahub ahubVarQ = aewp.Q(aiau.b.createBuilder());
            String str = aiawVar2.c;
            str.getClass();
            ahubVarQ.x(str);
            aibz aibzVar = aiawVar2.d;
            if (aibzVar == null) {
                aibzVar = aibz.a;
            }
            aibzVar.getClass();
            ahubVarQ.C(aibzVar);
            aibw aibwVar = aiawVar2.g;
            if (aibwVar == null) {
                aibwVar = aibw.a;
            }
            aibwVar.getClass();
            ahubVarQ.A(aibwVar);
            aidy aidyVarA = aidy.a(aiawVar2.h);
            if (aidyVarA == null) {
                aidyVarA = aidy.FETCH_REASON_UNSPECIFIED;
            }
            ahubVarQ.y(aidyVarA);
            ahubVarQ.E();
            aiie aiieVar = aiawVar2.i;
            aiieVar.getClass();
            ahubVarQ.D(aiieVar);
            aieu aieuVar2 = aiawVar2.j;
            if (aieuVar2 == null) {
                aieuVar2 = aieu.a;
            }
            aieuVar2.getClass();
            ahubVarQ.B(aieuVar2);
            ahubVarQ.z(aiawVar2.e);
            Object obj2 = ahubVarQ.a;
            ((aihf) obj2).copyOnWrite();
            aiau aiauVar = (aiau) ((aihf) obj2).instance;
            aiauVar.k = 2;
            aiauVar.c |= SemanticState.Focused;
            new aikl(new aihx(aiauVar.j, aiau.a));
            aiel aielVar = aiel.SYSTEM_TRAY;
            ((aihf) obj2).copyOnWrite();
            aiau aiauVar2 = (aiau) ((aihf) obj2).instance;
            aihv aihvVar = aiauVar2.j;
            if (!aihvVar.c()) {
                aiauVar2.j = aihn.mutableCopy(aihvVar);
            }
            aiauVar2.j.h(aielVar.d);
            aihf aihfVarCreateBuilder = aife.b.createBuilder();
            aihfVarCreateBuilder.getClass();
            aext.G(aihfVarCreateBuilder);
            aihfVarCreateBuilder.au(aidu.DELETED);
            aext.G(aihfVarCreateBuilder);
            aihfVarCreateBuilder.au(aidu.ACTIVE);
            aihn aihnVarBuild = aihfVarCreateBuilder.build();
            aihnVarBuild.getClass();
            ((aihf) obj2).copyOnWrite();
            aiau aiauVar3 = (aiau) ((aihf) obj2).instance;
            aiauVar3.m = (aife) aihnVarBuild;
            aiauVar3.c |= SemanticState.LiveRegion;
            aiau aiauVarW = ahubVarQ.w();
            kjc kjcVar = this.j;
            pdyVar2.e = plxVar2;
            pdyVar2.d = aiawVar2;
            pdyVar2.c = 2;
            Object objG = kjcVar.G(plxVar2, aiauVarW, pdyVar2);
            if (objG == obj) {
                return obj;
            }
            plx plxVar4 = plxVar2;
            aiawVar = aiawVar2;
            objT = objG;
            plxVar3 = plxVar4;
            pdyVar2.e = plxVar3;
            pdyVar2.d = aiawVar;
            pdyVar2.c = 3;
            objT = h((qau) objT, plxVar3, pdyVar2);
            if (objT == obj) {
                return obj;
            }
            qau qauVar2 = (qau) objT;
            l(plxVar3, qauVar2, ahyy.FAILED_TO_FETCH_UPDATED_NOTIFICATIONS);
            return pdq.a(aiawVar, qauVar2);
        } catch (pqh e) {
            qat qatVarC2 = pdq.c();
            qatVarC2.b = e;
            qatVarC2.f(true);
            return qatVarC2.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, pqg] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, pun] */
    @Override // defpackage.pdr
    public final Object d(plx plxVar, aieu aieuVar, awoq awoqVar) throws Throwable {
        pea peaVar;
        aibc aibcVar;
        plx plxVar2;
        if (awoqVar instanceof pea) {
            peaVar = (pea) awoqVar;
            int i = peaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                peaVar.c = i - Integer.MIN_VALUE;
            } else {
                peaVar = new pea(this, awoqVar);
            }
        } else {
            peaVar = new pea(this, awoqVar);
        }
        pea peaVar2 = peaVar;
        Object objP = peaVar2.a;
        awox awoxVar = awox.a;
        int i2 = peaVar2.c;
        try {
            if (i2 == 0) {
                atqp.j(objP);
                isi isiVar = this.g;
                aieuVar.getClass();
                plxVar.getClass();
                aihf aihfVarCreateBuilder = aibc.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                Object obj = isiVar.c;
                String str = ((pls) obj).a;
                str.getClass();
                aihfVarCreateBuilder.copyOnWrite();
                aibc aibcVar2 = (aibc) aihfVarCreateBuilder.instance;
                aibcVar2.b |= 1;
                aibcVar2.c = str;
                aiby aibyVarB = isiVar.b.b(plxVar);
                aihfVarCreateBuilder.copyOnWrite();
                aibc aibcVar3 = (aibc) aihfVarCreateBuilder.instance;
                aibcVar3.d = aibyVarB;
                aibcVar3.b |= 2;
                aihf aihfVarCreateBuilder2 = aibm.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                aihf aihfVarCreateBuilder3 = aibl.a.createBuilder();
                aihfVarCreateBuilder3.getClass();
                String str2 = ((pls) obj).b;
                if (str2 != null) {
                    aewp.s(Long.parseLong(str2), aihfVarCreateBuilder3);
                }
                aewp.r(isiVar.a.c(), aihfVarCreateBuilder3);
                aewp.u(aewp.q(aihfVarCreateBuilder3), aihfVarCreateBuilder2);
                aibm aibmVarT = aewp.t(aihfVarCreateBuilder2);
                aihfVarCreateBuilder.copyOnWrite();
                aibc aibcVar4 = (aibc) aihfVarCreateBuilder.instance;
                aibcVar4.e = aibmVarT;
                aibcVar4.b |= 4;
                aihfVarCreateBuilder.copyOnWrite();
                aibc aibcVar5 = (aibc) aihfVarCreateBuilder.instance;
                aibcVar5.f = aieuVar;
                aibcVar5.b |= 8;
                aihn aihnVarBuild = aihfVarCreateBuilder.build();
                aihnVarBuild.getClass();
                aibcVar = (aibc) aihnVarBuild;
                kjc kjcVar = this.j;
                peaVar2.e = plxVar;
                peaVar2.d = aibcVar;
                peaVar2.c = 1;
                Object obj2 = kjcVar.a;
                aibd aibdVar = aibd.a;
                aibdVar.getClass();
                qbf qbfVar = (qbf) obj2;
                objP = awro.p(qbfVar.t, new pqd(qbfVar, "/v1/removetarget", plxVar, aibcVar, aibdVar, awnp.a, (awoq) null, 2), peaVar2);
                if (objP == awoxVar) {
                    return awoxVar;
                }
                plxVar2 = plxVar;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aibc aibcVar6 = peaVar2.d;
                plx plxVar3 = peaVar2.e;
                atqp.j(objP);
                aibcVar = aibcVar6;
                plxVar2 = plxVar3;
            }
            qau qauVar = (qau) objP;
            l(plxVar2, qauVar, ahyy.FAILED_TO_UNREGISTER);
            return pdq.a(aibcVar, qauVar);
        } catch (pqh e) {
            qat qatVarC = pdq.c();
            qatVarC.b = e;
            qatVarC.f(true);
            return qatVarC.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, pun] */
    @Override // defpackage.pdr
    public final Object e(plx plxVar, ozh ozhVar, boolean z, aieu aieuVar, awoq awoqVar) throws Throwable {
        peb pebVar;
        plx plxVar2;
        aibe aibeVar;
        if (awoqVar instanceof peb) {
            pebVar = (peb) awoqVar;
            int i = pebVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pebVar.c = i - Integer.MIN_VALUE;
            } else {
                pebVar = new peb(this, awoqVar);
            }
        } else {
            pebVar = new peb(this, awoqVar);
        }
        peb pebVar2 = pebVar;
        Object objP = pebVar2.a;
        awox awoxVar = awox.a;
        int i2 = pebVar2.c;
        try {
            if (i2 == 0) {
                atqp.j(objP);
                omr omrVar = this.f;
                plxVar.getClass();
                ozhVar.getClass();
                aieuVar.getClass();
                aihf aihfVarCreateBuilder = aibe.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                String str = ((pls) omrVar.b).a;
                str.getClass();
                aihfVarCreateBuilder.copyOnWrite();
                aibe aibeVar2 = (aibe) aihfVarCreateBuilder.instance;
                aibeVar2.b |= 1;
                aibeVar2.c = str;
                aihfVarCreateBuilder.copyOnWrite();
                aibe aibeVar3 = (aibe) aihfVarCreateBuilder.instance;
                aibeVar3.f = aieuVar;
                aibeVar3.b |= 8;
                List listUnmodifiableList = DesugarCollections.unmodifiableList(aibeVar3.d);
                listUnmodifiableList.getClass();
                new aikl(listUnmodifiableList);
                List<ozf> list = ozhVar.a;
                list.getClass();
                ArrayList arrayList = new ArrayList(atqq.N(list, 10));
                for (ozf ozfVar : list) {
                    aihf aihfVarCreateBuilder2 = aibk.a.createBuilder();
                    ozg ozgVar = ozfVar.a;
                    aihf aihfVarCreateBuilder3 = aial.a.createBuilder();
                    String str2 = ozgVar.a;
                    aihfVarCreateBuilder3.copyOnWrite();
                    aial aialVar = (aial) aihfVarCreateBuilder3.instance;
                    str2.getClass();
                    aialVar.b |= 1;
                    aialVar.c = str2;
                    String str3 = ozgVar.b;
                    if (!TextUtils.isEmpty(str3)) {
                        aihfVarCreateBuilder3.copyOnWrite();
                        aial aialVar2 = (aial) aihfVarCreateBuilder3.instance;
                        str3.getClass();
                        aialVar2.b |= 2;
                        aialVar2.d = str3;
                    }
                    aial aialVar3 = (aial) aihfVarCreateBuilder3.build();
                    aihfVarCreateBuilder2.copyOnWrite();
                    aibk aibkVar = (aibk) aihfVarCreateBuilder2.instance;
                    aialVar3.getClass();
                    aibkVar.c = aialVar3;
                    aibkVar.b |= 1;
                    int i3 = ozfVar.b;
                    int i4 = i3 - 1;
                    if (i3 == 0) {
                        throw null;
                    }
                    int i5 = i4 != 1 ? i4 != 2 ? 1 : 2 : 3;
                    aihfVarCreateBuilder2.copyOnWrite();
                    aibk aibkVar2 = (aibk) aihfVarCreateBuilder2.instance;
                    aibkVar2.d = i5 - 1;
                    aibkVar2.b |= 2;
                    arrayList.add((aibk) aihfVarCreateBuilder2.build());
                }
                aihfVarCreateBuilder.copyOnWrite();
                aibe aibeVar4 = (aibe) aihfVarCreateBuilder.instance;
                aiie aiieVar = aibeVar4.d;
                if (!aiieVar.c()) {
                    aibeVar4.d = aihn.mutableCopy(aiieVar);
                }
                aifs.addAll(arrayList, aibeVar4.d);
                if (z) {
                    aiby aibyVarB = omrVar.a.b(plxVar);
                    aihfVarCreateBuilder.copyOnWrite();
                    aibe aibeVar5 = (aibe) aihfVarCreateBuilder.instance;
                    aibeVar5.e = aibyVarB;
                    aibeVar5.b |= 4;
                }
                aihn aihnVarBuild = aihfVarCreateBuilder.build();
                aihnVarBuild.getClass();
                aibe aibeVar6 = (aibe) aihnVarBuild;
                kjc kjcVar = this.j;
                pebVar2.e = plxVar;
                pebVar2.d = aibeVar6;
                pebVar2.c = 1;
                Object obj = kjcVar.a;
                aibf aibfVar = aibf.a;
                aibfVar.getClass();
                qbf qbfVar = (qbf) obj;
                objP = awro.p(qbfVar.t, new pqd(qbfVar, "/v1/setuserpreference", plxVar, aibeVar6, aibfVar, awnp.a, (awoq) null, 2), pebVar2);
                if (objP == awoxVar) {
                    return awoxVar;
                }
                plxVar2 = plxVar;
                aibeVar = aibeVar6;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aibeVar = pebVar2.d;
                plxVar2 = pebVar2.e;
                atqp.j(objP);
            }
            qau qauVar = (qau) objP;
            l(plxVar2, qauVar, ahyy.FAILED_TO_UPDATE_PREFS);
            return pdq.a(aibeVar, qauVar);
        } catch (pqh e) {
            qat qatVarC = pdq.c();
            qatVarC.b = e;
            qatVarC.f(true);
            return qatVarC.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r1v12, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [awou, java.lang.Object] */
    @Override // defpackage.pdr
    public final Object f(plx plxVar, aier aierVar, aieu aieuVar, awoq awoqVar) throws Throwable {
        pec pecVar;
        aibg aibgVar;
        plx plxVar2 = plxVar;
        if (awoqVar instanceof pec) {
            pecVar = (pec) awoqVar;
            int i = pecVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pecVar.c = i - Integer.MIN_VALUE;
            } else {
                pecVar = new pec(this, awoqVar);
            }
        } else {
            pecVar = new pec(this, awoqVar);
        }
        pec pecVar2 = pecVar;
        Object objP = pecVar2.a;
        awox awoxVar = awox.a;
        int i2 = pecVar2.c;
        try {
            if (i2 == 0) {
                atqp.j(objP);
                if (new aihx(auvj.a.io().b().c, poz.a).contains(aierVar)) {
                    qat qatVarC = pdq.c();
                    qatVarC.b = new pdv(aierVar);
                    qatVarC.f(false);
                    return qatVarC.d();
                }
                pep pepVar = this.c;
                plxVar2.getClass();
                aierVar.getClass();
                aieuVar.getClass();
                try {
                    aihf aihfVarCreateBuilder = aibm.a.createBuilder();
                    aihfVarCreateBuilder.getClass();
                    aihf aihfVarCreateBuilder2 = aibl.a.createBuilder();
                    aihfVarCreateBuilder2.getClass();
                    String str = pepVar.a.b;
                    if (str != null) {
                        aewp.s(Long.parseLong(str), aihfVarCreateBuilder2);
                    }
                    aewp.r(pepVar.b.c(), aihfVarCreateBuilder2);
                    aewp.u(aewp.q(aihfVarCreateBuilder2), aihfVarCreateBuilder);
                    aibm aibmVarT = aewp.t(aihfVarCreateBuilder);
                    aihf aihfVarCreateBuilder3 = aibg.a.createBuilder();
                    aihfVarCreateBuilder3.getClass();
                    pls plsVar = pepVar.a;
                    String str2 = plsVar.a;
                    str2.getClass();
                    aihfVarCreateBuilder3.copyOnWrite();
                    aibg aibgVar2 = (aibg) aihfVarCreateBuilder3.instance;
                    aibgVar2.b |= 2;
                    aibgVar2.d = str2;
                    aiby aibyVarB = pepVar.d.b(plxVar2);
                    aihfVarCreateBuilder3.copyOnWrite();
                    aibg aibgVar3 = (aibg) aihfVarCreateBuilder3.instance;
                    aibgVar3.e = aibyVarB;
                    aibgVar3.b |= 4;
                    awou awouVar = pepVar.i;
                    aibw aibwVar = (aibw) awqx.l(awouVar, new gmc(pepVar, plxVar2, (awoq) null, 15));
                    aibwVar.getClass();
                    aihfVarCreateBuilder3.copyOnWrite();
                    aibg aibgVar4 = (aibg) aihfVarCreateBuilder3.instance;
                    aibgVar4.g = aibwVar;
                    aibgVar4.b |= 8;
                    aihfVarCreateBuilder3.copyOnWrite();
                    aibg aibgVar5 = (aibg) aihfVarCreateBuilder3.instance;
                    aibgVar5.c = aierVar.p;
                    aibgVar5.b |= 1;
                    aihfVarCreateBuilder3.copyOnWrite();
                    aibg aibgVar6 = (aibg) aihfVarCreateBuilder3.instance;
                    aibgVar6.h = aibmVarT;
                    aibgVar6.b |= 16;
                    aihfVarCreateBuilder3.copyOnWrite();
                    aibg aibgVar7 = (aibg) aihfVarCreateBuilder3.instance;
                    aibgVar7.i = aieuVar;
                    aibgVar7.b |= 32;
                    pwf pwfVar = pepVar.h;
                    String packageName = pepVar.g.getPackageName();
                    qtf qtfVar = (qtf) pwfVar.k.io();
                    Boolean bool = Boolean.FALSE;
                    qtfVar.b(1L, packageName, str2, bool, bool);
                    omm ommVar = pepVar.j;
                    Object objL = awqx.l(ommVar.b, new dnz(ommVar, (awoq) null, 12));
                    objL.getClass();
                    String str3 = (String) objL;
                    if (str3.length() > 0) {
                        aewp.v(str3, aihfVarCreateBuilder3);
                    } else {
                        String str4 = plxVar2.n;
                        if (str4 != null) {
                            aewp.v(str4, aihfVarCreateBuilder3);
                        }
                    }
                    List list = (List) awqx.l(awouVar, new gmc(pepVar, plxVar2, (awoq) null, 16, (byte[]) null));
                    if (list != null) {
                        List listUnmodifiableList = DesugarCollections.unmodifiableList(((aibg) aihfVarCreateBuilder3.instance).f);
                        listUnmodifiableList.getClass();
                        new aikl(listUnmodifiableList);
                        aihfVarCreateBuilder3.copyOnWrite();
                        aibg aibgVar8 = (aibg) aihfVarCreateBuilder3.instance;
                        aiie aiieVar = aibgVar8.f;
                        if (!aiieVar.c()) {
                            aibgVar8.f = aihn.mutableCopy(aiieVar);
                        }
                        aifs.addAll(list, aibgVar8.f);
                    }
                    Integer num = plsVar.i;
                    if (num != null) {
                        int i3 = awtl.b;
                        num.intValue();
                        int iD = (int) awtl.d(awrc.i(90, awtn.DAYS));
                        aihfVarCreateBuilder3.copyOnWrite();
                        aibg aibgVar9 = (aibg) aihfVarCreateBuilder3.instance;
                        aibgVar9.b |= SemanticState.Focused;
                        aibgVar9.k = iD;
                    }
                    aihn aihnVarBuild = aihfVarCreateBuilder3.build();
                    aihnVarBuild.getClass();
                    aibg aibgVar10 = (aibg) aihnVarBuild;
                    kjc kjcVar = this.j;
                    pecVar2.e = plxVar2;
                    pecVar2.d = aibgVar10;
                    pecVar2.c = 1;
                    Object obj = kjcVar.a;
                    aibh aibhVar = aibh.a;
                    aibhVar.getClass();
                    qbf qbfVar = (qbf) obj;
                    objP = awro.p(qbfVar.t, new pqd(qbfVar, "/v1/storetarget", plxVar2, aibgVar10, aibhVar, awnp.a, (awoq) null, 2), pecVar2);
                    if (objP == awoxVar) {
                        return awoxVar;
                    }
                    aibgVar = aibgVar10;
                } catch (pqh e) {
                    paw pawVarA = pepVar.f.a(ahyy.FAILED_TO_GET_IID);
                    pawVarA.f(plxVar2);
                    pawVarA.a();
                    throw e;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aibgVar = pecVar2.d;
                plxVar2 = pecVar2.e;
                atqp.j(objP);
            }
            qau qauVar = (qau) objP;
            l(plxVar2, qauVar, ahyy.FAILED_TO_REGISTER);
            return pdq.a(aibgVar, qauVar);
        } catch (pqh e2) {
            qat qatVarC2 = pdq.c();
            qatVarC2.b = e2;
            qatVarC2.f(true);
            return qatVarC2.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.pdr
    public final Object g(String str, aiff aiffVar, awoq awoqVar) throws Throwable {
        pef pefVar;
        aibi aibiVar;
        if (awoqVar instanceof pef) {
            pefVar = (pef) awoqVar;
            int i = pefVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pefVar.c = i - Integer.MIN_VALUE;
            } else {
                pefVar = new pef(this, awoqVar);
            }
        } else {
            pefVar = new pef(this, awoqVar);
        }
        pef pefVar2 = pefVar;
        Object objP = pefVar2.a;
        awox awoxVar = awox.a;
        int i2 = pefVar2.c;
        if (i2 == 0) {
            atqp.j(objP);
            aihf aihfVarCreateBuilder = aibi.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            str.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            aibi aibiVar2 = (aibi) aihfVarCreateBuilder.instance;
            aibiVar2.b |= 1;
            aibiVar2.c = str;
            aiffVar.getClass();
            aihfVarCreateBuilder.copyOnWrite();
            aibi aibiVar3 = (aibi) aihfVarCreateBuilder.instance;
            aibiVar3.d = aiffVar;
            aibiVar3.b |= 2;
            aihn aihnVarBuild = aihfVarCreateBuilder.build();
            aihnVarBuild.getClass();
            kjc kjcVar = this.j;
            aibi aibiVar4 = (aibi) aihnVarBuild;
            pefVar2.d = aibiVar4;
            pefVar2.c = 1;
            aibj aibjVar = aibj.a;
            aibjVar.getClass();
            qbf qbfVar = (qbf) kjcVar.a;
            objP = awro.p(qbfVar.t, new pqd(qbfVar, "/v1/updatethreadstatebytoken", (plx) null, aibiVar4, aibjVar, awnp.a, (awoq) null, 2), pefVar2);
            if (objP == awoxVar) {
                return awoxVar;
            }
            aibiVar = aibiVar4;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aibiVar = pefVar2.d;
            atqp.j(objP);
        }
        qau qauVar = (qau) objP;
        l(null, qauVar, ahyy.FAILED_TO_UPDATE_THREAD_STATE_BY_TOKEN);
        return pdq.a(aibiVar, qauVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(qau qauVar, plx plxVar, awoq awoqVar) throws Throwable {
        ped pedVar;
        qat qatVarB;
        Object obj;
        qat qatVar;
        if (awoqVar instanceof ped) {
            pedVar = (ped) awoqVar;
            int i = pedVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pedVar.c = i - Integer.MIN_VALUE;
            } else {
                pedVar = new ped(this, awoqVar);
            }
        } else {
            pedVar = new ped(this, awoqVar);
        }
        Object obj2 = pedVar.a;
        Object obj3 = awox.a;
        int i2 = pedVar.c;
        if (i2 == 0) {
            atqp.j(obj2);
            qatVarB = qau.b();
            if (qauVar.a()) {
                qatVarB.b = qauVar.c;
                qatVarB.c = qauVar.a;
                qatVarB.c(qauVar.d);
                qatVarB.b(qauVar.e);
            } else {
                aiav aiavVar = (aiav) qauVar.b;
                pedVar.f = qauVar;
                pedVar.d = qatVarB;
                pedVar.e = qatVarB;
                pedVar.c = 1;
                Object objK = k(aiavVar, pedVar);
                if (objK == obj3) {
                    return obj3;
                }
                obj = objK;
                qatVar = qatVarB;
            }
            return qatVarB.a();
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qatVar = pedVar.e;
        qat qatVar2 = pedVar.d;
        qau qauVar2 = pedVar.f;
        atqp.j(obj2);
        qatVarB = qatVar2;
        qauVar = qauVar2;
        obj = obj2;
        qatVar.a = (MessageLite) obj;
        qatVar.c = qauVar.a;
        return qatVarB.a();
    }

    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object i(plx plxVar, long j, aidy aidyVar, aieu aieuVar, awoq awoqVar) throws Throwable {
        pdx pdxVar;
        aiau aiauVar;
        plx plxVar2;
        aiau aiauVar2;
        if (awoqVar instanceof pdx) {
            pdxVar = (pdx) awoqVar;
            int i = pdxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pdxVar.c = i - Integer.MIN_VALUE;
            } else {
                pdxVar = new pdx(this, awoqVar);
            }
        } else {
            pdxVar = new pdx(this, awoqVar);
        }
        pdx pdxVar2 = pdxVar;
        Object objU = pdxVar2.a;
        awox awoxVar = awox.a;
        int i2 = pdxVar2.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    plxVar = pdxVar2.e;
                    atqp.j(objU);
                    aiauVar = (aiau) objU;
                    plxVar2 = plxVar;
                    aiauVar2 = aiauVar;
                    kjc kjcVar = this.j;
                    pdxVar2.e = plxVar2;
                    pdxVar2.d = aiauVar2;
                    pdxVar2.c = 3;
                    objU = kjcVar.G(plxVar2, aiauVar2, pdxVar2);
                    if (objU == awoxVar) {
                        return awoxVar;
                    }
                } else if (i2 == 2) {
                    plxVar = pdxVar2.e;
                    atqp.j(objU);
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aiauVar2 = pdxVar2.d;
                    plxVar2 = pdxVar2.e;
                    atqp.j(objU);
                }
                qau qauVar = (qau) objU;
                l(plxVar2, qauVar, ahyy.FAILED_TO_FETCH_LATEST_NOTIFICATIONS);
                return pdq.a(aiauVar2, qauVar);
            }
            atqp.j(objU);
            isi isiVar = this.i;
            pdxVar2.e = plxVar;
            pdxVar2.c = 2;
            objU = isiVar.u(plxVar, j, aidyVar, aieuVar, pdxVar2);
            if (objU == awoxVar) {
                return awoxVar;
            }
            aiauVar = (aiau) objU;
            plxVar2 = plxVar;
            aiauVar2 = aiauVar;
            kjc kjcVar2 = this.j;
            pdxVar2.e = plxVar2;
            pdxVar2.d = aiauVar2;
            pdxVar2.c = 3;
            objU = kjcVar2.G(plxVar2, aiauVar2, pdxVar2);
            if (objU == awoxVar) {
                return awoxVar;
            }
            qau qauVar2 = (qau) objU;
            l(plxVar2, qauVar2, ahyy.FAILED_TO_FETCH_LATEST_NOTIFICATIONS);
            return pdq.a(aiauVar2, qauVar2);
        } catch (pqh e) {
            qat qatVarC = pdq.c();
            qatVarC.b = e;
            qatVarC.f(true);
            return qatVarC.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(aiav aiavVar, awoq awoqVar) throws Throwable {
        pdz pdzVar;
        Exception e;
        pkx pkxVar;
        Object pkvVar;
        Object obj;
        if (awoqVar instanceof pdz) {
            pdzVar = (pdz) awoqVar;
            int i = pdzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pdzVar.c = i - Integer.MIN_VALUE;
            } else {
                pdzVar = new pdz(this, awoqVar);
            }
        } else {
            pdzVar = new pdz(this, awoqVar);
        }
        Object obj2 = pdzVar.a;
        awox awoxVar = awox.a;
        int i2 = pdzVar.c;
        if (i2 == 0) {
            atqp.j(obj2);
            if (aiavVar.c.isEmpty()) {
                aiie aiieVar = aiavVar.b;
                aiieVar.getClass();
                return aiieVar;
            }
            agev agevVar = (agev) ((aupo) this.e).b;
            if (!agevVar.g()) {
                ((agsj) a.c()).t("FetchEncryptionHandler is not present");
                aiie aiieVar2 = aiavVar.b;
                aiieVar2.getClass();
                return aiieVar2;
            }
            pkx pkxVar2 = pkx.b;
            try {
                pom pomVar = (pom) agevVar.c();
                aiavVar.b.getClass();
                aiavVar.c.getClass();
                pdzVar.d = aiavVar;
                pdzVar.e = pkxVar2;
                pdzVar.c = 1;
                Object objA = pomVar.a();
                if (objA == awoxVar) {
                    return awoxVar;
                }
                obj2 = objA;
                pkxVar = pkxVar2;
            } catch (Exception e2) {
                e = e2;
                pkxVar = pkxVar2;
                awro.A(pdzVar.getContext());
                pkvVar = new pkv(e, pkxVar);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pkxVar = pdzVar.e;
            aiavVar = pdzVar.d;
            try {
                atqp.j(obj2);
            } catch (Exception e3) {
                e = e3;
                awro.A(pdzVar.getContext());
                pkvVar = new pkv(e, pkxVar);
            }
        }
        pkvVar = new pla(obj2);
        int iD = a.D(pkvVar);
        if (iD == 0) {
            obj = ((pla) pkvVar).a;
        } else {
            if (iD != 1) {
                throw new awmj();
            }
            ((agsj) ((agsj) a.c()).j(((pku) pkvVar).b())).t("decryptAndMergeFrontendNotificationThreadLists Failed");
            obj = aiavVar.b;
            obj.getClass();
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(aiav aiavVar, awoq awoqVar) throws Throwable {
        pee peeVar;
        axst axstVar;
        axst axstVar2;
        aikl aiklVar;
        if (awoqVar instanceof pee) {
            peeVar = (pee) awoqVar;
            int i = peeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                peeVar.c = i - Integer.MIN_VALUE;
            } else {
                peeVar = new pee(this, awoqVar);
            }
        } else {
            peeVar = new pee(this, awoqVar);
        }
        Object obj = peeVar.a;
        Object obj2 = awox.a;
        int i2 = peeVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            if (aiavVar == null) {
                return aewp.M(aiax.a.createBuilder()).r();
            }
            axst axstVarM = aewp.M(aiax.a.createBuilder());
            Object obj3 = axstVarM.a;
            long j = aiavVar.d;
            aihf aihfVar = (aihf) obj3;
            aihfVar.copyOnWrite();
            aiax aiaxVar = (aiax) aihfVar.instance;
            aiaxVar.b |= 1;
            aiaxVar.d = j;
            List listUnmodifiableList = DesugarCollections.unmodifiableList(aiaxVar.c);
            listUnmodifiableList.getClass();
            aikl aiklVar2 = new aikl(listUnmodifiableList);
            peeVar.e = axstVarM;
            peeVar.f = axstVarM;
            peeVar.d = aiklVar2;
            peeVar.c = 1;
            Object objJ = j(aiavVar, peeVar);
            if (objJ == obj2) {
                return obj2;
            }
            axstVar = axstVarM;
            axstVar2 = axstVar;
            obj = objJ;
            aiklVar = aiklVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aiklVar = peeVar.d;
            axstVar = peeVar.f;
            axstVar2 = peeVar.e;
            atqp.j(obj);
        }
        List listAm = atqq.am((Iterable) obj, new awv(19));
        aiklVar.getClass();
        aihf aihfVar2 = (aihf) axstVar.a;
        aihfVar2.copyOnWrite();
        aiax aiaxVar2 = (aiax) aihfVar2.instance;
        aiax aiaxVar3 = aiax.a;
        aiie aiieVar = aiaxVar2.c;
        if (!aiieVar.c()) {
            aiaxVar2.c = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(listAm, aiaxVar2.c);
        return axstVar2.r();
    }
}
