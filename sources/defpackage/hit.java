package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hit implements zza {
    public final /* synthetic */ hiv a;
    private final hjn b;
    private int c;

    public hit(hiv hivVar, hjn hjnVar) {
        this.a = hivVar;
        this.b = hjnVar;
    }

    private final void g() {
        int i = this.c;
        this.c = i + 1;
        hjn hjnVar = this.b;
        zne zneVar = hjnVar.i;
        hiv hivVar = this.a;
        if (i < 3) {
            hit hitVar = (hit) hivVar.y.get(zneVar);
            if (hitVar != null) {
                taf.i(((wqm) hivVar.g.io()).m(hivVar.a(hjnVar)), (Executor) hivVar.v.io(), new gtq(hitVar, 10), new gln(hitVar, 14), null);
                return;
            }
            return;
        }
        hivVar.y.remove(zneVar);
        ListenableFuture listenableFuture = hivVar.A;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            hivVar.A = null;
        }
        h();
        this.c = 0;
    }

    private final void h() {
        hiv hivVar = this.a;
        hir hirVar = (hir) hivVar.f.io();
        hjn hjnVar = this.b;
        if (!hirVar.e(hjnVar)) {
            hjnVar.c(agpi.a, null);
        }
        if (txz.d((Context) hivVar.e.io())) {
            zne zneVar = hjnVar.i;
            aunn aunnVar = hivVar.l;
            ((isw) aunnVar.io()).h(zneVar.a());
        }
    }

    public final void d(amzv amzvVar, Set set, ListenableFuture listenableFuture) {
        taf.i(listenableFuture, (Executor) this.a.v.io(), new gou(this, amzvVar, 9), new gsu(this, amzvVar, set, 16), null);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x011a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0126  */
    public final void e(amzv amzvVar, Set set) {
        amzl amzlVar;
        int i;
        hiv hivVar = this.a;
        aunn aunnVar = hivVar.f;
        hir hirVar = (hir) aunnVar.io();
        hjn hjnVar = this.b;
        zne zneVar = hjnVar.i;
        hiq hiqVarA = hirVar.a(zneVar);
        if ((amzvVar.b & 2) != 0) {
            amzl amzlVar2 = amzvVar.e;
            if (amzlVar2 == null) {
                amzlVar2 = amzl.a;
            }
            amzlVar = amzlVar2;
        } else {
            amzlVar = null;
        }
        hiqVarA.g(amzvVar.d, amzlVar, hjnVar, set, amzvVar.f.G());
        if (((hir) aunnVar.io()).b(gzl.f) && ((hir) aunnVar.io()).b(gzl.g)) {
            znf znfVarA = hiqVarA.a().a();
            hiqVarA.l(znfVarA, yno.ai(gzl.a));
            hiqVarA.l(znfVarA, yno.ai(gzl.d));
            hiqVarA.k(znfVarA, agke.q(((hin) hivVar.k.io()).a(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_LOCAL_CONTENT_PARENT)));
        }
        hir hirVar2 = (hir) aunnVar.io();
        synchronized (hirVar2.b) {
            hirVar2.g.add(zneVar);
        }
        String.format("MBS: MBFE Root loaded for client '%s'", zneVar);
        hiv hivVar2 = this.a;
        hivVar2.y.remove(zneVar);
        this.c = 0;
        hivVar2.A = null;
        if ((zneVar.equals(zlw.a) || zneVar.equals(zlx.a)) && amzvVar.j.size() != 0 && !((jnm) hivVar2.o.io()).C()) {
            ailm ailmVarA = ((hja) hivVar2.u.io()).a(zneVar, hivVar2.z);
            int i2 = ailmVarA.b;
            if ((i2 & 1) == 0 || (i2 & 2) == 0) {
                for (amzz amzzVar : amzvVar.j) {
                    i = amzzVar.b;
                    if ((i & 8) == 0 && (i & 1) != 0) {
                        hivVar2.z = amzzVar.e;
                        ((hir) hivVar2.f.io()).a(zneVar).f(amzzVar);
                        break;
                    }
                }
            } else {
                int i3 = ailmVarA.c;
                if (i3 < 4) {
                    aijp aijpVar = ailmVarA.d;
                    if (aijpVar == null) {
                        aijpVar = aijp.a;
                    }
                    Instant instantAx = ahng.ax(aijpVar);
                    Instant instantNow = Instant.now();
                    Duration duration = i3 <= 0 ? Duration.ZERO : new Duration[]{hiv.a, hiv.b, hiv.c}[i3 - 1];
                    Duration durationBetween = Duration.between(instantAx, instantNow);
                    if (duration != null && durationBetween.compareTo(duration) >= 0) {
                        while (r13.hasNext()) {
                            i = amzzVar.b;
                            if ((i & 8) == 0) {
                            }
                        }
                    }
                }
            }
        }
        h();
        if (hhs.b(zneVar)) {
            ((awkx) hivVar2.n.io()).kk(zneVar);
        }
    }

    @Override // defpackage.tnh
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void a(amzv amzvVar) {
        hit hitVar;
        boolean z;
        hjn hjnVar = this.b;
        hjnVar.b(tau.MEDIA_BROWSER_GET_ROOT_RESPONSE_RECEIVED);
        if (amzvVar != null) {
            if ((amzvVar.b & 32) != 0) {
                amzu amzuVar = amzvVar.i;
                if (amzuVar == null) {
                    amzuVar = amzu.a;
                }
                anki ankiVar = amzuVar.b == 100625508 ? (anki) amzuVar.c : anki.a;
                hiv hivVar = this.a;
                axfd axfdVar = (axfd) hivVar.p.io();
                aunn aunnVar = hivVar.q;
                axfdVar.av(((zwb) aunnVar.io()).e(), ankiVar.toBuilder());
                ((jnm) hivVar.o.io()).B(((zwb) aunnVar.io()).e(), ankiVar);
            } else {
                Iterator it = amzvVar.g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    amzp amzpVarA = amzp.a(((amzq) it.next()).c);
                    if (amzpVarA == null) {
                        amzpVarA = amzp.MEDIA_BROWSER_ERROR_CODE_UNKNOWN;
                    }
                    if (amzpVarA == amzp.MEDIA_BROWSER_ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED) {
                        z = false;
                        break;
                    }
                }
                hiv hivVar2 = this.a;
                jnm jnmVar = (jnm) hivVar2.o.io();
                aunn aunnVar2 = hivVar2.q;
                jnmVar.A(((zwb) aunnVar2.io()).e(), z);
                aunn aunnVar3 = hivVar2.e;
                if (txz.d((Context) aunnVar3.io()) || txz.g((Context) aunnVar3.io())) {
                    ((axfd) hivVar2.p.io()).ar(((zwb) aunnVar2.io()).e(), z);
                }
            }
        }
        hiv hivVar3 = this.a;
        if (amzvVar != null && amzvVar.j.size() > 0) {
            ((awkx) ((grj) hivVar3.m.io()).a).kk((amzz) amzvVar.j.get(0));
        }
        zne zneVar = hjnVar.i;
        if (amzvVar == null) {
            hitVar = this;
        } else {
            if (amzvVar.d.size() > 0) {
                if (hivVar3.A == null) {
                    hivVar3.A = ((hin) hivVar3.k.io()).e(zneVar);
                }
                ListenableFuture listenableFuture = ((hia) hivVar3.t.io()).y;
                if (listenableFuture != null) {
                    taf.i(hivVar3.A, (Executor) hivVar3.v.io(), new gwc(this, amzvVar, listenableFuture, 5), new gsu(this, amzvVar, listenableFuture, 15, (byte[]) null), null);
                    return;
                } else {
                    taf.i(hivVar3.A, (Executor) hivVar3.v.io(), new gou(this, amzvVar, 8), new gov(this, amzvVar, 11), null);
                    return;
                }
            }
            hitVar = this;
            if (amzvVar.g.size() > 0) {
                ListenableFuture listenableFuture2 = hivVar3.A;
                if (listenableFuture2 != null) {
                    listenableFuture2.cancel(false);
                }
                hivVar3.A = null;
                hir hirVar = (hir) hivVar3.f.io();
                amzq amzqVar = (amzq) amzvVar.g.get(0);
                synchronized (hirVar.a) {
                    hirVar.f.put(zneVar, amzqVar);
                }
                hiv hivVar4 = hitVar.a;
                String.format("MBS: Online tree loaded with error message for client %s", zneVar);
                hivVar4.y.remove(zneVar);
                hitVar.h();
                hitVar.c = 0;
                return;
            }
            if (amzvVar.j.size() != 0) {
                return;
            }
        }
        String.format("MBS: Empty tree received for client %s", zneVar);
        hitVar.g();
    }

    @Override // defpackage.tng
    public final void jj(toe toeVar) {
        hjn hjnVar = this.b;
        hjnVar.b(tau.MEDIA_BROWSER_GET_ROOT_REQUEST_FAILED);
        zvp.a(zvn.b, zvm.n, toeVar.getMessage() != null ? toeVar.getMessage() : "Lacking required capabilities.");
        hiv hivVar = this.a;
        ((Handler) hivVar.r.io()).post(new hgx(this, 5));
        zne zneVar = hjnVar.i;
        if (this.c == 0 && hhs.b(zneVar)) {
            ((awkx) hivVar.n.io()).kk(zneVar);
        }
        g();
    }

    @Override // defpackage.zza
    public final /* synthetic */ void jk() {
    }
}
