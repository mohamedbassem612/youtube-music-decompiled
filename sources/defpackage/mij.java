package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mij extends foe {

    @fmt(a = 6)
    @fmu(a = fmv.a)
    List m;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    myz n;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    avmm o;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nsl p;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    nth q;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    ntr r;

    public mij() {
        super("CollectionSection");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.foe
    /* JADX INFO: renamed from: f */
    public final boolean a(foe foeVar) {
        myz myzVar;
        avmm avmmVar;
        nsl nslVar;
        nth nthVar;
        ntr ntrVar;
        if (this == foeVar) {
            return true;
        }
        if (foeVar != null && getClass() == foeVar.getClass()) {
            mij mijVar = (mij) foeVar;
            List list = this.m;
            if (list != null) {
                if (mijVar.m != null && list.size() == mijVar.m.size()) {
                    Iterator it = this.m.iterator();
                    Iterator it2 = mijVar.m.iterator();
                    while (it.hasNext() && it2.hasNext()) {
                        fgy fgyVar = (fgy) it.next();
                        fgy fgyVar2 = (fgy) it2.next();
                        boolean z = fna.a;
                        if (!fgyVar.g(fgyVar2)) {
                        }
                    }
                    myzVar = this.n;
                    if (myzVar != null ? mijVar.n == null : myzVar.equals(mijVar.n)) {
                        avmmVar = this.o;
                        if (avmmVar != null ? mijVar.o == null : avmmVar.equals(mijVar.o)) {
                            nslVar = this.p;
                            if (nslVar != null ? mijVar.p == null : nslVar.equals(mijVar.p)) {
                                nthVar = this.q;
                                if (nthVar != null ? mijVar.q == null : nthVar.equals(mijVar.q)) {
                                    ntrVar = this.r;
                                    if (ntrVar != null) {
                                        if (ntrVar.equals(mijVar.r)) {
                                            return true;
                                        }
                                    } else if (mijVar.r == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (mijVar.m == null) {
                myzVar = this.n;
                if (myzVar != null) {
                    avmmVar = this.o;
                    if (avmmVar != null) {
                        nslVar = this.p;
                        if (nslVar != null) {
                            nthVar = this.q;
                            if (nthVar != null) {
                                ntrVar = this.r;
                                if (ntrVar != null) {
                                    if (ntrVar.equals(mijVar.r)) {
                                        return true;
                                    }
                                } else if (mijVar.r == null) {
                                    return true;
                                }
                            } else {
                                ntrVar = this.r;
                                if (ntrVar != null) {
                                    if (ntrVar.equals(mijVar.r)) {
                                        return true;
                                    }
                                } else if (mijVar.r == null) {
                                    return true;
                                }
                            }
                        } else {
                            nthVar = this.q;
                            if (nthVar != null) {
                                ntrVar = this.r;
                                if (ntrVar != null) {
                                    if (ntrVar.equals(mijVar.r)) {
                                        return true;
                                    }
                                } else if (mijVar.r == null) {
                                    return true;
                                }
                            } else {
                                ntrVar = this.r;
                                if (ntrVar != null) {
                                    if (ntrVar.equals(mijVar.r)) {
                                        return true;
                                    }
                                } else if (mijVar.r == null) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        nslVar = this.p;
                        if (nslVar != null) {
                            nthVar = this.q;
                            if (nthVar != null) {
                                ntrVar = this.r;
                                if (ntrVar != null) {
                                    if (ntrVar.equals(mijVar.r)) {
                                        return true;
                                    }
                                } else if (mijVar.r == null) {
                                    return true;
                                }
                            } else {
                                ntrVar = this.r;
                                if (ntrVar != null) {
                                    if (ntrVar.equals(mijVar.r)) {
                                        return true;
                                    }
                                } else if (mijVar.r == null) {
                                    return true;
                                }
                            }
                        } else {
                            nthVar = this.q;
                            if (nthVar != null) {
                                ntrVar = this.r;
                                if (ntrVar != null) {
                                    if (ntrVar.equals(mijVar.r)) {
                                        return true;
                                    }
                                } else if (mijVar.r == null) {
                                    return true;
                                }
                            } else {
                                ntrVar = this.r;
                                if (ntrVar != null) {
                                    if (ntrVar.equals(mijVar.r)) {
                                        return true;
                                    }
                                } else if (mijVar.r == null) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    avmmVar = this.o;
                    if (avmmVar != null) {
                        nslVar = this.p;
                        if (nslVar != null) {
                            nthVar = this.q;
                            if (nthVar != null) {
                                ntrVar = this.r;
                                if (ntrVar != null) {
                                    if (ntrVar.equals(mijVar.r)) {
                                        return true;
                                    }
                                } else if (mijVar.r == null) {
                                    return true;
                                }
                            } else {
                                ntrVar = this.r;
                                if (ntrVar != null) {
                                    if (ntrVar.equals(mijVar.r)) {
                                        return true;
                                    }
                                } else if (mijVar.r == null) {
                                    return true;
                                }
                            }
                        } else {
                            nthVar = this.q;
                            if (nthVar != null) {
                                ntrVar = this.r;
                                if (ntrVar != null) {
                                    if (ntrVar.equals(mijVar.r)) {
                                        return true;
                                    }
                                } else if (mijVar.r == null) {
                                    return true;
                                }
                            } else {
                                ntrVar = this.r;
                                if (ntrVar != null) {
                                    if (ntrVar.equals(mijVar.r)) {
                                        return true;
                                    }
                                } else if (mijVar.r == null) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        nslVar = this.p;
                        if (nslVar != null) {
                            nthVar = this.q;
                            if (nthVar != null) {
                                ntrVar = this.r;
                                if (ntrVar != null) {
                                    if (ntrVar.equals(mijVar.r)) {
                                        return true;
                                    }
                                } else if (mijVar.r == null) {
                                    return true;
                                }
                            } else {
                                ntrVar = this.r;
                                if (ntrVar != null) {
                                    if (ntrVar.equals(mijVar.r)) {
                                        return true;
                                    }
                                } else if (mijVar.r == null) {
                                    return true;
                                }
                            }
                        } else {
                            nthVar = this.q;
                            if (nthVar != null) {
                                ntrVar = this.r;
                                if (ntrVar != null) {
                                    if (ntrVar.equals(mijVar.r)) {
                                        return true;
                                    }
                                } else if (mijVar.r == null) {
                                    return true;
                                }
                            } else {
                                ntrVar = this.r;
                                if (ntrVar != null) {
                                    if (ntrVar.equals(mijVar.r)) {
                                        return true;
                                    }
                                } else if (mijVar.r == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.foh
    protected final dov s(fof fofVar) {
        nsl nslVar = this.p;
        ntr ntrVar = this.r;
        nth nthVar = this.q;
        avmm avmmVar = this.o;
        myz myzVar = this.n;
        List<fgy> list = this.m;
        ci ciVar = new ci((short[]) null);
        if (myzVar.g() > 0) {
            for (int i = 0; i < myzVar.g(); i++) {
                mzc mzcVarJ = myzVar.j(i);
                int i2 = 0;
                while (i2 < mzcVarJ.g()) {
                    fof fofVar2 = fofVar;
                    fgy fgyVarA = ntrVar.a(fofVar2, nslVar, mzcVarJ.h(i2), nthVar, avmmVar);
                    fov fovVar = new fov(fofVar2, new fow());
                    fovVar.b(fgyVarA);
                    ciVar.F(fovVar);
                    i2++;
                    fofVar = fofVar2;
                }
            }
        } else if (list != null) {
            int iC = myzVar.C();
            boolean zT = myzVar.t();
            boolean z = iC == 2;
            if (zT || !fgn.b(fofVar.a)) {
                myw mywVarI = myzVar.i();
                int iG = -1;
                if (mywVarI != null) {
                    mep mepVar = nbv.V;
                    if (mywVarI.e(mepVar)) {
                        iG = ((nbv) mywVarI.d(mepVar)).g();
                    }
                }
                if (iG <= 0) {
                    for (fgy fgyVar : list) {
                        fov fovVar2 = new fov(fofVar, new fow());
                        fovVar2.b(fgyVar);
                        ciVar.F(fovVar2);
                    }
                } else {
                    mda.x(fofVar, list, ciVar, iG, z);
                }
            } else {
                mda.x(fofVar, list, ciVar, 1, z);
            }
        }
        return (dov) ciVar.a;
    }
}
