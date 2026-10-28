package defpackage;

import android.os.Handler;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wvu extends wvv {
    private Queue h;
    private long i;
    private long j;
    private boolean k;
    private final wwn l;

    public wvu(Handler handler, ahgb ahgbVar, wxi wxiVar, wwn wwnVar, ahey aheyVar, vxz vxzVar) {
        super(handler, ahgbVar, wxiVar, aheyVar, vxzVar);
        this.l = wwnVar;
    }

    @Override // defpackage.wvv, defpackage.wvt
    public final synchronized void a(List list, long j) {
        if (this.h == null) {
            return;
        }
        this.i = Long.MIN_VALUE;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ajwo ajwoVar = (ajwo) it.next();
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ammw.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ammw.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                ammw ammwVar = (ammw) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                this.h.add(ammwVar);
                long j2 = ammwVar.d;
                if (j2 > this.i) {
                    this.i = j2;
                }
            }
        }
        this.k = true;
        g(this.j);
    }

    @Override // defpackage.wvv, defpackage.wvt, defpackage.wxn
    public final synchronized void b() {
        this.k = false;
    }

    @Override // defpackage.wvt, defpackage.wxn
    public final synchronized void c() {
        this.k = true;
    }

    @Override // defpackage.wvv, defpackage.wvt, defpackage.wxn
    public final synchronized void d() {
        this.h = new ArrayDeque();
        this.j = 0L;
        this.k = true;
        this.i = Long.MIN_VALUE;
    }

    @Override // defpackage.wvv, defpackage.wvt, defpackage.wxn
    public final synchronized void e() {
        this.h = null;
        this.k = false;
    }

    public final synchronized void f(long j) {
        this.j = j;
        this.i = Long.MIN_VALUE;
        ((wwn) this.a).d.l();
        this.h.clear();
        wvr wvrVar = new wvr(this, 2);
        wwn wwnVar = this.l;
        List<amqo> list = wwnVar.f;
        if (list != null) {
            for (amqo amqoVar : list) {
                if ((amqoVar.b & 16) != 0) {
                    wwnVar.f = null;
                    wxa wxaVar = wwnVar.k;
                    aosj aosjVar = amqoVar.g;
                    if (aosjVar == null) {
                        aosjVar = aosj.a;
                    }
                    wxr wxrVar = wxaVar.e.e;
                    if (wxrVar != null) {
                        wxrVar.o();
                    }
                    aihf aihfVarCreateBuilder = amnx.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    amnx amnxVar = (amnx) aihfVarCreateBuilder.instance;
                    amnxVar.b |= 2;
                    amnxVar.c = j;
                    amnx amnxVar2 = (amnx) aihfVarCreateBuilder.build();
                    acjx acjxVarAe = aawb.ae(aosjVar);
                    wqs wqsVarG = wxaVar.f.g();
                    wqsVarG.a = amnxVar2;
                    wqsVarG.q(acjxVarAe);
                    wqsVarG.o(aosjVar.d.G());
                    wxaVar.u(wqsVarG, acjxVarAe, wvrVar);
                    this.k = false;
                    break;
                }
            }
        }
    }

    public final synchronized void g(long j) {
        if (this.h != null) {
            long j2 = this.j;
            long j3 = (-1000) + j2;
            long j4 = j2 + 10000;
            long j5 = this.i;
            long j6 = 0;
            long j7 = j5 > j ? j5 - j : 0L;
            if (j < j3 || (j > j4 && j > j5 && this.l.y())) {
                f(j);
                return;
            }
            Queue queue = this.h;
            queue.getClass();
            wxi wxiVar = this.a;
            wwv wwvVar = ((wwn) wxiVar).r;
            boolean z = wwvVar != null && wwvVar.a() == 0;
            while (!queue.isEmpty() && ((ammw) queue.peek()).d <= j) {
                aiie aiieVar = ((ammw) queue.remove()).c;
                if (z) {
                    this.b.k(aiieVar, wxiVar, false);
                } else {
                    super.a(aiieVar, 1000L);
                }
            }
            if (z) {
                wwvVar.o();
            }
            if (this.k) {
                wwn wwnVar = this.l;
                List<amqo> list = wwnVar.f;
                if (list != null) {
                    for (amqo amqoVar : list) {
                        if ((amqoVar.b & 8) != 0) {
                            amqr amqrVar = amqoVar.f;
                            if (amqrVar == null) {
                                amqrVar = amqr.a;
                            }
                            j6 = amqrVar.c;
                            break;
                        }
                    }
                }
                this.j = j;
                if (j7 < j6 || (this.h.isEmpty() && wwnVar.y())) {
                    aaaj aaajVar = wwnVar.b;
                    if (aaajVar != null) {
                        aaajVar.b();
                    }
                    List<amqo> list2 = wwnVar.f;
                    if (list2 != null) {
                        for (amqo amqoVar2 : list2) {
                            if ((amqoVar2.b & 8) != 0) {
                                wxa wxaVar = wwnVar.k;
                                amqr amqrVar2 = amqoVar2.f;
                                if (amqrVar2 == null) {
                                    amqrVar2 = amqr.a;
                                }
                                wxaVar.iM(aawb.ae(amqrVar2));
                                this.k = false;
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
