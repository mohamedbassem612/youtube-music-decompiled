package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pbc implements paw {
    private static final agsn w = agsn.h("GnpSdk");
    private static final List x = atqq.aL(new ahzv[]{ahzv.SHOWN, ahzv.SHOWN_REPLACED, ahzv.SHOWN_FORCED});
    private final pun A;
    private final pds B;
    private final awut C;
    private plx F;
    private String G;
    private String H;
    private String I;
    private ahyr J;
    private Long K;
    private final Long L;
    private Long M;
    private final int O;
    public final pav a;
    public final ahzv b;
    public final pgy c;
    public String d;
    public ahza f;
    public qab g;
    public String h;
    public pgv i;
    public pax k;
    public ahzt l;
    public String m;
    public pbg n;
    public boolean o;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    private final ahyy y;
    private final pls z;
    public final List e = new ArrayList();
    private final Set D = new LinkedHashSet();
    private final Set E = new LinkedHashSet();
    public final List j = new ArrayList();
    public final Set p = new LinkedHashSet();
    private final SecureRandom N = new SecureRandom();

    public pbc(pav pavVar, mbc mbcVar, ahzv ahzvVar, ahyy ahyyVar, pls plsVar, int i, pun punVar, pds pdsVar, pgy pgyVar, awut awutVar) {
        this.a = pavVar;
        this.b = ahzvVar;
        this.y = ahyyVar;
        this.z = plsVar;
        this.O = i;
        this.A = punVar;
        this.B = pdsVar;
        this.c = pgyVar;
        this.C = awutVar;
        this.K = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(mbcVar.f().toEpochMilli()));
        this.L = Long.valueOf(mbcVar.b());
    }

    public static final ahyg m(poq poqVar, boolean z) {
        int i;
        aihf aihfVarCreateBuilder = ahyg.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        pot potVar = (pot) poqVar;
        aewo.ab(potVar.a, aihfVarCreateBuilder);
        aewo.ae(potVar.c, aihfVarCreateBuilder);
        aewo.Z(potVar.e, aihfVarCreateBuilder);
        aewo.ad(potVar.i, aihfVarCreateBuilder);
        String str = potVar.n;
        if (str != null) {
            aewo.ac(str, aihfVarCreateBuilder);
        }
        if (z) {
            int i2 = 1;
            int i3 = potVar.B - 1;
            if (i3 == 0) {
                i = 1;
            } else if (i3 == 1) {
                i = 2;
            } else {
                if (i3 != 4) {
                    throw new awmj();
                }
                i = 3;
            }
            aihfVarCreateBuilder.copyOnWrite();
            ahyg ahygVar = (ahyg) aihfVarCreateBuilder.instance;
            ahygVar.h = i - 1;
            ahygVar.b |= 32;
            int i4 = potVar.z - 1;
            if (i4 != 0) {
                i2 = i4 != 1 ? 3 : 2;
            }
            aihfVarCreateBuilder.copyOnWrite();
            ahyg ahygVar2 = (ahyg) aihfVarCreateBuilder.instance;
            ahygVar2.i = i2 - 1;
            ahygVar2.b |= 64;
        }
        return aewo.X(aihfVarCreateBuilder);
    }

    private final void n(Boolean bool, ahyi ahyiVar) {
        if (awrc.c(bool, Boolean.TRUE)) {
            this.E.add(ahyiVar);
        } else if (awrc.c(bool, Boolean.FALSE)) {
            this.D.add(ahyiVar);
        }
    }

    @Override // defpackage.paw
    public final void a() {
        awro.t(this.C, null, 0, new paz(this, null), 3);
    }

    @Override // defpackage.paw
    public final void b(pot potVar) {
        potVar.getClass();
        aihf builder = m(potVar, false).toBuilder();
        builder.getClass();
        aewo.aa(potVar.q, builder);
        aidc aidcVar = potVar.o.o;
        if (aidcVar == null) {
            aidcVar = aidc.a;
        }
        List list = this.j;
        String str = aidcVar.b;
        str.getClass();
        aewo.Y(str, builder);
        list.add(aewo.X(builder));
        this.p.addAll(potVar.k);
    }

    @Override // defpackage.paw
    public final void c(List list) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((pot) it.next());
        }
    }

    @Override // defpackage.paw
    public final void d(ahyr ahyrVar) {
        ahyrVar.getClass();
        this.J = ahyrVar;
    }

    @Override // defpackage.paw
    public final void e(pzp pzpVar) {
        n(pzpVar.a, ahyi.COLLAPSED_ICON);
        n(pzpVar.c, ahyi.EXPANDED_ICON);
        n(pzpVar.b, ahyi.BIG_PICTURE);
        n(pzpVar.d, ahyi.ANDROID_MESSAGING_STYLE_AVATAR);
        n(pzpVar.e, ahyi.ANDROID_MESSAGING_STYLE_IMAGES);
        n(pzpVar.f, ahyi.ANDROID_MESSAGING_STYLE_SHORTCUT_ICON);
    }

    @Override // defpackage.paw
    public final void f(plx plxVar) {
        if (plxVar != null) {
            this.F = plxVar;
            pxk pxkVarB = plxVar.b();
            Objects.checkIndex(0, 4);
            if (pxkVarB instanceof pxo) {
                this.G = plxVar.c;
                this.h = ((pxo) pxkVarB).a;
            } else if (pxkVarB instanceof pxl) {
                this.h = plxVar.d;
                this.H = ((pxl) pxkVarB).a;
                this.I = plxVar.e;
            } else if (pxkVarB instanceof pxn) {
                this.M = Long.valueOf(((pxn) pxkVarB).b);
            }
        }
    }

    @Override // defpackage.paw
    public final void g(aiec aiecVar) {
        if (aiecVar != null) {
            String str = aiecVar.e;
            str.getClass();
            if (str.length() > 0) {
                List list = this.j;
                aihf aihfVarCreateBuilder = ahyg.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                String str2 = aiecVar.e;
                str2.getClass();
                aewo.ab(str2, aihfVarCreateBuilder);
                aewo.ae(aiecVar.j, aihfVarCreateBuilder);
                aewo.Z(aiecVar.g, aihfVarCreateBuilder);
                String str3 = (aiecVar.c == 12 ? (aidq) aiecVar.d : aidq.a).n;
                str3.getClass();
                aewo.aa(str3, aihfVarCreateBuilder);
                aidc aidcVar = (aiecVar.c == 12 ? (aidq) aiecVar.d : aidq.a).o;
                if (aidcVar == null) {
                    aidcVar = aidc.a;
                }
                String str4 = aidcVar.b;
                str4.getClass();
                aewo.Y(str4, aihfVarCreateBuilder);
                aigj aigjVar = aiecVar.t;
                aigjVar.getClass();
                aewo.ad(aigjVar, aihfVarCreateBuilder);
                String str5 = aiecVar.f;
                str5.getClass();
                if (str5.length() > 0) {
                    String str6 = aiecVar.f;
                    str6.getClass();
                    aewo.ac(str6, aihfVarCreateBuilder);
                }
                list.add(aewo.X(aihfVarCreateBuilder));
            }
        }
        if (aiecVar != null) {
            Set set = this.p;
            aihv aihvVar = aiecVar.u;
            aihvVar.getClass();
            set.addAll(aihvVar);
        }
    }

    @Override // defpackage.paw
    public final void h(List list) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g((aiec) it.next());
        }
    }

    @Override // defpackage.paw
    public final void i(long j) {
        this.K = Long.valueOf(j);
    }

    @Override // defpackage.paw
    public final void j(List list) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aicb aicbVar = (aicb) it.next();
            List list2 = this.j;
            aihf aihfVarCreateBuilder = ahyg.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            String str = aicbVar.c;
            str.getClass();
            aewo.ab(str, aihfVarCreateBuilder);
            aewo.ae(aicbVar.d, aihfVarCreateBuilder);
            aewo.Z(aicbVar.e, aihfVarCreateBuilder);
            aigj aigjVar = aicbVar.f;
            aigjVar.getClass();
            aewo.ad(aigjVar, aihfVarCreateBuilder);
            list2.add(aewo.X(aihfVarCreateBuilder));
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:56:0x0106  */
    /* JADX WARN: Code duplicated, block: B:64:0x0123  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(awoq awoqVar) throws Throwable {
        pba pbaVar;
        axst axstVarAv;
        axst axstVar;
        axst axstVar2;
        ahzs ahzsVar;
        plx plxVar;
        pxk pxkVarB;
        axst axstVar3;
        axst axstVar4;
        axst axstVar5;
        Long l;
        ahyr ahyrVar;
        String str;
        String str2;
        String str3;
        Long l2;
        pax paxVar;
        ahzv ahzvVar;
        if (awoqVar instanceof pba) {
            pbaVar = (pba) awoqVar;
            int i = pbaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbaVar.c = i - Integer.MIN_VALUE;
            } else {
                pbaVar = new pba(this, awoqVar);
            }
        } else {
            pbaVar = new pba(this, awoqVar);
        }
        Object objD = pbaVar.a;
        awox awoxVar = awox.a;
        int i2 = pbaVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                axstVarAv = pbaVar.f;
                axstVar = pbaVar.e;
                axstVar2 = pbaVar.d;
                atqp.j(objD);
                ahzsVar = (ahzs) objD;
                axstVarAv.W(ahzsVar);
                pds pdsVar = this.B;
                plxVar = this.F;
                if (plxVar != null) {
                    pxkVarB = plxVar.b();
                } else {
                    pxkVarB = null;
                }
                ahzv ahzvVar2 = this.b;
                pbaVar.d = axstVar2;
                pbaVar.e = axstVar;
                pbaVar.f = axstVar;
                pbaVar.c = 3;
                objD = pdsVar.b(pxkVarB, ahzvVar2, pbaVar);
                if (objD != awoxVar) {
                    return awoxVar;
                }
                axstVar3 = axstVar;
                axstVar4 = axstVar3;
                axstVar5 = axstVar2;
            } else if (i2 == 2) {
                axstVarAv = pbaVar.f;
                axstVar = pbaVar.e;
                axstVar2 = pbaVar.d;
                atqp.j(objD);
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                axstVar3 = pbaVar.f;
                axstVar4 = pbaVar.e;
                axstVar5 = pbaVar.d;
                atqp.j(objD);
            }
            axstVar3.U((ahzn) objD);
            l = this.K;
            if (l != null) {
                axstVar4.R(l.longValue());
            }
            ahyrVar = this.J;
            if (ahyrVar != null) {
                aihf aihfVarCreateBuilder = ahyp.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                aewo.O(ahyrVar, aihfVarCreateBuilder);
                axstVar4.O(aewo.N(aihfVarCreateBuilder));
            }
            str = this.G;
            if (str != null && str.length() != 0) {
                axstVar4.S(str);
            }
            str2 = this.H;
            if (str2 != null && str2.length() != 0) {
                axstVar4.T(str2);
            }
            str3 = this.I;
            if (str3 != null && str3.length() != 0) {
                axstVar4.S(str3);
            }
            l2 = this.M;
            if (l2 != null) {
                axstVar4.P(l2.longValue());
            }
            paxVar = this.k;
            if (paxVar != null) {
                axstVar4.N(paxVar.a.longValue());
                ahzvVar = this.b;
                if (ahzvVar != ahzv.SHOWN || ahzvVar == ahzv.SHOWN_REPLACED || ahzvVar == ahzv.REMOVED || this.y == ahyy.DROPPED_BY_CLIENT) {
                    aihf aihfVarCreateBuilder2 = ahyv.a.createBuilder();
                    aihfVarCreateBuilder2.getClass();
                    aewo.G(this.L.longValue() - paxVar.b.longValue(), aihfVarCreateBuilder2);
                    Long l3 = paxVar.c;
                    l3.getClass();
                    aewo.B(l3.longValue(), aihfVarCreateBuilder2);
                    Long l4 = paxVar.d;
                    l4.getClass();
                    aewo.F(l4.longValue(), aihfVarCreateBuilder2);
                    Long l5 = paxVar.e;
                    l5.getClass();
                    aewo.A(l5.longValue(), aihfVarCreateBuilder2);
                    Long l6 = paxVar.f;
                    l6.getClass();
                    aewo.C(l6.longValue(), aihfVarCreateBuilder2);
                    Long l7 = paxVar.g;
                    l7.getClass();
                    aewo.D(l7.longValue(), aihfVarCreateBuilder2);
                    Long l8 = paxVar.h;
                    l8.getClass();
                    aewo.E(l8.longValue(), aihfVarCreateBuilder2);
                    aewo.H(paxVar.i, aihfVarCreateBuilder2);
                    axstVar4.Q(aewo.z(aihfVarCreateBuilder2));
                }
            }
            axstVar4.V(String.valueOf(this.N.nextInt(1000000000)));
            return axstVar5.L();
        }
        atqp.j(objD);
        axstVarAv = aewo.av(ahyh.a.createBuilder());
        axstVarAv.Y();
        axstVarAv.X(this.j);
        String str4 = this.z.a;
        str4.getClass();
        axstVarAv.M(str4);
        pun punVar = this.A;
        plx plxVar2 = this.F;
        pbaVar.d = axstVarAv;
        pbaVar.e = axstVarAv;
        pbaVar.f = axstVarAv;
        pbaVar.c = 2;
        objD = punVar.d(plxVar2, pbaVar);
        if (objD == awoxVar) {
            return awoxVar;
        }
        axstVar = axstVarAv;
        axstVar2 = axstVar;
        ahzsVar = (ahzs) objD;
        axstVarAv.W(ahzsVar);
        pds pdsVar2 = this.B;
        plxVar = this.F;
        if (plxVar != null) {
            pxkVarB = plxVar.b();
        } else {
            pxkVarB = null;
        }
        ahzv ahzvVar3 = this.b;
        pbaVar.d = axstVar2;
        pbaVar.e = axstVar;
        pbaVar.f = axstVar;
        pbaVar.c = 3;
        objD = pdsVar2.b(pxkVarB, ahzvVar3, pbaVar);
        if (objD != awoxVar) {
            return awoxVar;
        }
        axstVar3 = axstVar;
        axstVar4 = axstVar3;
        axstVar5 = axstVar2;
        axstVar3.U((ahzn) objD);
        l = this.K;
        if (l != null) {
            axstVar4.R(l.longValue());
        }
        ahyrVar = this.J;
        if (ahyrVar != null) {
            aihf aihfVarCreateBuilder3 = ahyp.a.createBuilder();
            aihfVarCreateBuilder3.getClass();
            aewo.O(ahyrVar, aihfVarCreateBuilder3);
            axstVar4.O(aewo.N(aihfVarCreateBuilder3));
        }
        str = this.G;
        if (str != null) {
            axstVar4.S(str);
        }
        str2 = this.H;
        if (str2 != null) {
            axstVar4.T(str2);
        }
        str3 = this.I;
        if (str3 != null) {
            axstVar4.S(str3);
        }
        l2 = this.M;
        if (l2 != null) {
            axstVar4.P(l2.longValue());
        }
        paxVar = this.k;
        if (paxVar != null) {
            axstVar4.N(paxVar.a.longValue());
            ahzvVar = this.b;
            if (ahzvVar != ahzv.SHOWN) {
                aihf aihfVarCreateBuilder4 = ahyv.a.createBuilder();
                aihfVarCreateBuilder4.getClass();
                aewo.G(this.L.longValue() - paxVar.b.longValue(), aihfVarCreateBuilder4);
                Long l9 = paxVar.c;
                l9.getClass();
                aewo.B(l9.longValue(), aihfVarCreateBuilder4);
                Long l10 = paxVar.d;
                l10.getClass();
                aewo.F(l10.longValue(), aihfVarCreateBuilder4);
                Long l11 = paxVar.e;
                l11.getClass();
                aewo.A(l11.longValue(), aihfVarCreateBuilder4);
                Long l12 = paxVar.f;
                l12.getClass();
                aewo.C(l12.longValue(), aihfVarCreateBuilder4);
                Long l13 = paxVar.g;
                l13.getClass();
                aewo.D(l13.longValue(), aihfVarCreateBuilder4);
                Long l14 = paxVar.h;
                l14.getClass();
                aewo.E(l14.longValue(), aihfVarCreateBuilder4);
                aewo.H(paxVar.i, aihfVarCreateBuilder4);
                axstVar4.Q(aewo.z(aihfVarCreateBuilder4));
            } else {
                aihf aihfVarCreateBuilder5 = ahyv.a.createBuilder();
                aihfVarCreateBuilder5.getClass();
                aewo.G(this.L.longValue() - paxVar.b.longValue(), aihfVarCreateBuilder5);
                Long l15 = paxVar.c;
                l15.getClass();
                aewo.B(l15.longValue(), aihfVarCreateBuilder5);
                Long l16 = paxVar.d;
                l16.getClass();
                aewo.F(l16.longValue(), aihfVarCreateBuilder5);
                Long l17 = paxVar.e;
                l17.getClass();
                aewo.A(l17.longValue(), aihfVarCreateBuilder5);
                Long l18 = paxVar.f;
                l18.getClass();
                aewo.C(l18.longValue(), aihfVarCreateBuilder5);
                Long l19 = paxVar.g;
                l19.getClass();
                aewo.D(l19.longValue(), aihfVarCreateBuilder5);
                Long l110 = paxVar.h;
                l110.getClass();
                aewo.E(l110.longValue(), aihfVarCreateBuilder5);
                aewo.H(paxVar.i, aihfVarCreateBuilder5);
                axstVar4.Q(aewo.z(aihfVarCreateBuilder5));
            }
        }
        axstVar4.V(String.valueOf(this.N.nextInt(1000000000)));
        return axstVar5.L();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(awoq awoqVar) throws Throwable {
        pbb pbbVar;
        if (awoqVar instanceof pbb) {
            pbbVar = (pbb) awoqVar;
            int i = pbbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbbVar.c = i - Integer.MIN_VALUE;
            } else {
                pbbVar = new pbb(this, awoqVar);
            }
        } else {
            pbbVar = new pbb(this, awoqVar);
        }
        Object objK = pbbVar.a;
        awox awoxVar = awox.a;
        int i2 = pbbVar.c;
        int i3 = 1;
        if (i2 == 0) {
            atqp.j(objK);
            pbbVar.d = this;
            pbbVar.c = 1;
            objK = k(pbbVar);
            if (objK == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = pbbVar.d;
            atqp.j(objK);
        }
        ahyh ahyhVar = (ahyh) objK;
        aihf aihfVarCreateBuilder = ahyj.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ahyj ahyjVar = (ahyj) aihfVarCreateBuilder.instance;
        ahyhVar.getClass();
        ahyjVar.e = ahyhVar;
        ahyjVar.b |= 1;
        ahzv ahzvVar = this.b;
        if (ahzvVar != null) {
            aihf aihfVarCreateBuilder2 = ahzz.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            ahzz ahzzVar = (ahzz) aihfVarCreateBuilder2.instance;
            ahzzVar.c = ahzvVar.ah;
            ahzzVar.b |= 1;
            if (x.contains(ahzvVar)) {
                List list = this.e;
                aihfVarCreateBuilder2.copyOnWrite();
                ahzz ahzzVar2 = (ahzz) aihfVarCreateBuilder2.instance;
                aiie aiieVar = ahzzVar2.g;
                if (!aiieVar.c()) {
                    ahzzVar2.g = aihn.mutableCopy(aiieVar);
                }
                aifs.addAll(list, ahzzVar2.g);
            } else if (ahzv.ACTION_CLICK == ahzvVar) {
                String str = this.d;
                if (str != null) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    ahzz ahzzVar3 = (ahzz) aihfVarCreateBuilder2.instance;
                    ahzzVar3.b |= 2;
                    ahzzVar3.d = str;
                }
                int i4 = this.q;
                if (i4 != 0) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    ahzz ahzzVar4 = (ahzz) aihfVarCreateBuilder2.instance;
                    ahzzVar4.e = i4 - 1;
                    ahzzVar4.b |= 4;
                }
                int i5 = this.v;
                if (i5 != 0) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    ahzz ahzzVar5 = (ahzz) aihfVarCreateBuilder2.instance;
                    ahzzVar5.f = i5 - 1;
                    ahzzVar5.b |= 8;
                }
            }
            pgv pgvVar = this.i;
            if (pgvVar != null) {
                ahyd ahydVarA = pgvVar.a();
                aihfVarCreateBuilder2.copyOnWrite();
                ahzz ahzzVar6 = (ahzz) aihfVarCreateBuilder2.instance;
                ahydVarA.getClass();
                ahzzVar6.i = ahydVarA;
                ahzzVar6.b |= SemanticState.Hidden;
            }
            int i6 = this.r;
            if (i6 != 0) {
                aihfVarCreateBuilder2.copyOnWrite();
                ahzz ahzzVar7 = (ahzz) aihfVarCreateBuilder2.instance;
                ahzzVar7.h = i6 - 1;
                ahzzVar7.b |= SemanticState.Focused;
            }
            ahza ahzaVar = this.f;
            if (ahzaVar != null) {
                aihfVarCreateBuilder2.copyOnWrite();
                ahzz ahzzVar8 = (ahzz) aihfVarCreateBuilder2.instance;
                ahzzVar8.l = ahzaVar.r;
                ahzzVar8.b |= 16384;
            }
            int i7 = this.s;
            if (i7 != 0) {
                aihfVarCreateBuilder2.copyOnWrite();
                ahzz ahzzVar9 = (ahzz) aihfVarCreateBuilder2.instance;
                ahzzVar9.m = i7 - 1;
                ahzzVar9.b |= 32768;
            }
            int i8 = this.t;
            if (i8 != 0) {
                aihfVarCreateBuilder2.copyOnWrite();
                ahzz ahzzVar10 = (ahzz) aihfVarCreateBuilder2.instance;
                ahzzVar10.n = i8 - 1;
                ahzzVar10.b |= 65536;
            }
            int i9 = this.u;
            if (i9 != 0) {
                aihf aihfVarCreateBuilder3 = ahzo.a.createBuilder();
                aihfVarCreateBuilder3.getClass();
                aewp.H(i9, aihfVarCreateBuilder3);
                ahzo ahzoVarG = aewp.G(aihfVarCreateBuilder3);
                aihfVarCreateBuilder2.copyOnWrite();
                ahzz ahzzVar11 = (ahzz) aihfVarCreateBuilder2.instance;
                ahzzVar11.j = ahzoVarG;
                ahzzVar11.b |= SemanticState.Obscured;
            }
            ahzt ahztVar = this.l;
            if (ahztVar != null) {
                aihfVarCreateBuilder2.copyOnWrite();
                ahzz ahzzVar12 = (ahzz) aihfVarCreateBuilder2.instance;
                ahzzVar12.k = ahztVar.e;
                ahzzVar12.b |= SemanticState.Multiline;
            }
            pbg pbgVar = this.n;
            if (pbgVar != null) {
                ahzx ahzxVarA = pbgVar.a();
                aihfVarCreateBuilder2.copyOnWrite();
                ahzz ahzzVar13 = (ahzz) aihfVarCreateBuilder2.instance;
                ahzzVar13.o = ahzxVarA;
                ahzzVar13.b |= 262144;
            }
            Set set = this.E;
            if (!set.isEmpty()) {
                aihfVarCreateBuilder2.copyOnWrite();
                ahzz ahzzVar14 = (ahzz) aihfVarCreateBuilder2.instance;
                aihv aihvVar = ahzzVar14.p;
                if (!aihvVar.c()) {
                    ahzzVar14.p = aihn.mutableCopy(aihvVar);
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ahzzVar14.p.h(((ahyi) it.next()).i);
                }
            }
            ahzz ahzzVar15 = (ahzz) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            ahyj ahyjVar2 = (ahyj) aihfVarCreateBuilder.instance;
            ahzzVar15.getClass();
            ahyjVar2.d = ahzzVar15;
            ahyjVar2.c = 2;
        } else {
            ahyy ahyyVar = this.y;
            if (ahyyVar == null) {
                ((agsj) w.b()).t("Failed to create clearcut event, both interaction and failure is null");
                return null;
            }
            aihf aihfVarCreateBuilder4 = ahyz.a.createBuilder();
            aihfVarCreateBuilder4.copyOnWrite();
            ahyz ahyzVar = (ahyz) aihfVarCreateBuilder4.instance;
            ahyzVar.c = ahyyVar.ap;
            ahyzVar.b |= 1;
            String str2 = this.m;
            if (str2 != null) {
                aihfVarCreateBuilder4.copyOnWrite();
                ahyz ahyzVar2 = (ahyz) aihfVarCreateBuilder4.instance;
                ahyzVar2.b |= 32;
                ahyzVar2.g = str2;
            }
            int i10 = this.r;
            if (i10 != 0) {
                aihfVarCreateBuilder4.copyOnWrite();
                ahyz ahyzVar3 = (ahyz) aihfVarCreateBuilder4.instance;
                ahyzVar3.d = i10 - 1;
                ahyzVar3.b |= 2;
            }
            Set set2 = this.D;
            aihfVarCreateBuilder4.copyOnWrite();
            ahyz ahyzVar4 = (ahyz) aihfVarCreateBuilder4.instance;
            aihv aihvVar2 = ahyzVar4.i;
            if (!aihvVar2.c()) {
                ahyzVar4.i = aihn.mutableCopy(aihvVar2);
            }
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                ahyzVar4.i.h(((ahyi) it2.next()).i);
            }
            qab qabVar = this.g;
            if (qabVar != null) {
                switch (qabVar.ordinal()) {
                    case 0:
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahyz ahyzVar5 = (ahyz) aihfVarCreateBuilder4.instance;
                        ahyzVar5.e = i3 - 1;
                        ahyzVar5.b |= 8;
                        break;
                    case 1:
                        i3 = 2;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahyz ahyzVar6 = (ahyz) aihfVarCreateBuilder4.instance;
                        ahyzVar6.e = i3 - 1;
                        ahyzVar6.b |= 8;
                        break;
                    case 2:
                        i3 = 3;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahyz ahyzVar7 = (ahyz) aihfVarCreateBuilder4.instance;
                        ahyzVar7.e = i3 - 1;
                        ahyzVar7.b |= 8;
                        break;
                    case 3:
                        i3 = 7;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahyz ahyzVar8 = (ahyz) aihfVarCreateBuilder4.instance;
                        ahyzVar8.e = i3 - 1;
                        ahyzVar8.b |= 8;
                        break;
                    case 4:
                        i3 = 4;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahyz ahyzVar9 = (ahyz) aihfVarCreateBuilder4.instance;
                        ahyzVar9.e = i3 - 1;
                        ahyzVar9.b |= 8;
                        break;
                    case 5:
                        i3 = 5;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahyz ahyzVar10 = (ahyz) aihfVarCreateBuilder4.instance;
                        ahyzVar10.e = i3 - 1;
                        ahyzVar10.b |= 8;
                        break;
                    case 6:
                        i3 = 6;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahyz ahyzVar11 = (ahyz) aihfVarCreateBuilder4.instance;
                        ahyzVar11.e = i3 - 1;
                        ahyzVar11.b |= 8;
                        break;
                    case 7:
                        i3 = 8;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahyz ahyzVar12 = (ahyz) aihfVarCreateBuilder4.instance;
                        ahyzVar12.e = i3 - 1;
                        ahyzVar12.b |= 8;
                        break;
                    case 8:
                        i3 = 9;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahyz ahyzVar13 = (ahyz) aihfVarCreateBuilder4.instance;
                        ahyzVar13.e = i3 - 1;
                        ahyzVar13.b |= 8;
                        break;
                    case 9:
                        i3 = 1001;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahyz ahyzVar14 = (ahyz) aihfVarCreateBuilder4.instance;
                        ahyzVar14.e = i3 - 1;
                        ahyzVar14.b |= 8;
                        break;
                    case 10:
                        i3 = 10002;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahyz ahyzVar15 = (ahyz) aihfVarCreateBuilder4.instance;
                        ahyzVar15.e = i3 - 1;
                        ahyzVar15.b |= 8;
                        break;
                    case 11:
                        i3 = 10003;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahyz ahyzVar16 = (ahyz) aihfVarCreateBuilder4.instance;
                        ahyzVar16.e = i3 - 1;
                        ahyzVar16.b |= 8;
                        break;
                    case 12:
                        i3 = 10;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahyz ahyzVar17 = (ahyz) aihfVarCreateBuilder4.instance;
                        ahyzVar17.e = i3 - 1;
                        ahyzVar17.b |= 8;
                        break;
                    case 13:
                        i3 = 1002;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahyz ahyzVar18 = (ahyz) aihfVarCreateBuilder4.instance;
                        ahyzVar18.e = i3 - 1;
                        ahyzVar18.b |= 8;
                        break;
                    case 14:
                        i3 = 11;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahyz ahyzVar19 = (ahyz) aihfVarCreateBuilder4.instance;
                        ahyzVar19.e = i3 - 1;
                        ahyzVar19.b |= 8;
                        break;
                    case 15:
                        i3 = 12;
                        aihfVarCreateBuilder4.copyOnWrite();
                        ahyz ahyzVar110 = (ahyz) aihfVarCreateBuilder4.instance;
                        ahyzVar110.e = i3 - 1;
                        ahyzVar110.b |= 8;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown enum value: ".concat(qabVar.toString()));
                }
            }
            int i11 = this.u;
            if (i11 != 0) {
                aihf aihfVarCreateBuilder5 = ahzo.a.createBuilder();
                aihfVarCreateBuilder5.getClass();
                aewp.H(i11, aihfVarCreateBuilder5);
                ahzo ahzoVarG2 = aewp.G(aihfVarCreateBuilder5);
                aihfVarCreateBuilder4.copyOnWrite();
                ahyz ahyzVar20 = (ahyz) aihfVarCreateBuilder4.instance;
                ahyzVar20.f = ahzoVarG2;
                ahyzVar20.b |= 16;
            }
            ahyz ahyzVar21 = (ahyz) aihfVarCreateBuilder4.build();
            aihfVarCreateBuilder.copyOnWrite();
            ahyj ahyjVar3 = (ahyj) aihfVarCreateBuilder.instance;
            ahyzVar21.getClass();
            ahyjVar3.d = ahyzVar21;
            ahyjVar3.c = 3;
        }
        aihf aihfVarCreateBuilder6 = ahyk.a.createBuilder();
        aihfVarCreateBuilder6.getClass();
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        aewo.T((ahyj) aihnVarBuild, aihfVarCreateBuilder6);
        aewo.U(rpi.U(this.O), aihfVarCreateBuilder6);
        return aewo.S(aihfVarCreateBuilder6);
    }
}
