package com.bumptech.glide;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.support.rastermill.FrameSequenceDrawable;
import com.google.android.libraries.youtube.rendering.image.glide.GlideLoaderModule;
import defpackage.a;
import defpackage.accu;
import defpackage.adhp;
import defpackage.adid;
import defpackage.adie;
import defpackage.adif;
import defpackage.adig;
import defpackage.adii;
import defpackage.adiy;
import defpackage.adiz;
import defpackage.adjj;
import defpackage.adjk;
import defpackage.aerj;
import defpackage.agfa;
import defpackage.aqmh;
import defpackage.ayq;
import defpackage.ci;
import defpackage.erj;
import defpackage.erl;
import defpackage.eru;
import defpackage.erv;
import defpackage.esb;
import defpackage.ese;
import defpackage.esf;
import defpackage.etg;
import defpackage.evs;
import defpackage.ewn;
import defpackage.ewo;
import defpackage.ewv;
import defpackage.eww;
import defpackage.exf;
import defpackage.exj;
import defpackage.exl;
import defpackage.exp;
import defpackage.exs;
import defpackage.eyl;
import defpackage.ezb;
import defpackage.ezi;
import defpackage.fam;
import defpackage.fap;
import defpackage.fdd;
import defpackage.fde;
import defpackage.fec;
import defpackage.fjf;
import defpackage.gjc;
import defpackage.hhb;
import defpackage.jqs;
import defpackage.nzy;
import defpackage.nzz;
import defpackage.omj;
import defpackage.qto;
import defpackage.qtp;
import defpackage.tqr;
import defpackage.tzk;
import defpackage.vxz;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    private final GlideLoaderModule a = new GlideLoaderModule();

    public GeneratedAppGlideModuleImpl(Context context) {
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final /* synthetic */ fde a() {
        return new fdd(1);
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final Set b() {
        return Collections.EMPTY_SET;
    }

    /* JADX WARN: Type inference failed for: r10v19, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r9v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [awmd, java.lang.Object] */
    @Override // defpackage.fdn, defpackage.fdo
    public final void c(Context context, esb esbVar) {
        float fA;
        int i;
        GlideLoaderModule glideLoaderModule = this.a;
        glideLoaderModule.a(context);
        aerj aerjVar = glideLoaderModule.a;
        fec fecVar = new fec();
        ?? r1 = aerjVar.a;
        int i2 = tqr.a;
        fec fecVar2 = r1.k(1073814178) ? (fec) fecVar.x(fam.c) : (fec) fecVar.x(fam.d);
        if (r1.k(1073814013) && Build.VERSION.SDK_INT >= 28) {
            fecVar2 = (fec) fecVar2.G(fap.d, Boolean.TRUE);
        }
        float fA2 = 2.0f;
        if (r1.k(1073814009)) {
            if (!r1.k(1073814008)) {
                fecVar2 = (fec) fecVar2.w();
            }
            if (a.aS(r1.a(1073945082)) == 3) {
                fecVar2 = (fec) fecVar2.A(etg.b);
            }
            fA2 = r1.a(1074078242) >= 0 ? r1.a(1074078242) : 2.0f;
            fA = r1.a(1074078247) >= 0 ? r1.a(1074078247) : 2.0f;
        } else {
            if (!tzk.s(context)) {
                fecVar2 = (fec) fecVar2.w();
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && activityManager.isLowRamDevice()) {
                fecVar2 = (fec) fecVar2.A(etg.b);
            }
            fA = 2.0f;
        }
        int iA = r1.a(1073879724);
        if (iA == 1) {
            fecVar2 = (fec) fecVar2.E(esf.b);
        } else if (iA == 2) {
            fecVar2 = (fec) fecVar2.E(esf.a);
        }
        fec fecVar3 = (fec) fecVar2.v(evs.b);
        esbVar.g = new exf();
        ?? r9 = ((agfa) aerjVar.d).a;
        if (r1.k(73633)) {
            esbVar.p.n(new erv());
            fecVar3 = (fec) fecVar3.G(adiz.a, new adiy());
        }
        esbVar.i = new erl(fecVar3);
        esbVar.l = true;
        float fA3 = r1.a(1074274816) > 0 ? (r1.a(1074274816) + 0.0f) / 100.0f : 1.0f;
        exl exlVar = new exl(context);
        exlVar.d = 0.1f;
        float f = fA2 * fA3;
        if (f < 0.0f) {
            throw new IllegalArgumentException("Memory cache screens must be greater than or equal to 0");
        }
        exlVar.b = f;
        float f2 = fA * fA3;
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Bitmap pool screens must be greater than or equal to 0");
        }
        exlVar.c = f2;
        esbVar.o = new fjf(exlVar);
        r1.a(1073879842);
        esbVar.h = 6;
        if (r1.k(1073820287)) {
            exp expVarD = exs.d();
            expVarD.c = new accu(11);
            esbVar.d = expVarD.a();
            exp expVarC = exs.c();
            expVarC.c = new accu(11);
            esbVar.e = expVarC.a();
            exp expVarB = exs.b();
            expVarB.c = new accu(11);
            esbVar.k = expVarB.a();
        }
        if (r1.k(1073829760)) {
            esbVar.p.n(new eru(ese.ZERO));
        }
        ayq ayqVar = (ayq) r9.io();
        int i3 = 0;
        if (((vxz) ayqVar.c).l(48, 45412893L, false) && Build.VERSION.SDK_INT >= 28) {
            esbVar.b = new ewo();
        } else if (!((vxz) ayqVar.a).l(13, 45354046L, false)) {
            adhp adhpVar = (adhp) ayqVar.b.io();
            if (adhpVar == adhp.a) {
                i = 5000;
            } else {
                i = adhpVar == adhp.b ? 30000 : 0;
            }
            esbVar.b = new eww(i << 10);
        }
        if (((vxz) ayqVar.a).l(13, 45354046L, false)) {
            return;
        }
        adhp adhpVar2 = (adhp) ayqVar.b.io();
        if (adhpVar2 == adhp.a) {
            i3 = 600;
        } else if (adhpVar2 == adhp.b) {
            i3 = 3600;
        }
        esbVar.c = new exj(i3 << 10);
    }

    @Override // defpackage.fdn
    public final boolean d() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, tqj] */
    @Override // defpackage.fdq, defpackage.fds
    public final void e(Context context, erj erjVar, jqs jqsVar) {
        List listC = jqsVar.c();
        ewn ewnVar = erjVar.a;
        ewv ewvVar = erjVar.h;
        jqsVar.j("legacy_prepend_all", InputStream.class, FrameSequenceDrawable.class, new nzz(listC, ewnVar, ewvVar));
        jqsVar.j("legacy_prepend_all", ByteBuffer.class, FrameSequenceDrawable.class, new nzy(jqsVar.c(), ewnVar, ewvVar));
        ci ciVar = new ci(2000L);
        omj omjVar = new omj(context, (byte[]) null);
        jqsVar.g(qto.class, ByteBuffer.class, new qtp(omjVar, ciVar, 0));
        jqsVar.g(qto.class, InputStream.class, new qtp(omjVar, ciVar, 1));
        GlideLoaderModule glideLoaderModule = this.a;
        glideLoaderModule.a(context);
        aerj aerjVar = glideLoaderModule.a;
        ?? r14 = aerjVar.b;
        Object obj = aerjVar.c;
        ?? r15 = aerjVar.e;
        jqsVar.n(eyl.class, InputStream.class, new adjk(r14, r15, (adjj) ((gjc) ((hhb) obj).a).a.a.fX.io(), 0));
        jqsVar.i(eyl.class, ByteBuffer.class, new adjk(r14, r15, (adjj) ((gjc) ((hhb) aerjVar.f).a).a.a.ga.io(), 1, null));
        Object obj2 = aerjVar.g;
        jqsVar.i(eyl.class, InputStream.class, new ezb(obj2, 8));
        jqsVar.i(eyl.class, ByteBuffer.class, new ezb(obj2, 7));
        jqsVar.n(aqmh.class, InputStream.class, new ezi(3));
        ?? r3 = aerjVar.a;
        int i = tqr.a;
        if (r3.k(1073816114)) {
            jqsVar.j("legacy_prepend_all", InputStream.class, byte[].class, new adig(ewvVar, 1));
        } else {
            jqsVar.j("legacy_prepend_all", InputStream.class, byte[].class, new adie(ewvVar));
        }
        jqsVar.j("legacy_prepend_all", ByteBuffer.class, byte[].class, new adid());
        if (Build.VERSION.SDK_INT < 29 || !r3.k(1073830494)) {
            return;
        }
        jqsVar.i(Uri.class, adif.class, new adii(context.getContentResolver()));
        jqsVar.j("Bitmap", adif.class, Bitmap.class, new adig(ewnVar, 0));
    }
}
