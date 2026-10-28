package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hgo implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hgo(dyp dypVar, String str, int i) {
        this.$cid = i;
        this.b = "UPDATE workspec SET output=? WHERE id=?";
        this.a = dypVar;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, tjk] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, tjk] */
    /* JADX WARN: Type inference failed for: r0v48, types: [acpo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r12v33, types: [awql, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v41, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r12v42, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r12v51, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v22, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r13v32, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v37, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, yqs] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, yqs] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.awqg
    public final Object invoke(Object obj) throws Throwable {
        boolean zBi;
        int i = 6;
        switch (this.$cid) {
            case 0:
                String str = (String) obj;
                hhr hhrVar = (hhr) ((hgs) this.a).i.io();
                str.getClass();
                boolean zL = hhrVar.n.l(6, 45680102L, false);
                Object obj2 = this.c;
                Object obj3 = this.b;
                if (zL) {
                    hik hikVarA = hhrVar.a(((hjy) obj3).d);
                    if (((vxz) hikVarA.o.io()).l(21, 45791927L, false)) {
                        ReentrantLock reentrantLock = hikVarA.r;
                        reentrantLock.lock();
                        try {
                            ((hht) hikVarA.i.io()).c(hikVarA.a((znf) obj2), str);
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                } else {
                    ((hir) hhrVar.b.io()).a(((hjy) obj3).d).j((znf) obj2, str);
                }
                return awmy.a;
            case 1:
                dpt dptVar = (dpt) obj;
                dptVar.getClass();
                dpb dpbVarA = dptVar.a((String) this.b);
                Object obj4 = this.c;
                try {
                    dpbVarA.e(1, azx.h((dyp) this.a));
                    dpbVarA.i(2, (String) obj4);
                    dpbVarA.l();
                    return awmy.a;
                } finally {
                    dpbVarA.close();
                }
            case 2:
                amzs amzsVar = (amzs) obj;
                Object obj5 = this.c;
                if (amzsVar == null) {
                    return null;
                }
                Object obj6 = this.a;
                Object obj7 = this.b;
                ((hjn) obj7).b(tau.MEDIA_BROWSER_GET_CHILDREN_RESPONSE_RECEIVED);
                ReentrantLock reentrantLock2 = ((hik) obj6).r;
                reentrantLock2.lock();
                try {
                    if (!amzsVar.c.isEmpty()) {
                        him himVarA = ((hik) obj6).a((znf) obj5);
                        aiie aiieVar = amzsVar.c;
                        aiieVar.getClass();
                        amzl amzlVar = amzsVar.d;
                        if (amzlVar == null) {
                            amzlVar = amzl.a;
                        }
                        himVarA.n(aiieVar, amzlVar, ((hik) obj6).e, ((hik) obj6).m);
                    }
                    ((hik) obj6).e((hjn) obj7);
                    return null;
                } finally {
                    reentrantLock2.unlock();
                }
            case 3:
                ((znf) obj).getClass();
                zne zneVar = (zne) this.b;
                him himVar = new him(zneVar.a(), zneVar, this.c);
                aihf aihfVarCreateBuilder = amzx.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                String str2 = zneVar.a().l;
                aihfVarCreateBuilder.copyOnWrite();
                amzx amzxVar = (amzx) aihfVarCreateBuilder.instance;
                amzxVar.b |= 1;
                amzxVar.e = str2;
                alay alayVarC = ackj.c("YouTube Music");
                alayVarC.getClass();
                aihfVarCreateBuilder.copyOnWrite();
                amzx amzxVar2 = (amzx) aihfVarCreateBuilder.instance;
                amzxVar2.g = alayVarC;
                amzxVar2.b |= 4;
                aihfVarCreateBuilder.copyOnWrite();
                amzx amzxVar3 = (amzx) aihfVarCreateBuilder.instance;
                amzxVar3.b |= SemanticState.Focused;
                amzxVar3.l = true;
                himVar.s(agvp.U(aihfVarCreateBuilder), this.a);
                return himVar;
            case 4:
                ((znf) obj).getClass();
                return new him((znf) this.b, (zne) this.a, this.c);
            case 5:
                ((hub) this.a).f.remove(this.b, this.c);
                return awmy.a;
            case 6:
                if (((Throwable) obj) != null) {
                    ((ConcurrentHashMap) ((xsc) this.a).a).remove(this.b, this.c);
                }
                return awmy.a;
            case 7:
                ((String) obj).getClass();
                Object obj8 = this.b;
                Object obj9 = this.a;
                xsc xscVar = (xsc) obj9;
                awuz awuzVarR = awro.r(xscVar.c, awov.a, 1, new qbj(xscVar, (ajwo) obj8, (awoq) null, 13));
                awuzVarR.kJ(new hgo(obj9, this.c, awuzVarR, i));
                return awuzVarR;
            case 8:
                ((vdx) obj).getClass();
                Object obj10 = this.c;
                aaok aaokVar = (aaok) obj10;
                awuz awuzVarR2 = awro.r(aaokVar.b, awov.a, 1, new qbj(aaokVar, (vdw) this.a, (awoq) null, 14));
                awuzVarR2.kJ(new hgo(obj10, this.b, (Object) awuzVarR2, 9, (byte[]) null));
                return awuzVarR2;
            case 9:
                if (((Throwable) obj) != null) {
                    ((ConcurrentHashMap) ((aaok) this.b).d).remove(this.a, this.c);
                }
                return awmy.a;
            case 10:
                IOException iOException = (IOException) obj;
                iOException.getClass();
                twu.c(6, "Failed to parse deferred FrameworkUpdateTransport", iOException);
                return this.c.invoke(tnx.d(new tnp(iOException)), this.a, this.b);
            case 11:
                return yru.a((ysf) this.c, this.b, this.a, (Throwable) obj);
            case 12:
                return yru.a((ysf) this.c, this.b, this.a, (Throwable) obj);
            case 13:
                zrh zrhVar = (zrh) obj;
                zrhVar.getClass();
                Object obj11 = this.b;
                if (obj11 != null) {
                    zrhVar.e = true;
                    zrhVar.b.N(((zrd) obj11).a, 1);
                }
                zqn zqnVar = zrhVar.a;
                if (!zrhVar.e) {
                    awrc.c(zqnVar.a, zqnVar.b);
                }
                Object obj12 = this.a;
                Object obj13 = this.c;
                if (zrhVar.c) {
                    av avVar = new av(zrhVar.b);
                    avVar.s(R.anim.fragment_fade_in, R.anim.fragment_fade_out, 0);
                    String str3 = (String) obj13;
                    avVar.q(R.id.fragment_container, (cc) obj12, str3);
                    avVar.o(str3);
                    avVar.r();
                    avVar.a(false, true);
                } else {
                    av avVar2 = new av(zrhVar.b);
                    avVar2.s(R.anim.fragment_fade_in, R.anim.fragment_fade_out, 0);
                    avVar2.q(R.id.fragment_container, (cc) obj12, null);
                    avVar2.o((String) obj13);
                    avVar2.r();
                    avVar2.a(false, true);
                }
                zrhVar.d = false;
                return awmy.a;
            case 14:
                acvm acvmVar = (acvm) obj;
                if (acvmVar instanceof acvh) {
                    ?? r0 = this.b;
                    apfp apfpVarC = ((acvh) acvmVar).c.c();
                    apfu apfuVarHx = r0.hx();
                    if (apfpVarC != null) {
                        Object obj14 = this.c;
                        if ((apfpVarC.d & 32768) != 0) {
                            apfu apfuVar = apfpVarC.R;
                            if (apfuVar == null) {
                                apfuVar = apfu.a;
                            }
                            zBi = hno.bi(apfuVar);
                        } else {
                            zBi = hno.bi(apfuVarHx);
                        }
                        if (zBi) {
                            String str4 = apfpVarC.o;
                            str4.getClass();
                            if (str4.length() > 0) {
                                ?? r12 = this.a;
                                zwa zwaVarE = r12 != 0 ? r12.e() : null;
                                acsj acsjVar = (acsj) obj14;
                                long epochMilli = acsjVar.a.f().toEpochMilli();
                                if (str4.length() == 0 || acsjVar.b() <= 0) {
                                    new awwf(null).c();
                                } else if (((hno) acsjVar.b).ao()) {
                                    awro.t(acsjVar.e, null, 0, new acpx(acsjVar, zwaVarE, str4, epochMilli, null), 3);
                                } else {
                                    acsjVar.f(zwaVarE, str4, epochMilli);
                                    new awwf(null).c();
                                }
                            }
                        }
                    }
                }
                return awmy.a;
            case 15:
                ((adpd) this.a).f.remove(this.b, this.c);
                return awmy.a;
            default:
                Long l = (Long) obj;
                long jLongValue = l.longValue();
                float fFloatValue = Float.valueOf(0.0f).floatValue();
                Object obj15 = this.a;
                if (fFloatValue > 0.0f) {
                    long j = (long) (1.0E9d / ((double) fFloatValue));
                    long jMin = Math.min(2000000L, j / 10);
                    Long l2 = ((adrq) obj15).a;
                    if (l2 != null && jLongValue - l2.longValue() < j - jMin) {
                        return awmy.a;
                    }
                }
                ?? r1 = this.b;
                Object obj16 = this.c;
                ((adrq) obj15).a = l;
                ((awri) obj16).a = true;
                r1.invoke(l);
                return awmy.a;
        }
    }

    public /* synthetic */ hgo(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ hgo(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ hgo(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ hgo(Object obj, Object obj2, Object obj3, int i, int[] iArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ hgo(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ hgo(ysf ysfVar, yqs yqsVar, tjk tjkVar, int i) {
        this.$cid = i;
        this.c = ysfVar;
        this.b = yqsVar;
        this.a = tjkVar;
    }
}
