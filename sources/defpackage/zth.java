package defpackage;

import android.app.Application;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zth implements tcq {
    public final awmd a;
    public final awmd b;
    private tdd c;
    private final awmd d;
    private final Application e;
    private final tag f;
    private final tqj g;
    private boolean h = false;

    public zth(tag tagVar, awmd awmdVar, awmd awmdVar2, Application application, tqj tqjVar, awmd awmdVar3) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.e = application;
        this.f = tagVar;
        this.g = tqjVar;
        this.d = awmdVar3;
        int i = tqr.a;
        if (tqjVar.k(1073815370)) {
            return;
        }
        awmdVar.io();
        awmdVar2.io();
    }

    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        tqj tqjVar = this.g;
        int i = tqr.a;
        if (tqjVar.k(1073830161)) {
            ((oml) this.d.io()).g(this);
        } else {
            tdd tddVar = new tdd(tqjVar);
            this.c = tddVar;
            tddVar.b(this.e);
            this.c.a(this);
        }
        if (qel.d(this.e.getApplicationContext())) {
            return;
        }
        if (tqjVar.k(1073815420)) {
            this.a.io();
            this.b.io();
        }
        t();
    }

    @Override // defpackage.tcq
    public final void t() {
        tai taiVar = tai.a;
        ztg ztgVar = new ztg(this, 1);
        tag tagVar = this.f;
        tagVar.b(taiVar, ztgVar);
        tagVar.b(taiVar, new ztg(this, 0));
    }
}
