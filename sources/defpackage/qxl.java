package defpackage;

import android.content.Context;
import android.webkit.URLUtil;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.attribute.FileAttribute;
import j$.time.Duration;
import j$.util.Optional;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qxl implements qyi {
    public qyh a;
    public qvq b;
    public agkz c;
    public boolean d;
    public boolean e;
    final /* synthetic */ qxm f;
    public qxn g;
    public sry h;

    public qxl(qxm qxmVar, qvq qvqVar, sry sryVar, agkz agkzVar) {
        this.f = qxmVar;
        this.b = qvqVar;
        this.h = sryVar;
        this.c = agkzVar;
    }

    final Duration a() {
        return this.b.q;
    }

    public final Duration b() {
        qvq qvqVar = this.b;
        return qvqVar.p.plus(qvqVar.q);
    }

    public final Duration c() {
        return this.b.p;
    }

    final UUID d() {
        return this.b.m;
    }

    public final void e() {
        Optional optionalEmpty;
        qua quaVar;
        qyh qyhVar = this.a;
        if (qyhVar != null) {
            qyhVar.close();
            rbc rbcVar = new rbc(qxm.z, rbd.c);
            rbcVar.c();
            rbcVar.a("ExoplayerMixerAudioSource is already initialized.", new Object[0]);
        }
        qxm qxmVar = this.f;
        Context context = qxmVar.a;
        qye qyeVar = new qye(context);
        qyeVar.b = this.b;
        qyeVar.p = this.h;
        qyeVar.c = this.c;
        qyeVar.d = qxmVar.q;
        qyeVar.e = qxmVar.d.a;
        rdr rdrVar = (rdr) qxmVar.g;
        qyeVar.f = rdrVar.H;
        qyeVar.g = rdrVar.u;
        qyeVar.l = this;
        qyeVar.k = qxmVar.b;
        qyeVar.o = qxmVar.n;
        qua quaVar2 = qxmVar.i;
        qyeVar.h = quaVar2;
        qyeVar.i = qxmVar.j;
        Optional optional = qxmVar.m;
        optional.isPresent();
        optional.isPresent();
        byd bydVar = (byd) optional.orElse(new byj(context));
        Optional optional2 = qxmVar.l;
        if (optional2.isPresent()) {
            qyeVar.j = new rbx(bydVar, (quo) optional2.get(), quaVar2);
        } else {
            Optional optional3 = qxmVar.k;
            if (optional3.isPresent() && URLUtil.isNetworkUrl(this.b.b.a().toString())) {
                Object obj = optional3.get();
                UUID uuid = this.b.m;
                qxr qxrVar = (qxr) obj;
                if (!qxrVar.c.containsKey(uuid)) {
                    Path path = qxrVar.a;
                    if (Files.exists(path, new LinkOption[0])) {
                        try {
                            Path pathCreateTempDirectory = Files.createTempDirectory(path, "cache", new FileAttribute[0]);
                            bxp bxpVar = qxrVar.d;
                            if (bxpVar == null) {
                                bxpVar = new bxp(qxrVar.b);
                            }
                            optionalEmpty = Optional.of(new qxq(new cab(pathCreateTempDirectory.toFile(), new kys(null), bxpVar), pathCreateTempDirectory, bxpVar));
                        } catch (IOException e) {
                            rbc rbcVar2 = new rbc(qxr.e, rbd.d);
                            rbcVar2.c();
                            rbcVar2.a = e;
                            rbcVar2.a("Failed to create a single source cache.", new Object[0]);
                            optionalEmpty = Optional.empty();
                        }
                    } else {
                        rbc rbcVar3 = new rbc(qxr.e, rbd.a);
                        rbcVar3.c();
                        rbcVar3.a("Cache directory not created", new Object[0]);
                        optionalEmpty = Optional.empty();
                    }
                    hqc hqcVar = new hqc(obj, uuid, 14);
                    if (true == optionalEmpty.isPresent()) {
                        ((qxr) hqcVar.a).c.put(hqcVar.b, optionalEmpty.get());
                    }
                }
                Optional optionalOfNullable = Optional.ofNullable((qxq) qxrVar.c.get(uuid));
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((qxq) optionalOfNullable.get()).a);
                }
                if (optionalOfNullable.isPresent()) {
                    bzo bzoVar = new bzo();
                    bzoVar.a = (bzk) optionalOfNullable.get();
                    bzoVar.b = bydVar;
                    qyeVar.j = bzoVar;
                }
            }
        }
        if (qyeVar.j == null) {
            qyeVar.j = new byj(qyeVar.a);
        }
        if (qyeVar.n == null) {
            qyeVar.n = new clf(qyeVar.a);
        }
        if (qyeVar.i == null && (quaVar = qyeVar.h) != null) {
            qyeVar.i = qys.a(quaVar).a();
        }
        qyeVar.k.getClass();
        this.a = new qyh(qyeVar);
    }

    final void f(Duration duration) {
        long jA = ahbt.a(duration);
        trg trgVar = new trg(jA, null);
        qxp qxpVar = this.f.d;
        qxpVar.b.k(1, trgVar).p();
        this.g = new qxn(qxpVar, jA);
    }

    @Override // defpackage.qyi
    public final void g() {
        qxm qxmVar = this.f;
        qxmVar.g();
        this.d = true;
        qxmVar.c();
    }

    @Override // defpackage.qyi
    public final void h(quk qukVar) {
        qxm qxmVar = this.f;
        qxmVar.g();
        qug qugVar = qxmVar.h;
        if (qugVar != null) {
            ((rdr) qugVar).D(qukVar);
        }
    }

    @Override // defpackage.qyi
    public final void i() {
        this.f.g();
        this.e = true;
    }
}
