package defpackage;

import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aett implements Runnable, bnu {
    public final String a;
    public final vxe b;
    final ArrayList c;
    final ArrayList d;
    final ArrayList e;
    final ArrayList f;
    final WeakReference g;
    public agev h;
    public boolean i;
    public boolean j;
    private final Executor l;
    private final ScheduledExecutorService m;
    private final awmd n;
    private final mbc o;
    private ScheduledFuture q;
    private long p = 0;
    public byte[] k = new byte[0];

    public aett(vxe vxeVar, mbc mbcVar, awmd awmdVar, String str, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.b = vxeVar;
        this.o = mbcVar;
        this.n = awmdVar;
        this.a = str;
        this.l = executor;
        this.m = scheduledExecutorService;
        agke agkeVar = agpi.a;
        this.h = agdf.a;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new WeakReference(null);
    }

    private final void c() {
        ScheduledFuture scheduledFuture = this.q;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.q = null;
        }
    }

    public final void a() {
        agrx agrxVar = agso.a;
        c();
        this.h = agdf.a;
        agke agkeVar = agpi.a;
        this.g.clear();
        this.p = 0L;
        this.j = true;
    }

    public final void b(long j) {
        this.q = this.m.schedule(this, j, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        this.l.execute(this);
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        c();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, zwb] */
    @Override // java.lang.Runnable
    public final void run() {
        long epochMilli = this.o.f().toEpochMilli();
        long j = this.p;
        if (j != 0 && epochMilli - j < 5000) {
            agrx agrxVar = agso.a;
            b(5000L);
            return;
        }
        this.p = epochMilli;
        awmd awmdVar = this.n;
        Optional optionalEmpty = Optional.empty();
        aend aendVar = (aend) awmdVar.io();
        String str = this.h.g() ? null : this.a;
        byte[] bArr = this.h.g() ? null : this.k;
        String str2 = (String) this.h.f();
        aqzz aqzzVar = (aqzz) optionalEmpty.orElse(null);
        wuh wuhVar = new wuh(aendVar.b, aendVar.d.e());
        wuhVar.a = str;
        wuhVar.c = bArr;
        wuhVar.b = str2;
        if (aqzzVar != null) {
            wuhVar.d = aqzzVar;
        }
        taf.i(aendVar.f(alzc.a, (wlp) aendVar.c, new wsj(18), new wtk(13)).a(wuhVar), this.l, new aelg(this, 2), new tae() { // from class: aets
            @Override // defpackage.tae, defpackage.twi
            public final void a(Object obj) {
                aqmx aqmxVar;
                alzc alzcVar = (alzc) obj;
                aett aettVar = this.a;
                if (aettVar.j) {
                    return;
                }
                aiie<ajwo> aiieVar = alzcVar.e;
                ArrayList arrayList = aettVar.c;
                ArrayList arrayList2 = aettVar.d;
                ArrayList arrayList3 = aettVar.e;
                ArrayList arrayList4 = aettVar.f;
                for (ajwo ajwoVar : aiieVar) {
                    aihl aihlVar = aqzy.b;
                    aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
                    ajwoVar.c(aihlVarCheckIsLite);
                    if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                        ajwoVar.c(aihlVarCheckIsLite2);
                        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                        aqzy aqzyVar = (aqzy) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                        if (!aqzyVar.d) {
                            arec arecVar = aqzyVar.c;
                            if (arecVar == null) {
                                arecVar = arec.a;
                            }
                            if ((arecVar.b & 1) != 0) {
                                arec arecVar2 = aqzyVar.c;
                                if (arecVar2 == null) {
                                    arecVar2 = arec.a;
                                }
                                arfy arfyVar = arecVar2.c;
                                if (arfyVar == null) {
                                    arfyVar = arfy.a;
                                }
                                long j2 = arfyVar.b;
                                arec arecVar3 = aqzyVar.c;
                                if (arecVar3 == null) {
                                    arecVar3 = arec.a;
                                }
                                arfy arfyVar2 = arecVar3.c;
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    aetx aetxVar = (aetx) ((WeakReference) it.next()).get();
                                    if (aetxVar != null) {
                                        aetxVar.a();
                                    }
                                }
                            }
                        }
                    } else {
                        aihl aihlVar2 = aqzj.b;
                        aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar2);
                        ajwoVar.c(aihlVarCheckIsLite3);
                        if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar2);
                            ajwoVar.c(aihlVarCheckIsLite4);
                            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                            apji apjiVar = ((aqzj) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2))).c;
                            if (apjiVar == null) {
                                apjiVar = apji.a;
                            }
                            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(akmr.a);
                            apjiVar.c(aihlVarCheckIsLite5);
                            Object objK3 = apjiVar.j.k(aihlVarCheckIsLite5.d);
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                aetw aetwVar = (aetw) ((WeakReference) it2.next()).get();
                                if (aetwVar != null) {
                                    aetwVar.a();
                                }
                            }
                        } else {
                            aihl aihlVar3 = aqzw.b;
                            aihl aihlVarCheckIsLite6 = aihn.checkIsLite(aihlVar3);
                            ajwoVar.c(aihlVarCheckIsLite6);
                            if (ajwoVar.j.n(aihlVarCheckIsLite6.d)) {
                                aihl aihlVarCheckIsLite7 = aihn.checkIsLite(aihlVar3);
                                ajwoVar.c(aihlVarCheckIsLite7);
                                Object objK4 = ajwoVar.j.k(aihlVarCheckIsLite7.d);
                                aqzw aqzwVar = (aqzw) (objK4 == null ? aihlVarCheckIsLite7.b : aihlVarCheckIsLite7.c(objK4));
                                if ((aqzwVar.c & 4) != 0) {
                                    Iterator it3 = arrayList3.iterator();
                                    while (it3.hasNext()) {
                                        aetv aetvVar = (aetv) ((WeakReference) it3.next()).get();
                                        if (aetvVar != null) {
                                            int i = aqzwVar.f;
                                            if (aqzwVar.d == null) {
                                                alay alayVar = alay.a;
                                            }
                                            if (aqzwVar.e == null) {
                                                alay alayVar2 = alay.a;
                                            }
                                            aetvVar.a();
                                        }
                                    }
                                }
                            } else {
                                aihl aihlVar4 = aqze.b;
                                aihl aihlVarCheckIsLite8 = aihn.checkIsLite(aihlVar4);
                                ajwoVar.c(aihlVarCheckIsLite8);
                                if (ajwoVar.j.n(aihlVarCheckIsLite8.d)) {
                                    aihl aihlVarCheckIsLite9 = aihn.checkIsLite(aihlVar4);
                                    ajwoVar.c(aihlVarCheckIsLite9);
                                    Object objK5 = ajwoVar.j.k(aihlVarCheckIsLite9.d);
                                    aqze aqzeVar = (aqze) (objK5 == null ? aihlVarCheckIsLite9.b : aihlVarCheckIsLite9.c(objK5));
                                    apji apjiVar2 = aqzeVar.c;
                                    if (apjiVar2 == null) {
                                        apjiVar2 = apji.a;
                                    }
                                    aihl aihlVarCheckIsLite10 = aihn.checkIsLite(ajiv.a);
                                    apjiVar2.c(aihlVarCheckIsLite10);
                                    Object objK6 = apjiVar2.j.k(aihlVarCheckIsLite10.d);
                                    apji apjiVar3 = aqzeVar.d;
                                    if (apjiVar3 == null) {
                                        apjiVar3 = apji.a;
                                    }
                                    aihl aihlVarCheckIsLite11 = aihn.checkIsLite(aosc.a);
                                    apjiVar3.c(aihlVarCheckIsLite11);
                                    Object objK7 = apjiVar3.j.k(aihlVarCheckIsLite11.d);
                                    Iterator it4 = arrayList4.iterator();
                                    while (it4.hasNext()) {
                                        aetu aetuVar = (aetu) ((WeakReference) it4.next()).get();
                                        if (aetuVar != null) {
                                            aetuVar.a();
                                        }
                                    }
                                } else {
                                    aettVar.b.a(ajwoVar);
                                }
                            }
                        }
                    }
                }
                WeakReference weakReference = aettVar.g;
                aetr aetrVar = (aetr) weakReference.get();
                if (aetrVar != null) {
                    aetrVar.a();
                    weakReference.clear();
                }
                if ((alzcVar.b & 2) != 0) {
                    alzd alzdVar = alzcVar.d;
                    if (alzdVar == null) {
                        alzdVar = alzd.a;
                    }
                    aqmxVar = alzdVar.b;
                    if (aqmxVar == null) {
                        aqmxVar = aqmx.a;
                    }
                } else {
                    aqmxVar = null;
                }
                if (aqmxVar == null) {
                    aettVar.h = agdf.a;
                    aettVar.a();
                } else {
                    aettVar.h = agev.i(aqmxVar.d);
                    int i2 = aqmxVar.c;
                    aettVar.b(i2 != 0 ? i2 : 30000L);
                    agrx agrxVar2 = agso.a;
                }
                aiie aiieVar2 = alzcVar.e;
            }
        }, new aeia(6));
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }
}
