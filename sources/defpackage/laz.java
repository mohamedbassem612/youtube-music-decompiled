package defpackage;

import android.util.Pair;
import com.google.android.libraries.youtube.rendering.image.glide.GlideImageLoggerImpl;
import com.google.cardboard.sdk.R;
import io.grpc.Status;
import j$.time.Duration;
import j$.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class laz implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ long a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;

    public laz(aveo aveoVar, long j, int i) {
        this.$cid = i;
        this.a = j;
        this.b = "CallOptions";
        this.c = aveoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v16, types: [cty, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Pair pairCreate;
        String string;
        int i = 2;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                Object obj = this.c;
                ldz ldzVar = (ldz) obj;
                ldzVar.o();
                Object obj2 = this.b;
                kro.i((String) obj2);
                lba lbaVar = (lba) obj;
                Map map = lbaVar.b;
                long j = this.a;
                if (map.isEmpty()) {
                    lbaVar.c = j;
                }
                Integer num = (Integer) map.get(obj2);
                if (num != null) {
                    map.put(obj2, Integer.valueOf(num.intValue() + 1));
                    return;
                } else if (((aha) map).d >= 100) {
                    ldzVar.aT().f.a("Too many ads visible");
                    return;
                } else {
                    map.put(obj2, 1);
                    lbaVar.a.put(obj2, Long.valueOf(j));
                    return;
                }
            case 1:
                int i2 = bwp.a;
                ((pj) this.c).b.j(this.b, this.a);
                return;
            case 2:
                Object obj3 = this.c;
                ldz ldzVar2 = (ldz) obj3;
                ldzVar2.o();
                Object obj4 = this.b;
                String str = (String) obj4;
                kro.i(str);
                lba lbaVar2 = (lba) obj3;
                Map map2 = lbaVar2.b;
                Integer num2 = (Integer) map2.get(obj4);
                if (num2 == null) {
                    ldzVar2.aT().c.b("Call to endAdUnitExposure for unknown ad unit id", obj4);
                    return;
                }
                lhf lhfVarT = ((lbb) obj3).l().t(false);
                int iIntValue = num2.intValue() - 1;
                if (iIntValue != 0) {
                    map2.put(obj4, Integer.valueOf(iIntValue));
                    return;
                }
                long j2 = this.a;
                map2.remove(obj4);
                Map map3 = lbaVar2.a;
                Long l = (Long) map3.get(obj4);
                if (l == null) {
                    ldzVar2.aT().c.a("First ad unit exposure time was never set");
                } else {
                    long jLongValue = j2 - l.longValue();
                    map3.remove(obj4);
                    lbaVar2.d(str, jLongValue, lhfVarT);
                }
                if (map2.isEmpty()) {
                    long j3 = lbaVar2.c;
                    if (j3 == 0) {
                        ldzVar2.aT().c.a("First ad exposure time was never set");
                        return;
                    } else {
                        lbaVar2.c(j2 - j3, lhfVarT);
                        lbaVar2.c = 0L;
                        return;
                    }
                }
                return;
            case 3:
                long j4 = this.a;
                ler lerVar = (ler) this.c;
                lerVar.Q("sgtm_fetch", j4);
                Object obj5 = this.b;
                if (obj5 == null) {
                    lerVar.ai("failed_fetches", 1);
                    return;
                }
                List list = ((lfn) obj5).a;
                if (list.isEmpty()) {
                    return;
                }
                lerVar.ai("fetched_batches", list.size());
                return;
            case 4:
                long j5 = this.a;
                Object obj6 = this.c;
                Object obj7 = this.b;
                lhh lhhVar = (lhh) obj7;
                lhhVar.x((lhf) obj6, false, j5);
                lhhVar.c = null;
                ((lbb) obj7).j().F(null);
                return;
            case 5:
                long j6 = this.a;
                Object obj8 = this.c;
                riv rivVar = (riv) obj8;
                synchronized (rivVar.b) {
                    Duration durationPlus = Duration.ofMillis(j6).plus(((qup) ((riv) obj8).y.get(0)).c);
                    int i3 = 0;
                    while (true) {
                        if (i3 < ((riv) obj8).y.size()) {
                            qup qupVar = (qup) ((riv) obj8).y.get(i3);
                            quz quzVar = (quz) qupVar.b;
                            Duration durationPlus2 = qupVar.c.plus(qupVar.d);
                            durationPlus.getClass();
                            if (aext.i(qupVar.c, durationPlus)) {
                                durationPlus.getClass();
                                if (aext.l(durationPlus2, durationPlus)) {
                                    pairCreate = Pair.create(Integer.valueOf(i3), Long.valueOf((long) (durationPlus.minus(qupVar.c).toMillis() * quzVar.n)));
                                }
                            }
                            i3++;
                        } else {
                            qup qupVar2 = (qup) aguu.K(((riv) obj8).y);
                            rbc rbcVar = new rbc(riv.z, rbd.d);
                            rbcVar.c();
                            rbcVar.a("Could not find a segment corresponding to seek time=%s, segments: %s", durationPlus, Collection.EL.stream(((riv) obj8).y).map(new ris(i)).collect(aghu.a));
                            pairCreate = Pair.create(Integer.valueOf(((riv) obj8).y.size() - 1), Long.valueOf((long) (qupVar2.c.minusMillis(1L).toMillis() * ((quz) qupVar2.b).n)));
                        }
                    }
                }
                bth bthVar = rivVar.f;
                if (bthVar.l() == ((Integer) pairCreate.first).intValue() && bthVar.r() == ((Long) pairCreate.second).longValue()) {
                    rivVar.A.h();
                } else {
                    rivVar.aG(((Integer) pairCreate.first).intValue());
                    if (rivVar.e.b) {
                        rivVar.C(new rhz(obj8, this.b, 4, bArr));
                    }
                    ((brs) bthVar).h(((Integer) pairCreate.first).intValue(), ((Long) pairCreate.second).longValue(), false);
                }
                ((brs) bthVar).A(true);
                rivVar.C(new rhl(rivVar.A, 6));
                return;
            case 6:
                ((agbt) this.c).a((askb) this.b, this.a);
                return;
            case 7:
                ((ytv) this.c).r(this.a, (appa) this.b);
                return;
            case 8:
                ((ywh) this.c).b.v(this.a, (appa) this.b);
                return;
            case 9:
                ((ywh) this.c).b.w(this.a, (appa) this.b);
                return;
            case 10:
                ((ywh) this.c).b.o(this.a, (appa) this.b);
                return;
            case 11:
                yzc yzcVar = (yzc) this.c;
                zkf.d(yzcVar.d);
                yzcVar.b();
                yzcVar.d.m(false, (byte[]) this.b, this.a);
                return;
            case 12:
                for (jtj jtjVar : ((zah) ((xxj) this.c).a).a) {
                    Object obj9 = this.b;
                    byte[] bArr2 = (byte[]) obj9;
                    if (jtjVar.b(bArr2)) {
                        long j7 = this.a;
                        ywn ywnVar = jtjVar.c;
                        if (j7 == 0) {
                            string = "never";
                        } else {
                            bvd bvdVar = jtjVar.d;
                            string = Long.toString(j7 - System.currentTimeMillis());
                        }
                        ywnVar.w("dkrt", string);
                        for (jth jthVar : jtjVar.a) {
                            if (jthVar.q(bArr2)) {
                                if (jthVar.j == null) {
                                }
                                jthVar.l.l(jthVar.m);
                            }
                            break;
                        }
                    }
                }
                return;
            case 13:
                aady aadyVar = (aady) this.c;
                if (aadyVar.n.C()) {
                    ((aaew) aadyVar.h.io()).R((String) this.b, this.a);
                    return;
                }
                return;
            case 14:
                ((acfx) this.c).h(((acga) this.b).u(), false, false, this.a);
                return;
            case 15:
                acoi acoiVar = (acoi) this.c;
                acoz acozVar = acoiVar.aZ;
                long j8 = this.a;
                if (acozVar != null) {
                    acozVar.c(j8);
                }
                if (acoiVar.ce.l(R.styleable.AppCompatTheme_windowMinWidthMajor, 45715945L, false) && acoiVar.getView() == null) {
                    return;
                }
                acoiVar.R(acoiVar.bu, (alqc) this.b, j8);
                return;
            case 16:
                acoi acoiVar2 = (acoi) this.c;
                acoz acozVar2 = acoiVar2.aZ;
                long j9 = this.a;
                if (acozVar2 != null) {
                    acozVar2.c(j9);
                }
                acoiVar2.R(acoiVar2.bu, (alqc) this.b, j9);
                return;
            case 17:
                ((acqz) this.c).R((alvt) this.b, this.a);
                return;
            case 18:
                j$.util.Map.EL.computeIfAbsent(((GlideImageLoggerImpl) this.c).e, this.b, new adis(this.a, i));
                return;
            default:
                long j10 = this.a;
                long jAbs = Math.abs(j10);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long j11 = jAbs / 1000000000;
                long jAbs2 = Math.abs(j10);
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                long j12 = jAbs2 % 1000000000;
                StringBuilder sb = new StringBuilder();
                if (j10 < 0) {
                    sb.append("ClientCall started after ");
                    sb.append((String) this.b);
                    sb.append(" deadline was exceeded. Deadline has been exceeded for ");
                } else {
                    sb.append("Deadline ");
                    sb.append((String) this.b);
                    sb.append(" was exceeded after ");
                }
                sb.append(j11);
                sb.append(String.format(Locale.US, ".%09d", Long.valueOf(j12)));
                sb.append("s waiting for ");
                aveo aveoVar = (aveo) this.c;
                sb.append(aveoVar.b);
                aveoVar.g(Status.e.withDescription(sb.toString()), true);
                return;
        }
    }

    public /* synthetic */ laz(acga acgaVar, acfx acfxVar, long j, int i) {
        this.$cid = i;
        this.b = acgaVar;
        this.c = acfxVar;
        this.a = j;
    }

    public /* synthetic */ laz(Object obj, long j, Object obj2, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = j;
        this.b = obj2;
    }

    public /* synthetic */ laz(Object obj, Object obj2, long j, int i) {
        this.$cid = i;
        this.c = obj;
        this.b = obj2;
        this.a = j;
    }

    public laz(lba lbaVar, String str, long j, int i) {
        this.$cid = i;
        this.b = str;
        this.a = j;
        this.c = lbaVar;
    }

    public laz(lhh lhhVar, lhf lhfVar, long j, int i) {
        this.$cid = i;
        this.c = lhfVar;
        this.a = j;
        this.b = lhhVar;
    }
}
