package com.google.android.libraries.youtube.mdx.mediaroute.service;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.google.android.apps.youtube.music.R;
import defpackage.aawl;
import defpackage.abrp;
import defpackage.abrt;
import defpackage.abru;
import defpackage.abvn;
import defpackage.agrf;
import defpackage.agrx;
import defpackage.agso;
import defpackage.avlh;
import defpackage.avmm;
import defpackage.awmd;
import defpackage.axg;
import defpackage.hzt;
import defpackage.sep;
import defpackage.seq;
import defpackage.tbt;
import defpackage.tcc;
import defpackage.xmr;
import defpackage.xru;
import defpackage.xsc;
import defpackage.xul;
import defpackage.xut;
import defpackage.xuu;
import defpackage.xuv;
import defpackage.xxj;
import defpackage.xzg;
import defpackage.ycp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class RemotePlaybackControlsService extends xut {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/mediaroute/service/RemotePlaybackControlsService");
    public tbt b;
    public abvn c;
    public abrt d;
    public abrt e;
    public xuu f;
    public abrp g;
    public awmd h;
    public awmd i;
    public xmr j;
    public abru k;
    public hzt l;
    public xuu m;
    final xxj n = new xxj(this);
    private final avmm o = new avmm();
    private final xzg p = new xuv(this);
    private final xxj r = new xxj(this);
    private final xxj q = new xxj(this);

    public final void b() {
        this.k.c();
        this.e.d(false);
        this.d.h();
    }

    public final void c() {
        boolean zJ = ((ycp) this.i.io()).j();
        xsc xscVar = ((xru) this.h.io()).j;
        if (zJ) {
            b();
        } else if (xscVar != null) {
            this.d.c = getString(R.string.now_playing_on_screen, new Object[]{axg.a().b((String) xscVar.a)});
        } else {
            agrx agrxVar = agso.a;
        }
    }

    @tcc
    void handleAdVideoStageEvent(seq seqVar) {
        if (((ycp) this.i.io()).e != null) {
            sep sepVar = seqVar.a;
            b();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        agrx agrxVar = agso.a;
        c();
        return new Binder();
    }

    @Override // defpackage.xut, android.app.Service
    public final void onCreate() {
        agrx agrxVar = agso.a;
        super.onCreate();
        abrt abrtVar = this.d;
        abrtVar.e = this.q;
        abrtVar.g(this.l, this.f);
        this.d.f = this.r;
        this.e.g(this.l, this.m);
        this.g.h(this);
        abvn abvnVar = this.c;
        Object obj = abvnVar.r().a;
        xxj xxjVar = this.n;
        this.o.e(((avlh) obj).ak(new aawl(new xul(xxjVar, 2), "RPCS", 1)), ((avlh) abvnVar.r().n).ak(new xul(xxjVar, 3)));
        this.b.f(this);
        ((ycp) this.i.io()).b(this.p);
        ((xru) this.h.io()).L();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        agrx agrxVar = agso.a;
        this.d.f = null;
        ((xru) this.h.io()).M();
        this.d.d(true);
        this.e.d(true);
        this.g.h(null);
        this.o.b();
        this.b.l(this);
        ((ycp) this.i.io()).d.remove(this.p);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
    }
}
