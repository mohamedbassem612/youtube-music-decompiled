package defpackage;

import android.graphics.Paint;
import app.rive.semantics.SemanticState;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ann extends aoa {
    public final aoc f;

    static {
        Paint paint = new Paint(7);
        aas.a(-281474976710656L, paint);
        paint.setStrokeWidth(1.0f);
        aas.b(paint);
    }

    public ann(anq anqVar) {
        super(anqVar);
        aoc aocVar = new aoc();
        this.f = aocVar;
        aocVar.c = this;
    }

    @Override // defpackage.anu, defpackage.amz
    public final int a(int i) {
        eol eolVarO = this.h.o();
        ane aneVarV = eolVarO.v();
        anq anqVar = (anq) eolVarO.a;
        return aneVarV.maxIntrinsicHeight(anqVar.d(), anqVar.e(), i);
    }

    @Override // defpackage.anu, defpackage.amz
    public final int b(int i) {
        eol eolVarO = this.h.o();
        ane aneVarV = eolVarO.v();
        anq anqVar = (anq) eolVarO.a;
        return aneVarV.maxIntrinsicWidth(anqVar.d(), anqVar.e(), i);
    }

    @Override // defpackage.anu, defpackage.amz
    public final int c(int i) {
        eol eolVarO = this.h.o();
        ane aneVarV = eolVarO.v();
        anq anqVar = (anq) eolVarO.a;
        return aneVarV.minIntrinsicHeight(anqVar.d(), anqVar.e(), i);
    }

    @Override // defpackage.anu, defpackage.amz
    public final int d(int i) {
        eol eolVarO = this.h.o();
        ane aneVarV = eolVarO.v();
        anq anqVar = (anq) eolVarO.a;
        return aneVarV.minIntrinsicWidth(anqVar.d(), anqVar.e(), i);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f5 A[Catch: all -> 0x0155, TRY_LEAVE, TryCatch #1 {, blocks: (B:44:0x00e0, B:46:0x00f5), top: B:84:0x00e0 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0107  */
    /* JADX WARN: Code duplicated, block: B:53:0x010b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    /* JADX WARN: Code duplicated, block: B:58:0x0118  */
    /* JADX WARN: Code duplicated, block: B:61:0x0122  */
    /* JADX WARN: Code duplicated, block: B:63:0x0126  */
    /* JADX WARN: Code duplicated, block: B:64:0x012a  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.and
    public final anj e(long j) {
        boolean z;
        ahto ahtoVar;
        long j2;
        Object obj;
        xgl xglVar;
        Object obj2;
        ake akeVar;
        ajv ajvVar;
        ajw akfVar;
        ajv ajvVar2;
        awqg awqgVarD;
        akf akfVar2;
        if (this.d != j) {
            this.d = j;
            super.u();
        }
        anq anqVar = this.h;
        aiz aizVarA = anqVar.a();
        Object[] objArr = aizVarA.a;
        int i = aizVarA.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((anq) objArr[i2]).b().o = 3;
        }
        anf anfVarMo201measure3p2s80s = anqVar.a.mo201measure3p2s80s(this, anqVar.e(), j);
        anf anfVar = this.j;
        if (anfVarMo201measure3p2s80s != anfVar) {
            this.j = anfVarMo201measure3p2s80s;
            if (anfVar == null || anfVarMo201measure3p2s80s.b() != anfVar.b() || anfVarMo201measure3p2s80s.a() != anfVar.a()) {
                long jB = anfVarMo201measure3p2s80s.b();
                long jA = anfVarMo201measure3p2s80s.a();
                anqVar.j();
                v((jB << 32) | (jA & 4294967295L));
                int i3 = aob.a;
                if (anqVar.l() == 5) {
                    anqVar.n();
                    anqVar.m();
                }
                anqVar.e.i.o();
            }
        }
        int i4 = aob.a;
        akp akpVarN = super.n();
        if (akpVarN != null && (akpVarN.a.b & SemanticState.Focused) != 0) {
            ajw ajwVar = (ajw) aka.f.s();
            if (ajwVar instanceof ake) {
                ake akeVar2 = (ake) ajwVar;
                if (akeVar2.f == ahs.j()) {
                    akeVar2.d = null;
                } else {
                    if (ajwVar instanceof akf) {
                        akfVar2 = (akf) ajwVar;
                        if (akfVar2.c == ahs.j()) {
                            akfVar2.a = null;
                        }
                    }
                    z = ajwVar instanceof ajv;
                    if (!z || ajwVar == null) {
                        ahtoVar = aka.g;
                        j2 = ahs.j();
                        if (j2 == ajq.a) {
                            obj2 = ahtoVar.c;
                            ahtoVar.c = null;
                        } else {
                            synchronized (ahtoVar.a) {
                                obj = ahtoVar.b;
                                xglVar = (xgl) ((AtomicReference) obj).get();
                                Object objE = xglVar.e(j2);
                                if (!xglVar.f(j2, null)) {
                                    ((AtomicReference) obj).set(xglVar.i(j2, null));
                                }
                            }
                            obj2 = objE;
                        }
                        akeVar = (ake) obj2;
                        if (akeVar != null) {
                            if (z) {
                                ajvVar2 = (ajv) ajwVar;
                            } else {
                                ajvVar2 = null;
                            }
                            akeVar.c = ajvVar2;
                            akeVar.d = null;
                            if (ajvVar2 != null || (awqgVarD = ajvVar2.d()) == null) {
                                awqgVarD = ((ajv) aka.e).a;
                            }
                            akeVar.e = awqgVarD;
                            akeVar.b = false;
                        } else {
                            if (z) {
                                ajvVar = (ajv) ajwVar;
                            } else {
                                ajvVar = null;
                            }
                            akeVar = new ake(ajvVar);
                        }
                        akfVar = akeVar;
                    } else {
                        akfVar = new akf(ajwVar);
                    }
                    ahto ahtoVar2 = aka.f;
                    ahtoVar2.t(akfVar);
                }
                akfVar = ajwVar;
            } else {
                if (ajwVar instanceof akf) {
                    akfVar2 = (akf) ajwVar;
                    if (akfVar2.c == ahs.j()) {
                        akfVar2.a = null;
                        akfVar = ajwVar;
                    }
                }
                z = ajwVar instanceof ajv;
                if (z) {
                    ahtoVar = aka.g;
                    j2 = ahs.j();
                    if (j2 == ajq.a) {
                        obj2 = ahtoVar.c;
                        ahtoVar.c = null;
                    } else {
                        synchronized (ahtoVar.a) {
                            obj = ahtoVar.b;
                            xglVar = (xgl) ((AtomicReference) obj).get();
                            Object objE2 = xglVar.e(j2);
                            if (!xglVar.f(j2, null)) {
                                ((AtomicReference) obj).set(xglVar.i(j2, null));
                            }
                            obj2 = objE2;
                        }
                    }
                    akeVar = (ake) obj2;
                    if (akeVar != null) {
                        if (z) {
                            ajvVar2 = (ajv) ajwVar;
                        } else {
                            ajvVar2 = null;
                        }
                        akeVar.c = ajvVar2;
                        akeVar.d = null;
                        if (ajvVar2 != null) {
                            awqgVarD = ((ajv) aka.e).a;
                        } else {
                            awqgVarD = ((ajv) aka.e).a;
                        }
                        akeVar.e = awqgVarD;
                        akeVar.b = false;
                    } else {
                        if (z) {
                            ajvVar = (ajv) ajwVar;
                        } else {
                            ajvVar = null;
                        }
                        akeVar = new ake(ajvVar);
                    }
                    akfVar = akeVar;
                } else {
                    ahtoVar = aka.g;
                    j2 = ahs.j();
                    if (j2 == ajq.a) {
                        obj2 = ahtoVar.c;
                        ahtoVar.c = null;
                    } else {
                        synchronized (ahtoVar.a) {
                            obj = ahtoVar.b;
                            xglVar = (xgl) ((AtomicReference) obj).get();
                            Object objE3 = xglVar.e(j2);
                            if (!xglVar.f(j2, null)) {
                                ((AtomicReference) obj).set(xglVar.i(j2, null));
                            }
                            obj2 = objE3;
                        }
                    }
                    akeVar = (ake) obj2;
                    if (akeVar != null) {
                        if (z) {
                            ajvVar2 = (ajv) ajwVar;
                        } else {
                            ajvVar2 = null;
                        }
                        akeVar.c = ajvVar2;
                        akeVar.d = null;
                        if (ajvVar2 != null) {
                            awqgVarD = ((ajv) aka.e).a;
                        } else {
                            awqgVarD = ((ajv) aka.e).a;
                        }
                        akeVar.e = awqgVarD;
                        akeVar.b = false;
                    } else {
                        if (z) {
                            ajvVar = (ajv) ajwVar;
                        } else {
                            ajvVar = null;
                        }
                        akeVar = new ake(ajvVar);
                    }
                    akfVar = akeVar;
                }
                ahto ahtoVar3 = aka.f;
                ahtoVar3.t(akfVar);
            }
            try {
                aoc aocVar = this.f;
                for (akp akpVarN2 = super.n(); akpVarN2 != null && (akpVarN2.b & SemanticState.Focused) != 0 && akpVarN2 != aocVar; akpVarN2 = null) {
                }
            } finally {
                ahs.i(ajwVar, akfVar);
            }
        }
        return this;
    }

    @Override // defpackage.aoa
    public final /* synthetic */ akp j() {
        return this.f;
    }

    @Override // defpackage.anu, defpackage.anj
    protected final void q(long j) {
        anq anqVar = this.h;
        awrc.c(this.i, anqVar.b);
        this.i = anqVar.b;
        if (j != 0) {
            amw.a("LayoutNode should be attached to an owner");
            throw new awmh();
        }
        if (this == anqVar.d() && !this.g) {
            amw.a("LayoutNode should be attached to an owner");
            throw new awmh();
        }
        if (!this.g) {
            l();
        }
        anw anwVarB = anqVar.b();
        anwVarB.g();
        anq anqVarL = anwVarB.l();
        aoa aoaVarC = anqVarL.c();
        for (aoa aoaVarD = anqVarL.d(); aoaVarD != aoaVarC; aoaVarD = null) {
            aoaVarD.getClass();
        }
        if (0.0f != anwVarB.n) {
            anwVarB.n = 0.0f;
        }
        if (!anwVarB.g().g) {
            if (anwVarB.h) {
                vbq vbqVar = anwVarB.p;
                anwVarB.l().c().m();
            } else {
                anwVarB.n();
            }
        }
        anwVarB.g = 0;
        anwVarB.h();
    }
}
