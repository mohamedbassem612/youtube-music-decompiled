package defpackage;

import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ztq {
    static ztq cp() {
        zsp zspVar = new zsp();
        zspVar.ck(600);
        zspVar.ci(3600);
        zspVar.bD(30000L);
        zspVar.cj(10);
        zspVar.aN(SemanticState.ReadOnly);
        zspVar.aM(3.5d);
        zspVar.bo(1);
        zspVar.bl(2);
        zspVar.bF(1);
        zspVar.bp(50);
        zspVar.bq(8);
        zspVar.bn(2);
        zspVar.bm(1);
        zspVar.aV(10000);
        zspVar.aW(7000);
        zspVar.aZ(8);
        zspVar.ba(16);
        zspVar.aQ(true);
        zspVar.aR(true);
        zspVar.aT(true);
        zspVar.bX(true);
        zspVar.bZ(true);
        zspVar.bY(true);
        zspVar.a = ahbo.d(86400, 86400, 86400, 86400);
        zspVar.b = ahbo.d(600, 600, 600, 600);
        zspVar.c = ahbn.d();
        zspVar.bd(4);
        zspVar.bz(2);
        zspVar.bu(1);
        zspVar.bh(1);
        zspVar.bC(1);
        zspVar.by(1);
        zspVar.be(4);
        zspVar.bA(2);
        zspVar.bv(1);
        zspVar.bf(4);
        zspVar.bB(2);
        zspVar.aS(5);
        zspVar.bw(2);
        zspVar.bW(5);
        zspVar.bg(32);
        zspVar.bx(1);
        zspVar.ch(false);
        zspVar.aK(250);
        zspVar.aJ(120000);
        zspVar.aX(300000);
        zspVar.bH(SemanticState.LiveRegion);
        zspVar.d = ahbo.d(SemanticState.Focused, SemanticState.Hidden, SemanticState.ReadOnly, SemanticState.ReadOnly);
        zspVar.e = ahbo.d(SemanticState.Obscured, SemanticState.Multiline, 65536, 65536);
        zspVar.bE(1);
        zspVar.bk(10);
        zspVar.f = ahbo.d(10, 10, 10, 10);
        zspVar.br(180000);
        zspVar.bb(Long.MAX_VALUE);
        zspVar.bi(5000);
        zspVar.bj(250);
        zspVar.cb(100);
        zspVar.bU(5000);
        zspVar.bT(100);
        zspVar.aP(500);
        zspVar.cc(1000);
        zspVar.bS(3000);
        zspVar.bQ(60000);
        zspVar.bR(7000);
        zspVar.aE(7000);
        zspVar.aL(true);
        zspVar.ce(908);
        zspVar.ca(988);
        zspVar.cm(4132);
        zspVar.aO(SemanticState.Modal);
        zspVar.cf(50);
        zspVar.cg(100);
        zspVar.cd(30);
        zspVar.cn(50);
        zspVar.co(100);
        zspVar.cl(30);
        zspVar.aG(75);
        zspVar.aH(100);
        zspVar.aF(30);
        zspVar.bO(120);
        zspVar.bN(5);
        zspVar.bK(30);
        zspVar.bM(15);
        zspVar.bP(3);
        zspVar.bL(10);
        zspVar.bJ(5);
        zspVar.bI(50);
        zspVar.aU(134217728L);
        zspVar.aI(600000);
        return zspVar;
    }

    static final boolean cr(ahbo ahboVar, int i, int i2) {
        if (ahboVar.b != 4) {
            return false;
        }
        for (int i3 = 0; i3 < 4; i3++) {
            int iA = ahboVar.a(i3);
            if (iA > i2 || iA < i) {
                return false;
            }
        }
        return true;
    }

    static final boolean cs(ahbo ahboVar, int i) {
        if (ahboVar.b != 4) {
            return false;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            int iA = ahboVar.a(i2);
            if (i2 > 0) {
                if (iA < ahboVar.a(i2 - 1) || iA > i) {
                    return false;
                }
            } else if (iA < 0) {
                return false;
            }
        }
        return true;
    }

    public abstract int A();

    public abstract int B();

    public abstract int C();

    public abstract int D();

    public abstract int E();

    public abstract int F();

    public abstract int G();

    public abstract int H();

    public abstract int I();

    public abstract int J();

    public abstract int K();

    public abstract int L();

    public abstract int M();

    public abstract int N();

    public abstract int O();

    public abstract int P();

    public abstract int Q();

    public abstract int R();

    public abstract int S();

    public abstract int T();

    public abstract int U();

    public abstract int V();

    public abstract int W();

    public abstract int X();

    public abstract int Y();

    public abstract int Z();

    public abstract double a();

    public abstract ahbo aA();

    public abstract ahbo aB();

    public abstract ahbo aC();

    public abstract ahbo aD();

    public abstract void aE(int i);

    public abstract void aF(int i);

    public abstract void aG(int i);

    public abstract void aH(int i);

    public abstract void aI(int i);

    public abstract void aJ(int i);

    public abstract void aK(int i);

    public abstract void aL(boolean z);

    public abstract void aM(double d);

    public abstract void aN(int i);

    public abstract void aO(int i);

    public abstract void aP(int i);

    public abstract void aQ(boolean z);

    public abstract void aR(boolean z);

    public abstract void aS(int i);

    public abstract void aT(boolean z);

    public abstract void aU(long j);

    public abstract void aV(int i);

    public abstract void aW(int i);

    public abstract void aX(int i);

    public abstract void aY(ahbo ahboVar);

    public abstract void aZ(int i);

    public abstract int aa();

    public abstract int ab();

    public abstract int ac();

    public abstract int ad();

    public abstract int ae();

    public abstract int af();

    public abstract int ag();

    public abstract int ah();

    public abstract int ai();

    public abstract int aj();

    public abstract int ak();

    public abstract int al();

    public abstract int am();

    public abstract int an();

    public abstract int ao();

    public abstract int ap();

    public abstract int aq();

    public abstract int ar();

    public abstract int as();

    public abstract int at();

    public abstract long au();

    public abstract long av();

    public abstract long aw();

    public abstract ztr ax();

    public abstract ahbn ay();

    public abstract ahbo az();

    public abstract int b();

    public abstract void bA(int i);

    public abstract void bB(int i);

    public abstract void bC(int i);

    public abstract void bD(long j);

    public abstract void bE(int i);

    public abstract void bF(int i);

    public abstract void bG(ahbo ahboVar);

    public abstract void bH(int i);

    public abstract void bI(int i);

    public abstract void bJ(int i);

    public abstract void bK(int i);

    public abstract void bL(int i);

    public abstract void bM(int i);

    public abstract void bN(int i);

    public abstract void bO(int i);

    public abstract void bP(int i);

    public abstract void bQ(int i);

    public abstract void bR(int i);

    public abstract void bS(int i);

    public abstract void bT(int i);

    public abstract void bU(int i);

    public abstract void bV(ahbn ahbnVar);

    public abstract void bW(int i);

    public abstract void bX(boolean z);

    public abstract void bY(boolean z);

    public abstract void bZ(boolean z);

    public abstract void ba(int i);

    public abstract void bb(long j);

    public abstract void bc(ahbo ahboVar);

    public abstract void bd(int i);

    public abstract void be(int i);

    public abstract void bf(int i);

    public abstract void bg(int i);

    public abstract void bh(int i);

    public abstract void bi(int i);

    public abstract void bj(int i);

    public abstract void bk(int i);

    public abstract void bl(int i);

    public abstract void bm(int i);

    public abstract void bn(int i);

    public abstract void bo(int i);

    public abstract void bp(int i);

    public abstract void bq(int i);

    public abstract void br(int i);

    public abstract void bs(ahbo ahboVar);

    public abstract void bt(ahbo ahboVar);

    public abstract void bu(int i);

    public abstract void bv(int i);

    public abstract void bw(int i);

    public abstract void bx(int i);

    public abstract void by(int i);

    public abstract void bz(int i);

    public abstract int c();

    public abstract void ca(int i);

    public abstract void cb(int i);

    public abstract void cc(int i);

    public abstract void cd(int i);

    public abstract void ce(int i);

    public abstract void cf(int i);

    public abstract void cg(int i);

    public abstract void ch(boolean z);

    public abstract void ci(int i);

    public abstract void cj(int i);

    public abstract void ck(int i);

    public abstract void cl(int i);

    public abstract void cm(int i);

    public abstract void cn(int i);

    public abstract void co(int i);

    public final ztr cq() {
        int iAp = ap();
        if (iAp <= 0) {
            iAp = 1;
        } else if (iAp > 604800) {
            iAp = 604800;
        }
        ck(iAp);
        int iAn = an();
        if (iAn <= 0) {
            iAn = 1;
        } else if (iAn > 604800) {
            iAn = 604800;
        }
        ci(iAn);
        int iAo = ao();
        if (iAo <= 0) {
            iAo = 1;
        } else if (iAo > 10000) {
            iAo = 10000;
        }
        cj(iAo);
        int i = i();
        if (i < 128) {
            i = 128;
        }
        aN(i);
        double dA = a();
        if (dA < 1.0d) {
            dA = 1.0d;
        } else if (dA > Double.MAX_VALUE) {
            dA = Double.MAX_VALUE;
        }
        aM(dA);
        int iC = C();
        if (iC <= 0) {
            iC = 1;
        }
        bo(iC);
        int iZ = z();
        if (iZ < 2) {
            iZ = 2;
        }
        bl(iZ);
        int iQ = Q();
        if (iQ <= 0) {
            iQ = 1;
        }
        bF(iQ);
        int iMax = Math.max(z(), C());
        int iD = D();
        if (iD < iMax) {
            iD = iMax;
        }
        bp(iD);
        int iE = E();
        if (iE >= iMax) {
            iMax = iE;
        }
        bq(iMax);
        int iB = B();
        int i2 = 20;
        if (iB < 0) {
            iB = 0;
        } else if (iB > 20) {
            iB = 20;
        }
        bn(iB);
        int iA = A();
        if (iA < 0) {
            i2 = 0;
        } else if (iA <= 20) {
            i2 = iA;
        }
        bm(i2);
        int iM = m();
        if (iM < 0) {
            iM = 0;
        }
        aV(iM);
        int iN = n();
        if (iN < 0) {
            iN = 0;
        }
        aW(iN);
        int iP = p();
        if (iP <= 0) {
            iP = 1;
        }
        aZ(iP);
        int iQ2 = q();
        if (iQ2 <= 0) {
            iQ2 = 1;
        }
        ba(iQ2);
        if (!cr(aC(), 15, 604800)) {
            bt(ahbo.d(86400, 86400, 86400, 86400));
        }
        if (!cr(aD(), 15, 604800)) {
            bG(ahbo.d(600, 600, 600, 600));
        }
        ahbn ahbnVarAy = ay();
        if (ahbnVarAy.b != 4) {
            bV(ahbn.d());
            break;
        }
        for (int i3 = 0; i3 < 4; i3++) {
            double dA2 = ahbnVarAy.a(i3);
            if (dA2 > 10.0d || dA2 < 1.0d) {
                bV(ahbn.d());
                break;
            }
        }
        int iR = r();
        if (iR <= 0) {
            iR = 1;
        }
        bd(iR);
        int iL = L();
        int iR2 = r();
        if (iL <= 0) {
            iL = 1;
        } else if (iL > iR2) {
            iL = iR2;
        }
        bz(iL);
        int iG = G();
        int iR3 = r();
        if (iG <= 0) {
            iG = 1;
        } else if (iG > iR3) {
            iG = iR3;
        }
        bu(iG);
        int iV = v();
        int iR4 = r();
        if (iV < 0) {
            iV = 0;
        } else if (iV > iR4) {
            iV = iR4;
        }
        bh(iV);
        int iO = O();
        int iV2 = v();
        if (iO < 0) {
            iO = 0;
        } else if (iO > iV2) {
            iO = iV2;
        }
        bC(iO);
        int iK = K();
        int iV3 = v();
        if (iK < 0) {
            iK = 0;
        } else if (iK > iV3) {
            iK = iV3;
        }
        by(iK);
        int iS = s();
        if (iS < 0) {
            iS = 0;
        }
        be(iS);
        int iM2 = M();
        int iS2 = s();
        if (iM2 < 0) {
            iM2 = 0;
        } else if (iM2 > iS2) {
            iM2 = iS2;
        }
        bA(iM2);
        int iH = H();
        int iS3 = s();
        if (iH < 0) {
            iH = 0;
        } else if (iH > iS3) {
            iH = iS3;
        }
        bv(iH);
        int iT = t();
        if (iT <= 0) {
            iT = 1;
        }
        bf(iT);
        int iN2 = N();
        int iT2 = t();
        if (iN2 <= 0) {
            iN2 = 1;
        } else if (iN2 > iT2) {
            iN2 = iT2;
        }
        bB(iN2);
        int I = I();
        int iT3 = t();
        if (I <= 0) {
            I = 1;
        } else if (I > iT3) {
            I = iT3;
        }
        bw(I);
        int iL2 = l();
        int iZ2 = z() + 1;
        if (iL2 < iZ2) {
            iL2 = iZ2;
        }
        aS(iL2);
        int iAf = af();
        if (iAf <= 0) {
            iAf = 1;
        }
        bW(iAf);
        int iU = u();
        if (iU <= 0) {
            iU = 1;
        }
        bg(iU);
        int iJ = J();
        int iU2 = u();
        if (iJ <= 0) {
            iJ = 1;
        } else if (iJ > iU2) {
            iJ = iU2;
        }
        bx(iJ);
        int iH2 = h();
        if (iH2 < 50) {
            iH2 = 50;
        }
        aK(iH2);
        int iG2 = g();
        if (iG2 < 30000) {
            iG2 = 30000;
        }
        aJ(iG2);
        int iO2 = o();
        if (iO2 < 60000) {
            iO2 = 60000;
        }
        aX(iO2);
        int iR5 = R();
        if (iR5 < 0) {
            iR5 = 0;
        }
        bH(iR5);
        if (!cs(aA(), 25000)) {
            bc(ahbo.d(SemanticState.Focused, SemanticState.Hidden, SemanticState.ReadOnly, SemanticState.ReadOnly));
        }
        if (!cs(az(), Alert.DURATION_SHOW_INDEFINITELY)) {
            aY(ahbo.d(SemanticState.Obscured, SemanticState.Multiline, 65536, 65536));
        }
        int iP2 = P();
        if (iP2 <= 0) {
            iP2 = 1;
        }
        bE(iP2);
        int iY = y();
        if (iY < 0) {
            iY = 0;
        }
        bk(iY);
        if (!cr(aB(), 0, Alert.DURATION_SHOW_INDEFINITELY)) {
            bs(ahbo.d(10, 10, 10, 10));
        }
        int iF = F();
        if (iF < 5000) {
            iF = 5000;
        }
        br(iF);
        long jAv = av();
        if (jAv < 3600000) {
            jAv = 3600000;
        }
        bb(jAv);
        int iW = w();
        if (iW < 0) {
            iW = 0;
        }
        bi(iW);
        int iX = x();
        int iW2 = w();
        if (iX < 0) {
            iX = 0;
        } else if (iX > iW2) {
            iX = iW2;
        }
        bj(iX);
        int iAh = ah();
        if (iAh < 0) {
            iAh = 0;
        }
        cb(iAh);
        int iAe = ae();
        if (iAe < 0) {
            iAe = 0;
        }
        bU(iAe);
        int iAd = ad();
        if (iAd < 0) {
            iAd = 0;
        }
        bT(iAd);
        int iK2 = k();
        if (iK2 < 0) {
            iK2 = 0;
        }
        aP(iK2);
        int iAi = ai();
        int iK3 = k();
        if (iAi < iK3) {
            iAi = iK3;
        }
        cc(iAi);
        int iAc = ac();
        if (iAc < 0) {
            iAc = 0;
        }
        bS(iAc);
        int iAa = aa();
        if (iAa < 0) {
            iAa = 0;
        }
        bQ(iAa);
        int iAb = ab();
        int i4 = 300000;
        if (iAb < 0) {
            iAb = 0;
        } else if (iAb > 300000) {
            iAb = 300000;
        }
        bR(iAb);
        int iB2 = b();
        if (iB2 < 0) {
            i4 = 0;
        } else if (iB2 <= 300000) {
            i4 = iB2;
        }
        aE(i4);
        ce((ak() | 4) & 8052);
        ca((ag() | 4) & 8052);
        cm((ar() | 4) & 8052);
        aO(j() & 8052);
        int iAl = al();
        if (iAl < 10) {
            iAl = 10;
        } else if (iAl > 100) {
            iAl = 100;
        }
        cf(iAl);
        int iAm = am();
        if (iAm < 10) {
            iAm = 10;
        } else if (iAm > 1200) {
            iAm = 1200;
        }
        cg(iAm);
        int iAj = aj();
        if (iAj < 10) {
            iAj = 10;
        } else if (iAj > 120) {
            iAj = 120;
        }
        cd(iAj);
        int iAs = as();
        if (iAs < 10) {
            iAs = 10;
        } else if (iAs > 100) {
            iAs = 100;
        }
        cn(iAs);
        int iAt = at();
        if (iAt < 10) {
            iAt = 10;
        } else if (iAt > 1200) {
            iAt = 1200;
        }
        co(iAt);
        int iAq = aq();
        if (iAq < 10) {
            iAq = 10;
        } else if (iAq > 120) {
            iAq = 120;
        }
        cl(iAq);
        int iD2 = d();
        if (iD2 < 10) {
            iD2 = 10;
        } else if (iD2 > 100) {
            iD2 = 100;
        }
        aG(iD2);
        int iE2 = e();
        if (iE2 < 10) {
            iE2 = 10;
        } else if (iE2 > 1200) {
            iE2 = 1200;
        }
        aH(iE2);
        int iC2 = c();
        aF(iC2 >= 10 ? iC2 > 120 ? 120 : iC2 : 10);
        int iY2 = Y();
        bO(iY2 >= 15 ? iY2 > 1200 ? 1200 : iY2 : 15);
        int iX2 = X();
        bN(iX2 > 0 ? iX2 > 60 ? 60 : iX2 : 1);
        int iU3 = U();
        int iY3 = Y();
        if (iU3 < 0) {
            iU3 = 0;
        } else if (iU3 > iY3) {
            iU3 = iY3;
        }
        bK(iU3);
        int iW3 = W();
        int iY4 = Y();
        if (iW3 < 0) {
            iW3 = 0;
        } else if (iW3 > iY4) {
            iW3 = iY4;
        }
        bM(iW3);
        int iZ3 = Z();
        if (iZ3 < 0) {
            iZ3 = 0;
        } else if (iZ3 > 100) {
            iZ3 = 100;
        }
        bP(iZ3);
        int iV4 = V();
        int iZ4 = Z();
        if (iV4 < iZ4) {
            iV4 = iZ4;
        } else if (iV4 > 101) {
            iV4 = 101;
        }
        bL(iV4);
        int iT4 = T();
        if (iT4 < 0) {
            iT4 = 0;
        } else if (iT4 > 1000) {
            iT4 = 1000;
        }
        bJ(iT4);
        int iS4 = S();
        bI(iS4 >= 0 ? iS4 > 100 ? 100 : iS4 : 0);
        long jAu = au();
        if (jAu < 0) {
            jAu = 0;
        }
        aU(jAu);
        int iF2 = f();
        aI(iF2 >= 30000 ? iF2 : 30000);
        long jAw = aw();
        bD(jAw >= 0 ? jAw : 0L);
        return ax();
    }

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract int q();

    public abstract int r();

    public abstract int s();

    public abstract int t();

    public abstract int u();

    public abstract int v();

    public abstract int w();

    public abstract int x();

    public abstract int y();

    public abstract int z();
}
