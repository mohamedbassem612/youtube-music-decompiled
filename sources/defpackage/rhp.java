package defpackage;

import android.util.Size;
import com.google.mediapipe.framework.GraphTextureFrame;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.TextureFrame;
import com.google.research.aimatter.drishti.DrishtiCache;
import com.google.research.aimatter.drishti.DrishtiLruCache;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.InputFrameSource;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rhp {
    public Size a;
    public rhr b;
    public Optional c;
    public rhh e;
    public rjb h;
    public rjc i;
    private rhu k;
    public final atvx j = atth.a();
    public qua d = qua.a();
    public InputFrameSource f = InputFrameSource.VIDEO;
    public final Optional g = Optional.empty();

    public final rht a() {
        rhu rhbVar;
        Object obj;
        atwd atwdVar;
        Object obj2;
        atwc atwcVar;
        if (this.d.k) {
            this.j.a = rht.c;
        }
        if (this.e == null) {
            this.e = new rhh(Optional.empty(), Optional.empty());
        }
        if (this.k == null) {
            atth atthVarE = this.j.e();
            if (this.d.i) {
                rhh rhhVar = this.e;
                int i = rhhVar.f;
                synchronized (rhhVar.a) {
                    Optional optional = rhhVar.b;
                    hly hlyVar = new hly(rhhVar, 7);
                    if (true != optional.isPresent()) {
                        Object obj3 = hlyVar.a;
                        if (((rhh) obj3).d == null) {
                            ((rhh) obj3).d = new atwd(atwd.nativeCreateHandle());
                        }
                        obj = ((rhh) obj3).d;
                    } else {
                        obj = optional.get();
                    }
                    atwdVar = (atwd) obj;
                }
                rhh rhhVar2 = this.e;
                synchronized (rhhVar2.a) {
                    Optional optional2 = rhhVar2.c;
                    hly hlyVar2 = new hly(rhhVar2, 8);
                    if (true != optional2.isPresent()) {
                        Object obj4 = hlyVar2.a;
                        if (((rhh) obj4).e == null) {
                            ((rhh) obj4).e = new atwc(atwc.nativeCreateHandle());
                        }
                        obj2 = ((rhh) obj4).e;
                    } else {
                        obj2 = optional2.get();
                    }
                    atwcVar = (atwc) obj2;
                }
                rhbVar = new rha(atwdVar, atwcVar, atthVarE);
                this.g.isPresent();
            } else {
                int i2 = this.e.f;
                rhbVar = new rhb(atthVarE);
            }
            this.k = rhbVar;
        }
        this.k.e(this.f, this.a);
        final rht rhtVar = new rht(this.k, this.b, this.c, this.h, this.i, this.d);
        this.k.i(new atur() { // from class: rhn
            @Override // defpackage.atur
            public final void l(Packet packet, String str, Object obj5) {
                Effect effect = (Effect) obj5;
                rht rhtVar2 = rhtVar;
                if (rhtVar2.e.get()) {
                    if (packet != null) {
                        packet.release();
                        return;
                    }
                    rbc rbcVar = new rbc(rht.q, rbd.c);
                    rbcVar.c();
                    rbcVar.a("Xeno reported an aux output with null packet after the release!", new Object[0]);
                    return;
                }
                agke agkeVar = rhtVar2.p;
                atur aturVar = rhtVar2.o;
                int size = agkeVar.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Cloneable cloneable = (qvk) agkeVar.get(i3);
                    if (cloneable instanceof qyw) {
                        qyw qywVar = (qyw) cloneable;
                        if (qywVar.k().contains(str)) {
                            qywVar.l(packet, str, effect);
                        }
                    }
                }
                if (aturVar != null) {
                    aturVar.l(packet, str, effect);
                }
            }
        });
        this.k.j(rhtVar);
        this.k.l(new ahxk() { // from class: rho
            @Override // defpackage.ahxk
            public final void iB(TextureFrame textureFrame) {
                rht rhtVar2 = rhtVar;
                rfs rfsVar = new rfs(new rhm(rhtVar2, textureFrame));
                GraphTextureFrame graphTextureFrame = (GraphTextureFrame) textureFrame;
                if (graphTextureFrame.d <= rhtVar2.h.get()) {
                    rbc rbcVar = new rbc(rht.q, rbd.a);
                    rbcVar.c();
                    rbcVar.a("Received a frame from Xeno from an old effect after setEffect's callback was called.", new Object[0]);
                    rfsVar.release();
                    return;
                }
                if (rhtVar2.e.get()) {
                    new rbc(rht.q, rbd.a).a("Received a frame from Xeno after releasing XenoEffect texture processor.", new Object[0]);
                    rfsVar.release();
                    return;
                }
                rhs rhsVarI = rhtVar2.i(textureFrame);
                if (rhsVarI == null) {
                    rbc rbcVar2 = new rbc(rht.q, rbd.e);
                    rbcVar2.c();
                    rbcVar2.a("Unable to reattach frame metadata for frame at time %d", Long.valueOf(graphTextureFrame.d));
                    rfsVar.release();
                } else {
                    rfsVar.d = rhsVarI.a;
                    rfsVar.c = rhsVarI.c;
                    if (rhtVar2.i.Y) {
                        synchronized (rhtVar2) {
                            rhs rhsVar = (rhs) rhtVar2.l.peek();
                            if (rhsVar != null) {
                                if (rhsVar.d) {
                                    rhsVar.d = false;
                                    rhsVar.c.c();
                                } else {
                                    rbc rbcVar3 = new rbc(rht.q, rbd.c);
                                    rbcVar3.c();
                                    rbcVar3.a("Processing resumed when it was not paused.", new Object[0]);
                                }
                            }
                        }
                    }
                    rhtVar2.e(rfsVar);
                }
                synchronized (rhtVar2) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = rhtVar2.l;
                    rhs rhsVar2 = (rhs) concurrentLinkedQueue.peek();
                    if (rhsVar2 != null && rhsVar2.c.a != null) {
                        rfs rfsVarH = rfs.h();
                        rhs rhsVar3 = (rhs) concurrentLinkedQueue.poll();
                        rhsVar3.getClass();
                        rfsVarH.c = rhsVar3.c;
                        rhtVar2.e(rfsVarH);
                    }
                }
            }
        });
        return rhtVar;
    }

    public final void b(DrishtiCache drishtiCache) {
        this.j.b = drishtiCache;
    }

    public final void c(Optional optional) {
        if (optional.isPresent()) {
            atvx atvxVar = this.j;
            DrishtiLruCache drishtiLruCache = (DrishtiLruCache) optional.get();
            atvxVar.g(agke.q(Long.valueOf(drishtiLruCache.b.get() ? drishtiLruCache.a : 0L)));
        }
    }

    public final void d(ahxp ahxpVar) {
        if (ahxpVar != null) {
            atvx atvxVar = this.j;
            if (ahxpVar.f == 0) {
                ahxpVar.d();
            }
            atvxVar.f(ahxpVar.f);
        }
    }
}
