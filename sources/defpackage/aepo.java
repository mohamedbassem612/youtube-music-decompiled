package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aepo implements tfx {
    private final awmd b;
    private final awmd c;
    private final awmd d;
    private final mbc e;
    private final agfr f;
    private final Set g = DesugarCollections.synchronizedSet(new HashSet());
    private final tqj h;

    public aepo(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, mbc mbcVar, vxz vxzVar, awmd awmdVar4, tqj tqjVar) {
        this.b = awmdVar;
        this.c = awmdVar2;
        this.d = awmdVar3;
        this.e = mbcVar;
        this.f = aguu.al(new jxq(awmdVar4, vxzVar, 20, null));
        this.h = tqjVar;
    }

    @Override // defpackage.tfx
    public final void a(tfv tfvVar) {
        boolean zA;
        boolean z;
        xgt xgtVarA;
        int iIntValue;
        tao taoVar = (tao) this.c.io();
        Collection collection = tfvVar.k;
        if (collection == null) {
            zA = ((zyv) this.f.io()).a();
            break;
        }
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                zA = ((zyv) this.f.io()).a();
                break;
            }
            Object next = it.next();
            if (next instanceof wlv) {
                wlv wlvVar = (wlv) next;
                if (wlvVar != wlv.a) {
                    if (wlvVar == wlv.b) {
                        zA = true;
                        break;
                    }
                } else {
                    zA = false;
                    break;
                }
            }
        }
        aqiy aqiyVar = taoVar.e().e;
        if (aqiyVar == null) {
            aqiyVar = aqiy.a;
        }
        int i = tfvVar.n;
        boolean z2 = aqiyVar.o;
        if (zA) {
            z = i == 0;
        } else {
            if (!z2) {
                return;
            }
            z = i == 0;
            if (i == 0) {
                return;
            }
        }
        Long l = tfvVar.e;
        String str = tfvVar.a;
        qhy qhyVar = new qhy(null, str, false, l == null ? this.e.f().toEpochMilli() : l.longValue());
        String str2 = tfvVar.i;
        if (str2 != null) {
            qhyVar.i = str2;
        }
        String str3 = tfvVar.b;
        if (str3 != null) {
            qhyVar.b(str3);
        }
        Long l2 = tfvVar.c;
        int iIntValue2 = l2 != null ? l2.intValue() : 0;
        Long l3 = tfvVar.d;
        qhyVar.a(iIntValue2, l3 != null ? l3.intValue() : 0);
        Integer num = tfvVar.h;
        if (num != null && (iIntValue = num.intValue()) >= 0) {
            qhyVar.j = iIntValue;
        }
        Long l4 = tfvVar.f;
        if (l4 != null) {
            qhyVar.b = l4.longValue();
        }
        Long l5 = tfvVar.g;
        if (l5 != null) {
            qhyVar.c = l5.longValue();
        }
        int i2 = tfvVar.m;
        if (i2 != 0) {
            qhyVar.v = i2;
        }
        if (true != z) {
            qhyVar.u = i;
        }
        Integer num2 = tfvVar.j;
        if (num2 != null) {
            num2.intValue();
            qhyVar.n = num2;
        }
        axgi axgiVar = axgi.a;
        aihf aihfVarCreateBuilder = axgiVar.createBuilder();
        aqiy aqiyVar2 = taoVar.e().e;
        if (aqiyVar2 == null) {
            aqiyVar2 = aqiy.a;
        }
        if (aqiyVar2.j && (xgtVarA = ((xgv) this.b.io()).a()) != null) {
            int i3 = xgtVarA.b().a;
            aihfVarCreateBuilder.copyOnWrite();
            axgi axgiVar2 = (axgi) aihfVarCreateBuilder.instance;
            axgiVar2.b |= 2097152;
            axgiVar2.y = i3;
        }
        Integer num3 = tfvVar.l;
        if (num3 != null) {
            int iIntValue3 = num3.intValue();
            aihfVarCreateBuilder.copyOnWrite();
            axgi axgiVar3 = (axgi) aihfVarCreateBuilder.instance;
            axgiVar3.b |= 67108864;
            axgiVar3.E = iIntValue3;
        }
        if (zA) {
            aihfVarCreateBuilder.copyOnWrite();
            axgi axgiVar4 = (axgi) aihfVarCreateBuilder.instance;
            axgiVar4.z = 1;
            axgiVar4.b |= 4194304;
        } else {
            aihfVarCreateBuilder.copyOnWrite();
            axgi axgiVar5 = (axgi) aihfVarCreateBuilder.instance;
            axgiVar5.z = 2;
            axgiVar5.b |= 4194304;
        }
        if (collection != null && !collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof wla) {
                    wla wlaVar = (wla) obj;
                    qhyVar.p = wlaVar.x;
                    long j = wlaVar.a;
                    aihfVarCreateBuilder.copyOnWrite();
                    axgi axgiVar6 = (axgi) aihfVarCreateBuilder.instance;
                    axgiVar6.b |= 1;
                    axgiVar6.c = j;
                    int i4 = wlaVar.w;
                    aihfVarCreateBuilder.copyOnWrite();
                    axgi axgiVar7 = (axgi) aihfVarCreateBuilder.instance;
                    axgiVar7.b |= 1048576;
                    axgiVar7.w = i4;
                    agke agkeVar = wlaVar.y;
                    aihfVarCreateBuilder.copyOnWrite();
                    axgi axgiVar8 = (axgi) aihfVarCreateBuilder.instance;
                    aiie aiieVar = axgiVar8.x;
                    if (!aiieVar.c()) {
                        axgiVar8.x = aihn.mutableCopy(aiieVar);
                    }
                    aifs.addAll(agkeVar, axgiVar8.x);
                    int i5 = wlaVar.d;
                    aihfVarCreateBuilder.copyOnWrite();
                    axgi axgiVar9 = (axgi) aihfVarCreateBuilder.instance;
                    axgiVar9.b |= 8;
                    axgiVar9.f = i5;
                    int i6 = wlaVar.c;
                    aihfVarCreateBuilder.copyOnWrite();
                    axgi axgiVar10 = (axgi) aihfVarCreateBuilder.instance;
                    axgiVar10.b |= 4;
                    axgiVar10.e = i6;
                    agke agkeVar2 = wlaVar.C;
                    aihfVarCreateBuilder.copyOnWrite();
                    axgi axgiVar11 = (axgi) aihfVarCreateBuilder.instance;
                    aiie aiieVar2 = axgiVar11.H;
                    if (!aiieVar2.c()) {
                        axgiVar11.H = aihn.mutableCopy(aiieVar2);
                    }
                    aifs.addAll(agkeVar2, axgiVar11.H);
                    if (wlaVar.e) {
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar12 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar12.b |= 16;
                        axgiVar12.g = true;
                    }
                    if (wlaVar.v) {
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar13 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar13.b |= 33554432;
                        axgiVar13.D = true;
                    }
                    if (wlaVar.f) {
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar14 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar14.b |= 524288;
                        axgiVar14.v = true;
                        int i7 = wlaVar.g;
                        if (i7 > 0) {
                            aihfVarCreateBuilder.copyOnWrite();
                            axgi axgiVar15 = (axgi) aihfVarCreateBuilder.instance;
                            axgiVar15.b |= 32;
                            axgiVar15.h = i7;
                        }
                        int i8 = wlaVar.n;
                        if (i8 > 0) {
                            int i9 = wlaVar.b;
                            aihfVarCreateBuilder.copyOnWrite();
                            axgi axgiVar16 = (axgi) aihfVarCreateBuilder.instance;
                            axgiVar16.b |= 2;
                            axgiVar16.d = i9;
                            aihfVarCreateBuilder.copyOnWrite();
                            axgi axgiVar17 = (axgi) aihfVarCreateBuilder.instance;
                            axgiVar17.b |= SemanticState.LiveRegion;
                            axgiVar17.l = i8;
                            int i10 = wlaVar.p;
                            if (i10 != 0) {
                                int i11 = wlaVar.i;
                                aihfVarCreateBuilder.copyOnWrite();
                                axgi axgiVar18 = (axgi) aihfVarCreateBuilder.instance;
                                axgiVar18.b |= SemanticState.Focused;
                                axgiVar18.j = i11;
                                aihfVarCreateBuilder.copyOnWrite();
                                axgi axgiVar19 = (axgi) aihfVarCreateBuilder.instance;
                                axgiVar19.b |= SemanticState.Modal;
                                axgiVar19.n = i10;
                                int i12 = wlaVar.r;
                                aihfVarCreateBuilder.copyOnWrite();
                                axgi axgiVar20 = (axgi) aihfVarCreateBuilder.instance;
                                axgiVar20.b |= 16384;
                                axgiVar20.q = i12;
                                int i13 = wlaVar.k;
                                if (i13 > 0) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    axgi axgiVar21 = (axgi) aihfVarCreateBuilder.instance;
                                    axgiVar21.b |= 65536;
                                    axgiVar21.s = i13;
                                    int i14 = wlaVar.l;
                                    if (i14 > 0) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        axgi axgiVar22 = (axgi) aihfVarCreateBuilder.instance;
                                        axgiVar22.b |= 131072;
                                        axgiVar22.t = i14;
                                    }
                                    int i15 = wlaVar.m;
                                    if (i15 > 0) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        axgi axgiVar23 = (axgi) aihfVarCreateBuilder.instance;
                                        axgiVar23.b |= 262144;
                                        axgiVar23.u = i15;
                                    }
                                }
                            }
                            int i16 = wlaVar.o;
                            if (i16 != 0) {
                                int i17 = wlaVar.h;
                                aihfVarCreateBuilder.copyOnWrite();
                                axgi axgiVar24 = (axgi) aihfVarCreateBuilder.instance;
                                axgiVar24.b |= 64;
                                axgiVar24.i = i17;
                                aihfVarCreateBuilder.copyOnWrite();
                                axgi axgiVar25 = (axgi) aihfVarCreateBuilder.instance;
                                axgiVar25.b |= SemanticState.ReadOnly;
                                axgiVar25.m = i16;
                                int i18 = wlaVar.s;
                                aihfVarCreateBuilder.copyOnWrite();
                                axgi axgiVar26 = (axgi) aihfVarCreateBuilder.instance;
                                axgiVar26.b |= SemanticState.Multiline;
                                axgiVar26.p = i18;
                            }
                            int i19 = wlaVar.q;
                            if (i19 != 0) {
                                int i20 = wlaVar.j;
                                aihfVarCreateBuilder.copyOnWrite();
                                axgi axgiVar27 = (axgi) aihfVarCreateBuilder.instance;
                                axgiVar27.b |= SemanticState.Hidden;
                                axgiVar27.k = i20;
                                aihfVarCreateBuilder.copyOnWrite();
                                axgi axgiVar28 = (axgi) aihfVarCreateBuilder.instance;
                                axgiVar28.b |= SemanticState.Obscured;
                                axgiVar28.o = i19;
                                int i21 = wlaVar.t;
                                aihfVarCreateBuilder.copyOnWrite();
                                axgi axgiVar29 = (axgi) aihfVarCreateBuilder.instance;
                                axgiVar29.b |= 32768;
                                axgiVar29.r = i21;
                            }
                        }
                    }
                    wly wlyVar = wlaVar.z;
                    if (wlyVar != null) {
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar30 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar30.b |= 8388608;
                        axgiVar30.A = wlyVar.a;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar31 = (axgi) aihfVarCreateBuilder.instance;
                        aiie aiieVar3 = axgiVar31.B;
                        if (!aiieVar3.c()) {
                            axgiVar31.B = aihn.mutableCopy(aiieVar3);
                        }
                        aifs.addAll(wlyVar.b, axgiVar31.B);
                    }
                    aigj aigjVar = wlaVar.B;
                    if (aigjVar != null) {
                        aihfVarCreateBuilder.copyOnWrite();
                        axgi axgiVar32 = (axgi) aihfVarCreateBuilder.instance;
                        axgiVar32.b |= 268435456;
                        axgiVar32.G = aigjVar;
                    }
                    Optional optional = wlaVar.A;
                    aihfVarCreateBuilder.getClass();
                    optional.isPresent();
                    tqj tqjVar = this.h;
                    int i22 = tqr.a;
                    if (tqjVar.k(1073828988)) {
                        int iIndexOf = str.indexOf(63);
                        if (this.g.add(iIndexOf != -1 ? str.substring(0, iIndexOf) : str)) {
                            aihfVarCreateBuilder.copyOnWrite();
                            axgi axgiVar33 = (axgi) aihfVarCreateBuilder.instance;
                            axgiVar33.b |= 134217728;
                            axgiVar33.F = true;
                        }
                    }
                }
            }
        }
        axgi axgiVar34 = (axgi) aihfVarCreateBuilder.build();
        if (!Objects.equals(axgiVar34, axgiVar)) {
            aihh aihhVar = (aihh) axgh.a.createBuilder();
            aihl aihlVar = axgl.b;
            aihf aihfVarCreateBuilder2 = axgl.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            axgl axglVar = (axgl) aihfVarCreateBuilder2.instance;
            axgiVar34.getClass();
            axglVar.d = axgiVar34;
            axglVar.c |= 1;
            aihhVar.e(aihlVar, (axgl) aihfVarCreateBuilder2.build());
            qhyVar.m = (axgh) aihhVar.build();
            axgiVar34.getSerializedSize();
        }
        qck.a().c(qhyVar);
    }
}
