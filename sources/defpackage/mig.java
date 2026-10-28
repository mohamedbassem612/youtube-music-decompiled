package defpackage;

import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import com.google.android.apps.youtube.music.R;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.BitSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mig extends fkx {

    @fmt(a = 13)
    @fmu(a = fmv.a)
    mzg A;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    mzg B;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean C;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    AtomicReference D;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    awmd E;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    mqg F;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    mip G;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    ci H;

    @fmt(a = 6)
    @fmu(a = fmv.a)
    List a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    avmm b;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    myz c;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nry d;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nsl e;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    awmd f;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nso g;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    String q;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean r;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean s;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean t;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean u;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean v;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nbl w;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean x;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nuc y;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    mzg z;

    public mig() {
        super("Collection");
    }

    public static fip aE(fhd fhdVar) {
        return o(mig.class, "Collection", fhdVar, 1803022739, new Object[]{fhdVar});
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    @Override // defpackage.fgy
    protected final Object A(fip fipVar, Object obj) {
        nue nueVar;
        RecyclerView recyclerViewA;
        nue nueVar2;
        int i = fipVar.c;
        if (i == -1048037474) {
            gzj.bO((fhd) fipVar.d[0], (isw) obj);
        } else if (i == 1803022739) {
            fiu fiuVar = fipVar.b;
            fhd fhdVar = (fhd) fipVar.d[0];
            Object obj2 = ((ahfi) obj).c;
            mig migVar = (mig) fiuVar;
            mif mifVar = (mif) fhdVar.i().c;
            myz myzVar = migVar.c;
            AtomicReference atomicReference = migVar.D;
            AtomicReference atomicReference2 = mifVar.d;
            ftc ftcVar = mifVar.l;
            AtomicBoolean atomicBoolean = mifVar.j;
            String str = mio.a;
            if (atomicReference == null || atomicReference.get() == null || !atomicBoolean.getAndSet(false)) {
                if (atomicReference2 != null) {
                    nueVar2 = (nue) atomicReference2.get();
                } else {
                    nueVar = null;
                }
                if (nueVar != null && (recyclerViewA = ftcVar.a()) != null) {
                    nueVar = nueVar2;
                    nueVar.o(recyclerViewA);
                    recyclerViewA.setTag(R.id.elements_item_touch_helper, nueVar);
                }
            } else {
                RecyclerView recyclerViewA2 = ftcVar.a();
                if (recyclerViewA2 != null) {
                    if (myzVar.C() == 2) {
                        recyclerViewA2.getWidth();
                    } else {
                        recyclerViewA2.getHeight();
                    }
                    ((nwj) atomicReference.get()).h(recyclerViewA2);
                    if (atomicReference2 != null) {
                        nueVar2 = (nue) atomicReference2.get();
                    } else {
                        nueVar = null;
                    }
                    if (nueVar != null) {
                        nueVar = nueVar2;
                        nueVar.o(recyclerViewA);
                        recyclerViewA.setTag(R.id.elements_item_touch_helper, nueVar);
                    }
                }
            }
        }
        nueVar = nueVar2;
        nueVar = nueVar2;
        return null;
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        boolean z;
        boolean z2;
        avmm avmmVar;
        avmm avmmVar2;
        mif mifVar = (mif) fhdVar.i().c;
        String str = this.q;
        awmd awmdVar = this.E;
        awmd awmdVar2 = this.f;
        nbl nblVar = this.w;
        ci ciVar = this.H;
        myz myzVar = this.c;
        nsl nslVar = this.e;
        avmm avmmVar3 = this.b;
        boolean z3 = this.C;
        boolean z4 = this.u;
        String str2 = mio.a;
        ftc ftcVar = new ftc();
        mlf mlfVar = (mlf) fhdVar.l(mlf.class);
        int iC = myzVar.C();
        adfx adfxVarI = nslVar.i();
        boolean z5 = (ciVar == null || adfxVarI == null) ? false : true;
        if (!z3 || mlfVar == null) {
            z = true;
            z2 = false;
        } else {
            z2 = true;
            z = true;
        }
        AtomicReference atomicReference = new AtomicReference();
        if (z4 || z5 || z2) {
            avmmVar = avmmVar3;
            ftcVar.b = new mik(ciVar, adfxVarI, z3, mlfVar, nslVar, iC == 2 ? z : false, z4, atomicReference);
        } else {
            avmmVar = avmmVar3;
        }
        mlm mlmVar = new mlm(ftcVar);
        mim mimVar = new mim(myzVar, fhdVar.a, ftcVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        nyv nyvVar = null;
        nwj nwjVar = awmdVar != null ? (nwj) awmdVar.io() : null;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(z);
        if (nblVar != null && nblVar.p()) {
            nyvVar = new nyv();
        }
        AtomicReference atomicReference2 = new AtomicReference();
        AtomicReference atomicReference3 = new AtomicReference();
        if (myzVar.s()) {
            avmm avmmVar4 = avmmVar;
            mio.b(myzVar, awmdVar2, nslVar, str, avmmVar4, atomicReference2, atomicReference3);
            avmmVar2 = avmmVar4;
        } else {
            avmmVar2 = avmmVar;
        }
        AtomicReference atomicReference4 = new AtomicReference(avmmVar2);
        avnq avnqVar = nslVar.i;
        if (avnqVar != null) {
            avnqVar.c(avmmVar2);
        }
        mifVar.l = ftcVar;
        mifVar.h = mlmVar;
        mifVar.i = nwjVar;
        mifVar.j = atomicBoolean2;
        mifVar.g = atomicBoolean;
        mifVar.e = mimVar;
        mifVar.k = nyvVar;
        mifVar.b = atomicReference2;
        mifVar.d = atomicReference3;
        mifVar.c = atomicReference4;
        mifVar.f = atomicReference;
    }

    @Override // defpackage.fgy
    public final void I(fhd fhdVar) {
        avmm avmmVar;
        mif mifVar = (mif) fhdVar.i().c;
        String str = this.q;
        awmd awmdVar = this.f;
        mqg mqgVar = this.F;
        nsl nslVar = this.e;
        myz myzVar = this.c;
        avmm avmmVar2 = this.b;
        mlm mlmVar = mifVar.h;
        AtomicBoolean atomicBoolean = mifVar.g;
        AtomicReference atomicReference = mifVar.b;
        AtomicReference atomicReference2 = mifVar.d;
        AtomicReference atomicReference3 = mifVar.c;
        String str2 = mio.a;
        if (str != null && mlmVar != null) {
            mqgVar.f(str, mlmVar);
        }
        atomicBoolean.set(false);
        nro nroVar = atomicReference != null ? (nro) atomicReference.get() : null;
        if (nroVar != null && nroVar.k && myzVar.s()) {
            atomicReference.getClass();
            atomicReference2.getClass();
            avmmVar = avmmVar2;
            mio.b(myzVar, awmdVar, nslVar, str, avmmVar, atomicReference, atomicReference2);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (fhdVar.c != null) {
                    fhdVar.z(new aero(0, new Object[0]), "updateState:Collection.collectionDataSourceChanged");
                }
            } else if (fhdVar.c != null) {
                fhdVar.x(new aero(0, new Object[0]), "updateState:Collection.collectionDataSourceChanged");
            }
        } else {
            avmmVar = avmmVar2;
        }
        if (atomicReference3.get() != avmmVar) {
            mio.d(atomicReference3, avmmVar, (nro) atomicReference.get(), nslVar);
        }
    }

    @Override // defpackage.fgy
    public final void K(fhd fhdVar) {
        mif mifVar = (mif) fhdVar.i().c;
        String str = this.q;
        mqg mqgVar = this.F;
        avmm avmmVar = this.b;
        ftc ftcVar = mifVar.l;
        mlm mlmVar = mifVar.h;
        AtomicReference atomicReference = mifVar.b;
        AtomicReference atomicReference2 = mifVar.c;
        AtomicReference atomicReference3 = mifVar.f;
        String str2 = mio.a;
        if (str != null) {
            mqgVar.g(str, mlmVar);
        }
        npv npvVar = atomicReference3 != null ? (npv) atomicReference3.getAndSet(null) : null;
        if (npvVar != null) {
            npvVar.m((RecyclerView) null);
        }
        if (ftcVar != null) {
            ftcVar.b = null;
        }
        avmmVar.dispose();
        avmm avmmVar2 = (avmm) atomicReference2.get();
        if (avmmVar2 != null && avmmVar2 != avmmVar) {
            avmmVar2.dispose();
        }
        nro nroVar = atomicReference != null ? (nro) atomicReference.get() : null;
        if (nroVar == null || nroVar.k) {
            return;
        }
        nroVar.dispose();
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        mif mifVar = (mif) fkyVar;
        mif mifVar2 = (mif) fkyVar2;
        mifVar2.a = mifVar.a;
        mifVar2.b = mifVar.b;
        mifVar2.c = mifVar.c;
        mifVar2.d = mifVar.d;
        mifVar2.e = mifVar.e;
        mifVar2.f = mifVar.f;
        mifVar2.l = mifVar.l;
        mifVar2.g = mifVar.g;
        mifVar2.h = mifVar.h;
        mifVar2.i = mifVar.i;
        mifVar2.j = mifVar.j;
        mifVar2.k = mifVar.k;
    }

    @Override // defpackage.fgy
    public final boolean P() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean S() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0245  */
    /* JADX WARN: Code duplicated, block: B:104:0x024c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0253  */
    /* JADX WARN: Code duplicated, block: B:107:0x0256  */
    /* JADX WARN: Code duplicated, block: B:110:0x025c  */
    /* JADX WARN: Code duplicated, block: B:112:0x025f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0263  */
    /* JADX WARN: Code duplicated, block: B:117:0x0268  */
    /* JADX WARN: Code duplicated, block: B:118:0x026f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0274  */
    /* JADX WARN: Code duplicated, block: B:123:0x027c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0282  */
    /* JADX WARN: Code duplicated, block: B:126:0x0285  */
    /* JADX WARN: Code duplicated, block: B:130:0x0295  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:143:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:144:0x0309  */
    /* JADX WARN: Code duplicated, block: B:147:0x03a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:152:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:155:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:158:0x03c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:160:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:161:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:166:0x03de  */
    /* JADX WARN: Code duplicated, block: B:167:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:170:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:171:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:173:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:175:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:177:0x0409  */
    /* JADX WARN: Code duplicated, block: B:179:0x040d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x0415  */
    /* JADX WARN: Code duplicated, block: B:184:0x0419  */
    /* JADX WARN: Code duplicated, block: B:186:0x0422  */
    /* JADX WARN: Code duplicated, block: B:188:0x042b  */
    /* JADX WARN: Code duplicated, block: B:189:0x043a  */
    /* JADX WARN: Code duplicated, block: B:191:0x043e  */
    /* JADX WARN: Code duplicated, block: B:193:0x045d  */
    /* JADX WARN: Code duplicated, block: B:196:0x0467  */
    /* JADX WARN: Code duplicated, block: B:198:0x0471  */
    /* JADX WARN: Code duplicated, block: B:203:0x0495  */
    /* JADX WARN: Code duplicated, block: B:208:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:213:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:218:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:223:0x0507  */
    /* JADX WARN: Code duplicated, block: B:228:0x0522  */
    /* JADX WARN: Code duplicated, block: B:233:0x053d  */
    /* JADX WARN: Code duplicated, block: B:238:0x0558  */
    /* JADX WARN: Code duplicated, block: B:243:0x0572 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:250:0x0587  */
    /* JADX WARN: Code duplicated, block: B:253:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:255:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:256:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:258:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:259:0x05b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:260:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x0145  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x0206  */
    /* JADX WARN: Code duplicated, block: B:84:0x020e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0210  */
    /* JADX WARN: Code duplicated, block: B:87:0x0214  */
    /* JADX WARN: Code duplicated, block: B:89:0x021b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0224  */
    /* JADX WARN: Code duplicated, block: B:95:0x0230  */
    /* JADX WARN: Code duplicated, block: B:97:0x0238 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x023a  */
    /* JADX WARN: Code duplicated, block: B:99:0x023e  */
    /* JADX WARN: Instruction removed from duplicated block: B:191:0x043e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [fpn] */
    /* JADX WARN: Type inference failed for: r9v10, types: [mot] */
    /* JADX WARN: Type inference failed for: r9v11, types: [fpb] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // defpackage.fkx
    protected final fgy aC(fhd fhdVar) {
        boolean z;
        mzg mzgVar;
        mim mimVar;
        boolean zE;
        float fH;
        float f;
        AtomicReference atomicReference;
        List list;
        ?? motVar;
        ?? r12;
        int i;
        fpf fpfVar;
        nvy nvyVar;
        boolean z2;
        boolean z3;
        nro nroVar;
        boolean z4;
        boolean z5;
        nue nueVar;
        boolean z6;
        boolean z7;
        fph fphVar;
        nry nryVar;
        foe foeVarB;
        fpj fpjVar;
        boolean z8;
        boolean z9;
        int iD;
        int i2;
        AtomicReference atomicReference2;
        int i3;
        nsl nslVar;
        fph fphVar2;
        nt ntVar;
        mhc mhcVar;
        nak nakVarN;
        nbn nbnVarO;
        oyg oygVarBw;
        AtomicReference atomicReference3;
        npv npvVar;
        Integer num;
        Float f2;
        int iIntValue;
        mif mifVar = (mif) fhdVar.i().c;
        ntr ntrVar = (ntr) fhdVar.k(ntr.class);
        nth nthVar = (nth) fhdVar.k(nth.class);
        avmm avmmVar = this.b;
        nsl nslVar2 = this.e;
        myz myzVar = this.c;
        List list2 = this.a;
        nry nryVar2 = this.d;
        ftc ftcVar = mifVar.l;
        AtomicBoolean atomicBoolean = mifVar.g;
        nwj nwjVar = mifVar.i;
        int i4 = mifVar.a;
        boolean z10 = this.x;
        AtomicReference atomicReference4 = this.D;
        mzg mzgVar2 = this.A;
        mzg mzgVar3 = this.z;
        mzg mzgVar4 = this.B;
        mip mipVar = this.G;
        mim mimVar2 = mifVar.e;
        nyv nyvVar = mifVar.k;
        nuc nucVar = this.y;
        boolean z11 = this.v;
        boolean z12 = this.C;
        nso nsoVar = this.g;
        boolean z13 = this.r;
        boolean z14 = this.s;
        boolean z15 = this.t;
        boolean z16 = this.u;
        AtomicReference atomicReference5 = mifVar.b;
        AtomicReference atomicReference6 = mifVar.d;
        AtomicReference atomicReference7 = mifVar.c;
        AtomicReference atomicReference8 = mifVar.f;
        CommandOuterClass$Command commandOuterClass$CommandA = mio.a(mzgVar2, nucVar, nslVar2);
        CommandOuterClass$Command commandOuterClass$CommandA2 = mio.a(mzgVar3, nucVar, nslVar2);
        CommandOuterClass$Command commandOuterClass$CommandA3 = mio.a(mzgVar4, nucVar, nslVar2);
        if (mipVar != null) {
            mipVar.b(mimVar2, mimVar2);
        }
        ntx ntxVar = nslVar2.x;
        boolean z17 = myzVar.C() == 2;
        int iB = myzVar.B();
        boolean z18 = z17 && iB != 1;
        boolean z19 = z17 && iB == 3;
        boolean z20 = z17 && iB == 4;
        String str = nslVar2.n;
        if (myzVar.t() && myzVar.t()) {
            z = z20;
            myw mywVarI = myzVar.i();
            mzgVar = mzgVar3;
            mimVar = mimVar2;
            if (myzVar.B() == 1) {
                mep mepVar = nbv.V;
                if (mywVarI.e(mepVar)) {
                    nbv nbvVar = (nbv) myzVar.i().d(mepVar);
                    if (nbvVar.g() > 0) {
                        foy foyVar = new foy();
                        foyVar.c = nbvVar.g();
                        foyVar.b = myzVar.C() + (-1) != 1 ? 1 : 0;
                        foyVar.e = mio.e(myzVar.E(), myzVar.F(), z17, nucVar, nslVar2);
                        foyVar.d = nbvVar.g();
                        atomicReference = atomicReference8;
                        list = list2;
                        r12 = foyVar;
                    } else {
                        nucVar.c(aslh.LOG_TYPE_CONFIGURATION_ERROR, nslVar2, "Span count should be at least 1 for GridCollectionLayout. Provided 0", new Object[0]);
                    }
                }
            }
            asnu asnuVarD = nslVar2.d();
            if (nslVar2.i() != null || asnuVarD == null) {
                i = 1;
            } else {
                asnw asnwVar = asnuVarD.c;
                if (asnwVar == null) {
                    asnwVar = asnw.a;
                }
                asnv asnvVar = asnwVar.e;
                if (asnvVar == null) {
                    asnvVar = asnv.a;
                }
                int iAU = a.aU(asnvVar.b);
                if (iAU != 0) {
                    i = iAU;
                } else {
                    i = 1;
                }
            }
            fpfVar = new fpf();
            if (ntxVar == null) {
                nvyVar = null;
            } else {
                nvyVar = ntxVar.f;
            }
            if (nvyVar != null) {
                fpfVar.b(nvyVar.b);
            }
            if (z18) {
                fpfVar.a = true;
            }
            if (myzVar.v()) {
                fpfVar.c = myzVar.q();
            }
            if (myzVar.w()) {
                fpfVar.d = myzVar.r();
            }
            if (!z19) {
                if (z) {
                    z2 = true;
                    z3 = true;
                }
                if (atomicReference5 != null) {
                    nroVar = (nro) atomicReference5.get();
                } else {
                    nroVar = null;
                }
                if (nroVar == null && nroVar.f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z11 || z4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                fpfVar.b = z5;
                if (atomicReference6 != null) {
                    nueVar = (nue) atomicReference6.get();
                } else {
                    nueVar = null;
                }
                z6 = z4;
                if (nroVar != null) {
                    fpfVar.h = nroVar.f;
                    num = nroVar.i;
                    if (num != null) {
                        iIntValue = num.intValue();
                        if (iIntValue > 0) {
                            throw new IllegalArgumentException(a.bR(iIntValue, "Estimated viewport count must be > 0: "));
                        }
                        fpfVar.e = iIntValue;
                    }
                    f2 = nroVar.j;
                    if (f2 != null) {
                        fpfVar.b(f2.floatValue());
                    }
                }
                if (atomicReference7.get() != avmmVar) {
                    mio.d(atomicReference7, avmmVar, nroVar, nslVar2);
                }
                if (myzVar.p() && (ntxVar == null || ntxVar.g)) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                fphVar = new fph(fhdVar, new fpj());
                if (nroVar == null) {
                    mii miiVar = new mii(new fof(fhdVar), new mij());
                    mij mijVar = miiVar.b;
                    mijVar.p = nslVar2;
                    BitSet bitSet = miiVar.c;
                    bitSet.set(3);
                    mijVar.r = ntrVar;
                    bitSet.set(5);
                    mijVar.q = nthVar;
                    bitSet.set(4);
                    mijVar.o = avmmVar;
                    bitSet.set(2);
                    mijVar.n = myzVar;
                    bitSet.set(1);
                    mijVar.m = list;
                    bitSet.set(0);
                    foeVarB = miiVar.a();
                    nryVar = nryVar2;
                } else {
                    mjj mjjVar = new mjj(new fof(fhdVar), new mjl());
                    mjl mjlVar = mjjVar.b;
                    mjlVar.r = nslVar2;
                    BitSet bitSet2 = mjjVar.c;
                    bitSet2.set(5);
                    mjlVar.v = nucVar;
                    bitSet2.set(9);
                    mjlVar.u = ntrVar;
                    bitSet2.set(8);
                    mjlVar.t = nthVar;
                    bitSet2.set(7);
                    mjlVar.q = avmmVar;
                    bitSet2.set(4);
                    mjlVar.o = myzVar;
                    bitSet2.set(2);
                    mjlVar.m = nroVar;
                    bitSet2.set(0);
                    mjlVar.w = nueVar;
                    bitSet2.set(10);
                    nryVar = nryVar2;
                    mjlVar.p = nryVar;
                    bitSet2.set(3);
                    mjlVar.x = z13;
                    bitSet2.set(11);
                    mjlVar.s = nsoVar;
                    bitSet2.set(6);
                    mjlVar.y = z14;
                    bitSet2.set(12);
                    mjlVar.n = i4;
                    bitSet2.set(1);
                    foeVarB = mjjVar.a();
                }
                fpjVar = fphVar.a;
                fpjVar.C = foeVarB;
                fphVar.e.set(0);
                fphVar.r(false);
                fpjVar.x = z7;
                r12.b(fpfVar.a());
                fpjVar.A = r12.a();
                if (!z18 || z19) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                fpjVar.b = z8;
                fpjVar.r = nslVar2.h();
                if (nroVar == null && nroVar.d) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                fpjVar.e = z9;
                iD = myzVar.D() - 1;
                if (iD != 1) {
                    i2 = 2;
                } else if (iD != 2) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                fpjVar.z = i2;
                if (z16) {
                    DisplayMetrics displayMetrics = fhdVar.a.getResources().getDisplayMetrics();
                    if (myzVar.x()) {
                        nbnVarO = myzVar.o();
                    } else {
                        nbnVarO = null;
                    }
                    oygVarBw = qnl.bw(displayMetrics, nbnVarO);
                    atomicReference3 = atomicReference;
                    if (oygVarBw == null) {
                        npvVar = null;
                        atomicReference3.set(null);
                    } else {
                        npvVar = (npv) atomicReference3.get();
                        if (npvVar != null || !npvVar.p(z17, oygVarBw)) {
                            npvVar = new npv(z17, oygVarBw);
                            atomicReference3.set(npvVar);
                        }
                    }
                    if (npvVar != null) {
                        fpjVar.J = npvVar;
                    }
                }
                if (z6 && nroVar != null) {
                    fpjVar.u = nroVar.h;
                }
                if (nroVar != null || !nroVar.c) {
                    fpjVar.s = new fpe();
                }
                if (nueVar != null) {
                    fphVar.I(aE(fhdVar));
                }
                if (atomicReference4 != null) {
                    atomicReference2 = atomicReference4;
                    atomicReference2.set(nwjVar);
                    fphVar.I(aE(fhdVar));
                } else {
                    atomicReference2 = atomicReference4;
                }
                if (z10) {
                    fphVar.Y();
                    fphVar.H(mio.a + mio.b.getAndIncrement());
                }
                if (ftcVar != null) {
                    fpjVar.I = ftcVar;
                }
                if (myzVar.u()) {
                    nakVarN = myzVar.n();
                    if (nakVarN.ak() && qnl.by(nakVarN.g())) {
                        float fCo = nakVarN.g().co();
                        fphVar.g(fCo);
                        fphVar.h(fCo);
                        fphVar.i(fCo);
                        fphVar.c(fCo);
                    }
                    if (nakVarN.r() && qnl.by(nakVarN.j())) {
                        float fCo2 = nakVarN.j().co();
                        fphVar.g(fCo2);
                        fphVar.h(fCo2);
                    }
                    if (nakVarN.w() && qnl.by(nakVarN.o())) {
                        float fCo3 = nakVarN.o().co();
                        fphVar.i(fCo3);
                        fphVar.c(fCo3);
                    }
                    if (nakVarN.v() && qnl.by(nakVarN.n())) {
                        fphVar.i(nakVarN.n().co());
                    }
                    if (nakVarN.s() && qnl.by(nakVarN.k())) {
                        fphVar.g(nakVarN.k().co());
                    }
                    if (nakVarN.p() && qnl.by(nakVarN.h())) {
                        fphVar.c(nakVarN.h().co());
                    }
                    if (nakVarN.t() && qnl.by(nakVarN.l())) {
                        fphVar.h(nakVarN.l().co());
                    }
                    if (nakVarN.u() && qnl.by(nakVarN.m())) {
                        fphVar.g(nakVarN.m().co());
                    }
                    if (nakVarN.q() && qnl.by(nakVarN.i())) {
                        fphVar.h(nakVarN.i().co());
                    }
                    fphVar.s();
                }
                if (mzgVar2 != null && mzgVar == null && mzgVar4 == null && atomicReference2 == null) {
                    if (i != 1) {
                        i3 = 2;
                    } else {
                        fphVar2 = fphVar;
                    }
                    if (z17) {
                        nslVar = nslVar2;
                        ntVar = nslVar.k;
                        if (ntVar != null) {
                            fphVar2.f(ntVar);
                        } else {
                            mhcVar = nslVar.L;
                            if (mhcVar != null) {
                                fpjVar.H = mhcVar;
                            }
                        }
                    } else if (r22 != 0) {
                        fphVar2.f(nyvVar);
                    }
                    return fphVar2.a();
                }
                i3 = i;
                fphVar2 = fphVar;
                nslVar = nslVar2;
                int i5 = i3;
                mim mimVar3 = mimVar;
                fphVar2.j(new mil(commandOuterClass$CommandA, nryVar, mimVar3, nslVar, atomicReference2, atomicBoolean, commandOuterClass$CommandA3, i5, commandOuterClass$CommandA2));
                fphVar2.j(mimVar3);
                if (z17) {
                    nslVar = nslVar2;
                    ntVar = nslVar.k;
                    if (ntVar != null) {
                        fphVar2.f(ntVar);
                    } else {
                        mhcVar = nslVar.L;
                        if (mhcVar != null) {
                            fpjVar.H = mhcVar;
                        }
                    }
                } else if (r22 != 0) {
                    fphVar2.f(nyvVar);
                }
                return fphVar2.a();
            }
            z2 = true;
            fpfVar.f = true;
            z3 = z;
            if (z3) {
                fpfVar.g = z2;
            }
            fpfVar.c = false;
            if (atomicReference5 != null) {
                nroVar = (nro) atomicReference5.get();
            } else {
                nroVar = null;
            }
            if (nroVar == null) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (z11) {
                z5 = true;
            } else {
                z5 = true;
            }
            fpfVar.b = z5;
            if (atomicReference6 != null) {
                nueVar = (nue) atomicReference6.get();
            } else {
                nueVar = null;
            }
            z6 = z4;
            if (nroVar != null) {
                fpfVar.h = nroVar.f;
                num = nroVar.i;
                if (num != null) {
                    iIntValue = num.intValue();
                    if (iIntValue > 0) {
                        throw new IllegalArgumentException(a.bR(iIntValue, "Estimated viewport count must be > 0: "));
                    }
                    fpfVar.e = iIntValue;
                }
                f2 = nroVar.j;
                if (f2 != null) {
                    fpfVar.b(f2.floatValue());
                }
            }
            if (atomicReference7.get() != avmmVar) {
                mio.d(atomicReference7, avmmVar, nroVar, nslVar2);
            }
            if (myzVar.p()) {
                z7 = false;
            } else {
                z7 = false;
            }
            fphVar = new fph(fhdVar, new fpj());
            if (nroVar == null) {
                mii miiVar2 = new mii(new fof(fhdVar), new mij());
                mij mijVar2 = miiVar2.b;
                mijVar2.p = nslVar2;
                BitSet bitSet3 = miiVar2.c;
                bitSet3.set(3);
                mijVar2.r = ntrVar;
                bitSet3.set(5);
                mijVar2.q = nthVar;
                bitSet3.set(4);
                mijVar2.o = avmmVar;
                bitSet3.set(2);
                mijVar2.n = myzVar;
                bitSet3.set(1);
                mijVar2.m = list;
                bitSet3.set(0);
                foeVarB = miiVar2.a();
                nryVar = nryVar2;
            } else {
                mjj mjjVar2 = new mjj(new fof(fhdVar), new mjl());
                mjl mjlVar2 = mjjVar2.b;
                mjlVar2.r = nslVar2;
                BitSet bitSet4 = mjjVar2.c;
                bitSet4.set(5);
                mjlVar2.v = nucVar;
                bitSet4.set(9);
                mjlVar2.u = ntrVar;
                bitSet4.set(8);
                mjlVar2.t = nthVar;
                bitSet4.set(7);
                mjlVar2.q = avmmVar;
                bitSet4.set(4);
                mjlVar2.o = myzVar;
                bitSet4.set(2);
                mjlVar2.m = nroVar;
                bitSet4.set(0);
                mjlVar2.w = nueVar;
                bitSet4.set(10);
                nryVar = nryVar2;
                mjlVar2.p = nryVar;
                bitSet4.set(3);
                mjlVar2.x = z13;
                bitSet4.set(11);
                mjlVar2.s = nsoVar;
                bitSet4.set(6);
                mjlVar2.y = z14;
                bitSet4.set(12);
                mjlVar2.n = i4;
                bitSet4.set(1);
                foeVarB = mjjVar2.a();
            }
            fpjVar = fphVar.a;
            fpjVar.C = foeVarB;
            fphVar.e.set(0);
            fphVar.r(false);
            fpjVar.x = z7;
            r12.b(fpfVar.a());
            fpjVar.A = r12.a();
            if (z18) {
                z8 = true;
            } else {
                z8 = true;
            }
            fpjVar.b = z8;
            fpjVar.r = nslVar2.h();
            if (nroVar == null) {
                z9 = true;
            } else {
                z9 = true;
            }
            fpjVar.e = z9;
            iD = myzVar.D() - 1;
            if (iD != 1) {
                i2 = 2;
            } else if (iD != 2) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            fpjVar.z = i2;
            if (z16) {
                DisplayMetrics displayMetrics2 = fhdVar.a.getResources().getDisplayMetrics();
                if (myzVar.x()) {
                    nbnVarO = myzVar.o();
                } else {
                    nbnVarO = null;
                }
                oygVarBw = qnl.bw(displayMetrics2, nbnVarO);
                atomicReference3 = atomicReference;
                if (oygVarBw == null) {
                    npvVar = null;
                    atomicReference3.set(null);
                } else {
                    npvVar = (npv) atomicReference3.get();
                    if (npvVar != null) {
                        npvVar = new npv(z17, oygVarBw);
                        atomicReference3.set(npvVar);
                    } else {
                        npvVar = new npv(z17, oygVarBw);
                        atomicReference3.set(npvVar);
                    }
                }
                if (npvVar != null) {
                    fpjVar.J = npvVar;
                }
            }
            if (z6) {
                fpjVar.u = nroVar.h;
            }
            if (nroVar != null) {
                fpjVar.s = new fpe();
            } else {
                fpjVar.s = new fpe();
            }
            if (nueVar != null) {
                fphVar.I(aE(fhdVar));
            }
            if (atomicReference4 != null) {
                atomicReference2 = atomicReference4;
                atomicReference2.set(nwjVar);
                fphVar.I(aE(fhdVar));
            } else {
                atomicReference2 = atomicReference4;
            }
            if (z10) {
                fphVar.Y();
                fphVar.H(mio.a + mio.b.getAndIncrement());
            }
            if (ftcVar != null) {
                fpjVar.I = ftcVar;
            }
            if (myzVar.u()) {
                nakVarN = myzVar.n();
                if (nakVarN.ak()) {
                    float fCo4 = nakVarN.g().co();
                    fphVar.g(fCo4);
                    fphVar.h(fCo4);
                    fphVar.i(fCo4);
                    fphVar.c(fCo4);
                }
                if (nakVarN.r()) {
                    float fCo5 = nakVarN.j().co();
                    fphVar.g(fCo5);
                    fphVar.h(fCo5);
                }
                if (nakVarN.w()) {
                    float fCo6 = nakVarN.o().co();
                    fphVar.i(fCo6);
                    fphVar.c(fCo6);
                }
                if (nakVarN.v()) {
                    fphVar.i(nakVarN.n().co());
                }
                if (nakVarN.s()) {
                    fphVar.g(nakVarN.k().co());
                }
                if (nakVarN.p()) {
                    fphVar.c(nakVarN.h().co());
                }
                if (nakVarN.t()) {
                    fphVar.h(nakVarN.l().co());
                }
                if (nakVarN.u()) {
                    fphVar.g(nakVarN.m().co());
                }
                if (nakVarN.q()) {
                    fphVar.h(nakVarN.i().co());
                }
                fphVar.s();
            }
            if (mzgVar2 != null) {
                i3 = i;
                fphVar2 = fphVar;
                nslVar = nslVar2;
                int i6 = i3;
                mim mimVar4 = mimVar;
                fphVar2.j(new mil(commandOuterClass$CommandA, nryVar, mimVar4, nslVar, atomicReference2, atomicBoolean, commandOuterClass$CommandA3, i6, commandOuterClass$CommandA2));
                fphVar2.j(mimVar4);
            } else {
                i3 = i;
                fphVar2 = fphVar;
                nslVar = nslVar2;
                int i7 = i3;
                mim mimVar5 = mimVar;
                fphVar2.j(new mil(commandOuterClass$CommandA, nryVar, mimVar5, nslVar, atomicReference2, atomicBoolean, commandOuterClass$CommandA3, i7, commandOuterClass$CommandA2));
                fphVar2.j(mimVar5);
            }
            if (z17) {
                nslVar = nslVar2;
                ntVar = nslVar.k;
                if (ntVar != null) {
                    fphVar2.f(ntVar);
                } else {
                    mhcVar = nslVar.L;
                    if (mhcVar != null) {
                        fpjVar.H = mhcVar;
                    }
                }
            } else if (r22 != 0) {
                fphVar2.f(nyvVar);
            }
            return fphVar2.a();
        }
        z = z20;
        mzgVar = mzgVar3;
        mimVar = mimVar2;
        if (myzVar.t()) {
            myw mywVarI2 = myzVar.i();
            if (myzVar.B() != 1) {
                zE = false;
            } else {
                zE = mywVarI2.e(nbr.U);
            }
        } else {
            zE = false;
        }
        if (!zE) {
            if (z15) {
                f = 0.0f;
                fH = 0.0f;
            } else {
                motVar = new fpb();
                motVar.c = myzVar.C() + (-1) != 1 ? 1 : 0;
                motVar.d = mio.e(myzVar.E(), myzVar.F(), z17, nucVar, nslVar2);
                if (z12) {
                    motVar.e = new min(str, (mlf) fhdVar.l(mlf.class));
                }
                atomicReference = atomicReference8;
                list = list2;
            }
            r12 = motVar;
            asnu asnuVarD2 = nslVar2.d();
            if (nslVar2.i() != null) {
                i = 1;
            } else {
                i = 1;
            }
            fpfVar = new fpf();
            if (ntxVar == null) {
                nvyVar = null;
            } else {
                nvyVar = ntxVar.f;
            }
            if (nvyVar != null) {
                fpfVar.b(nvyVar.b);
            }
            if (z18) {
                fpfVar.a = true;
            }
            if (myzVar.v()) {
                fpfVar.c = myzVar.q();
            }
            if (myzVar.w()) {
                fpfVar.d = myzVar.r();
            }
            if (!z19) {
                if (z) {
                    z2 = true;
                    z3 = true;
                }
                if (atomicReference5 != null) {
                    nroVar = (nro) atomicReference5.get();
                } else {
                    nroVar = null;
                }
                if (nroVar == null) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (z11) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                fpfVar.b = z5;
                if (atomicReference6 != null) {
                    nueVar = (nue) atomicReference6.get();
                } else {
                    nueVar = null;
                }
                z6 = z4;
                if (nroVar != null) {
                    fpfVar.h = nroVar.f;
                    num = nroVar.i;
                    if (num != null) {
                        iIntValue = num.intValue();
                        if (iIntValue > 0) {
                            throw new IllegalArgumentException(a.bR(iIntValue, "Estimated viewport count must be > 0: "));
                        }
                        fpfVar.e = iIntValue;
                    }
                    f2 = nroVar.j;
                    if (f2 != null) {
                        fpfVar.b(f2.floatValue());
                    }
                }
                if (atomicReference7.get() != avmmVar) {
                    mio.d(atomicReference7, avmmVar, nroVar, nslVar2);
                }
                if (myzVar.p()) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                fphVar = new fph(fhdVar, new fpj());
                if (nroVar == null) {
                    mii miiVar3 = new mii(new fof(fhdVar), new mij());
                    mij mijVar3 = miiVar3.b;
                    mijVar3.p = nslVar2;
                    BitSet bitSet5 = miiVar3.c;
                    bitSet5.set(3);
                    mijVar3.r = ntrVar;
                    bitSet5.set(5);
                    mijVar3.q = nthVar;
                    bitSet5.set(4);
                    mijVar3.o = avmmVar;
                    bitSet5.set(2);
                    mijVar3.n = myzVar;
                    bitSet5.set(1);
                    mijVar3.m = list;
                    bitSet5.set(0);
                    foeVarB = miiVar3.a();
                    nryVar = nryVar2;
                } else {
                    mjj mjjVar3 = new mjj(new fof(fhdVar), new mjl());
                    mjl mjlVar3 = mjjVar3.b;
                    mjlVar3.r = nslVar2;
                    BitSet bitSet6 = mjjVar3.c;
                    bitSet6.set(5);
                    mjlVar3.v = nucVar;
                    bitSet6.set(9);
                    mjlVar3.u = ntrVar;
                    bitSet6.set(8);
                    mjlVar3.t = nthVar;
                    bitSet6.set(7);
                    mjlVar3.q = avmmVar;
                    bitSet6.set(4);
                    mjlVar3.o = myzVar;
                    bitSet6.set(2);
                    mjlVar3.m = nroVar;
                    bitSet6.set(0);
                    mjlVar3.w = nueVar;
                    bitSet6.set(10);
                    nryVar = nryVar2;
                    mjlVar3.p = nryVar;
                    bitSet6.set(3);
                    mjlVar3.x = z13;
                    bitSet6.set(11);
                    mjlVar3.s = nsoVar;
                    bitSet6.set(6);
                    mjlVar3.y = z14;
                    bitSet6.set(12);
                    mjlVar3.n = i4;
                    bitSet6.set(1);
                    foeVarB = mjjVar3.a();
                }
                fpjVar = fphVar.a;
                fpjVar.C = foeVarB;
                fphVar.e.set(0);
                fphVar.r(false);
                fpjVar.x = z7;
                r12.b(fpfVar.a());
                fpjVar.A = r12.a();
                if (z18) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                fpjVar.b = z8;
                fpjVar.r = nslVar2.h();
                if (nroVar == null) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                fpjVar.e = z9;
                iD = myzVar.D() - 1;
                if (iD != 1) {
                    i2 = 2;
                } else if (iD != 2) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                fpjVar.z = i2;
                if (z16) {
                    DisplayMetrics displayMetrics3 = fhdVar.a.getResources().getDisplayMetrics();
                    if (myzVar.x()) {
                        nbnVarO = myzVar.o();
                    } else {
                        nbnVarO = null;
                    }
                    oygVarBw = qnl.bw(displayMetrics3, nbnVarO);
                    atomicReference3 = atomicReference;
                    if (oygVarBw == null) {
                        npvVar = null;
                        atomicReference3.set(null);
                    } else {
                        npvVar = (npv) atomicReference3.get();
                        if (npvVar != null) {
                            npvVar = new npv(z17, oygVarBw);
                            atomicReference3.set(npvVar);
                        } else {
                            npvVar = new npv(z17, oygVarBw);
                            atomicReference3.set(npvVar);
                        }
                    }
                    if (npvVar != null) {
                        fpjVar.J = npvVar;
                    }
                }
                if (z6) {
                    fpjVar.u = nroVar.h;
                }
                if (nroVar != null) {
                    fpjVar.s = new fpe();
                } else {
                    fpjVar.s = new fpe();
                }
                if (nueVar != null) {
                    fphVar.I(aE(fhdVar));
                }
                if (atomicReference4 != null) {
                    atomicReference2 = atomicReference4;
                    atomicReference2.set(nwjVar);
                    fphVar.I(aE(fhdVar));
                } else {
                    atomicReference2 = atomicReference4;
                }
                if (z10) {
                    fphVar.Y();
                    fphVar.H(mio.a + mio.b.getAndIncrement());
                }
                if (ftcVar != null) {
                    fpjVar.I = ftcVar;
                }
                if (myzVar.u()) {
                    nakVarN = myzVar.n();
                    if (nakVarN.ak()) {
                        float fCo7 = nakVarN.g().co();
                        fphVar.g(fCo7);
                        fphVar.h(fCo7);
                        fphVar.i(fCo7);
                        fphVar.c(fCo7);
                    }
                    if (nakVarN.r()) {
                        float fCo8 = nakVarN.j().co();
                        fphVar.g(fCo8);
                        fphVar.h(fCo8);
                    }
                    if (nakVarN.w()) {
                        float fCo9 = nakVarN.o().co();
                        fphVar.i(fCo9);
                        fphVar.c(fCo9);
                    }
                    if (nakVarN.v()) {
                        fphVar.i(nakVarN.n().co());
                    }
                    if (nakVarN.s()) {
                        fphVar.g(nakVarN.k().co());
                    }
                    if (nakVarN.p()) {
                        fphVar.c(nakVarN.h().co());
                    }
                    if (nakVarN.t()) {
                        fphVar.h(nakVarN.l().co());
                    }
                    if (nakVarN.u()) {
                        fphVar.g(nakVarN.m().co());
                    }
                    if (nakVarN.q()) {
                        fphVar.h(nakVarN.i().co());
                    }
                    fphVar.s();
                }
                if (mzgVar2 != null) {
                    i3 = i;
                    fphVar2 = fphVar;
                    nslVar = nslVar2;
                    int i8 = i3;
                    mim mimVar6 = mimVar;
                    fphVar2.j(new mil(commandOuterClass$CommandA, nryVar, mimVar6, nslVar, atomicReference2, atomicBoolean, commandOuterClass$CommandA3, i8, commandOuterClass$CommandA2));
                    fphVar2.j(mimVar6);
                } else {
                    i3 = i;
                    fphVar2 = fphVar;
                    nslVar = nslVar2;
                    int i9 = i3;
                    mim mimVar7 = mimVar;
                    fphVar2.j(new mil(commandOuterClass$CommandA, nryVar, mimVar7, nslVar, atomicReference2, atomicBoolean, commandOuterClass$CommandA3, i9, commandOuterClass$CommandA2));
                    fphVar2.j(mimVar7);
                }
                if (z17) {
                    nslVar = nslVar2;
                    ntVar = nslVar.k;
                    if (ntVar != null) {
                        fphVar2.f(ntVar);
                    } else {
                        mhcVar = nslVar.L;
                        if (mhcVar != null) {
                            fpjVar.H = mhcVar;
                        }
                    }
                } else if (r22 != 0) {
                    fphVar2.f(nyvVar);
                }
                return fphVar2.a();
            }
            z2 = true;
            fpfVar.f = true;
            z3 = z;
            if (z3) {
                fpfVar.g = z2;
            }
            fpfVar.c = false;
            if (atomicReference5 != null) {
                nroVar = (nro) atomicReference5.get();
            } else {
                nroVar = null;
            }
            if (nroVar == null) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (z11) {
                z5 = true;
            } else {
                z5 = true;
            }
            fpfVar.b = z5;
            if (atomicReference6 != null) {
                nueVar = (nue) atomicReference6.get();
            } else {
                nueVar = null;
            }
            z6 = z4;
            if (nroVar != null) {
                fpfVar.h = nroVar.f;
                num = nroVar.i;
                if (num != null) {
                    iIntValue = num.intValue();
                    if (iIntValue > 0) {
                        throw new IllegalArgumentException(a.bR(iIntValue, "Estimated viewport count must be > 0: "));
                    }
                    fpfVar.e = iIntValue;
                }
                f2 = nroVar.j;
                if (f2 != null) {
                    fpfVar.b(f2.floatValue());
                }
            }
            if (atomicReference7.get() != avmmVar) {
                mio.d(atomicReference7, avmmVar, nroVar, nslVar2);
            }
            if (myzVar.p()) {
                z7 = false;
            } else {
                z7 = false;
            }
            fphVar = new fph(fhdVar, new fpj());
            if (nroVar == null) {
                mii miiVar4 = new mii(new fof(fhdVar), new mij());
                mij mijVar4 = miiVar4.b;
                mijVar4.p = nslVar2;
                BitSet bitSet7 = miiVar4.c;
                bitSet7.set(3);
                mijVar4.r = ntrVar;
                bitSet7.set(5);
                mijVar4.q = nthVar;
                bitSet7.set(4);
                mijVar4.o = avmmVar;
                bitSet7.set(2);
                mijVar4.n = myzVar;
                bitSet7.set(1);
                mijVar4.m = list;
                bitSet7.set(0);
                foeVarB = miiVar4.a();
                nryVar = nryVar2;
            } else {
                mjj mjjVar4 = new mjj(new fof(fhdVar), new mjl());
                mjl mjlVar4 = mjjVar4.b;
                mjlVar4.r = nslVar2;
                BitSet bitSet8 = mjjVar4.c;
                bitSet8.set(5);
                mjlVar4.v = nucVar;
                bitSet8.set(9);
                mjlVar4.u = ntrVar;
                bitSet8.set(8);
                mjlVar4.t = nthVar;
                bitSet8.set(7);
                mjlVar4.q = avmmVar;
                bitSet8.set(4);
                mjlVar4.o = myzVar;
                bitSet8.set(2);
                mjlVar4.m = nroVar;
                bitSet8.set(0);
                mjlVar4.w = nueVar;
                bitSet8.set(10);
                nryVar = nryVar2;
                mjlVar4.p = nryVar;
                bitSet8.set(3);
                mjlVar4.x = z13;
                bitSet8.set(11);
                mjlVar4.s = nsoVar;
                bitSet8.set(6);
                mjlVar4.y = z14;
                bitSet8.set(12);
                mjlVar4.n = i4;
                bitSet8.set(1);
                foeVarB = mjjVar4.a();
            }
            fpjVar = fphVar.a;
            fpjVar.C = foeVarB;
            fphVar.e.set(0);
            fphVar.r(false);
            fpjVar.x = z7;
            r12.b(fpfVar.a());
            fpjVar.A = r12.a();
            if (z18) {
                z8 = true;
            } else {
                z8 = true;
            }
            fpjVar.b = z8;
            fpjVar.r = nslVar2.h();
            if (nroVar == null) {
                z9 = true;
            } else {
                z9 = true;
            }
            fpjVar.e = z9;
            iD = myzVar.D() - 1;
            if (iD != 1) {
                i2 = 2;
            } else if (iD != 2) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            fpjVar.z = i2;
            if (z16) {
                DisplayMetrics displayMetrics4 = fhdVar.a.getResources().getDisplayMetrics();
                if (myzVar.x()) {
                    nbnVarO = myzVar.o();
                } else {
                    nbnVarO = null;
                }
                oygVarBw = qnl.bw(displayMetrics4, nbnVarO);
                atomicReference3 = atomicReference;
                if (oygVarBw == null) {
                    npvVar = null;
                    atomicReference3.set(null);
                } else {
                    npvVar = (npv) atomicReference3.get();
                    if (npvVar != null) {
                        npvVar = new npv(z17, oygVarBw);
                        atomicReference3.set(npvVar);
                    } else {
                        npvVar = new npv(z17, oygVarBw);
                        atomicReference3.set(npvVar);
                    }
                }
                if (npvVar != null) {
                    fpjVar.J = npvVar;
                }
            }
            if (z6) {
                fpjVar.u = nroVar.h;
            }
            if (nroVar != null) {
                fpjVar.s = new fpe();
            } else {
                fpjVar.s = new fpe();
            }
            if (nueVar != null) {
                fphVar.I(aE(fhdVar));
            }
            if (atomicReference4 != null) {
                atomicReference2 = atomicReference4;
                atomicReference2.set(nwjVar);
                fphVar.I(aE(fhdVar));
            } else {
                atomicReference2 = atomicReference4;
            }
            if (z10) {
                fphVar.Y();
                fphVar.H(mio.a + mio.b.getAndIncrement());
            }
            if (ftcVar != null) {
                fpjVar.I = ftcVar;
            }
            if (myzVar.u()) {
                nakVarN = myzVar.n();
                if (nakVarN.ak()) {
                    float fCo10 = nakVarN.g().co();
                    fphVar.g(fCo10);
                    fphVar.h(fCo10);
                    fphVar.i(fCo10);
                    fphVar.c(fCo10);
                }
                if (nakVarN.r()) {
                    float fCo11 = nakVarN.j().co();
                    fphVar.g(fCo11);
                    fphVar.h(fCo11);
                }
                if (nakVarN.w()) {
                    float fCo12 = nakVarN.o().co();
                    fphVar.i(fCo12);
                    fphVar.c(fCo12);
                }
                if (nakVarN.v()) {
                    fphVar.i(nakVarN.n().co());
                }
                if (nakVarN.s()) {
                    fphVar.g(nakVarN.k().co());
                }
                if (nakVarN.p()) {
                    fphVar.c(nakVarN.h().co());
                }
                if (nakVarN.t()) {
                    fphVar.h(nakVarN.l().co());
                }
                if (nakVarN.u()) {
                    fphVar.g(nakVarN.m().co());
                }
                if (nakVarN.q()) {
                    fphVar.h(nakVarN.i().co());
                }
                fphVar.s();
            }
            if (mzgVar2 != null) {
                i3 = i;
                fphVar2 = fphVar;
                nslVar = nslVar2;
                int i10 = i3;
                mim mimVar8 = mimVar;
                fphVar2.j(new mil(commandOuterClass$CommandA, nryVar, mimVar8, nslVar, atomicReference2, atomicBoolean, commandOuterClass$CommandA3, i10, commandOuterClass$CommandA2));
                fphVar2.j(mimVar8);
            } else {
                i3 = i;
                fphVar2 = fphVar;
                nslVar = nslVar2;
                int i11 = i3;
                mim mimVar9 = mimVar;
                fphVar2.j(new mil(commandOuterClass$CommandA, nryVar, mimVar9, nslVar, atomicReference2, atomicBoolean, commandOuterClass$CommandA3, i11, commandOuterClass$CommandA2));
                fphVar2.j(mimVar9);
            }
            if (z17) {
                nslVar = nslVar2;
                ntVar = nslVar.k;
                if (ntVar != null) {
                    fphVar2.f(ntVar);
                } else {
                    mhcVar = nslVar.L;
                    if (mhcVar != null) {
                        fpjVar.H = mhcVar;
                    }
                }
            } else if (r22 != 0) {
                fphVar2.f(nyvVar);
            }
            return fphVar2.a();
        }
        nbr nbrVar = (nbr) myzVar.i().d(nbr.U);
        float fG = nbrVar.g();
        fH = nbrVar.h();
        f = fG;
        boolean z21 = zE;
        motVar = new mot();
        atomicReference = atomicReference8;
        list = list2;
        motVar.b = myzVar.C() + (-1) != 1 ? 1 : 0;
        motVar.c = mio.e(myzVar.E(), myzVar.F(), z17, nucVar, nslVar2);
        motVar.e = f;
        motVar.d = fH;
        if (!z21) {
            motVar.f = 1;
        }
        if (z12) {
            motVar.g = str;
            motVar.h = (mlf) fhdVar.l(mlf.class);
        }
        r12 = motVar;
        asnu asnuVarD3 = nslVar2.d();
        if (nslVar2.i() != null) {
            i = 1;
        } else {
            i = 1;
        }
        fpfVar = new fpf();
        if (ntxVar == null) {
            nvyVar = null;
        } else {
            nvyVar = ntxVar.f;
        }
        if (nvyVar != null) {
            fpfVar.b(nvyVar.b);
        }
        if (z18) {
            fpfVar.a = true;
        }
        if (myzVar.v()) {
            fpfVar.c = myzVar.q();
        }
        if (myzVar.w()) {
            fpfVar.d = myzVar.r();
        }
        if (!z19) {
            if (z) {
                z2 = true;
                z3 = true;
            }
            if (atomicReference5 != null) {
                nroVar = (nro) atomicReference5.get();
            } else {
                nroVar = null;
            }
            if (nroVar == null) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (z11) {
                z5 = true;
            } else {
                z5 = true;
            }
            fpfVar.b = z5;
            if (atomicReference6 != null) {
                nueVar = (nue) atomicReference6.get();
            } else {
                nueVar = null;
            }
            z6 = z4;
            if (nroVar != null) {
                fpfVar.h = nroVar.f;
                num = nroVar.i;
                if (num != null) {
                    iIntValue = num.intValue();
                    if (iIntValue > 0) {
                        throw new IllegalArgumentException(a.bR(iIntValue, "Estimated viewport count must be > 0: "));
                    }
                    fpfVar.e = iIntValue;
                }
                f2 = nroVar.j;
                if (f2 != null) {
                    fpfVar.b(f2.floatValue());
                }
            }
            if (atomicReference7.get() != avmmVar) {
                mio.d(atomicReference7, avmmVar, nroVar, nslVar2);
            }
            if (myzVar.p()) {
                z7 = false;
            } else {
                z7 = false;
            }
            fphVar = new fph(fhdVar, new fpj());
            if (nroVar == null) {
                mii miiVar5 = new mii(new fof(fhdVar), new mij());
                mij mijVar5 = miiVar5.b;
                mijVar5.p = nslVar2;
                BitSet bitSet9 = miiVar5.c;
                bitSet9.set(3);
                mijVar5.r = ntrVar;
                bitSet9.set(5);
                mijVar5.q = nthVar;
                bitSet9.set(4);
                mijVar5.o = avmmVar;
                bitSet9.set(2);
                mijVar5.n = myzVar;
                bitSet9.set(1);
                mijVar5.m = list;
                bitSet9.set(0);
                foeVarB = miiVar5.a();
                nryVar = nryVar2;
            } else {
                mjj mjjVar5 = new mjj(new fof(fhdVar), new mjl());
                mjl mjlVar5 = mjjVar5.b;
                mjlVar5.r = nslVar2;
                BitSet bitSet10 = mjjVar5.c;
                bitSet10.set(5);
                mjlVar5.v = nucVar;
                bitSet10.set(9);
                mjlVar5.u = ntrVar;
                bitSet10.set(8);
                mjlVar5.t = nthVar;
                bitSet10.set(7);
                mjlVar5.q = avmmVar;
                bitSet10.set(4);
                mjlVar5.o = myzVar;
                bitSet10.set(2);
                mjlVar5.m = nroVar;
                bitSet10.set(0);
                mjlVar5.w = nueVar;
                bitSet10.set(10);
                nryVar = nryVar2;
                mjlVar5.p = nryVar;
                bitSet10.set(3);
                mjlVar5.x = z13;
                bitSet10.set(11);
                mjlVar5.s = nsoVar;
                bitSet10.set(6);
                mjlVar5.y = z14;
                bitSet10.set(12);
                mjlVar5.n = i4;
                bitSet10.set(1);
                foeVarB = mjjVar5.a();
            }
            fpjVar = fphVar.a;
            fpjVar.C = foeVarB;
            fphVar.e.set(0);
            fphVar.r(false);
            fpjVar.x = z7;
            r12.b(fpfVar.a());
            fpjVar.A = r12.a();
            if (z18) {
                z8 = true;
            } else {
                z8 = true;
            }
            fpjVar.b = z8;
            fpjVar.r = nslVar2.h();
            if (nroVar == null) {
                z9 = true;
            } else {
                z9 = true;
            }
            fpjVar.e = z9;
            iD = myzVar.D() - 1;
            if (iD != 1) {
                i2 = 2;
            } else if (iD != 2) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            fpjVar.z = i2;
            if (z16) {
                DisplayMetrics displayMetrics5 = fhdVar.a.getResources().getDisplayMetrics();
                if (myzVar.x()) {
                    nbnVarO = myzVar.o();
                } else {
                    nbnVarO = null;
                }
                oygVarBw = qnl.bw(displayMetrics5, nbnVarO);
                atomicReference3 = atomicReference;
                if (oygVarBw == null) {
                    npvVar = null;
                    atomicReference3.set(null);
                } else {
                    npvVar = (npv) atomicReference3.get();
                    if (npvVar != null) {
                        npvVar = new npv(z17, oygVarBw);
                        atomicReference3.set(npvVar);
                    } else {
                        npvVar = new npv(z17, oygVarBw);
                        atomicReference3.set(npvVar);
                    }
                }
                if (npvVar != null) {
                    fpjVar.J = npvVar;
                }
            }
            if (z6) {
                fpjVar.u = nroVar.h;
            }
            if (nroVar != null) {
                fpjVar.s = new fpe();
            } else {
                fpjVar.s = new fpe();
            }
            if (nueVar != null) {
                fphVar.I(aE(fhdVar));
            }
            if (atomicReference4 != null) {
                atomicReference2 = atomicReference4;
                atomicReference2.set(nwjVar);
                fphVar.I(aE(fhdVar));
            } else {
                atomicReference2 = atomicReference4;
            }
            if (z10) {
                fphVar.Y();
                fphVar.H(mio.a + mio.b.getAndIncrement());
            }
            if (ftcVar != null) {
                fpjVar.I = ftcVar;
            }
            if (myzVar.u()) {
                nakVarN = myzVar.n();
                if (nakVarN.ak()) {
                    float fCo13 = nakVarN.g().co();
                    fphVar.g(fCo13);
                    fphVar.h(fCo13);
                    fphVar.i(fCo13);
                    fphVar.c(fCo13);
                }
                if (nakVarN.r()) {
                    float fCo14 = nakVarN.j().co();
                    fphVar.g(fCo14);
                    fphVar.h(fCo14);
                }
                if (nakVarN.w()) {
                    float fCo15 = nakVarN.o().co();
                    fphVar.i(fCo15);
                    fphVar.c(fCo15);
                }
                if (nakVarN.v()) {
                    fphVar.i(nakVarN.n().co());
                }
                if (nakVarN.s()) {
                    fphVar.g(nakVarN.k().co());
                }
                if (nakVarN.p()) {
                    fphVar.c(nakVarN.h().co());
                }
                if (nakVarN.t()) {
                    fphVar.h(nakVarN.l().co());
                }
                if (nakVarN.u()) {
                    fphVar.g(nakVarN.m().co());
                }
                if (nakVarN.q()) {
                    fphVar.h(nakVarN.i().co());
                }
                fphVar.s();
            }
            if (mzgVar2 != null) {
                i3 = i;
                fphVar2 = fphVar;
                nslVar = nslVar2;
                int i12 = i3;
                mim mimVar10 = mimVar;
                fphVar2.j(new mil(commandOuterClass$CommandA, nryVar, mimVar10, nslVar, atomicReference2, atomicBoolean, commandOuterClass$CommandA3, i12, commandOuterClass$CommandA2));
                fphVar2.j(mimVar10);
            } else {
                i3 = i;
                fphVar2 = fphVar;
                nslVar = nslVar2;
                int i13 = i3;
                mim mimVar11 = mimVar;
                fphVar2.j(new mil(commandOuterClass$CommandA, nryVar, mimVar11, nslVar, atomicReference2, atomicBoolean, commandOuterClass$CommandA3, i13, commandOuterClass$CommandA2));
                fphVar2.j(mimVar11);
            }
            if (z17) {
                nslVar = nslVar2;
                ntVar = nslVar.k;
                if (ntVar != null) {
                    fphVar2.f(ntVar);
                } else {
                    mhcVar = nslVar.L;
                    if (mhcVar != null) {
                        fpjVar.H = mhcVar;
                    }
                }
            } else if (r22 != 0) {
                fphVar2.f(nyvVar);
            }
            return fphVar2.a();
        }
        z2 = true;
        fpfVar.f = true;
        z3 = z;
        if (z3) {
            fpfVar.g = z2;
        }
        fpfVar.c = false;
        if (atomicReference5 != null) {
            nroVar = (nro) atomicReference5.get();
        } else {
            nroVar = null;
        }
        if (nroVar == null) {
            z4 = false;
        } else {
            z4 = false;
        }
        if (z11) {
            z5 = true;
        } else {
            z5 = true;
        }
        fpfVar.b = z5;
        if (atomicReference6 != null) {
            nueVar = (nue) atomicReference6.get();
        } else {
            nueVar = null;
        }
        z6 = z4;
        if (nroVar != null) {
            fpfVar.h = nroVar.f;
            num = nroVar.i;
            if (num != null) {
                iIntValue = num.intValue();
                if (iIntValue > 0) {
                    throw new IllegalArgumentException(a.bR(iIntValue, "Estimated viewport count must be > 0: "));
                }
                fpfVar.e = iIntValue;
            }
            f2 = nroVar.j;
            if (f2 != null) {
                fpfVar.b(f2.floatValue());
            }
        }
        if (atomicReference7.get() != avmmVar) {
            mio.d(atomicReference7, avmmVar, nroVar, nslVar2);
        }
        if (myzVar.p()) {
            z7 = false;
        } else {
            z7 = false;
        }
        fphVar = new fph(fhdVar, new fpj());
        if (nroVar == null) {
            mii miiVar6 = new mii(new fof(fhdVar), new mij());
            mij mijVar6 = miiVar6.b;
            mijVar6.p = nslVar2;
            BitSet bitSet11 = miiVar6.c;
            bitSet11.set(3);
            mijVar6.r = ntrVar;
            bitSet11.set(5);
            mijVar6.q = nthVar;
            bitSet11.set(4);
            mijVar6.o = avmmVar;
            bitSet11.set(2);
            mijVar6.n = myzVar;
            bitSet11.set(1);
            mijVar6.m = list;
            bitSet11.set(0);
            foeVarB = miiVar6.a();
            nryVar = nryVar2;
        } else {
            mjj mjjVar6 = new mjj(new fof(fhdVar), new mjl());
            mjl mjlVar6 = mjjVar6.b;
            mjlVar6.r = nslVar2;
            BitSet bitSet12 = mjjVar6.c;
            bitSet12.set(5);
            mjlVar6.v = nucVar;
            bitSet12.set(9);
            mjlVar6.u = ntrVar;
            bitSet12.set(8);
            mjlVar6.t = nthVar;
            bitSet12.set(7);
            mjlVar6.q = avmmVar;
            bitSet12.set(4);
            mjlVar6.o = myzVar;
            bitSet12.set(2);
            mjlVar6.m = nroVar;
            bitSet12.set(0);
            mjlVar6.w = nueVar;
            bitSet12.set(10);
            nryVar = nryVar2;
            mjlVar6.p = nryVar;
            bitSet12.set(3);
            mjlVar6.x = z13;
            bitSet12.set(11);
            mjlVar6.s = nsoVar;
            bitSet12.set(6);
            mjlVar6.y = z14;
            bitSet12.set(12);
            mjlVar6.n = i4;
            bitSet12.set(1);
            foeVarB = mjjVar6.a();
        }
        fpjVar = fphVar.a;
        fpjVar.C = foeVarB;
        fphVar.e.set(0);
        fphVar.r(false);
        fpjVar.x = z7;
        r12.b(fpfVar.a());
        fpjVar.A = r12.a();
        if (z18) {
            z8 = true;
        } else {
            z8 = true;
        }
        fpjVar.b = z8;
        fpjVar.r = nslVar2.h();
        if (nroVar == null) {
            z9 = true;
        } else {
            z9 = true;
        }
        fpjVar.e = z9;
        iD = myzVar.D() - 1;
        if (iD != 1) {
            i2 = 2;
        } else if (iD != 2) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        fpjVar.z = i2;
        if (z16) {
            DisplayMetrics displayMetrics6 = fhdVar.a.getResources().getDisplayMetrics();
            if (myzVar.x()) {
                nbnVarO = myzVar.o();
            } else {
                nbnVarO = null;
            }
            oygVarBw = qnl.bw(displayMetrics6, nbnVarO);
            atomicReference3 = atomicReference;
            if (oygVarBw == null) {
                npvVar = null;
                atomicReference3.set(null);
            } else {
                npvVar = (npv) atomicReference3.get();
                if (npvVar != null) {
                    npvVar = new npv(z17, oygVarBw);
                    atomicReference3.set(npvVar);
                } else {
                    npvVar = new npv(z17, oygVarBw);
                    atomicReference3.set(npvVar);
                }
            }
            if (npvVar != null) {
                fpjVar.J = npvVar;
            }
        }
        if (z6) {
            fpjVar.u = nroVar.h;
        }
        if (nroVar != null) {
            fpjVar.s = new fpe();
        } else {
            fpjVar.s = new fpe();
        }
        if (nueVar != null) {
            fphVar.I(aE(fhdVar));
        }
        if (atomicReference4 != null) {
            atomicReference2 = atomicReference4;
            atomicReference2.set(nwjVar);
            fphVar.I(aE(fhdVar));
        } else {
            atomicReference2 = atomicReference4;
        }
        if (z10) {
            fphVar.Y();
            fphVar.H(mio.a + mio.b.getAndIncrement());
        }
        if (ftcVar != null) {
            fpjVar.I = ftcVar;
        }
        if (myzVar.u()) {
            nakVarN = myzVar.n();
            if (nakVarN.ak()) {
                float fCo16 = nakVarN.g().co();
                fphVar.g(fCo16);
                fphVar.h(fCo16);
                fphVar.i(fCo16);
                fphVar.c(fCo16);
            }
            if (nakVarN.r()) {
                float fCo17 = nakVarN.j().co();
                fphVar.g(fCo17);
                fphVar.h(fCo17);
            }
            if (nakVarN.w()) {
                float fCo18 = nakVarN.o().co();
                fphVar.i(fCo18);
                fphVar.c(fCo18);
            }
            if (nakVarN.v()) {
                fphVar.i(nakVarN.n().co());
            }
            if (nakVarN.s()) {
                fphVar.g(nakVarN.k().co());
            }
            if (nakVarN.p()) {
                fphVar.c(nakVarN.h().co());
            }
            if (nakVarN.t()) {
                fphVar.h(nakVarN.l().co());
            }
            if (nakVarN.u()) {
                fphVar.g(nakVarN.m().co());
            }
            if (nakVarN.q()) {
                fphVar.h(nakVarN.i().co());
            }
            fphVar.s();
        }
        if (mzgVar2 != null) {
            i3 = i;
            fphVar2 = fphVar;
            nslVar = nslVar2;
            int i14 = i3;
            mim mimVar12 = mimVar;
            fphVar2.j(new mil(commandOuterClass$CommandA, nryVar, mimVar12, nslVar, atomicReference2, atomicBoolean, commandOuterClass$CommandA3, i14, commandOuterClass$CommandA2));
            fphVar2.j(mimVar12);
        } else {
            i3 = i;
            fphVar2 = fphVar;
            nslVar = nslVar2;
            int i15 = i3;
            mim mimVar13 = mimVar;
            fphVar2.j(new mil(commandOuterClass$CommandA, nryVar, mimVar13, nslVar, atomicReference2, atomicBoolean, commandOuterClass$CommandA3, i15, commandOuterClass$CommandA2));
            fphVar2.j(mimVar13);
        }
        if (z17) {
            nslVar = nslVar2;
            ntVar = nslVar.k;
            if (ntVar != null) {
                fphVar2.f(ntVar);
            } else {
                mhcVar = nslVar.L;
                if (mhcVar != null) {
                    fpjVar.H = mhcVar;
                }
            }
        } else if (r22 != 0) {
            fphVar2.f(nyvVar);
        }
        return fphVar2.a();
    }

    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fgy l() {
        return (mig) super.l();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new mif();
    }
}
