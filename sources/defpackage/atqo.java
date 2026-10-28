package defpackage;

import internal.org.jni_zero.CommonApis;
import j$.util.DesugarCollections;
import java.security.MessageDigest;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atqo {
    private atqo() {
    }

    public static int A(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
            default:
                return 0;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
        }
    }

    public static final /* synthetic */ void B(aihf aihfVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((augl) aihfVar.instance).c);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public static final /* synthetic */ void C(aihf aihfVar) {
        new aikl(new aihx(((augg) aihfVar.instance).d, augg.a));
    }

    public static final /* synthetic */ aikl D(jrq jrqVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((augj) jrqVar.instance).c);
        listUnmodifiableList.getClass();
        return new aikl(listUnmodifiableList);
    }

    public static final /* synthetic */ augj E(jrq jrqVar) {
        aihn aihnVarBuild = jrqVar.build();
        aihnVarBuild.getClass();
        return (augj) aihnVarBuild;
    }

    public static final /* synthetic */ void F(jrq jrqVar) {
        jrqVar.copyOnWrite();
        augj augjVar = (augj) jrqVar.instance;
        augj augjVar2 = augj.a;
        augjVar.c = augj.emptyProtobufList();
    }

    public static final /* synthetic */ void G(jrr jrrVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((augi) jrrVar.instance).j);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    private static ahwp H(ahwp ahwpVar) {
        return new ahwp(ahwpVar.a, ahwpVar.b, 0.1d + ahwpVar.c);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a A[PHI: r5
      0x002a: PHI (r5v7 double) = (r5v6 double), (r5v9 double) binds: [B:8:0x0022, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    private static ahwp I(ahwp ahwpVar) {
        double d;
        double d2;
        double d3 = ahwpVar.b;
        if (d3 > 0.85d) {
            d3 = 0.85d;
        }
        double d4 = ahwpVar.a;
        if (d3 < 0.15d) {
            double d5 = ahwpVar.c;
            double d6 = 0.45d;
            if (d5 <= 0.45d) {
                d6 = 0.25d;
                if (d5 < 0.25d) {
                    d = d6;
                    d2 = 0.0d;
                } else {
                    d2 = 0.0d;
                    d = d5;
                }
            } else {
                d = d6;
                d2 = 0.0d;
            }
        } else {
            d = CommonApis.B(d4) ? 0.6d : 0.4d;
            d2 = d3;
        }
        return new ahwp(d4, d2, d);
    }

    private static ahwp J(ahwp ahwpVar) {
        return new ahwp(ahwpVar.a, ahwpVar.b, (-0.05d) + ahwpVar.c);
    }

    private static double K(double d) {
        return d <= 0.03928d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }

    public static void a(atvg atvgVar, atvh atvhVar) {
        if (atvgVar != null) {
            atvgVar.iD(atvhVar);
        } else {
            atvhVar.a(0L);
        }
    }

    public static void b(List list, atvf atvfVar) {
        if (list.isEmpty()) {
            atvfVar.a(null);
        } else {
            c(list, new long[list.size()], atvfVar, 0);
        }
    }

    public static void c(final List list, final long[] jArr, final atvf atvfVar, final int i) {
        atvh atvhVar = new atvh() { // from class: atve
            @Override // defpackage.atvh
            public final void a(long j) {
                long[] jArr2 = jArr;
                int i2 = i;
                jArr2[i2] = j;
                List list2 = list;
                int size = list2.size() - 1;
                atvf atvfVar2 = atvfVar;
                if (i2 == size) {
                    atvfVar2.a(jArr2);
                } else {
                    atqo.c(list2, jArr2, atvfVar2, i2 + 1);
                }
            }
        };
        atvg atvgVar = (atvg) list.get(i);
        if (atvgVar != null) {
            atvgVar.iD(atvhVar);
        } else {
            atvhVar.a(0L);
        }
    }

    public static final atzk d(String str, atzc atzcVar, atzb atzbVar, atzo atzoVar) {
        boolean z = true;
        if (!ahno.ag("POST", "put") && !ahno.ag("POST", "post")) {
            z = false;
        }
        ahno.F(z);
        return (atzbVar.e() == -1 || atzbVar.e() >= 0) ? new atzi(str, atzcVar, atzbVar, atzoVar) : new atzg(str, atzcVar, atzbVar, atzoVar);
    }

    public static agev e(MessageDigest messageDigest) {
        agev agevVarA = agev.h(messageDigest).a(new ampw(2));
        if (!agevVarA.g() || (!ahno.ag((CharSequence) agevVarA.c(), "md5") && !ahno.ag((CharSequence) agevVarA.c(), "sha-1"))) {
            return agdf.a;
        }
        StringBuilder sb = new StringBuilder();
        if (ahno.ag((CharSequence) agevVarA.c(), "md5")) {
            sb.append("md5=");
        } else {
            sb.append("sha1=");
        }
        sb.append(agyg.d.j(messageDigest.digest()));
        return agev.i(sb.toString());
    }

    public static final /* synthetic */ augu f(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (augu) aihnVarBuild;
    }

    public static final void g(aimw aimwVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        augu auguVar = (augu) aihfVar.instance;
        augu auguVar2 = augu.a;
        auguVar.e = aimwVar;
        auguVar.b |= 4;
    }

    public static final /* synthetic */ aufa h(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (aufa) aihnVarBuild;
    }

    public static final void i(aigu aiguVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aufa aufaVar = (aufa) aihfVar.instance;
        aufa aufaVar2 = aufa.a;
        aufaVar.g = aiguVar;
        aufaVar.b |= 4;
    }

    public static final void j(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aufa aufaVar = (aufa) aihfVar.instance;
        aufa aufaVar2 = aufa.a;
        aufaVar.b |= 1;
        aufaVar.e = j;
    }

    public static final void k(aigu aiguVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aufa aufaVar = (aufa) aihfVar.instance;
        aufa aufaVar2 = aufa.a;
        aufaVar.h = aiguVar;
        aufaVar.b |= 8;
    }

    public static final void l(aigu aiguVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aufa aufaVar = (aufa) aihfVar.instance;
        aufa aufaVar2 = aufa.a;
        aufaVar.f = aiguVar;
        aufaVar.b |= 2;
    }

    public static final void m(auey aueyVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aufa aufaVar = (aufa) aihfVar.instance;
        aufa aufaVar2 = aufa.a;
        aufaVar.d = aueyVar;
        aufaVar.c = 102;
    }

    public static final void n(float f, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aufa aufaVar = (aufa) aihfVar.instance;
        aufa aufaVar2 = aufa.a;
        aufaVar.b |= 16;
        aufaVar.i = f;
    }

    public static final /* synthetic */ void o(Iterable iterable, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aufa aufaVar = (aufa) aihfVar.instance;
        aufa aufaVar2 = aufa.a;
        aufaVar.a();
        aifs.addAll(iterable, aufaVar.k);
    }

    public static final /* synthetic */ void p(aufs aufsVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aufa aufaVar = (aufa) aihfVar.instance;
        aufa aufaVar2 = aufa.a;
        aufaVar.a();
        aufaVar.k.add(aufsVar);
    }

    public static final /* synthetic */ void q(aihf aihfVar) {
        aihfVar.copyOnWrite();
        aufa aufaVar = (aufa) aihfVar.instance;
        aufa aufaVar2 = aufa.a;
        aufaVar.k = aufa.emptyProtobufList();
    }

    public static final /* synthetic */ void r(aihf aihfVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((aufa) aihfVar.instance).k);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public static final /* synthetic */ auev s(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (auev) aihnVarBuild;
    }

    public static final void t(aqmh aqmhVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        auev auevVar = (auev) aihfVar.instance;
        auev auevVar2 = auev.a;
        auevVar.d = aqmhVar;
        auevVar.b |= 2;
    }

    public static final void u(String str, aihf aihfVar) {
        str.getClass();
        aihfVar.copyOnWrite();
        auev auevVar = (auev) aihfVar.instance;
        auev auevVar2 = auev.a;
        auevVar.b |= 1;
        auevVar.c = str;
    }

    public static int v(int i) {
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        if (i != 6) {
            return i != 7 ? 9 : 8;
        }
        return 7;
    }

    public static auiu w(ahwp ahwpVar) {
        double d;
        double d2;
        double d3 = ahwpVar.b;
        if (d3 > 0.85d) {
            d = 0.85d;
        } else {
            d = d3 < 0.15d ? 0.0d : d3;
        }
        double d4 = ahwpVar.a;
        ahwp ahwpVar2 = new ahwp(d4, d, (d4 > 200.0d || d4 <= 30.0d) ? 0.15d : 0.1d);
        double d5 = ahwpVar2.c;
        double d6 = ahwpVar2.a;
        double d7 = CommonApis.B(d6) ? d5 + 0.12d : d5 + 0.1d;
        double d8 = ahwpVar2.b;
        ahwp ahwpVar3 = new ahwp(d6, d8, d7);
        ahwp ahwpVar4 = new ahwp(d6, d8, d5 + (true != CommonApis.B(d6) ? 0.05d : 0.06d));
        ahwp ahwpVar5 = new ahwp(d6, d8, d5 - 0.05d);
        ahwp ahwpVarA = CommonApis.A(ahwpVar, d3 < 0.15d ? 0.0d : 0.1d, 1.0d);
        double d9 = 0.2d;
        if (d3 < 0.15d) {
            d2 = 0.0d;
        } else {
            d2 = d3 > 0.2d ? 0.2d : d3;
        }
        ahwp ahwpVarA2 = CommonApis.A(ahwpVar, d2, 0.8d);
        if (d3 < 0.15d) {
            d9 = 0.0d;
        } else if (d3 <= 0.2d) {
            d9 = d3;
        }
        ahwp ahwpVarA3 = CommonApis.A(ahwpVar, d9, 0.7d);
        if (d3 < 0.15d) {
            d3 = 0.0d;
        } else if (d3 > 0.24d) {
            d3 = 0.24d;
        }
        return new auiu(CommonApis.z(ahwpVar3), CommonApis.z(ahwpVar4), CommonApis.z(ahwpVar2), CommonApis.z(ahwpVar5), CommonApis.z(ahwpVarA), CommonApis.z(ahwpVarA2), CommonApis.z(ahwpVarA), CommonApis.z(ahwpVarA3), CommonApis.z(CommonApis.A(ahwpVar, d3, 0.5d)), CommonApis.z(H(I(ahwpVar))));
    }

    public static auiu x(ahwp ahwpVar) {
        double d;
        ahwp ahwpVarI = I(ahwpVar);
        ahwp ahwpVarH = H(ahwpVarI);
        double d2 = ahwpVarI.a;
        double d3 = ahwpVarI.b;
        double d4 = ahwpVarI.c;
        ahwp ahwpVar2 = new ahwp(d2, d3, d4 + 0.05d);
        ahwp ahwpVar3 = new ahwp(d2, d3, (-0.05d) + d4);
        double d5 = ahwpVar.b;
        ahwp ahwpVarA = CommonApis.A(ahwpVar, d5 > 0.15d ? 0.1d : 0.0d, 1.0d);
        if (d5 < 4594572339843380019) {
            d = 0.0d;
        } else {
            d = 0.2d;
            if (d5 <= 0.2d) {
                d = d5;
            }
        }
        ahwp ahwpVarA2 = CommonApis.A(ahwpVar, d, 0.9d);
        double d6 = ahwpVar.a;
        if (d5 < 4594572339843380019) {
            d5 = 0.0d;
        } else if (d5 > 0.3d) {
            d5 = 0.3d;
        }
        ahwp ahwpVarA3 = CommonApis.A(ahwpVar, d5, true != CommonApis.B(d6) ? 0.6d : 0.75d);
        ahwp ahwpVarA4 = CommonApis.A(ahwpVar, d5 < 4594572339843380019 ? 0.0d : 0.4d, d5 < 4594572339843380019 ? 0.4d : 0.95d);
        ahwp ahwpVar4 = ahwpVarA;
        while (y(ahwo.b(ahwpVarH), ahwo.b(ahwpVarA2)) < 4.5d && ahwpVar3.c >= 0.05d) {
            ahwpVarH = J(ahwpVarH);
            ahwpVar2 = J(ahwpVar2);
            ahwp ahwpVarJ = J(ahwpVarI);
            ahwpVar3 = J(ahwpVar3);
            ahwpVarA4 = ahwpVarA4;
            ahwpVarI = ahwpVarJ;
            ahwpVarA2 = new ahwp(ahwpVarA2.a, Math.max(ahwpVarA2.b - 0.02d, 0.0d), ahwpVarA2.c);
            double d7 = ahwpVar4.b;
            if (d7 >= 0.01d) {
                ahwpVar4 = new ahwp(ahwpVar4.a, d7 - 0.01d, ahwpVar4.c);
            }
        }
        return new auiu(CommonApis.z(ahwpVarH), CommonApis.z(ahwpVar2), CommonApis.z(ahwpVarI), CommonApis.z(ahwpVar3), CommonApis.z(ahwpVar4), CommonApis.z(ahwpVarA2), CommonApis.z(ahwpVarA), CommonApis.z(ahwpVarA3), CommonApis.z(ahwpVarA3), CommonApis.z(ahwpVarA4));
    }

    public static double y(ahws ahwsVar, ahws ahwsVar2) {
        double dK = K(ahwsVar.c());
        double dK2 = K(ahwsVar.b());
        double dK3 = K(ahwsVar.a());
        double d = (dK * 0.2126d) + (dK2 * 0.7152d) + (dK3 * 0.0722d);
        double dK4 = (K(ahwsVar2.c()) * 0.2126d) + (K(ahwsVar2.b()) * 0.7152d) + (K(ahwsVar2.a()) * 0.0722d);
        return (Math.max(d, dK4) + 0.05d) / (Math.min(d, dK4) + 0.05d);
    }

    public static final /* synthetic */ void z(aihf aihfVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((augp) aihfVar.instance).c);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }
}
