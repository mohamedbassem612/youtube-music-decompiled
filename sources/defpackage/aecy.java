package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.blocks.Container;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aecy implements aecs {
    private final Optional c;
    private final View d;
    private apop e;
    private aecf f = aecf.a;
    private afyx g;
    private final vwt h;
    private final abxv i;

    public aecy(abxv abxvVar, awmd awmdVar, Optional optional, vwt vwtVar, View view, Optional optional2) {
        this.d = view;
        this.c = optional;
        this.i = abxvVar;
        this.h = vwtVar;
        Container container = (Container) awmdVar.io();
        if (container != null) {
            this.g = (afyx) container.a(new afyw(0));
        }
        if (true == optional2.isPresent()) {
            adxd adxdVar = (adxd) optional2.get();
            optional2 = Optional.ofNullable(adxdVar instanceof aecx ? (aecx) adxdVar : null);
        }
        aerg aergVar = new aerg(this, 1);
        if (true == optional2.isPresent()) {
            ((aecy) aergVar.a).j(null, null);
        }
    }

    @Override // defpackage.aecf
    public final int a() {
        return this.f.a();
    }

    @Override // defpackage.aecf
    public final Optional b() {
        return !h() ? Optional.of(avlr.z()) : this.f.b();
    }

    @Override // defpackage.aecf
    public final void c() {
        this.f.c();
    }

    @Override // defpackage.aecf
    public final boolean d(Object obj) {
        return this.f.d(obj);
    }

    @Override // defpackage.aecs
    public final Optional e() {
        return Optional.ofNullable(this.g);
    }

    @Override // defpackage.aecs
    public final Optional f() {
        return this.c;
    }

    @Override // defpackage.aecs
    public final boolean g() {
        return false;
    }

    @Override // defpackage.aecs
    public final boolean h() {
        return this.e != null;
    }

    @Override // defpackage.aecs
    public final ListenableFuture i(apop apopVar, adwq adwqVar) {
        return j(apopVar, adwqVar);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [aunn, java.lang.Object] */
    public final ListenableFuture j(apop apopVar, adwq adwqVar) {
        Optional optionalEmpty;
        Optional optionalEmpty2;
        aecf aecjVar;
        this.e = apopVar;
        Optional optionalEmpty3 = Optional.empty();
        if (apopVar != null && (apopVar.b & 2) != 0) {
            apkx apkxVar = apopVar.d;
            if (apkxVar == null) {
                apkxVar = apkx.a;
            }
            optionalEmpty3 = Optional.of(new aect(apkxVar));
        }
        Optional optional = optionalEmpty3;
        this.f.c();
        if (apopVar == null) {
            aecjVar = aecf.a;
        } else {
            abxv abxvVar = this.i;
            vwt vwtVar = this.h;
            View view = this.d;
            amjx amjxVar = apopVar.c;
            if (amjxVar == null) {
                amjxVar = amjx.a;
            }
            amjx amjxVar2 = amjxVar;
            Optional optional2 = this.c;
            Optional optionalEmpty4 = Optional.empty();
            if (adwqVar != null) {
                optionalEmpty = Optional.ofNullable(adwqVar.a);
                optionalEmpty2 = Optional.ofNullable(adwqVar.b);
            } else {
                optionalEmpty = Optional.empty();
                optionalEmpty2 = Optional.empty();
            }
            Optional optional3 = optionalEmpty2;
            Optional optional4 = optionalEmpty;
            Context context = (Context) abxvVar.c.io();
            context.getClass();
            avmb avmbVar = (avmb) abxvVar.a.io();
            avmbVar.getClass();
            ?? Io = abxvVar.b.io();
            Io.getClass();
            Executor executor = (Executor) abxvVar.d.io();
            executor.getClass();
            amjxVar2.getClass();
            aecjVar = new aecj(context, avmbVar, Io, executor, vwtVar, view, amjxVar2, optional2, optional, optionalEmpty4, optional4, optional3, "responsive_signal_block_without_key");
        }
        this.f = aecjVar;
        return new aher(Boolean.valueOf(apopVar != null));
    }
}
