package defpackage;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.os.MessageQueue;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.interfaces.ComponentConfig;
import com.google.android.libraries.multiplatform.elements.ElementsRetainedState;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.runtime.ElementsRuntimeImpl;
import com.google.android.libraries.multiplatform.elements.runtime.NativeLibraryInitializer;
import com.google.android.libraries.multiplatform.elements.runtime.NodeTreeProcessorImpl;
import com.google.android.libraries.multiplatform.elements.runtime.ReaperThreadJniWrapper;
import com.google.protos.youtube.elements.upb.TextTypeOuterClass$TextType;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class glb {
    private final aunn A;
    private final aunn B;
    private final aunn C;
    private final aunn D;
    private final aunn E;
    private final aunn F;
    private final aunn G;
    private final aunn H;
    private final avlh I;
    private final tqj J;
    private final xir K;
    private final boolean M;
    private final boolean N;
    public final aunn c;
    public final aunn d;
    public final aunn e;
    public final aunn f;
    public final aunn g;
    public final awmd h;
    private final Application i;
    private final gkt j;
    private final aunn k;
    private final aunn l;
    private final jkg m;
    private final aunn n;
    private final aunn o;
    private final aunn p;
    private final aunn q;
    private final aunn r;
    private final aunn s;
    private final aunn t;
    private final aunn u;
    private final aunn v;
    private final aunn w;
    private final aunn x;
    private final aunn y;
    private final aunn z;
    public final awlk a = new awlk();
    public final awlk b = new awlk();
    private boolean L = false;

    public glb(Application application, gkt gktVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, jkg jkgVar, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, aunn aunnVar8, aunn aunnVar9, aunn aunnVar10, aunn aunnVar11, aunn aunnVar12, aunn aunnVar13, aunn aunnVar14, aunn aunnVar15, aunn aunnVar16, aunn aunnVar17, aunn aunnVar18, aunn aunnVar19, aunn aunnVar20, aunn aunnVar21, aunn aunnVar22, aunn aunnVar23, aunn aunnVar24, aunn aunnVar25, xir xirVar, aunn aunnVar26, aunn aunnVar27, avlh avlhVar, tqj tqjVar, aunn aunnVar28, awmd awmdVar) {
        this.i = application;
        this.j = gktVar;
        this.c = aunnVar;
        this.k = aunnVar2;
        this.l = aunnVar3;
        this.d = aunnVar4;
        this.m = jkgVar;
        this.n = aunnVar5;
        this.o = aunnVar6;
        this.p = aunnVar7;
        this.e = aunnVar8;
        this.q = aunnVar9;
        this.r = aunnVar10;
        this.s = aunnVar11;
        this.t = aunnVar12;
        this.v = aunnVar13;
        this.w = aunnVar14;
        this.x = aunnVar15;
        this.y = aunnVar16;
        this.z = aunnVar17;
        this.A = aunnVar18;
        this.f = aunnVar19;
        this.B = aunnVar20;
        this.C = aunnVar21;
        this.D = aunnVar22;
        this.E = aunnVar23;
        this.F = aunnVar24;
        this.J = tqjVar;
        this.K = xirVar;
        this.u = aunnVar25;
        this.G = aunnVar26;
        this.H = aunnVar27;
        this.I = avlhVar;
        int i = tqr.a;
        this.M = tqjVar.k(1073807739);
        this.N = tqjVar.k(1073807742);
        this.g = aunnVar28;
        this.h = awmdVar;
    }

    private final trb[] c() {
        trb[] trbVarArr = new trb[2];
        trb trbVar = new trb(1, null);
        qci qciVar = trk.a;
        trk trkVar = new trk("hrq", qciVar);
        aunn aunnVar = this.e;
        jan janVar = (jan) aunnVar.io();
        janVar.getClass();
        trbVar.a(trkVar, new gku(janVar, 4));
        trk trkVar2 = new trk("bgt", qciVar);
        jan janVar2 = (jan) aunnVar.io();
        janVar2.getClass();
        gku gkuVar = new gku(janVar2, 5);
        int i = tqr.a;
        tqj tqjVar = this.J;
        trbVar.b(trkVar2, gkuVar, !tqjVar.k(1073830344));
        trk trkVar3 = new trk("ads", qciVar);
        jan janVar3 = (jan) aunnVar.io();
        janVar3.getClass();
        int i2 = 6;
        trbVar.b(trkVar3, new gku(janVar3, i2), !tqjVar.k(1073807723) && tqjVar.k(1073807717));
        trbVarArr[0] = trbVar;
        trb trbVar2 = new trb(0, null);
        trk trkVar4 = new trk("ecl", qciVar);
        aunn aunnVar2 = this.p;
        zpw zpwVar = (zpw) aunnVar2.io();
        zpwVar.getClass();
        trbVar2.a(trkVar4, new gku(zpwVar, 7));
        trk trkVar5 = new trk("lhb", qciVar);
        zpw zpwVar2 = (zpw) aunnVar2.io();
        zpwVar2.getClass();
        trbVar2.a(trkVar5, new gku(zpwVar2, 8));
        trk trkVar6 = new trk("ads", qciVar);
        jan janVar4 = (jan) aunnVar.io();
        janVar4.getClass();
        trbVar2.b(trkVar6, new gku(janVar4, i2), (tqjVar.k(1073807723) || tqjVar.k(1073807717)) ? false : true);
        trbVar2.b(new trk("bdc", qciVar), new gku(this, 10), !tqjVar.k(1073830339));
        trk trkVar7 = new trk("shp", qciVar);
        aunn aunnVar3 = this.k;
        aunnVar3.getClass();
        trbVar2.a(trkVar7, new gku(aunnVar3, 11));
        trk trkVar8 = new trk("ptl", qciVar);
        zpw zpwVar3 = (zpw) aunnVar2.io();
        zpwVar3.getClass();
        trbVar2.b(trkVar8, new gku(zpwVar3, 12), !tqjVar.k(1073830344));
        trk trkVar9 = new trk("lpc", qciVar);
        zpw zpwVar4 = (zpw) aunnVar2.io();
        zpwVar4.getClass();
        trbVar2.b(trkVar9, new gku(zpwVar4, 13), this.M);
        trk trkVar10 = new trk("mdx", qciVar);
        jij jijVar = (jij) this.q.io();
        jijVar.getClass();
        trbVar2.b(trkVar10, new fsu(jijVar, 15, null), !tqjVar.k(1073830344));
        trk trkVar11 = new trk("rnx", qciVar);
        final jnm jnmVar = (jnm) this.H.io();
        jnmVar.getClass();
        trbVar2.b(trkVar11, new Runnable() { // from class: gkv
            /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, oov] */
            /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v18 */
            /* JADX WARN: Type inference failed for: r4v6 */
            /* JADX WARN: Type inference failed for: r4v9, types: [agfr, android.app.Activity, byte[], java.lang.Object, java.nio.ByteBuffer, java.util.Set, java.util.concurrent.Executor, short[], syn] */
            @Override // java.lang.Runnable
            public final void run() {
                opq opqVar;
                Throwable th;
                ?? r4;
                Throwable th2;
                atgg atggVarAU;
                jnm jnmVar2 = jnmVar;
                ((abxu) jnmVar2.a.io()).p((xgn) jnmVar2.b.io());
                ooq ooqVar = new ooq();
                cbq cbqVar = new cbq(jnmVar2, 10);
                boolean z = osu.a;
                Object obj = jnmVar2.c;
                osu.a = true;
                meg.a();
                NativeLibraryInitializer.a();
                fdf fdfVar = erj.b((Context) obj).c;
                nsz.a(1073741924, 1073741924, 1.0f);
                mfc mfcVar = aszd.e;
                asyz asyzVar = new asyz();
                asyzVar.aR();
                asyzVar.bO(8, 8);
                asyzVar.bP(20, 100.0f);
                aszd aszdVarAU = asyzVar.aU();
                int i3 = asxe.A;
                asxb asxbVar = new asxb();
                asxbVar.aZ("Hello World!");
                asxbVar.bb(aszdVarAU);
                asxbVar.ba().bz(0);
                new asxg().aS();
                oph ophVarA = oph.a().a();
                try {
                    opq opqVar2 = new opq((Context) obj);
                    try {
                        Object objIo = cbqVar.io();
                        oui ouiVar = oui.a;
                        osp ospVar = new osp();
                        osq osqVar = new osq();
                        kjc kjcVar = new kjc((short[]) null);
                        nyd nydVar = new nyd(ospVar);
                        ComponentConfig componentConfigB = ((ost) objIo).c;
                        if (componentConfigB == null) {
                            try {
                                nxx nxxVarA = nxx.a();
                                nxxVarA.t();
                                nxxVarA.x(true);
                                nxxVarA.v(true);
                                componentConfigB = nxxVarA.b();
                            } catch (Throwable th3) {
                                th = th3;
                                opqVar = opqVar2;
                                try {
                                    nuo.a(opqVar);
                                    throw th;
                                } catch (Throwable th4) {
                                    th.addSuppressed(th4);
                                    throw th;
                                }
                            }
                        }
                        mew mewVar = ((ost) objIo).h;
                        if (mewVar == null) {
                            mewVar = aing.a;
                        }
                        aga agaVar = ElementsServices.a;
                        FlagServices.d(mewVar);
                        oss ossVar = new oss();
                        owu owuVar = new owu(nydVar, ouiVar, kjcVar, new HashMap());
                        oxn oxnVar = new oxn(false);
                        aga agaVarAI = ((ost) objIo).a;
                        if (agaVarAI != null) {
                            opqVar = opqVar2;
                            r4 = 0;
                        } else {
                            opqVar = opqVar2;
                            try {
                                r4 = 0;
                                agaVarAI = qnl.aI((Context) obj, owuVar, oxnVar, ouiVar, kjcVar, Memory.peekByte(mewVar.c + 56) != 0 ? Collections.singleton(new ouc((Context) obj, ouiVar, new oqe(owuVar, 3), 1)) : null, null, mewVar);
                            } catch (Throwable th5) {
                                th = th5;
                                th = th;
                                nuo.a(opqVar);
                                throw th;
                            }
                        }
                        aga agaVarAG = ((ost) objIo).b;
                        if (agaVarAG == null) {
                            agaVarAG = qnl.aG(r4);
                        }
                        oow oowVarAH = qnl.aH(new ope(new mra(), 4), ((ost) objIo).d == null ? new cln(6) : new ope(objIo, 5), new ahdt(), (Context) obj, osf.a(r4, r4, r4), osqVar);
                        oowVarAH.g(agaVarAI);
                        oowVarAH.f(agaVarAG);
                        oowVarAH.o = new ope(objIo, 6);
                        oowVarAH.c(componentConfigB);
                        oowVarAH.e(oui.b);
                        oowVarAH.t = ooqVar;
                        oowVarAH.n = new ope(ossVar, 2);
                        adgf adgfVar = ((ost) objIo).g;
                        if (adgfVar != null) {
                            oowVarAH.w = adgfVar;
                        }
                        ReaperThreadJniWrapper reaperThreadJniWrapper = ((ost) objIo).e;
                        if (reaperThreadJniWrapper != null) {
                            oowVarAH.u = new ope(reaperThreadJniWrapper, 3);
                        }
                        ElementsServices elementsServicesA = oowVarAH.a();
                        try {
                            NodeTreeProcessor nodeTreeProcessorB = elementsServicesA.L().io().b(ophVarA);
                            try {
                                if (Memory.peekByte(FlagServices.b().c + 56) != 0) {
                                    int i4 = atgg.l;
                                    atgd atgdVar = new atgd();
                                    atoc atocVar = new atoc();
                                    mep mepVar = atbv.d;
                                    atbv atbvVar = atbs.a;
                                    atocVar.aR(mepVar, atbvVar);
                                    atgdVar.aW(atocVar);
                                    atgdVar.aV(osu.a());
                                    atgdVar.aU();
                                    RecyclerView recyclerView = new RecyclerView((Context) obj);
                                    new oqu(recyclerView, nodeTreeProcessorB, r4);
                                    oqz oqzVarA = orb.a.a(atbvVar, 100.0f, 100.0f);
                                    osu.a();
                                    try {
                                        oqj oqjVar = new oqj(elementsServicesA, ophVarA, oqzVarA, new osr(), new ArrayList());
                                        elementsServicesA = elementsServicesA;
                                        oqj.I(recyclerView);
                                        new ovk(oqjVar, nus.a(new LinearLayoutManager((Context) obj)));
                                        atgd atgdVar2 = new atgd();
                                        atoc atocVar2 = new atoc();
                                        mep mepVar2 = atjc.d;
                                        atiy atiyVar = new atiy();
                                        int i5 = atiq.i;
                                        atim atimVar = new atim();
                                        mfc mfcVar2 = ativ.f;
                                        atit atitVar = new atit();
                                        byte[] bArr = osu.b;
                                        if (atitVar.d) {
                                            atitVar.d = false;
                                            atitVar.bG();
                                        }
                                        mfc mfcVar3 = atit.f;
                                        atitVar.bN(mfcVar3);
                                        atitVar.bL(mfcVar3.b, bArr);
                                        atitVar.h = r4;
                                        if (atitVar.d) {
                                            atitVar.bG();
                                        } else {
                                            atitVar.d = true;
                                        }
                                        ativ ativVar = new ativ(atitVar.b);
                                        if (atitVar.i != null) {
                                            ativVar.i = atitVar.i;
                                        }
                                        if (atitVar.j != null) {
                                            ativVar.j = atitVar.j;
                                        }
                                        if (atimVar.e) {
                                            AtomicReference atomicReference = atimVar.f;
                                            atomicReference.set(new ArrayList((Collection) atomicReference.get()));
                                            atimVar.e = false;
                                        } else {
                                            atimVar.aT();
                                        }
                                        AtomicReference atomicReference2 = atimVar.f;
                                        ((ArrayList) atomicReference2.get()).add(ativVar);
                                        atimVar.g = true;
                                        if (atimVar.d) {
                                            atimVar.bG();
                                        } else {
                                            atimVar.d = true;
                                        }
                                        atiq atiqVar = new atiq(atimVar.b);
                                        if (atomicReference2.get() != null) {
                                            atiqVar.f.set((ArrayList) atomicReference2.get());
                                            atiqVar.g = atimVar.g;
                                            atimVar.e = true;
                                        }
                                        if (atimVar.h != null) {
                                            atiqVar.h = atimVar.h;
                                        }
                                        atiqVar.aR();
                                        if (atiqVar != atiyVar.j) {
                                            atiyVar.j = atiqVar;
                                            atiyVar.e = true;
                                        }
                                        if (atiyVar.d) {
                                            atiyVar.bG();
                                        } else {
                                            atiyVar.d = true;
                                        }
                                        atjc atjcVar = new atjc(atiyVar.b);
                                        if (atiyVar.j != null) {
                                            atjcVar.j = atiyVar.j;
                                            atjcVar.e = atiyVar.e;
                                        }
                                        if (atiyVar.k != null) {
                                            atjcVar.k = atiyVar.k;
                                        }
                                        if (atiyVar.l != null) {
                                            atjcVar.l = atiyVar.l;
                                        }
                                        if (atiyVar.f != null) {
                                            atjcVar.f = atiyVar.f;
                                        }
                                        if (atiyVar.g != null) {
                                            atjcVar.g = atiyVar.g;
                                        }
                                        if (atiyVar.h != null) {
                                            atjcVar.h = atiyVar.h;
                                        }
                                        if (atiyVar.i != null) {
                                            atjcVar.i = atiyVar.i;
                                        }
                                        atjcVar.aR();
                                        atocVar2.aR(mepVar2, atjcVar);
                                        atgdVar2.aW(atocVar2);
                                        atjc atjcVar2 = (atjc) atgdVar2.aU().bb().d(mepVar2);
                                        atiq atiqVarBc = atjcVar2.bc();
                                        kjc kjcVar2 = new kjc((short[]) r4);
                                        otu otuVar = new otu(ouiVar, kjcVar2, false, false, elementsServicesA);
                                        otuVar.t(0, 0, 100, 100);
                                        otk.b((Context) obj, atiqVarBc);
                                        oty.d((Context) obj, atiqVarBc, null, null, kjcVar2, 100, 100, false);
                                        try {
                                            new otv(new Size(100, 100), otuVar, atiqVarBc, null, null, null, atjcVar2.aV(), atjcVar2.aW(), atjcVar2.aZ(), atjcVar2.aX(), atjcVar2.aY(), elementsServicesA);
                                        } catch (Throwable th6) {
                                            th = th6;
                                            elementsServicesA = elementsServicesA;
                                            th2 = th;
                                            try {
                                                nuo.a(nodeTreeProcessorB);
                                                throw th2;
                                            } catch (Throwable th7) {
                                                th2.addSuppressed(th7);
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        elementsServicesA = elementsServicesA;
                                    }
                                }
                                ((ElementsRuntimeImpl) elementsServicesA.L().io()).b.set(true);
                                if (Memory.peekByte(FlagServices.b().c + 56) != 0) {
                                    int i6 = atgg.l;
                                    atgd atgdVar3 = new atgd();
                                    atoc atocVar3 = new atoc();
                                    atocVar3.aR(aten.d, atek.a);
                                    atgdVar3.aW(atocVar3);
                                    atgd atgdVar4 = new atgd();
                                    atoc atocVar4 = new atoc();
                                    mep mepVar3 = atlz.d;
                                    atlv atlvVar = new atlv();
                                    atlvVar.aU();
                                    atle atleVar = new atle();
                                    atleVar.aU();
                                    atlj atljVar = new atlj();
                                    atljVar.aS();
                                    atleVar.aT(atljVar.aR());
                                    atlvVar.aT(atleVar.aS());
                                    atocVar4.aR(mepVar3, atlvVar.aR());
                                    atgdVar4.aW(atocVar4);
                                    atgd atgdVar5 = new atgd();
                                    atoc atocVar5 = new atoc();
                                    mep mepVar4 = TextTypeOuterClass$TextType.d;
                                    atnl atnlVar = new atnl();
                                    asxb asxbVar2 = new asxb();
                                    asxbVar2.aZ("Hello World!");
                                    atnlVar.aT(asxbVar2.ba());
                                    atocVar5.aR(mepVar4, atnlVar.aR());
                                    atgdVar5.aW(atocVar5);
                                    atgdVar4.aV(atgdVar5.aU());
                                    atgdVar3.aV(atgdVar4.aU());
                                    atgd atgdVar6 = new atgd();
                                    atoc atocVar6 = new atoc();
                                    atocVar6.aR(atfx.d, atfu.a);
                                    atgdVar6.aW(atocVar6);
                                    atgdVar3.aV(atgdVar6.aU());
                                    atgd atgdVar7 = new atgd();
                                    atoc atocVar7 = new atoc();
                                    atocVar7.aR(aswo.d, aswk.a);
                                    atgdVar7.aW(atocVar7);
                                    atgdVar3.aV(atgdVar7.aU());
                                    atoc atocVar8 = new atoc((byte[]) r4, (byte[]) r4);
                                    atocVar8.aU(atjt.d, atjq.a);
                                    atocVar8.aU(atcw.d, atct.a);
                                    atocVar8.aU(atnh.d, atne.a);
                                    atocVar8.aU(asvq.d, asvn.a);
                                    atocVar8.aU(atbf.d, atbb.a);
                                    atocVar8.aU(atic.d, athz.a);
                                    atocVar8.aU(atjj.d, atjg.a);
                                    atocVar8.aU(atnx.d, atnu.a);
                                    atgdVar3.aX(atocVar8.aV());
                                    atggVarAU = atgdVar3.aU();
                                } else {
                                    int i7 = atgg.l;
                                    atgd atgdVar8 = new atgd();
                                    atoc atocVar9 = new atoc();
                                    mep mepVar5 = atlz.d;
                                    atlv atlvVar2 = new atlv();
                                    atlvVar2.aU();
                                    atle atleVar2 = new atle();
                                    atleVar2.aU();
                                    atlj atljVar2 = new atlj();
                                    atljVar2.aS();
                                    atleVar2.aT(atljVar2.aR());
                                    atlvVar2.aT(atleVar2.aS());
                                    atocVar9.aR(mepVar5, atlvVar2.aR());
                                    atgdVar8.aW(atocVar9);
                                    atoc atocVar10 = new atoc();
                                    mep mepVar6 = TextTypeOuterClass$TextType.d;
                                    atnl atnlVar2 = new atnl();
                                    asxb asxbVar3 = new asxb();
                                    asxbVar3.aZ("Hello World!");
                                    atnlVar2.aT(asxbVar3.ba());
                                    atocVar10.aR(mepVar6, atnlVar2.aR());
                                    atgdVar8.aW(atocVar10);
                                    atoc atocVar11 = new atoc((byte[]) r4, (byte[]) r4);
                                    atocVar11.aU(atjt.d, atjq.a);
                                    atocVar11.aU(atcw.d, atct.a);
                                    atocVar11.aU(atnh.d, atne.a);
                                    atgdVar8.aX(atocVar11.aV());
                                    atggVarAU = atgdVar8.aU();
                                }
                                ((NodeTreeProcessorImpl) nodeTreeProcessorB).f.set(-1L);
                                AtomicLong atomicLong = ((NodeTreeProcessorImpl) nodeTreeProcessorB).d;
                                for (long j = atomicLong.get(); (j & 4611686018427387904L) == 0 && j > 0; j = atomicLong.get()) {
                                    if (atomicLong.compareAndSet(j, 1 + j)) {
                                        try {
                                            ElementsRetainedState elementsRetainedState = (ElementsRetainedState) ((NodeTreeProcessorImpl) nodeTreeProcessorB).g.getAndSet(r4);
                                            if (elementsRetainedState != null) {
                                                ((NodeTreeProcessorImpl) nodeTreeProcessorB).L(elementsRetainedState);
                                            }
                                            atggVarAU.bJ();
                                            long j2 = ((NodeTreeProcessorImpl) nodeTreeProcessorB).c;
                                            UpbMessage upbMessage = atggVarAU.b;
                                            NodeTreeProcessorImpl.jniSetElement(j2, upbMessage.a, upbMessage.c.a, 0L);
                                            if (((NodeTreeProcessorImpl) nodeTreeProcessorB).d.decrementAndGet() != 4611686018427387904L) {
                                                break;
                                            }
                                            ((NodeTreeProcessorImpl) nodeTreeProcessorB).a.z().execute(new ooz(nodeTreeProcessorB, 14));
                                            break;
                                        } catch (Throwable th9) {
                                            if (((NodeTreeProcessorImpl) nodeTreeProcessorB).d.decrementAndGet() == 4611686018427387904L) {
                                                ((NodeTreeProcessorImpl) nodeTreeProcessorB).a.z().execute(new ooz(nodeTreeProcessorB, 14));
                                            }
                                            throw th9;
                                        }
                                    }
                                }
                                nodeTreeProcessorB.h(1073741924, 1073741924);
                                ooy ooyVar = new ooy((Context) obj, 1);
                                ooyVar.z(opl.a(nodeTreeProcessorB));
                                ooyVar.F();
                                nuo.a(nodeTreeProcessorB);
                                elementsServicesA.close();
                                nuo.a(opqVar);
                            } catch (Throwable th10) {
                                th = th10;
                                th2 = th;
                                nuo.a(nodeTreeProcessorB);
                                throw th2;
                            }
                        } catch (Throwable th11) {
                            try {
                                elementsServicesA.close();
                                throw th11;
                            } catch (Throwable th12) {
                                th11.addSuppressed(th12);
                                throw th11;
                            }
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        opqVar = opqVar2;
                    }
                } catch (Exception e) {
                    Log.w("RENDER_NEXT", "Prewarm failed", e);
                }
            }
        }, tqjVar.k(1073807736));
        trbVarArr[1] = trbVar2;
        return trbVarArr;
    }

    private final trb[] d() {
        trb[] trbVarArr = new trb[2];
        trb trbVar = new trb(1, null);
        qci qciVar = trk.a;
        trk trkVar = new trk("blk", qciVar);
        dov dovVar = (dov) this.E.io();
        dovVar.getClass();
        trbVar.a(trkVar, new gku(dovVar, 15));
        trk trkVar2 = new trk("lkc", qciVar);
        aunn aunnVar = this.A;
        jnj jnjVar = (jnj) aunnVar.io();
        jnjVar.getClass();
        int i = 6;
        trbVar.a(trkVar2, new gkx(jnjVar, i));
        trk trkVar3 = new trk("lgm", qciVar);
        aunn aunnVar2 = this.p;
        zpw zpwVar = (zpw) aunnVar2.io();
        zpwVar.getClass();
        gkx gkxVar = new gkx(zpwVar, 18);
        boolean z = this.M;
        trbVar.b(trkVar3, gkxVar, !z);
        trk trkVar4 = new trk("sfl", qciVar);
        zpw zpwVar2 = (zpw) aunnVar2.io();
        zpwVar2.getClass();
        int i2 = 0;
        trbVar.a(trkVar4, new gky(zpwVar2, i2));
        trk trkVar5 = new trk("spe", qciVar);
        dov dovVar2 = (dov) this.y.io();
        dovVar2.getClass();
        trbVar.a(trkVar5, new gky(dovVar2, 2));
        trbVarArr[0] = trbVar;
        trb trbVar2 = new trb(0, null);
        trk trkVar6 = new trk("cal", qciVar);
        ((gzj) this.n.io()).getClass();
        gkz gkzVar = new gkz(i2);
        int i3 = tqr.a;
        tqj tqjVar = this.J;
        trbVar2.b(trkVar6, gkzVar, tqjVar.k(1073830342));
        trk trkVar7 = new trk("fba", qciVar);
        zpw zpwVar3 = (zpw) aunnVar2.io();
        zpwVar3.getClass();
        trbVar2.a(trkVar7, new gky(zpwVar3, 3));
        trk trkVar8 = new trk("sdc", qciVar);
        aunn aunnVar3 = this.r;
        jnj jnjVar2 = (jnj) aunnVar3.io();
        jnjVar2.getClass();
        trbVar2.a(trkVar8, new gky(jnjVar2, 4));
        trk trkVar9 = new trk("nor", qciVar);
        aunn aunnVar4 = this.t;
        jnm jnmVar = (jnm) aunnVar4.io();
        jnmVar.getClass();
        int i4 = 5;
        trbVar2.a(trkVar9, new gky(jnmVar, i4));
        trk trkVar10 = new trk("noc", qciVar);
        jnm jnmVar2 = (jnm) aunnVar4.io();
        jnmVar2.getClass();
        trbVar2.a(trkVar10, new gky(jnmVar2, i));
        trk trkVar11 = new trk("lsc", qciVar);
        gkt gktVar = this.j;
        gktVar.getClass();
        int i5 = 16;
        trbVar2.a(trkVar11, new gku(gktVar, i5));
        trk trkVar12 = new trk("bka", qciVar);
        jnj jnjVar3 = (jnj) aunnVar3.io();
        jnjVar3.getClass();
        int i6 = 17;
        trbVar2.a(trkVar12, new gku(jnjVar3, i6));
        trk trkVar13 = new trk("abt", qciVar);
        jnj jnjVar4 = (jnj) aunnVar3.io();
        jnjVar4.getClass();
        trbVar2.a(trkVar13, new gku(jnjVar4, 19));
        trk trkVar14 = new trk("gfb", qciVar);
        zpw zpwVar4 = (zpw) aunnVar2.io();
        zpwVar4.getClass();
        int i7 = 20;
        trbVar2.a(trkVar14, new gku(zpwVar4, i7));
        trk trkVar15 = new trk("lis", qciVar);
        gev gevVar = (gev) this.z.io();
        gevVar.getClass();
        trbVar2.a(trkVar15, new gkx(gevVar, 1));
        trbVar2.a(new trk("mdp", qciVar), new gkx(this, 0));
        trk trkVar16 = new trk("wdg", qciVar);
        jij jijVar = (jij) this.B.io();
        jijVar.getClass();
        trbVar2.a(trkVar16, new gkx(jijVar, 2));
        trk trkVar17 = new trk("aur", qciVar);
        jan janVar = (jan) this.w.io();
        janVar.getClass();
        trbVar2.a(trkVar17, new gkx(janVar, 3));
        trk trkVar18 = new trk("mbr", qciVar);
        gev gevVar2 = (gev) this.C.io();
        gevVar2.getClass();
        trbVar2.a(trkVar18, new gkx(gevVar2, 4));
        trk trkVar19 = new trk("ssa", qciVar);
        aunn aunnVar5 = this.x;
        gli gliVar = (gli) aunnVar5.io();
        gliVar.getClass();
        trbVar2.a(trkVar19, new gkx(gliVar, i4));
        trk trkVar20 = new trk("lsa", qciVar);
        gli gliVar2 = (gli) aunnVar5.io();
        gliVar2.getClass();
        trbVar2.a(trkVar20, new gkx(gliVar2, 7));
        trk trkVar21 = new trk("ssc", qciVar);
        gli gliVar3 = (gli) aunnVar5.io();
        gliVar3.getClass();
        trbVar2.b(trkVar21, new gkx(gliVar3, 9), tqjVar.k(1073807727));
        trk trkVar22 = new trk("rlp", qciVar);
        dov dovVar3 = (dov) this.D.io();
        dovVar3.getClass();
        trbVar2.a(trkVar22, new gkx(dovVar3, 10));
        trk trkVar23 = new trk("btl", qciVar);
        jnj jnjVar5 = (jnj) aunnVar.io();
        jnjVar5.getClass();
        trbVar2.a(trkVar23, new gkx(jnjVar5, 11));
        trk trkVar24 = new trk("lnc", qciVar);
        zpw zpwVar5 = (zpw) aunnVar2.io();
        zpwVar5.getClass();
        int i8 = 12;
        trbVar2.b(trkVar24, new gkx(zpwVar5, i8), z);
        trk trkVar25 = new trk("sas", qciVar);
        dov dovVar4 = (dov) this.F.io();
        dovVar4.getClass();
        trbVar2.a(trkVar25, new gkx(dovVar4, 13));
        trk trkVar26 = new trk("qre", qciVar);
        gli gliVar4 = (gli) aunnVar5.io();
        gliVar4.getClass();
        trbVar2.a(trkVar26, new gkx(gliVar4, 14));
        trk trkVar27 = new trk("pfp", qciVar);
        glh glhVar = (glh) this.G.io();
        glhVar.getClass();
        trbVar2.b(trkVar27, new gkx(glhVar, 15), tqjVar.k(1073807733));
        trk trkVar28 = new trk("ppc", qciVar);
        gli gliVar5 = (gli) aunnVar5.io();
        gliVar5.getClass();
        trbVar2.b(trkVar28, new gkx(gliVar5, i5), tqjVar.k(1073807734));
        trk trkVar29 = new trk("mcra", qciVar);
        gli gliVar6 = (gli) aunnVar5.io();
        gliVar6.getClass();
        trbVar2.a(trkVar29, new gkx(gliVar6, i6));
        trbVar2.a(new trk("riv", qciVar), new gkx(this, i7));
        trbVar2.b(new trk("mpm", qciVar), new gky(this, 1), tqjVar != null && tqjVar.k(1073830259));
        trk trkVar30 = new trk("bgt", qciVar);
        jan janVar2 = (jan) this.e.io();
        janVar2.getClass();
        trbVar2.b(trkVar30, new gku(janVar2, 5), tqjVar.k(1073830344));
        trk trkVar31 = new trk("ptl", qciVar);
        zpw zpwVar6 = (zpw) aunnVar2.io();
        zpwVar6.getClass();
        trbVar2.b(trkVar31, new gku(zpwVar6, i8), tqjVar.k(1073830344));
        trbVarArr[1] = trbVar2;
        return trbVarArr;
    }

    private final trb[] e() {
        byte[] bArr = null;
        trb trbVar = new trb(1, null);
        qci qciVar = trk.a;
        trk trkVar = new trk("pli", qciVar);
        aunn aunnVar = this.x;
        gli gliVar = (gli) aunnVar.io();
        gliVar.getClass();
        int i = 9;
        trbVar.a(trkVar, new fsu(gliVar, i, bArr));
        trk trkVar2 = new trk("pls", qciVar);
        gli gliVar2 = (gli) aunnVar.io();
        gliVar2.getClass();
        trbVar.a(trkVar2, new fsu(gliVar2, 10, bArr));
        trk trkVar3 = new trk("plr", qciVar);
        gli gliVar3 = (gli) aunnVar.io();
        gliVar3.getClass();
        trbVar.a(trkVar3, new fsu(gliVar3, 16, bArr));
        trk trkVar4 = new trk("mdx", qciVar);
        aunn aunnVar2 = this.q;
        jij jijVar = (jij) aunnVar2.io();
        jijVar.getClass();
        trbVar.a(trkVar4, new fsu(jijVar, 17, bArr));
        trk trkVar5 = new trk("mss", qciVar);
        gli gliVar4 = (gli) aunnVar.io();
        gliVar4.getClass();
        int i2 = 18;
        trbVar.a(trkVar5, new fsu(gliVar4, i2, bArr));
        trk trkVar6 = new trk("cmc", qciVar);
        gli gliVar5 = (gli) aunnVar.io();
        gliVar5.getClass();
        int i3 = 19;
        trbVar.a(trkVar6, new fsu(gliVar5, i3, bArr));
        trk trkVar7 = new trk("pmc", qciVar);
        gli gliVar6 = (gli) aunnVar.io();
        gliVar6.getClass();
        trbVar.a(trkVar7, new gku(gliVar6, 1));
        trk trkVar8 = new trk("wfo", qciVar);
        gli gliVar7 = (gli) aunnVar.io();
        gliVar7.getClass();
        trbVar.a(trkVar8, new gku(gliVar7, 0));
        trk trkVar9 = new trk("bqc", qciVar);
        gli gliVar8 = (gli) aunnVar.io();
        gliVar8.getClass();
        trbVar.a(trkVar9, new gku(gliVar8, 2));
        trk trkVar10 = new trk("pcu", qciVar);
        gli gliVar9 = (gli) aunnVar.io();
        gliVar9.getClass();
        trbVar.a(trkVar10, new gku(gliVar9, 3));
        trk trkVar11 = new trk("msq", qciVar);
        gli gliVar10 = (gli) aunnVar.io();
        gliVar10.getClass();
        trbVar.a(trkVar11, new fsu(gliVar10, 20, bArr));
        trk trkVar12 = new trk("pqc", qciVar);
        gli gliVar11 = (gli) aunnVar.io();
        gliVar11.getClass();
        trbVar.a(trkVar12, new gku(gliVar11, i));
        trk trkVar13 = new trk("wdg", qciVar);
        gli gliVar12 = (gli) aunnVar.io();
        gliVar12.getClass();
        trbVar.a(trkVar13, new gku(gliVar12, i2));
        trk trkVar14 = new trk("off", qciVar);
        aunn aunnVar3 = this.v;
        aerj aerjVar = (aerj) aunnVar3.io();
        aerjVar.getClass();
        int i4 = 8;
        gkx gkxVar = new gkx(aerjVar, i4);
        tqj tqjVar = this.J;
        int i5 = tqr.a;
        trbVar.b(trkVar14, gkxVar, !tqjVar.k(1073815146));
        trk trkVar15 = new trk("qcp", qciVar);
        gli gliVar13 = (gli) aunnVar.io();
        gliVar13.getClass();
        trbVar.a(trkVar15, new gkx(gliVar13, i3));
        trk trkVar16 = new trk("rsm", qciVar);
        gli gliVar14 = (gli) aunnVar.io();
        gliVar14.getClass();
        trbVar.a(trkVar16, new gky(gliVar14, 7));
        trk trkVar17 = new trk("wnf", qciVar);
        gli gliVar15 = (gli) aunnVar.io();
        gliVar15.getClass();
        trbVar.a(trkVar17, new gky(gliVar15, i4));
        trk trkVar18 = new trk("mpnc", qciVar);
        gli gliVar16 = (gli) aunnVar.io();
        gliVar16.getClass();
        trbVar.a(trkVar18, new gky(gliVar16, i));
        trb trbVar2 = new trb(0, null);
        trk trkVar19 = new trk("mdi", qciVar);
        gli gliVar17 = (gli) aunnVar.io();
        gliVar17.getClass();
        trbVar2.a(trkVar19, new gky(gliVar17, 10));
        trk trkVar20 = new trk("off", qciVar);
        aerj aerjVar2 = (aerj) aunnVar3.io();
        aerjVar2.getClass();
        trbVar2.b(trkVar20, new gkx(aerjVar2, i4), tqjVar.k(1073815146));
        trk trkVar21 = new trk("oasm", qciVar);
        aerj aerjVar3 = (aerj) aunnVar3.io();
        aerjVar3.getClass();
        trbVar2.a(trkVar21, new fsu(aerjVar3, 11, bArr));
        trk trkVar22 = new trk("pcm", qciVar);
        gli gliVar18 = (gli) aunnVar.io();
        gliVar18.getClass();
        trbVar2.a(trkVar22, new fsu(gliVar18, 12, bArr));
        trk trkVar23 = new trk("mmf", qciVar);
        gli gliVar19 = (gli) aunnVar.io();
        gliVar19.getClass();
        trbVar2.b(trkVar23, new fsu(gliVar19, 13, bArr), tqjVar.k(1073807737));
        trk trkVar24 = new trk("wilc", qciVar);
        gli gliVar20 = (gli) aunnVar.io();
        gliVar20.getClass();
        trbVar2.b(trkVar24, new fsu(gliVar20, 14, bArr), tqjVar.k(1073830336));
        trk trkVar25 = new trk("mdx", qciVar);
        jij jijVar2 = (jij) aunnVar2.io();
        jijVar2.getClass();
        trbVar2.b(trkVar25, new fsu(jijVar2, 15, bArr), tqjVar.k(1073830344));
        return new trb[]{trbVar, trbVar2};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v45, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v33, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v37, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v42, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v45, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v51, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v56, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r4v6, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [android.os.MessageQueue$IdleHandler, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v21, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object, tqj] */
    public final void a() {
        boolean z;
        agrx agrxVar = agso.a;
        int i = tqr.a;
        tqj tqjVar = this.J;
        int iA = tqjVar.a(1074007586) & 1;
        int iA2 = tqjVar.a(1073879929);
        boolean z2 = (iA2 == 0 || iA == 0) ? false : true;
        awlk awlkVar = new awlk();
        if (iA == 0) {
            awlkVar.kn();
        }
        boolean z3 = 1 == iA;
        gkt gktVar = this.j;
        byte[] bArr = null;
        trb trbVar = new trb(1, null);
        qci qciVar = trk.a;
        trk trkVar = new trk("ads", qciVar);
        aunn aunnVar = this.e;
        jan janVar = (jan) aunnVar.io();
        janVar.getClass();
        trbVar.b(trkVar, new gku(janVar, 6), tqjVar.k(1073807723));
        trbVar.b(new trk("cro", qciVar), new br(this, awlkVar, 18, bArr), z3);
        trb trbVar2 = new trb(0, null);
        trk trkVar2 = new trk("epd", qciVar);
        jan janVar2 = (jan) aunnVar.io();
        janVar2.getClass();
        trbVar2.b(trkVar2, new gku(janVar2, 14), tqjVar.k(1073814455));
        trb trbVar3 = new trb(0, awlkVar);
        trbVar3.b(new trk("epc", qciVar), new gkw(this, iA2, 0), z2);
        trb[] trbVarArr = {trbVar, trbVar2, trbVar3};
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int i2 = iAvailableProcessors > 4 ? 4 : 3;
        aebc aebcVar = gktVar.d;
        aebcVar.d(1, i2);
        aebcVar.d(0, iAvailableProcessors > 4 ? 5 : 3);
        aebcVar.i(trbVarArr);
        aebcVar.g();
        final jan janVar3 = (jan) this.o.io();
        ahxh.g = new gzj();
        ahxh.f = new ahxf() { // from class: gle
            @Override // defpackage.ahxf
            public final void a(String str) throws Throwable {
                Context context = (Context) janVar3.h;
                kro.ba(context, str, txz.b(context), new HashSet());
            }
        };
        ((tpp) janVar3.g.io()).h();
        sxg sxgVar = (sxg) janVar3.c.io();
        ?? r5 = janVar3.d;
        ((Executor) r5.io()).execute(afwl.i(new syd(sxgVar, 0)));
        ((vvm) janVar3.b.io()).h();
        if (janVar3.a.k(1073807739)) {
            Executor executor = (Executor) r5.io();
            zpw zpwVar = (zpw) janVar3.e.io();
            zpwVar.getClass();
            executor.execute(afwl.i(afwl.i(new dxk(zpwVar, 15))));
        } else {
            ((zrn) janVar3.f.io()).h();
        }
        if (!this.L) {
            this.L = true;
            jnj jnjVar = (jnj) this.A.io();
            aerj aerjVar = (aerj) jnjVar.e.io();
            trl trlVar = (trl) ((aess) aerjVar.f).e;
            int i3 = trlVar.a;
            if (i3 == 1) {
                aesh aeshVar = (aesh) aerjVar.a.io();
                if (aeshVar.a > 0) {
                    ((Thread) aeshVar.f).start();
                }
            } else if (i3 == 2) {
                aesk aeskVar = (aesk) aerjVar.c.io();
                int i4 = aerx.a;
                aeskVar.e.post(new aemk(aeskVar, 8, bArr));
                aeskVar.i.schedule(new aesi(aeskVar), aeskVar.a + 50, TimeUnit.MILLISECONDS);
            } else if (i3 == 3) {
                aesn aesnVar = (aesn) aerjVar.d.io();
                int i5 = aerx.a;
                aesnVar.d.post(new aemk(aesnVar, 9, bArr));
                aesnVar.f.start();
            }
            if (trlVar.c) {
                Logger.getLogger("ErrorLoggingExecutor").addHandler(new aepf(aerjVar));
            }
            aerj aerjVar2 = (aerj) aerjVar.b.io();
            if (aerjVar2.a()) {
                qck qckVar = (qck) aerjVar2.b.io();
                ?? r9 = aerjVar2.a;
                if ((r9.k(1073808363) && trlVar.b == 0) || r9.k(1073808373)) {
                    qckVar.a.c();
                    ((aeta) aerjVar2.g.io()).a();
                }
                if (r9.k(1073808364)) {
                    qckVar.a.d();
                }
            }
            aepg aepgVar = (aepg) jnjVar.b.io();
            aepgVar.b.e("system_health_capturer_battery", jnjVar.a);
            aepgVar.a.e("system_health_tx_gel", new glj(jnjVar, 0));
            aepgVar.f();
        }
        if (tqjVar.a(1074141851) > 0) {
            z = true;
            ((trn) this.u.io()).a(1);
        } else {
            z = true;
        }
        this.m.a = z;
        aunn aunnVar2 = this.p;
        zpw zpwVar2 = (zpw) aunnVar2.io();
        szu szuVar = (szu) zpwVar2.o.io();
        final aerj aerjVar3 = (aerj) zpwVar2.e.io();
        aerjVar3.getClass();
        szuVar.execute(afwl.i(new Runnable() { // from class: glf
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, tqj] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, tbu] */
            @Override // java.lang.Runnable
            public final void run() {
                int i6 = tqr.a;
                aerj aerjVar4 = aerjVar3;
                if (!aerjVar4.a.k(1073807731)) {
                    gzs gzsVar = new gzs((hau) aerjVar4.g);
                    xkd xkdVar = (xkd) aerjVar4.e;
                    xka xkaVarF = xkdVar.f(hab.class, null, gzsVar);
                    xkaVarF.c(has.class);
                    xkaVarF.c(haj.class);
                    xkaVarF.d(had.class);
                    xkaVarF.d(hak.class);
                    xkaVarF.c(hag.class);
                    xka xkaVarF2 = xkdVar.f(hac.class, null, gzsVar);
                    xkaVarF2.c(haj.class);
                    xkaVarF2.d(had.class);
                    xkaVarF2.d(hak.class);
                    xkaVarF2.c(hag.class);
                    if (!((jnj) aerjVar4.d).v()) {
                        xkaVarF.c(aayf.class);
                        xkaVarF.c(aboe.class);
                    }
                    xka xkaVarF3 = xkdVar.f(adkk.class, gzt.class, new adke());
                    xkaVarF3.d(adkj.class);
                    xkaVarF3.c(haj.class);
                }
                ?? r1 = aerjVar4.g;
                hau hauVar = (hau) r1;
                gzw gzwVar = new gzw(hauVar);
                Object obj = aerjVar4.e;
                xkd xkdVar2 = (xkd) obj;
                xka xkaVarF4 = xkdVar2.f(har.class, null, gzwVar);
                xkaVarF4.d(haq.class);
                xkaVarF4.c(haj.class);
                xka xkaVarF5 = xkdVar2.f(hai.class, null, new gzr(hauVar));
                xkaVarF5.d(hag.class);
                xkaVarF5.c(haj.class);
                if (!((jnj) aerjVar4.d).v()) {
                    xkaVarF5.c(aayf.class);
                    xkaVarF5.c(aboe.class);
                    xkaVarF5.c(aaxu.class);
                }
                Object obj2 = aerjVar4.c;
                zho zhoVar = (zho) aerjVar4.f;
                abnc abncVar = (abnc) obj2;
                xka xkaVarF6 = xkdVar2.f(sen.class, null, new seh(abncVar, zhoVar, new cbr(r1, 6), 1, null));
                xkaVarF6.d(aaxz.class);
                xkaVarF6.d(aaya.class);
                xkaVarF6.c(hat.class);
                xkaVarF6.c(aayf.class);
                xkaVarF6.c(aboe.class);
                xkaVarF6.c(aaxu.class);
                xka xkaVarF7 = xkdVar2.f(ses.class, null, new seh(abncVar, zhoVar, new cbr(r1, 6), 0));
                xkaVarF7.d(aaxz.class);
                xkaVarF7.d(sfi.class);
                xkaVarF7.d(aaya.class);
                xkaVarF7.d(aaxv.class);
                xkaVarF7.c(ser.class);
                xkaVarF7.c(tav.class);
                xkaVarF7.c(aayf.class);
                xkaVarF7.c(aboe.class);
                xkaVarF7.c(aaxu.class);
                final int i7 = 1;
                xkdVar2.a(xhi.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i7) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i8 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
                xkdVar2.b(haj.class, "cc");
                xkdVar2.b(has.class, "f_proc");
                xkdVar2.b(haa.class, "app_l");
                xkdVar2.b(gzz.class, "cr");
                xkdVar2.b(hal.class, "br_s");
                xkdVar2.b(ham.class, "br_r");
                xkdVar2.b(haf.class, "pbc_s");
                xkdVar2.b(hae.class, "pbc_e");
                xkdVar2.b(had.class, "aa");
                xkdVar2.b(hag.class, "ol");
                xkdVar2.b(hag.class, "aft");
                xkdVar2.b(hak.class, "ol");
                xkdVar2.b(hak.class, "aft");
                xkdVar2.b(han.class, "sr_s");
                xkdVar2.b(hao.class, "sr_r");
                xkdVar2.b(hap.class, "ol");
                xkdVar2.b(haq.class, "sr_re");
                final int i8 = 0;
                xkdVar2.a(wjo.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i8) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i9 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
                ((tbt) aerjVar4.b).a(aerjVar4, wjo.class, r1);
                final int i9 = 2;
                xkdVar2.a(hab.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i9) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i10 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
                final int i10 = 3;
                xkdVar2.a(hac.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i10) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i11 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
                final int i11 = 4;
                xkdVar2.a(hai.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i11) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i12 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
                xkdVar2.b(adkk.class, "thmon_s");
                xkdVar2.b(adkj.class, "thmon_e");
                xkdVar2.b(adkd.class, "thmon_e");
                xkdVar2.b(adki.class, "thmon_s");
                xkdVar2.b(adkh.class, "thmon_e");
                xkdVar2.c(adko.class, new adkb());
                xkdVar2.c(adkn.class, new adkb());
                xkdVar2.c(adkm.class, new adkb());
                xkdVar2.c(adkl.class, new adkb());
                final int i12 = 13;
                xkdVar2.a(adko.class, new xju() { // from class: yic
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        switch (i12) {
                            case 0:
                                return Collections.singletonMap("orec", "1");
                            case 1:
                                return Collections.singletonMap("crm", Integer.toString(((yiw) obj3).a.getNumber()));
                            case 2:
                                return Collections.singletonMap("ohrtt", Long.toString(((ykf) obj3).a));
                            case 3:
                                return Collections.singletonMap("oubpr", "1");
                            case 4:
                                String str = ((aayd) obj3).b;
                                if (str == null) {
                                    return null;
                                }
                                HashMap map = new HashMap();
                                map.put("task_id", str);
                                return map;
                            case 5:
                                if (!((aayc) obj3).b) {
                                    return null;
                                }
                                HashMap map2 = new HashMap();
                                map2.put("mod_pft", "cache");
                                return map2;
                            case 6:
                                if (!((aayh) obj3).a) {
                                    return null;
                                }
                                HashMap map3 = new HashMap();
                                map3.put("mod_pft", "cache");
                                return map3;
                            case 7:
                                aazj aazjVar = (aazj) obj3;
                                if (!aazjVar.a.a(abob.c, abob.h)) {
                                    return null;
                                }
                                String str2 = aazjVar.g;
                                wjf wjfVar = aazjVar.b;
                                if (str2 == null || wjfVar == null) {
                                    return null;
                                }
                                HashMap map4 = new HashMap();
                                if (!wjfVar.G().isEmpty()) {
                                    map4.put("docid", wjfVar.G());
                                }
                                map4.put("cpn", str2);
                                return map4;
                            case 8:
                                aboe aboeVar = (aboe) obj3;
                                HashMap map5 = new HashMap();
                                String str3 = aboeVar.h;
                                if (!TextUtils.isEmpty(str3)) {
                                    map5.put("docid", str3);
                                }
                                if (TextUtils.isEmpty(aboeVar.b)) {
                                    return map5;
                                }
                                map5.put("cpn", aboeVar.b);
                                return map5;
                            case 9:
                                int iOrdinal = ((abmh) obj3).a.ordinal();
                                String str4 = "jp";
                                switch (iOrdinal) {
                                    case 0:
                                        str4 = "st";
                                        break;
                                    case 1:
                                        str4 = "n";
                                        break;
                                    case 2:
                                        str4 = "p";
                                        break;
                                    case 3:
                                        str4 = "ap";
                                        break;
                                    case 4:
                                        str4 = "an";
                                        break;
                                    case 5:
                                        str4 = "rt";
                                        break;
                                    case 6:
                                    case 7:
                                        break;
                                    default:
                                        throw new RuntimeException(null, null);
                                }
                                HashMap map6 = new HashMap();
                                map6.put("yt_wt", str4);
                                return map6;
                            case 10:
                                yvu yvuVar = (yvu) obj3;
                                wgs wgsVar = yvuVar.c;
                                if (wgsVar == null) {
                                    wgsVar = yvuVar.f;
                                }
                                if (wgsVar == null) {
                                    return null;
                                }
                                HashMap map7 = new HashMap();
                                map7.put("fmt", String.valueOf(wgsVar.e()));
                                map7.put("mod_local", true != wgsVar.W() ? "0" : "1");
                                return map7;
                            case 11:
                                HashMap map8 = new HashMap();
                                if (!((aaye) obj3).b) {
                                    return map8;
                                }
                                map8.put("mod_adap", "1");
                                return map8;
                            case 12:
                                HashMap map9 = new HashMap();
                                map9.put("cmt", String.valueOf(((aaxz) obj3).b));
                                return map9;
                            default:
                                adko adkoVar = (adko) obj3;
                                return Collections.singletonMap("th" + adkoVar.c + "_tt", Integer.toString(adkoVar.f));
                        }
                    }
                });
                final int i13 = 5;
                xkdVar2.a(aazj.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i13) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i14 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
                xkdVar2.b(aaxx.class, "pl_i");
                xkdVar2.b(aaxy.class, "pl_r");
                xkdVar2.b(aayd.class, "ps_s");
                xkdVar2.b(aayc.class, "ps_r");
                xkdVar2.b(vzm.class, "psns");
                xkdVar2.b(vzl.class, "psnr");
                xkdVar2.b(vzk.class, "psps");
                xkdVar2.b(vzj.class, "pspe");
                xkdVar2.b(aaym.class, "wn_s");
                xkdVar2.b(aayl.class, "wn_r");
                xkdVar2.b(vzo.class, "wnps");
                xkdVar2.b(vzn.class, "wnpe");
                xkdVar2.b(aaxp.class, "pl_efa");
                xkdVar2.b(aaxq.class, "pl_efh");
                xkdVar2.b(aayi.class, "sw_s");
                xkdVar2.b(aayh.class, "sw_r");
                xkdVar2.b(aayg.class, "sw_fb");
                xkdVar2.b(aaxs.class, "pc_s");
                xkdVar2.b(aaxr.class, "pc");
                xkdVar2.b(aaye.class, "pl_s");
                xkdVar2.b(aayb.class, "pl_c");
                xkdVar2.b(aaxz.class, "pbs");
                xkdVar2.b(aaxt.class, "pbi");
                xkdVar2.b(aaya.class, "pbu");
                xkdVar2.b(aaxv.class, "pbp");
                xkdVar2.b(aayf.class, "pl_int");
                xkdVar2.b(aboe.class, "pl_ex");
                xkdVar2.b(aaxu.class, "pl_int");
                xkdVar2.b(aayk.class, "ts");
                xkdVar2.b(aayj.class, "tr");
                final int i14 = 4;
                xkdVar2.a(aayd.class, new xju() { // from class: yic
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        switch (i14) {
                            case 0:
                                return Collections.singletonMap("orec", "1");
                            case 1:
                                return Collections.singletonMap("crm", Integer.toString(((yiw) obj3).a.getNumber()));
                            case 2:
                                return Collections.singletonMap("ohrtt", Long.toString(((ykf) obj3).a));
                            case 3:
                                return Collections.singletonMap("oubpr", "1");
                            case 4:
                                String str = ((aayd) obj3).b;
                                if (str == null) {
                                    return null;
                                }
                                HashMap map = new HashMap();
                                map.put("task_id", str);
                                return map;
                            case 5:
                                if (!((aayc) obj3).b) {
                                    return null;
                                }
                                HashMap map2 = new HashMap();
                                map2.put("mod_pft", "cache");
                                return map2;
                            case 6:
                                if (!((aayh) obj3).a) {
                                    return null;
                                }
                                HashMap map3 = new HashMap();
                                map3.put("mod_pft", "cache");
                                return map3;
                            case 7:
                                aazj aazjVar = (aazj) obj3;
                                if (!aazjVar.a.a(abob.c, abob.h)) {
                                    return null;
                                }
                                String str2 = aazjVar.g;
                                wjf wjfVar = aazjVar.b;
                                if (str2 == null || wjfVar == null) {
                                    return null;
                                }
                                HashMap map4 = new HashMap();
                                if (!wjfVar.G().isEmpty()) {
                                    map4.put("docid", wjfVar.G());
                                }
                                map4.put("cpn", str2);
                                return map4;
                            case 8:
                                aboe aboeVar = (aboe) obj3;
                                HashMap map5 = new HashMap();
                                String str3 = aboeVar.h;
                                if (!TextUtils.isEmpty(str3)) {
                                    map5.put("docid", str3);
                                }
                                if (TextUtils.isEmpty(aboeVar.b)) {
                                    return map5;
                                }
                                map5.put("cpn", aboeVar.b);
                                return map5;
                            case 9:
                                int iOrdinal = ((abmh) obj3).a.ordinal();
                                String str4 = "jp";
                                switch (iOrdinal) {
                                    case 0:
                                        str4 = "st";
                                        break;
                                    case 1:
                                        str4 = "n";
                                        break;
                                    case 2:
                                        str4 = "p";
                                        break;
                                    case 3:
                                        str4 = "ap";
                                        break;
                                    case 4:
                                        str4 = "an";
                                        break;
                                    case 5:
                                        str4 = "rt";
                                        break;
                                    case 6:
                                    case 7:
                                        break;
                                    default:
                                        throw new RuntimeException(null, null);
                                }
                                HashMap map6 = new HashMap();
                                map6.put("yt_wt", str4);
                                return map6;
                            case 10:
                                yvu yvuVar = (yvu) obj3;
                                wgs wgsVar = yvuVar.c;
                                if (wgsVar == null) {
                                    wgsVar = yvuVar.f;
                                }
                                if (wgsVar == null) {
                                    return null;
                                }
                                HashMap map7 = new HashMap();
                                map7.put("fmt", String.valueOf(wgsVar.e()));
                                map7.put("mod_local", true != wgsVar.W() ? "0" : "1");
                                return map7;
                            case 11:
                                HashMap map8 = new HashMap();
                                if (!((aaye) obj3).b) {
                                    return map8;
                                }
                                map8.put("mod_adap", "1");
                                return map8;
                            case 12:
                                HashMap map9 = new HashMap();
                                map9.put("cmt", String.valueOf(((aaxz) obj3).b));
                                return map9;
                            default:
                                adko adkoVar = (adko) obj3;
                                return Collections.singletonMap("th" + adkoVar.c + "_tt", Integer.toString(adkoVar.f));
                        }
                    }
                });
                final int i15 = 5;
                xkdVar2.a(aayc.class, new xju() { // from class: yic
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        switch (i15) {
                            case 0:
                                return Collections.singletonMap("orec", "1");
                            case 1:
                                return Collections.singletonMap("crm", Integer.toString(((yiw) obj3).a.getNumber()));
                            case 2:
                                return Collections.singletonMap("ohrtt", Long.toString(((ykf) obj3).a));
                            case 3:
                                return Collections.singletonMap("oubpr", "1");
                            case 4:
                                String str = ((aayd) obj3).b;
                                if (str == null) {
                                    return null;
                                }
                                HashMap map = new HashMap();
                                map.put("task_id", str);
                                return map;
                            case 5:
                                if (!((aayc) obj3).b) {
                                    return null;
                                }
                                HashMap map2 = new HashMap();
                                map2.put("mod_pft", "cache");
                                return map2;
                            case 6:
                                if (!((aayh) obj3).a) {
                                    return null;
                                }
                                HashMap map3 = new HashMap();
                                map3.put("mod_pft", "cache");
                                return map3;
                            case 7:
                                aazj aazjVar = (aazj) obj3;
                                if (!aazjVar.a.a(abob.c, abob.h)) {
                                    return null;
                                }
                                String str2 = aazjVar.g;
                                wjf wjfVar = aazjVar.b;
                                if (str2 == null || wjfVar == null) {
                                    return null;
                                }
                                HashMap map4 = new HashMap();
                                if (!wjfVar.G().isEmpty()) {
                                    map4.put("docid", wjfVar.G());
                                }
                                map4.put("cpn", str2);
                                return map4;
                            case 8:
                                aboe aboeVar = (aboe) obj3;
                                HashMap map5 = new HashMap();
                                String str3 = aboeVar.h;
                                if (!TextUtils.isEmpty(str3)) {
                                    map5.put("docid", str3);
                                }
                                if (TextUtils.isEmpty(aboeVar.b)) {
                                    return map5;
                                }
                                map5.put("cpn", aboeVar.b);
                                return map5;
                            case 9:
                                int iOrdinal = ((abmh) obj3).a.ordinal();
                                String str4 = "jp";
                                switch (iOrdinal) {
                                    case 0:
                                        str4 = "st";
                                        break;
                                    case 1:
                                        str4 = "n";
                                        break;
                                    case 2:
                                        str4 = "p";
                                        break;
                                    case 3:
                                        str4 = "ap";
                                        break;
                                    case 4:
                                        str4 = "an";
                                        break;
                                    case 5:
                                        str4 = "rt";
                                        break;
                                    case 6:
                                    case 7:
                                        break;
                                    default:
                                        throw new RuntimeException(null, null);
                                }
                                HashMap map6 = new HashMap();
                                map6.put("yt_wt", str4);
                                return map6;
                            case 10:
                                yvu yvuVar = (yvu) obj3;
                                wgs wgsVar = yvuVar.c;
                                if (wgsVar == null) {
                                    wgsVar = yvuVar.f;
                                }
                                if (wgsVar == null) {
                                    return null;
                                }
                                HashMap map7 = new HashMap();
                                map7.put("fmt", String.valueOf(wgsVar.e()));
                                map7.put("mod_local", true != wgsVar.W() ? "0" : "1");
                                return map7;
                            case 11:
                                HashMap map8 = new HashMap();
                                if (!((aaye) obj3).b) {
                                    return map8;
                                }
                                map8.put("mod_adap", "1");
                                return map8;
                            case 12:
                                HashMap map9 = new HashMap();
                                map9.put("cmt", String.valueOf(((aaxz) obj3).b));
                                return map9;
                            default:
                                adko adkoVar = (adko) obj3;
                                return Collections.singletonMap("th" + adkoVar.c + "_tt", Integer.toString(adkoVar.f));
                        }
                    }
                });
                final int i16 = 6;
                xkdVar2.a(aayh.class, new xju() { // from class: yic
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        switch (i16) {
                            case 0:
                                return Collections.singletonMap("orec", "1");
                            case 1:
                                return Collections.singletonMap("crm", Integer.toString(((yiw) obj3).a.getNumber()));
                            case 2:
                                return Collections.singletonMap("ohrtt", Long.toString(((ykf) obj3).a));
                            case 3:
                                return Collections.singletonMap("oubpr", "1");
                            case 4:
                                String str = ((aayd) obj3).b;
                                if (str == null) {
                                    return null;
                                }
                                HashMap map = new HashMap();
                                map.put("task_id", str);
                                return map;
                            case 5:
                                if (!((aayc) obj3).b) {
                                    return null;
                                }
                                HashMap map2 = new HashMap();
                                map2.put("mod_pft", "cache");
                                return map2;
                            case 6:
                                if (!((aayh) obj3).a) {
                                    return null;
                                }
                                HashMap map3 = new HashMap();
                                map3.put("mod_pft", "cache");
                                return map3;
                            case 7:
                                aazj aazjVar = (aazj) obj3;
                                if (!aazjVar.a.a(abob.c, abob.h)) {
                                    return null;
                                }
                                String str2 = aazjVar.g;
                                wjf wjfVar = aazjVar.b;
                                if (str2 == null || wjfVar == null) {
                                    return null;
                                }
                                HashMap map4 = new HashMap();
                                if (!wjfVar.G().isEmpty()) {
                                    map4.put("docid", wjfVar.G());
                                }
                                map4.put("cpn", str2);
                                return map4;
                            case 8:
                                aboe aboeVar = (aboe) obj3;
                                HashMap map5 = new HashMap();
                                String str3 = aboeVar.h;
                                if (!TextUtils.isEmpty(str3)) {
                                    map5.put("docid", str3);
                                }
                                if (TextUtils.isEmpty(aboeVar.b)) {
                                    return map5;
                                }
                                map5.put("cpn", aboeVar.b);
                                return map5;
                            case 9:
                                int iOrdinal = ((abmh) obj3).a.ordinal();
                                String str4 = "jp";
                                switch (iOrdinal) {
                                    case 0:
                                        str4 = "st";
                                        break;
                                    case 1:
                                        str4 = "n";
                                        break;
                                    case 2:
                                        str4 = "p";
                                        break;
                                    case 3:
                                        str4 = "ap";
                                        break;
                                    case 4:
                                        str4 = "an";
                                        break;
                                    case 5:
                                        str4 = "rt";
                                        break;
                                    case 6:
                                    case 7:
                                        break;
                                    default:
                                        throw new RuntimeException(null, null);
                                }
                                HashMap map6 = new HashMap();
                                map6.put("yt_wt", str4);
                                return map6;
                            case 10:
                                yvu yvuVar = (yvu) obj3;
                                wgs wgsVar = yvuVar.c;
                                if (wgsVar == null) {
                                    wgsVar = yvuVar.f;
                                }
                                if (wgsVar == null) {
                                    return null;
                                }
                                HashMap map7 = new HashMap();
                                map7.put("fmt", String.valueOf(wgsVar.e()));
                                map7.put("mod_local", true != wgsVar.W() ? "0" : "1");
                                return map7;
                            case 11:
                                HashMap map8 = new HashMap();
                                if (!((aaye) obj3).b) {
                                    return map8;
                                }
                                map8.put("mod_adap", "1");
                                return map8;
                            case 12:
                                HashMap map9 = new HashMap();
                                map9.put("cmt", String.valueOf(((aaxz) obj3).b));
                                return map9;
                            default:
                                adko adkoVar = (adko) obj3;
                                return Collections.singletonMap("th" + adkoVar.c + "_tt", Integer.toString(adkoVar.f));
                        }
                    }
                });
                final int i17 = 0;
                xkdVar2.c(aazj.class, new xjv() { // from class: aawg
                    @Override // defpackage.xjv
                    public final tas a(tas tasVar) {
                        if (i17 != 0) {
                            sft sftVar = (sft) tasVar;
                            sftVar.b("ad_i");
                            return sftVar;
                        }
                        aazj aazjVar = (aazj) tasVar;
                        if (aazjVar.a != abob.c) {
                            return null;
                        }
                        aazjVar.b("gv");
                        return aazjVar;
                    }
                });
                final int i18 = 7;
                xkdVar2.a(aazj.class, new xju() { // from class: yic
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        switch (i18) {
                            case 0:
                                return Collections.singletonMap("orec", "1");
                            case 1:
                                return Collections.singletonMap("crm", Integer.toString(((yiw) obj3).a.getNumber()));
                            case 2:
                                return Collections.singletonMap("ohrtt", Long.toString(((ykf) obj3).a));
                            case 3:
                                return Collections.singletonMap("oubpr", "1");
                            case 4:
                                String str = ((aayd) obj3).b;
                                if (str == null) {
                                    return null;
                                }
                                HashMap map = new HashMap();
                                map.put("task_id", str);
                                return map;
                            case 5:
                                if (!((aayc) obj3).b) {
                                    return null;
                                }
                                HashMap map2 = new HashMap();
                                map2.put("mod_pft", "cache");
                                return map2;
                            case 6:
                                if (!((aayh) obj3).a) {
                                    return null;
                                }
                                HashMap map3 = new HashMap();
                                map3.put("mod_pft", "cache");
                                return map3;
                            case 7:
                                aazj aazjVar = (aazj) obj3;
                                if (!aazjVar.a.a(abob.c, abob.h)) {
                                    return null;
                                }
                                String str2 = aazjVar.g;
                                wjf wjfVar = aazjVar.b;
                                if (str2 == null || wjfVar == null) {
                                    return null;
                                }
                                HashMap map4 = new HashMap();
                                if (!wjfVar.G().isEmpty()) {
                                    map4.put("docid", wjfVar.G());
                                }
                                map4.put("cpn", str2);
                                return map4;
                            case 8:
                                aboe aboeVar = (aboe) obj3;
                                HashMap map5 = new HashMap();
                                String str3 = aboeVar.h;
                                if (!TextUtils.isEmpty(str3)) {
                                    map5.put("docid", str3);
                                }
                                if (TextUtils.isEmpty(aboeVar.b)) {
                                    return map5;
                                }
                                map5.put("cpn", aboeVar.b);
                                return map5;
                            case 9:
                                int iOrdinal = ((abmh) obj3).a.ordinal();
                                String str4 = "jp";
                                switch (iOrdinal) {
                                    case 0:
                                        str4 = "st";
                                        break;
                                    case 1:
                                        str4 = "n";
                                        break;
                                    case 2:
                                        str4 = "p";
                                        break;
                                    case 3:
                                        str4 = "ap";
                                        break;
                                    case 4:
                                        str4 = "an";
                                        break;
                                    case 5:
                                        str4 = "rt";
                                        break;
                                    case 6:
                                    case 7:
                                        break;
                                    default:
                                        throw new RuntimeException(null, null);
                                }
                                HashMap map6 = new HashMap();
                                map6.put("yt_wt", str4);
                                return map6;
                            case 10:
                                yvu yvuVar = (yvu) obj3;
                                wgs wgsVar = yvuVar.c;
                                if (wgsVar == null) {
                                    wgsVar = yvuVar.f;
                                }
                                if (wgsVar == null) {
                                    return null;
                                }
                                HashMap map7 = new HashMap();
                                map7.put("fmt", String.valueOf(wgsVar.e()));
                                map7.put("mod_local", true != wgsVar.W() ? "0" : "1");
                                return map7;
                            case 11:
                                HashMap map8 = new HashMap();
                                if (!((aaye) obj3).b) {
                                    return map8;
                                }
                                map8.put("mod_adap", "1");
                                return map8;
                            case 12:
                                HashMap map9 = new HashMap();
                                map9.put("cmt", String.valueOf(((aaxz) obj3).b));
                                return map9;
                            default:
                                adko adkoVar = (adko) obj3;
                                return Collections.singletonMap("th" + adkoVar.c + "_tt", Integer.toString(adkoVar.f));
                        }
                    }
                });
                final int i19 = 8;
                xkdVar2.a(aboe.class, new xju() { // from class: yic
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        switch (i19) {
                            case 0:
                                return Collections.singletonMap("orec", "1");
                            case 1:
                                return Collections.singletonMap("crm", Integer.toString(((yiw) obj3).a.getNumber()));
                            case 2:
                                return Collections.singletonMap("ohrtt", Long.toString(((ykf) obj3).a));
                            case 3:
                                return Collections.singletonMap("oubpr", "1");
                            case 4:
                                String str = ((aayd) obj3).b;
                                if (str == null) {
                                    return null;
                                }
                                HashMap map = new HashMap();
                                map.put("task_id", str);
                                return map;
                            case 5:
                                if (!((aayc) obj3).b) {
                                    return null;
                                }
                                HashMap map2 = new HashMap();
                                map2.put("mod_pft", "cache");
                                return map2;
                            case 6:
                                if (!((aayh) obj3).a) {
                                    return null;
                                }
                                HashMap map3 = new HashMap();
                                map3.put("mod_pft", "cache");
                                return map3;
                            case 7:
                                aazj aazjVar = (aazj) obj3;
                                if (!aazjVar.a.a(abob.c, abob.h)) {
                                    return null;
                                }
                                String str2 = aazjVar.g;
                                wjf wjfVar = aazjVar.b;
                                if (str2 == null || wjfVar == null) {
                                    return null;
                                }
                                HashMap map4 = new HashMap();
                                if (!wjfVar.G().isEmpty()) {
                                    map4.put("docid", wjfVar.G());
                                }
                                map4.put("cpn", str2);
                                return map4;
                            case 8:
                                aboe aboeVar = (aboe) obj3;
                                HashMap map5 = new HashMap();
                                String str3 = aboeVar.h;
                                if (!TextUtils.isEmpty(str3)) {
                                    map5.put("docid", str3);
                                }
                                if (TextUtils.isEmpty(aboeVar.b)) {
                                    return map5;
                                }
                                map5.put("cpn", aboeVar.b);
                                return map5;
                            case 9:
                                int iOrdinal = ((abmh) obj3).a.ordinal();
                                String str4 = "jp";
                                switch (iOrdinal) {
                                    case 0:
                                        str4 = "st";
                                        break;
                                    case 1:
                                        str4 = "n";
                                        break;
                                    case 2:
                                        str4 = "p";
                                        break;
                                    case 3:
                                        str4 = "ap";
                                        break;
                                    case 4:
                                        str4 = "an";
                                        break;
                                    case 5:
                                        str4 = "rt";
                                        break;
                                    case 6:
                                    case 7:
                                        break;
                                    default:
                                        throw new RuntimeException(null, null);
                                }
                                HashMap map6 = new HashMap();
                                map6.put("yt_wt", str4);
                                return map6;
                            case 10:
                                yvu yvuVar = (yvu) obj3;
                                wgs wgsVar = yvuVar.c;
                                if (wgsVar == null) {
                                    wgsVar = yvuVar.f;
                                }
                                if (wgsVar == null) {
                                    return null;
                                }
                                HashMap map7 = new HashMap();
                                map7.put("fmt", String.valueOf(wgsVar.e()));
                                map7.put("mod_local", true != wgsVar.W() ? "0" : "1");
                                return map7;
                            case 11:
                                HashMap map8 = new HashMap();
                                if (!((aaye) obj3).b) {
                                    return map8;
                                }
                                map8.put("mod_adap", "1");
                                return map8;
                            case 12:
                                HashMap map9 = new HashMap();
                                map9.put("cmt", String.valueOf(((aaxz) obj3).b));
                                return map9;
                            default:
                                adko adkoVar = (adko) obj3;
                                return Collections.singletonMap("th" + adkoVar.c + "_tt", Integer.toString(adkoVar.f));
                        }
                    }
                });
                final int i20 = 9;
                xkdVar2.a(abmh.class, new xju() { // from class: yic
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        switch (i20) {
                            case 0:
                                return Collections.singletonMap("orec", "1");
                            case 1:
                                return Collections.singletonMap("crm", Integer.toString(((yiw) obj3).a.getNumber()));
                            case 2:
                                return Collections.singletonMap("ohrtt", Long.toString(((ykf) obj3).a));
                            case 3:
                                return Collections.singletonMap("oubpr", "1");
                            case 4:
                                String str = ((aayd) obj3).b;
                                if (str == null) {
                                    return null;
                                }
                                HashMap map = new HashMap();
                                map.put("task_id", str);
                                return map;
                            case 5:
                                if (!((aayc) obj3).b) {
                                    return null;
                                }
                                HashMap map2 = new HashMap();
                                map2.put("mod_pft", "cache");
                                return map2;
                            case 6:
                                if (!((aayh) obj3).a) {
                                    return null;
                                }
                                HashMap map3 = new HashMap();
                                map3.put("mod_pft", "cache");
                                return map3;
                            case 7:
                                aazj aazjVar = (aazj) obj3;
                                if (!aazjVar.a.a(abob.c, abob.h)) {
                                    return null;
                                }
                                String str2 = aazjVar.g;
                                wjf wjfVar = aazjVar.b;
                                if (str2 == null || wjfVar == null) {
                                    return null;
                                }
                                HashMap map4 = new HashMap();
                                if (!wjfVar.G().isEmpty()) {
                                    map4.put("docid", wjfVar.G());
                                }
                                map4.put("cpn", str2);
                                return map4;
                            case 8:
                                aboe aboeVar = (aboe) obj3;
                                HashMap map5 = new HashMap();
                                String str3 = aboeVar.h;
                                if (!TextUtils.isEmpty(str3)) {
                                    map5.put("docid", str3);
                                }
                                if (TextUtils.isEmpty(aboeVar.b)) {
                                    return map5;
                                }
                                map5.put("cpn", aboeVar.b);
                                return map5;
                            case 9:
                                int iOrdinal = ((abmh) obj3).a.ordinal();
                                String str4 = "jp";
                                switch (iOrdinal) {
                                    case 0:
                                        str4 = "st";
                                        break;
                                    case 1:
                                        str4 = "n";
                                        break;
                                    case 2:
                                        str4 = "p";
                                        break;
                                    case 3:
                                        str4 = "ap";
                                        break;
                                    case 4:
                                        str4 = "an";
                                        break;
                                    case 5:
                                        str4 = "rt";
                                        break;
                                    case 6:
                                    case 7:
                                        break;
                                    default:
                                        throw new RuntimeException(null, null);
                                }
                                HashMap map6 = new HashMap();
                                map6.put("yt_wt", str4);
                                return map6;
                            case 10:
                                yvu yvuVar = (yvu) obj3;
                                wgs wgsVar = yvuVar.c;
                                if (wgsVar == null) {
                                    wgsVar = yvuVar.f;
                                }
                                if (wgsVar == null) {
                                    return null;
                                }
                                HashMap map7 = new HashMap();
                                map7.put("fmt", String.valueOf(wgsVar.e()));
                                map7.put("mod_local", true != wgsVar.W() ? "0" : "1");
                                return map7;
                            case 11:
                                HashMap map8 = new HashMap();
                                if (!((aaye) obj3).b) {
                                    return map8;
                                }
                                map8.put("mod_adap", "1");
                                return map8;
                            case 12:
                                HashMap map9 = new HashMap();
                                map9.put("cmt", String.valueOf(((aaxz) obj3).b));
                                return map9;
                            default:
                                adko adkoVar = (adko) obj3;
                                return Collections.singletonMap("th" + adkoVar.c + "_tt", Integer.toString(adkoVar.f));
                        }
                    }
                });
                final int i21 = 10;
                xkdVar2.a(yvu.class, new xju() { // from class: yic
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        switch (i21) {
                            case 0:
                                return Collections.singletonMap("orec", "1");
                            case 1:
                                return Collections.singletonMap("crm", Integer.toString(((yiw) obj3).a.getNumber()));
                            case 2:
                                return Collections.singletonMap("ohrtt", Long.toString(((ykf) obj3).a));
                            case 3:
                                return Collections.singletonMap("oubpr", "1");
                            case 4:
                                String str = ((aayd) obj3).b;
                                if (str == null) {
                                    return null;
                                }
                                HashMap map = new HashMap();
                                map.put("task_id", str);
                                return map;
                            case 5:
                                if (!((aayc) obj3).b) {
                                    return null;
                                }
                                HashMap map2 = new HashMap();
                                map2.put("mod_pft", "cache");
                                return map2;
                            case 6:
                                if (!((aayh) obj3).a) {
                                    return null;
                                }
                                HashMap map3 = new HashMap();
                                map3.put("mod_pft", "cache");
                                return map3;
                            case 7:
                                aazj aazjVar = (aazj) obj3;
                                if (!aazjVar.a.a(abob.c, abob.h)) {
                                    return null;
                                }
                                String str2 = aazjVar.g;
                                wjf wjfVar = aazjVar.b;
                                if (str2 == null || wjfVar == null) {
                                    return null;
                                }
                                HashMap map4 = new HashMap();
                                if (!wjfVar.G().isEmpty()) {
                                    map4.put("docid", wjfVar.G());
                                }
                                map4.put("cpn", str2);
                                return map4;
                            case 8:
                                aboe aboeVar = (aboe) obj3;
                                HashMap map5 = new HashMap();
                                String str3 = aboeVar.h;
                                if (!TextUtils.isEmpty(str3)) {
                                    map5.put("docid", str3);
                                }
                                if (TextUtils.isEmpty(aboeVar.b)) {
                                    return map5;
                                }
                                map5.put("cpn", aboeVar.b);
                                return map5;
                            case 9:
                                int iOrdinal = ((abmh) obj3).a.ordinal();
                                String str4 = "jp";
                                switch (iOrdinal) {
                                    case 0:
                                        str4 = "st";
                                        break;
                                    case 1:
                                        str4 = "n";
                                        break;
                                    case 2:
                                        str4 = "p";
                                        break;
                                    case 3:
                                        str4 = "ap";
                                        break;
                                    case 4:
                                        str4 = "an";
                                        break;
                                    case 5:
                                        str4 = "rt";
                                        break;
                                    case 6:
                                    case 7:
                                        break;
                                    default:
                                        throw new RuntimeException(null, null);
                                }
                                HashMap map6 = new HashMap();
                                map6.put("yt_wt", str4);
                                return map6;
                            case 10:
                                yvu yvuVar = (yvu) obj3;
                                wgs wgsVar = yvuVar.c;
                                if (wgsVar == null) {
                                    wgsVar = yvuVar.f;
                                }
                                if (wgsVar == null) {
                                    return null;
                                }
                                HashMap map7 = new HashMap();
                                map7.put("fmt", String.valueOf(wgsVar.e()));
                                map7.put("mod_local", true != wgsVar.W() ? "0" : "1");
                                return map7;
                            case 11:
                                HashMap map8 = new HashMap();
                                if (!((aaye) obj3).b) {
                                    return map8;
                                }
                                map8.put("mod_adap", "1");
                                return map8;
                            case 12:
                                HashMap map9 = new HashMap();
                                map9.put("cmt", String.valueOf(((aaxz) obj3).b));
                                return map9;
                            default:
                                adko adkoVar = (adko) obj3;
                                return Collections.singletonMap("th" + adkoVar.c + "_tt", Integer.toString(adkoVar.f));
                        }
                    }
                });
                final int i22 = 11;
                xkdVar2.a(aaye.class, new xju() { // from class: yic
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        switch (i22) {
                            case 0:
                                return Collections.singletonMap("orec", "1");
                            case 1:
                                return Collections.singletonMap("crm", Integer.toString(((yiw) obj3).a.getNumber()));
                            case 2:
                                return Collections.singletonMap("ohrtt", Long.toString(((ykf) obj3).a));
                            case 3:
                                return Collections.singletonMap("oubpr", "1");
                            case 4:
                                String str = ((aayd) obj3).b;
                                if (str == null) {
                                    return null;
                                }
                                HashMap map = new HashMap();
                                map.put("task_id", str);
                                return map;
                            case 5:
                                if (!((aayc) obj3).b) {
                                    return null;
                                }
                                HashMap map2 = new HashMap();
                                map2.put("mod_pft", "cache");
                                return map2;
                            case 6:
                                if (!((aayh) obj3).a) {
                                    return null;
                                }
                                HashMap map3 = new HashMap();
                                map3.put("mod_pft", "cache");
                                return map3;
                            case 7:
                                aazj aazjVar = (aazj) obj3;
                                if (!aazjVar.a.a(abob.c, abob.h)) {
                                    return null;
                                }
                                String str2 = aazjVar.g;
                                wjf wjfVar = aazjVar.b;
                                if (str2 == null || wjfVar == null) {
                                    return null;
                                }
                                HashMap map4 = new HashMap();
                                if (!wjfVar.G().isEmpty()) {
                                    map4.put("docid", wjfVar.G());
                                }
                                map4.put("cpn", str2);
                                return map4;
                            case 8:
                                aboe aboeVar = (aboe) obj3;
                                HashMap map5 = new HashMap();
                                String str3 = aboeVar.h;
                                if (!TextUtils.isEmpty(str3)) {
                                    map5.put("docid", str3);
                                }
                                if (TextUtils.isEmpty(aboeVar.b)) {
                                    return map5;
                                }
                                map5.put("cpn", aboeVar.b);
                                return map5;
                            case 9:
                                int iOrdinal = ((abmh) obj3).a.ordinal();
                                String str4 = "jp";
                                switch (iOrdinal) {
                                    case 0:
                                        str4 = "st";
                                        break;
                                    case 1:
                                        str4 = "n";
                                        break;
                                    case 2:
                                        str4 = "p";
                                        break;
                                    case 3:
                                        str4 = "ap";
                                        break;
                                    case 4:
                                        str4 = "an";
                                        break;
                                    case 5:
                                        str4 = "rt";
                                        break;
                                    case 6:
                                    case 7:
                                        break;
                                    default:
                                        throw new RuntimeException(null, null);
                                }
                                HashMap map6 = new HashMap();
                                map6.put("yt_wt", str4);
                                return map6;
                            case 10:
                                yvu yvuVar = (yvu) obj3;
                                wgs wgsVar = yvuVar.c;
                                if (wgsVar == null) {
                                    wgsVar = yvuVar.f;
                                }
                                if (wgsVar == null) {
                                    return null;
                                }
                                HashMap map7 = new HashMap();
                                map7.put("fmt", String.valueOf(wgsVar.e()));
                                map7.put("mod_local", true != wgsVar.W() ? "0" : "1");
                                return map7;
                            case 11:
                                HashMap map8 = new HashMap();
                                if (!((aaye) obj3).b) {
                                    return map8;
                                }
                                map8.put("mod_adap", "1");
                                return map8;
                            case 12:
                                HashMap map9 = new HashMap();
                                map9.put("cmt", String.valueOf(((aaxz) obj3).b));
                                return map9;
                            default:
                                adko adkoVar = (adko) obj3;
                                return Collections.singletonMap("th" + adkoVar.c + "_tt", Integer.toString(adkoVar.f));
                        }
                    }
                });
                final int i23 = 12;
                xkdVar2.a(aaxz.class, new xju() { // from class: yic
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        switch (i23) {
                            case 0:
                                return Collections.singletonMap("orec", "1");
                            case 1:
                                return Collections.singletonMap("crm", Integer.toString(((yiw) obj3).a.getNumber()));
                            case 2:
                                return Collections.singletonMap("ohrtt", Long.toString(((ykf) obj3).a));
                            case 3:
                                return Collections.singletonMap("oubpr", "1");
                            case 4:
                                String str = ((aayd) obj3).b;
                                if (str == null) {
                                    return null;
                                }
                                HashMap map = new HashMap();
                                map.put("task_id", str);
                                return map;
                            case 5:
                                if (!((aayc) obj3).b) {
                                    return null;
                                }
                                HashMap map2 = new HashMap();
                                map2.put("mod_pft", "cache");
                                return map2;
                            case 6:
                                if (!((aayh) obj3).a) {
                                    return null;
                                }
                                HashMap map3 = new HashMap();
                                map3.put("mod_pft", "cache");
                                return map3;
                            case 7:
                                aazj aazjVar = (aazj) obj3;
                                if (!aazjVar.a.a(abob.c, abob.h)) {
                                    return null;
                                }
                                String str2 = aazjVar.g;
                                wjf wjfVar = aazjVar.b;
                                if (str2 == null || wjfVar == null) {
                                    return null;
                                }
                                HashMap map4 = new HashMap();
                                if (!wjfVar.G().isEmpty()) {
                                    map4.put("docid", wjfVar.G());
                                }
                                map4.put("cpn", str2);
                                return map4;
                            case 8:
                                aboe aboeVar = (aboe) obj3;
                                HashMap map5 = new HashMap();
                                String str3 = aboeVar.h;
                                if (!TextUtils.isEmpty(str3)) {
                                    map5.put("docid", str3);
                                }
                                if (TextUtils.isEmpty(aboeVar.b)) {
                                    return map5;
                                }
                                map5.put("cpn", aboeVar.b);
                                return map5;
                            case 9:
                                int iOrdinal = ((abmh) obj3).a.ordinal();
                                String str4 = "jp";
                                switch (iOrdinal) {
                                    case 0:
                                        str4 = "st";
                                        break;
                                    case 1:
                                        str4 = "n";
                                        break;
                                    case 2:
                                        str4 = "p";
                                        break;
                                    case 3:
                                        str4 = "ap";
                                        break;
                                    case 4:
                                        str4 = "an";
                                        break;
                                    case 5:
                                        str4 = "rt";
                                        break;
                                    case 6:
                                    case 7:
                                        break;
                                    default:
                                        throw new RuntimeException(null, null);
                                }
                                HashMap map6 = new HashMap();
                                map6.put("yt_wt", str4);
                                return map6;
                            case 10:
                                yvu yvuVar = (yvu) obj3;
                                wgs wgsVar = yvuVar.c;
                                if (wgsVar == null) {
                                    wgsVar = yvuVar.f;
                                }
                                if (wgsVar == null) {
                                    return null;
                                }
                                HashMap map7 = new HashMap();
                                map7.put("fmt", String.valueOf(wgsVar.e()));
                                map7.put("mod_local", true != wgsVar.W() ? "0" : "1");
                                return map7;
                            case 11:
                                HashMap map8 = new HashMap();
                                if (!((aaye) obj3).b) {
                                    return map8;
                                }
                                map8.put("mod_adap", "1");
                                return map8;
                            case 12:
                                HashMap map9 = new HashMap();
                                map9.put("cmt", String.valueOf(((aaxz) obj3).b));
                                return map9;
                            default:
                                adko adkoVar = (adko) obj3;
                                return Collections.singletonMap("th" + adkoVar.c + "_tt", Integer.toString(adkoVar.f));
                        }
                    }
                });
                zkf.d(obj);
                xkdVar2.b(yjk.class, "gel");
                xkdVar2.b(yji.class, "exo");
                xkdVar2.b(yjo.class, "mpl_s");
                xkdVar2.b(yjn.class, "mpl_p");
                xkdVar2.b(ymt.class, "vsiss");
                xkdVar2.b(ymu.class, "vsisrh");
                xkdVar2.b(ymr.class, "vsisfb");
                xkdVar2.b(yms.class, "vis_r");
                xkdVar2.b(yin.class, "asiss");
                xkdVar2.b(yio.class, "asisrh");
                xkdVar2.b(yil.class, "asisfb");
                xkdVar2.b(yim.class, "ais_r");
                xkdVar2.b(ymv.class, "vri");
                xkdVar2.b(ymw.class, "vrrh");
                xkdVar2.b(ymq.class, "fvb_r");
                xkdVar2.b(ymp.class, "vr100k");
                xkdVar2.b(yip.class, "ari");
                xkdVar2.b(yiq.class, "arrh");
                xkdVar2.b(yik.class, "fab_r");
                xkdVar2.b(yij.class, "ar40k");
                xkdVar2.b(yke.class, "or_i");
                xkdVar2.b(ylb.class, "osor");
                xkdVar2.b(yku.class, "orj");
                xkdVar2.b(yjy.class, "ocs");
                xkdVar2.b(ykz.class, "orh_r");
                xkdVar2.b(ykb.class, "orfb");
                xkdVar2.b(yjz.class, "or100k");
                xkdVar2.b(yju.class, "oais_r");
                xkdVar2.b(ylg.class, "ovis_r");
                xkdVar2.b(ykk.class, "ormk");
                xkdVar2.b(ykq.class, "opr_r");
                xkdVar2.b(ylk.class, "orwnr");
                xkdVar2.b(ylj.class, "ovr2s");
                xkdVar2.b(yjx.class, "oar2s");
                xkdVar2.b(ylh.class, "ovd2s");
                xkdVar2.b(yjv.class, "oad2s");
                xkdVar2.b(yli.class, "ovrp2s");
                xkdVar2.b(yjw.class, "oarp2s");
                xkdVar2.b(ykc.class, "ofvrp");
                xkdVar2.b(yka.class, "ofarp");
                xkdVar2.b(yky.class, "or_c");
                xkdVar2.b(ykx.class, "ore");
                xkdVar2.b(ykd.class, "oge");
                xkdVar2.b(ykr.class, "or_fs");
                xkdVar2.b(yks.class, "or_fc");
                xkdVar2.b(ykt.class, "or_fe");
                xkdVar2.b(ykn.class, "oor");
                xkdVar2.b(ymd.class, "ppu");
                xkdVar2.b(yjq.class, "pari");
                xkdVar2.b(yjr.class, "pvri");
                xkdVar2.b(ymx.class, "vtre");
                xkdVar2.b(ymy.class, "vtrr");
                xkdVar2.b(ymz.class, "vtrs");
                xkdVar2.b(ymn.class, "vhb");
                xkdVar2.b(ymm.class, "vrb_f");
                xkdVar2.b(yis.class, "atre");
                xkdVar2.b(yit.class, "atrr");
                xkdVar2.b(yiu.class, "atrs");
                xkdVar2.b(yir.class, "atps");
                xkdVar2.b(yih.class, "ahb");
                xkdVar2.b(yig.class, "arb_f");
                xkdVar2.b(yie.class, "aci");
                xkdVar2.b(yid.class, "acc");
                xkdVar2.b(ymk.class, "vci");
                xkdVar2.b(ymj.class, "vcc");
                xkdVar2.b(yif.class, "acq");
                xkdVar2.b(yml.class, "vcq");
                xkdVar2.b(yja.class, "drm_gk_s");
                xkdVar2.b(yiz.class, "drm_gk_f");
                xkdVar2.b(yjc.class, "drm_net_s");
                xkdVar2.b(yjb.class, "drm_net_r");
                xkdVar2.b(yjg.class, "drm_kr_s");
                xkdVar2.b(yjf.class, "drm_kr_f");
                xkdVar2.b(yje.class, "drm_os_s");
                xkdVar2.b(yjd.class, "drm_os_f");
                xkdVar2.b(yiy.class, "mrs");
                xkdVar2.b(yix.class, "mrc");
                xkdVar2.b(ynl.class, "vmscps");
                xkdVar2.b(ynk.class, "vmscpe");
                xkdVar2.b(ynn.class, "vmsrps");
                xkdVar2.b(ynm.class, "vmsrpe");
                xkdVar2.b(ynj.class, "vmscls");
                xkdVar2.b(yni.class, "vmscle");
                xkdVar2.b(ynh.class, "vmpsts");
                xkdVar2.b(yng.class, "vmpste");
                xkdVar2.b(ynb.class, "vmpbtgs");
                xkdVar2.b(yna.class, "vmpbtge");
                xkdVar2.b(ynd.class, "vmpcdms");
                xkdVar2.b(ync.class, "vmpcdme");
                xkdVar2.b(ynf.class, "vmpdbs");
                xkdVar2.b(yne.class, "vmpdbe");
                xkdVar2.b(ymo.class, "vs_p");
                xkdVar2.b(yii.class, "as_p");
                xkdVar2.b(yjh.class, "exp");
                xkdVar2.b(yjj.class, "ffr");
                xkdVar2.b(ylr.class, "pwrm");
                xkdVar2.b(ylz.class, "pwr");
                xkdVar2.b(yly.class, "pls_p");
                xkdVar2.b(ylv.class, "pls_pa");
                xkdVar2.b(yls.class, "pls_b");
                xkdVar2.b(ymc.class, "pls_wff");
                xkdVar2.b(ylw.class, "pls_pb");
                xkdVar2.b(yma.class, "pls_s");
                xkdVar2.b(ylt.class, "pls_f");
                xkdVar2.b(ylx.class, "pls_pf");
                xkdVar2.b(ymb.class, "pls_u");
                xkdVar2.b(ymi.class, "sss");
                xkdVar2.b(ymh.class, "ssd");
                xkdVar2.b(yjm.class, "ml_i");
                xkdVar2.b(yjl.class, "ml_c");
                xkdVar2.b(ymf.class, "mpq_i");
                xkdVar2.b(yme.class, "mpq_c");
                xkdVar2.b(ylq.class, "mpn_i");
                xkdVar2.b(ylp.class, "mpn_c");
                xkdVar2.b(yjp.class, "mb_s");
                xkdVar2.b(ykv.class, "or_p");
                xkdVar2.b(ykp.class, "oprd_s");
                xkdVar2.b(yko.class, "oprd_c");
                xkdVar2.b(ykh.class, "oitru_s");
                xkdVar2.b(ykg.class, "oitru_c");
                xkdVar2.b(ykm.class, "omp_r");
                xkdVar2.b(ykl.class, "omp_c");
                xkdVar2.b(yjt.class, "oafs_r");
                xkdVar2.b(ylf.class, "ovfs_r");
                xkdVar2.b(ykj.class, "omd_s");
                xkdVar2.b(yki.class, "omd_c");
                xkdVar2.b(yle.class, "ove");
                xkdVar2.b(yll.class, "plt_cpc");
                xkdVar2.b(ylm.class, "plt_qvc");
                xkdVar2.b(yln.class, "plt_spi");
                xkdVar2.b(ylo.class, "plt_spr");
                xkdVar2.b(ymg.class, "nrrps");
                final int i24 = 18;
                xkdVar2.a(yjy.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i24) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i110 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
                final int i25 = 19;
                xkdVar2.a(yld.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i25) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i110 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
                final int i26 = 20;
                xkdVar2.a(yiv.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i26) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i110 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
                final int i27 = 1;
                xkdVar2.a(yiw.class, new xju() { // from class: yic
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        switch (i27) {
                            case 0:
                                return Collections.singletonMap("orec", "1");
                            case 1:
                                return Collections.singletonMap("crm", Integer.toString(((yiw) obj3).a.getNumber()));
                            case 2:
                                return Collections.singletonMap("ohrtt", Long.toString(((ykf) obj3).a));
                            case 3:
                                return Collections.singletonMap("oubpr", "1");
                            case 4:
                                String str = ((aayd) obj3).b;
                                if (str == null) {
                                    return null;
                                }
                                HashMap map = new HashMap();
                                map.put("task_id", str);
                                return map;
                            case 5:
                                if (!((aayc) obj3).b) {
                                    return null;
                                }
                                HashMap map2 = new HashMap();
                                map2.put("mod_pft", "cache");
                                return map2;
                            case 6:
                                if (!((aayh) obj3).a) {
                                    return null;
                                }
                                HashMap map3 = new HashMap();
                                map3.put("mod_pft", "cache");
                                return map3;
                            case 7:
                                aazj aazjVar = (aazj) obj3;
                                if (!aazjVar.a.a(abob.c, abob.h)) {
                                    return null;
                                }
                                String str2 = aazjVar.g;
                                wjf wjfVar = aazjVar.b;
                                if (str2 == null || wjfVar == null) {
                                    return null;
                                }
                                HashMap map4 = new HashMap();
                                if (!wjfVar.G().isEmpty()) {
                                    map4.put("docid", wjfVar.G());
                                }
                                map4.put("cpn", str2);
                                return map4;
                            case 8:
                                aboe aboeVar = (aboe) obj3;
                                HashMap map5 = new HashMap();
                                String str3 = aboeVar.h;
                                if (!TextUtils.isEmpty(str3)) {
                                    map5.put("docid", str3);
                                }
                                if (TextUtils.isEmpty(aboeVar.b)) {
                                    return map5;
                                }
                                map5.put("cpn", aboeVar.b);
                                return map5;
                            case 9:
                                int iOrdinal = ((abmh) obj3).a.ordinal();
                                String str4 = "jp";
                                switch (iOrdinal) {
                                    case 0:
                                        str4 = "st";
                                        break;
                                    case 1:
                                        str4 = "n";
                                        break;
                                    case 2:
                                        str4 = "p";
                                        break;
                                    case 3:
                                        str4 = "ap";
                                        break;
                                    case 4:
                                        str4 = "an";
                                        break;
                                    case 5:
                                        str4 = "rt";
                                        break;
                                    case 6:
                                    case 7:
                                        break;
                                    default:
                                        throw new RuntimeException(null, null);
                                }
                                HashMap map6 = new HashMap();
                                map6.put("yt_wt", str4);
                                return map6;
                            case 10:
                                yvu yvuVar = (yvu) obj3;
                                wgs wgsVar = yvuVar.c;
                                if (wgsVar == null) {
                                    wgsVar = yvuVar.f;
                                }
                                if (wgsVar == null) {
                                    return null;
                                }
                                HashMap map7 = new HashMap();
                                map7.put("fmt", String.valueOf(wgsVar.e()));
                                map7.put("mod_local", true != wgsVar.W() ? "0" : "1");
                                return map7;
                            case 11:
                                HashMap map8 = new HashMap();
                                if (!((aaye) obj3).b) {
                                    return map8;
                                }
                                map8.put("mod_adap", "1");
                                return map8;
                            case 12:
                                HashMap map9 = new HashMap();
                                map9.put("cmt", String.valueOf(((aaxz) obj3).b));
                                return map9;
                            default:
                                adko adkoVar = (adko) obj3;
                                return Collections.singletonMap("th" + adkoVar.c + "_tt", Integer.toString(adkoVar.f));
                        }
                    }
                });
                final int i28 = 0;
                xkdVar2.a(yla.class, new xju() { // from class: yic
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        switch (i28) {
                            case 0:
                                return Collections.singletonMap("orec", "1");
                            case 1:
                                return Collections.singletonMap("crm", Integer.toString(((yiw) obj3).a.getNumber()));
                            case 2:
                                return Collections.singletonMap("ohrtt", Long.toString(((ykf) obj3).a));
                            case 3:
                                return Collections.singletonMap("oubpr", "1");
                            case 4:
                                String str = ((aayd) obj3).b;
                                if (str == null) {
                                    return null;
                                }
                                HashMap map = new HashMap();
                                map.put("task_id", str);
                                return map;
                            case 5:
                                if (!((aayc) obj3).b) {
                                    return null;
                                }
                                HashMap map2 = new HashMap();
                                map2.put("mod_pft", "cache");
                                return map2;
                            case 6:
                                if (!((aayh) obj3).a) {
                                    return null;
                                }
                                HashMap map3 = new HashMap();
                                map3.put("mod_pft", "cache");
                                return map3;
                            case 7:
                                aazj aazjVar = (aazj) obj3;
                                if (!aazjVar.a.a(abob.c, abob.h)) {
                                    return null;
                                }
                                String str2 = aazjVar.g;
                                wjf wjfVar = aazjVar.b;
                                if (str2 == null || wjfVar == null) {
                                    return null;
                                }
                                HashMap map4 = new HashMap();
                                if (!wjfVar.G().isEmpty()) {
                                    map4.put("docid", wjfVar.G());
                                }
                                map4.put("cpn", str2);
                                return map4;
                            case 8:
                                aboe aboeVar = (aboe) obj3;
                                HashMap map5 = new HashMap();
                                String str3 = aboeVar.h;
                                if (!TextUtils.isEmpty(str3)) {
                                    map5.put("docid", str3);
                                }
                                if (TextUtils.isEmpty(aboeVar.b)) {
                                    return map5;
                                }
                                map5.put("cpn", aboeVar.b);
                                return map5;
                            case 9:
                                int iOrdinal = ((abmh) obj3).a.ordinal();
                                String str4 = "jp";
                                switch (iOrdinal) {
                                    case 0:
                                        str4 = "st";
                                        break;
                                    case 1:
                                        str4 = "n";
                                        break;
                                    case 2:
                                        str4 = "p";
                                        break;
                                    case 3:
                                        str4 = "ap";
                                        break;
                                    case 4:
                                        str4 = "an";
                                        break;
                                    case 5:
                                        str4 = "rt";
                                        break;
                                    case 6:
                                    case 7:
                                        break;
                                    default:
                                        throw new RuntimeException(null, null);
                                }
                                HashMap map6 = new HashMap();
                                map6.put("yt_wt", str4);
                                return map6;
                            case 10:
                                yvu yvuVar = (yvu) obj3;
                                wgs wgsVar = yvuVar.c;
                                if (wgsVar == null) {
                                    wgsVar = yvuVar.f;
                                }
                                if (wgsVar == null) {
                                    return null;
                                }
                                HashMap map7 = new HashMap();
                                map7.put("fmt", String.valueOf(wgsVar.e()));
                                map7.put("mod_local", true != wgsVar.W() ? "0" : "1");
                                return map7;
                            case 11:
                                HashMap map8 = new HashMap();
                                if (!((aaye) obj3).b) {
                                    return map8;
                                }
                                map8.put("mod_adap", "1");
                                return map8;
                            case 12:
                                HashMap map9 = new HashMap();
                                map9.put("cmt", String.valueOf(((aaxz) obj3).b));
                                return map9;
                            default:
                                adko adkoVar = (adko) obj3;
                                return Collections.singletonMap("th" + adkoVar.c + "_tt", Integer.toString(adkoVar.f));
                        }
                    }
                });
                final int i29 = 2;
                xkdVar2.a(ykf.class, new xju() { // from class: yic
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        switch (i29) {
                            case 0:
                                return Collections.singletonMap("orec", "1");
                            case 1:
                                return Collections.singletonMap("crm", Integer.toString(((yiw) obj3).a.getNumber()));
                            case 2:
                                return Collections.singletonMap("ohrtt", Long.toString(((ykf) obj3).a));
                            case 3:
                                return Collections.singletonMap("oubpr", "1");
                            case 4:
                                String str = ((aayd) obj3).b;
                                if (str == null) {
                                    return null;
                                }
                                HashMap map = new HashMap();
                                map.put("task_id", str);
                                return map;
                            case 5:
                                if (!((aayc) obj3).b) {
                                    return null;
                                }
                                HashMap map2 = new HashMap();
                                map2.put("mod_pft", "cache");
                                return map2;
                            case 6:
                                if (!((aayh) obj3).a) {
                                    return null;
                                }
                                HashMap map3 = new HashMap();
                                map3.put("mod_pft", "cache");
                                return map3;
                            case 7:
                                aazj aazjVar = (aazj) obj3;
                                if (!aazjVar.a.a(abob.c, abob.h)) {
                                    return null;
                                }
                                String str2 = aazjVar.g;
                                wjf wjfVar = aazjVar.b;
                                if (str2 == null || wjfVar == null) {
                                    return null;
                                }
                                HashMap map4 = new HashMap();
                                if (!wjfVar.G().isEmpty()) {
                                    map4.put("docid", wjfVar.G());
                                }
                                map4.put("cpn", str2);
                                return map4;
                            case 8:
                                aboe aboeVar = (aboe) obj3;
                                HashMap map5 = new HashMap();
                                String str3 = aboeVar.h;
                                if (!TextUtils.isEmpty(str3)) {
                                    map5.put("docid", str3);
                                }
                                if (TextUtils.isEmpty(aboeVar.b)) {
                                    return map5;
                                }
                                map5.put("cpn", aboeVar.b);
                                return map5;
                            case 9:
                                int iOrdinal = ((abmh) obj3).a.ordinal();
                                String str4 = "jp";
                                switch (iOrdinal) {
                                    case 0:
                                        str4 = "st";
                                        break;
                                    case 1:
                                        str4 = "n";
                                        break;
                                    case 2:
                                        str4 = "p";
                                        break;
                                    case 3:
                                        str4 = "ap";
                                        break;
                                    case 4:
                                        str4 = "an";
                                        break;
                                    case 5:
                                        str4 = "rt";
                                        break;
                                    case 6:
                                    case 7:
                                        break;
                                    default:
                                        throw new RuntimeException(null, null);
                                }
                                HashMap map6 = new HashMap();
                                map6.put("yt_wt", str4);
                                return map6;
                            case 10:
                                yvu yvuVar = (yvu) obj3;
                                wgs wgsVar = yvuVar.c;
                                if (wgsVar == null) {
                                    wgsVar = yvuVar.f;
                                }
                                if (wgsVar == null) {
                                    return null;
                                }
                                HashMap map7 = new HashMap();
                                map7.put("fmt", String.valueOf(wgsVar.e()));
                                map7.put("mod_local", true != wgsVar.W() ? "0" : "1");
                                return map7;
                            case 11:
                                HashMap map8 = new HashMap();
                                if (!((aaye) obj3).b) {
                                    return map8;
                                }
                                map8.put("mod_adap", "1");
                                return map8;
                            case 12:
                                HashMap map9 = new HashMap();
                                map9.put("cmt", String.valueOf(((aaxz) obj3).b));
                                return map9;
                            default:
                                adko adkoVar = (adko) obj3;
                                return Collections.singletonMap("th" + adkoVar.c + "_tt", Integer.toString(adkoVar.f));
                        }
                    }
                });
                final int i30 = 3;
                xkdVar2.a(ylc.class, new xju() { // from class: yic
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        switch (i30) {
                            case 0:
                                return Collections.singletonMap("orec", "1");
                            case 1:
                                return Collections.singletonMap("crm", Integer.toString(((yiw) obj3).a.getNumber()));
                            case 2:
                                return Collections.singletonMap("ohrtt", Long.toString(((ykf) obj3).a));
                            case 3:
                                return Collections.singletonMap("oubpr", "1");
                            case 4:
                                String str = ((aayd) obj3).b;
                                if (str == null) {
                                    return null;
                                }
                                HashMap map = new HashMap();
                                map.put("task_id", str);
                                return map;
                            case 5:
                                if (!((aayc) obj3).b) {
                                    return null;
                                }
                                HashMap map2 = new HashMap();
                                map2.put("mod_pft", "cache");
                                return map2;
                            case 6:
                                if (!((aayh) obj3).a) {
                                    return null;
                                }
                                HashMap map3 = new HashMap();
                                map3.put("mod_pft", "cache");
                                return map3;
                            case 7:
                                aazj aazjVar = (aazj) obj3;
                                if (!aazjVar.a.a(abob.c, abob.h)) {
                                    return null;
                                }
                                String str2 = aazjVar.g;
                                wjf wjfVar = aazjVar.b;
                                if (str2 == null || wjfVar == null) {
                                    return null;
                                }
                                HashMap map4 = new HashMap();
                                if (!wjfVar.G().isEmpty()) {
                                    map4.put("docid", wjfVar.G());
                                }
                                map4.put("cpn", str2);
                                return map4;
                            case 8:
                                aboe aboeVar = (aboe) obj3;
                                HashMap map5 = new HashMap();
                                String str3 = aboeVar.h;
                                if (!TextUtils.isEmpty(str3)) {
                                    map5.put("docid", str3);
                                }
                                if (TextUtils.isEmpty(aboeVar.b)) {
                                    return map5;
                                }
                                map5.put("cpn", aboeVar.b);
                                return map5;
                            case 9:
                                int iOrdinal = ((abmh) obj3).a.ordinal();
                                String str4 = "jp";
                                switch (iOrdinal) {
                                    case 0:
                                        str4 = "st";
                                        break;
                                    case 1:
                                        str4 = "n";
                                        break;
                                    case 2:
                                        str4 = "p";
                                        break;
                                    case 3:
                                        str4 = "ap";
                                        break;
                                    case 4:
                                        str4 = "an";
                                        break;
                                    case 5:
                                        str4 = "rt";
                                        break;
                                    case 6:
                                    case 7:
                                        break;
                                    default:
                                        throw new RuntimeException(null, null);
                                }
                                HashMap map6 = new HashMap();
                                map6.put("yt_wt", str4);
                                return map6;
                            case 10:
                                yvu yvuVar = (yvu) obj3;
                                wgs wgsVar = yvuVar.c;
                                if (wgsVar == null) {
                                    wgsVar = yvuVar.f;
                                }
                                if (wgsVar == null) {
                                    return null;
                                }
                                HashMap map7 = new HashMap();
                                map7.put("fmt", String.valueOf(wgsVar.e()));
                                map7.put("mod_local", true != wgsVar.W() ? "0" : "1");
                                return map7;
                            case 11:
                                HashMap map8 = new HashMap();
                                if (!((aaye) obj3).b) {
                                    return map8;
                                }
                                map8.put("mod_adap", "1");
                                return map8;
                            case 12:
                                HashMap map9 = new HashMap();
                                map9.put("cmt", String.valueOf(((aaxz) obj3).b));
                                return map9;
                            default:
                                adko adkoVar = (adko) obj3;
                                return Collections.singletonMap("th" + adkoVar.c + "_tt", Integer.toString(adkoVar.f));
                        }
                    }
                });
                xkdVar2.b(sex.class, "ab_s");
                xkdVar2.b(sew.class, "ab_r");
                xkdVar2.b(sez.class, "ad_bl");
                xkdVar2.b(sfn.class, "ad_bl");
                xkdVar2.b(ser.class, "ad_ba");
                xkdVar2.b(seu.class, "msti");
                xkdVar2.b(set.class, "mstr");
                xkdVar2.b(sev.class, "ad_bp");
                xkdVar2.b(sfb.class, "ads_s");
                xkdVar2.b(sfa.class, "ads_e");
                xkdVar2.b(ses.class, "ab_cre");
                xkdVar2.b(sfh.class, "ad_mbr");
                xkdVar2.b(sfi.class, "ad_mbs");
                xkdVar2.b(sfc.class, "ad_pre");
                xkdVar2.b(sfp.class, "pacf_ss");
                xkdVar2.b(sfo.class, "pacf_sb");
                xkdVar2.b(sfq.class, "pacf_ssc");
                xkdVar2.b(sff.class, "pacf_ls");
                xkdVar2.b(sfe.class, "pacf_lb");
                xkdVar2.b(sfg.class, "pacf_lsc");
                xkdVar2.b(sfr.class, "ad_vr");
                xkdVar2.b(sfm.class, "pb_s");
                xkdVar2.b(sfk.class, "pb_c");
                xkdVar2.b(sfj.class, "pb_ca");
                xkdVar2.b(sfl.class, "pb_f");
                final int i31 = 1;
                xkdVar2.c(sft.class, new xjv() { // from class: aawg
                    @Override // defpackage.xjv
                    public final tas a(tas tasVar) {
                        if (i31 != 0) {
                            sft sftVar = (sft) tasVar;
                            sftVar.b("ad_i");
                            return sftVar;
                        }
                        aazj aazjVar = (aazj) tasVar;
                        if (aazjVar.a != abob.c) {
                            return null;
                        }
                        aazjVar.b("gv");
                        return aazjVar;
                    }
                });
                final int i32 = 15;
                xkdVar2.a(sft.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i32) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i110 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
                xkdVar2.a(seq.class, new seg());
                final int i33 = 16;
                xkdVar2.a(aazj.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i33) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i110 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
                final int i34 = 17;
                xkdVar2.a(aaxt.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i34) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i110 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
                final int i35 = 6;
                xkdVar2.a(sey.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i35) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i110 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
                xkdVar2.a(sfd.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i18) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i110 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
                xkdVar2.a(sen.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i19) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i110 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
                xkdVar2.a(sfi.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i20) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i110 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
                xkdVar2.a(sfh.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i21) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i110 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
                final int i36 = 11;
                xkdVar2.a(sfm.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i36) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i110 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
                final int i37 = 12;
                xkdVar2.a(sfk.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i37) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i110 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
                final int i38 = 13;
                xkdVar2.a(sfl.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i38) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i110 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
                final int i39 = 14;
                xkdVar2.a(sfn.class, new xju() { // from class: gzx
                    @Override // defpackage.xju
                    public final Map a(Object obj3) {
                        HashMap map;
                        Map map2;
                        afv afvVar;
                        switch (i39) {
                            case 0:
                                return ((wjo) obj3).a;
                            case 1:
                                return agkj.j("csn", ((xhi) obj3).a);
                            case 2:
                                return agkj.j("yt_lt", "cold");
                            case 3:
                                return agkj.j("yt_lt", "warm");
                            case 4:
                                return agkj.j("browse_id", Uri.encode(((hai) obj3).a));
                            case 5:
                                aazj aazjVar = (aazj) obj3;
                                map = new HashMap();
                                int iOrdinal = aazjVar.a.ordinal();
                                if (iOrdinal != 2 && iOrdinal != 7) {
                                    return null;
                                }
                                wjf wjfVar = aazjVar.b;
                                map2 = map;
                                if (wjfVar != null && wjfVar.S()) {
                                    map2 = map;
                                    map.put("docid", wjfVar.k().a("docid"));
                                    map.put("ns", wjfVar.k().a("ns"));
                                    map2 = map;
                                }
                                break;
                                break;
                            case 6:
                                afv afvVar2 = new afv(1);
                                String str = ((sey) obj3).a;
                                afvVar2.put("ad_cpn", null);
                                map2 = afvVar2;
                                break;
                            case 7:
                                sfd sfdVar = (sfd) obj3;
                                afv afvVar3 = new afv(1);
                                String str2 = sfdVar.a;
                                afvVar3.put("ad_cpn", null);
                                String str3 = sfdVar.b;
                                afvVar3.put("cpn", null);
                                map2 = afvVar3;
                                break;
                            case 8:
                                sen senVar = (sen) obj3;
                                Optional optionalOfNullable = Optional.ofNullable(senVar.a);
                                afv afvVar4 = new afv();
                                afvVar4.put("ad_cr", senVar.b.k);
                                afvVar4.put("ad_cpn", (String) (true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((smc) optionalOfNullable.get()).o)).orElse(""));
                                if (true == optionalOfNullable.isPresent()) {
                                    optionalOfNullable = Optional.ofNullable(((smc) optionalOfNullable.get()).j());
                                }
                                afvVar4.put("ad_at", (String) optionalOfNullable.orElse(""));
                                slm slmVar = senVar.c;
                                afvVar4.put("yt_abt", slmVar != null ? taq.bh(slmVar) : "");
                                return afvVar4;
                            case 9:
                                sfi sfiVar = (sfi) obj3;
                                Optional optionalOfNullable2 = Optional.ofNullable(sfiVar.a);
                                afv afvVar5 = new afv();
                                if (true == optionalOfNullable2.isPresent()) {
                                    optionalOfNullable2 = Optional.ofNullable(((slc) optionalOfNullable2.get()).j());
                                }
                                afvVar5.put("ad_at", (String) optionalOfNullable2.orElse(""));
                                afvVar5.put("yt_abt", taq.bh(sfiVar.b));
                                return afvVar5;
                            case 10:
                                sfh sfhVar = (sfh) obj3;
                                Optional optionalOfNullable3 = Optional.ofNullable(sfhVar.a);
                                afv afvVar6 = new afv();
                                if (true == optionalOfNullable3.isPresent()) {
                                    optionalOfNullable3 = Optional.ofNullable(((slc) optionalOfNullable3.get()).j());
                                }
                                afvVar6.put("ad_at", (String) optionalOfNullable3.orElse(""));
                                afvVar6.put("yt_abt", taq.bh(sfhVar.b));
                                return afvVar6;
                            case 11:
                                HashMap map3 = new HashMap();
                                String str4 = ((sfm) obj3).a;
                                map3.put("pb_h", null);
                                map2 = map3;
                                break;
                            case 12:
                                HashMap map4 = new HashMap();
                                String str5 = ((sfk) obj3).a;
                                map4.put("pb_h", null);
                                map2 = map4;
                                break;
                            case 13:
                                new HashMap();
                                int i110 = ((sfl) obj3).a;
                                throw null;
                            case 14:
                                HashMap map5 = new HashMap();
                                map5.put("yt_abt", "1");
                                return map5;
                            case 15:
                                afv afvVar7 = new afv(1);
                                afvVar7.put("mod_ad", "1");
                                return afvVar7;
                            case 16:
                                aazj aazjVar2 = (aazj) obj3;
                                afvVar = new afv(2);
                                int iOrdinal2 = aazjVar2.a.ordinal();
                                if (iOrdinal2 == 4) {
                                    afvVar.put("cpn", aazjVar2.g);
                                    String str6 = aazjVar2.h;
                                    afvVar.put("ad_cpn", str6);
                                    afvVar.put("target_cpn", str6);
                                    wjf wjfVar2 = aazjVar2.c;
                                    if (wjfVar2 != null) {
                                        map2 = afvVar;
                                        afvVar.put("target_video_id", wjfVar2.G());
                                        map2 = afvVar;
                                    }
                                } else {
                                    if (iOrdinal2 != 7) {
                                        return null;
                                    }
                                    afvVar.put("cpn", aazjVar2.g);
                                    map2 = afvVar;
                                }
                                break;
                            case 17:
                                aaxt aaxtVar = (aaxt) obj3;
                                afv afvVar8 = new afv(2);
                                String str7 = aaxtVar.b;
                                if (str7 != null) {
                                    afvVar8.put("cpn", str7);
                                }
                                String str8 = aaxtVar.c;
                                if (str8 != null) {
                                    afvVar8.put("ad_cpn", str8);
                                    afvVar8.put("target_cpn", str8);
                                }
                                String str9 = aaxtVar.f;
                                if (str9 == null) {
                                    return afvVar8;
                                }
                                afvVar8.put("target_video_id", str9);
                                return afvVar8;
                            case 18:
                                HashMap map6 = new HashMap();
                                map6.put("one", "1");
                                return map6;
                            case 19:
                                return Collections.singletonMap("outi", ((yld) obj3).a);
                            default:
                                return Collections.singletonMap("cir", Integer.toString(((yiv) obj3).a.getNumber()));
                        }
                        map2 = map;
                        map2 = afvVar;
                        return map2;
                    }
                });
            }
        }));
        Application application = this.i;
        boolean z4 = application instanceof gjs;
        long j = z4 ? ((gjs) application).a : 0L;
        if (tqjVar.k(1073807732)) {
            xir xirVar = this.K;
            xirVar.l(j);
            aihf aihfVarCreateBuilder = amiu.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
            amiuVar.b |= SemanticState.Focused;
            amiuVar.j = "cold";
            xirVar.h((amiu) aihfVarCreateBuilder.build());
        }
        if (!tqjVar.k(1073807731)) {
            ((tbt) this.c.io()).e(new hab(j));
        }
        aunn aunnVar3 = this.c;
        tbt tbtVar = (tbt) aunnVar3.io();
        if (z4) {
            tbtVar.g(application, gjs.class);
        }
        tbtVar.a(this, hah.class, new gla(this, 1));
        tbtVar.a(this, hak.class, new gla(this, 0));
        gev gevVar = (gev) this.s.io();
        ((Application) gevVar.b).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) gevVar.a.io());
        zpw zpwVar3 = (zpw) aunnVar2.io();
        ((Application) zpwVar3.n).registerActivityLifecycleCallbacks(new gzy((qkb) zpwVar3.d.io()));
        ((aepg) ((jnj) this.A.io()).b.io()).j();
        if (tqjVar.k(1073830353)) {
            gktVar.a(c(), e(), d(), this.a, this.b, this.I, this.N);
        } else {
            gktVar.a(c(), e(), d(), this.a, this.b, null, this.N);
        }
        qkb qkbVar = (qkb) this.l.io();
        if (!qkbVar.b) {
            MessageQueue queue = Looper.getMainLooper().getQueue();
            ?? r6 = qkbVar.c;
            queue.removeIdleHandler(r6);
            queue.addIdleHandler(r6);
            qkbVar.b = false;
        }
        if (tqjVar.k(1073807732)) {
            this.K.f(tau.APPLICATION_LOADED);
        }
        if (tqjVar.k(1073807731)) {
            return;
        }
        ((tbt) aunnVar3.io()).c(new haa());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r0v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [aunn, java.lang.Object] */
    public final void b() {
        jnm jnmVar = (jnm) this.t.io();
        ?? r0 = jnmVar.d;
        int i = tqr.a;
        if (r0.k(1073807743)) {
            ((axfd) jnmVar.b.io()).am(3);
        } else {
            ((aabz) jnmVar.c.io()).d(aaby.a);
            ((axfd) jnmVar.b.io()).am(3);
        }
    }
}
