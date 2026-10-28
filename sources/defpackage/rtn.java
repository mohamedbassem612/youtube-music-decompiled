package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rtn implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rtn(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r14v36, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v37, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        aizx aizxVarE;
        tqf tqfVar;
        tqe tqeVar;
        tqd tqdVar;
        tqf tqfVar2;
        tqe tqeVar2;
        tqd tqdVar2;
        byte[] bArr = null;
        int i = 7;
        switch (this.$cid) {
            case 0:
                aazs aazsVar = (aazs) obj;
                String strA = aazsVar.a();
                boolean zIsEmpty = TextUtils.isEmpty(strA);
                Object obj2 = this.a;
                if (!zIsEmpty) {
                    rts rtsVar = (rts) obj2;
                    rtsVar.I.remove(strA);
                    rtsVar.J.remove(strA);
                }
                rts rtsVar2 = (rts) obj2;
                rtsVar2.i(new rme(aazsVar, i), taq.ac(rtsVar2.D) ? new agqj(rtsVar2.C) : agpr.a);
                break;
            case 1:
                aazn aaznVar = (aazn) obj;
                rts rtsVar3 = (rts) this.a;
                Object obj3 = ((rtsVar3.M.booleanValue() || ((aizxVarE = afxw.e(rtsVar3.D)) != null && aizxVarE.av && rtsVar3.L.booleanValue())) && rtsVar3.K.isPresent()) ? rtsVar3.K.get() : aaznVar.b;
                int i2 = aaznVar.a;
                rtsVar3.i(new rew(aaznVar, obj3, 5, bArr), agkz.u(rtsVar3.a, rtsVar3.c, rtsVar3.B, rtsVar3.r, rtsVar3.v, rtsVar3.q, rtsVar3.e));
                break;
            case 2:
                ((rts) this.a).i(new rme((aayt) obj, 12), agpr.a);
                break;
            case 3:
                ((rts) this.a).i(new rme((aayw) obj, 11), agpr.a);
                break;
            case 4:
                ((rts) this.a).k(((aaxl) obj).a);
                break;
            case 5:
                rme rmeVar = new rme((zhz) obj, 13);
                rts rtsVar4 = (rts) this.a;
                rtsVar4.i(rmeVar, new agqj(rtsVar4.l));
                break;
            case 6:
                acip acipVar = ((aazq) obj).b;
                ((rts) this.a).j(acipVar.au(), acipVar.a());
                break;
            case 7:
                ((spy) this.a).i((aazk) obj, false);
                break;
            case 8:
                ((spy) this.a).i((aazk) obj, true);
                break;
            case 9:
                zhz zhzVar = (zhz) obj;
                taq.d();
                spy spyVar = (spy) this.a;
                if (spyVar.d != null && zhzVar.f) {
                    spyVar.d.p(zhzVar);
                    break;
                }
                break;
            case 10:
                taq.d();
                if (((aazj) obj).a.ordinal() == 0) {
                    Object obj4 = this.a;
                    taq.d();
                    spy spyVar2 = (spy) obj4;
                    spyVar2.a();
                    spyVar2.f = null;
                    spyVar2.b.clear();
                    spyVar2.c.clear();
                }
                break;
            case 11:
                aazn aaznVar2 = (aazn) obj;
                taq.d();
                spy spyVar3 = (spy) this.a;
                if (spyVar3.d != null) {
                    spyVar3.d.y(aaznVar2);
                }
                int i3 = aaznVar2.a;
                if (i3 == 2) {
                    taq.d();
                    if (spyVar3.d != null) {
                        spyVar3.d.u();
                    }
                } else if (i3 == 3) {
                    taq.d();
                    if (spyVar3.d != null) {
                        spyVar3.d.s();
                    }
                } else if (i3 == 4) {
                    taq.d();
                    if (spyVar3.d != null) {
                        spyVar3.d.w();
                    }
                } else if (i3 == 7) {
                    taq.d();
                    if (spyVar3.d != null) {
                        spyVar3.d.q();
                    }
                }
                break;
            case 12:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                tfq tfqVar = (tfq) this.a;
                tfi tfiVar = tfqVar.a;
                if (tfiVar.c()) {
                    tfiVar.a();
                }
                tfqVar.c.c();
                if (zBooleanValue) {
                    tfqVar.f();
                }
                break;
            case 13:
                long jLongValue = ((Long) obj).longValue() & 4294967295L;
                Object obj5 = this.a;
                int i4 = (int) jLongValue;
                if ((i4 & 3) != 3) {
                    int iB = tqf.b(i4);
                    do {
                        tqfVar = (tqf) obj5;
                        tqeVar = (tqe) tqfVar.a.get();
                        if (tqeVar.e != iB) {
                            long[] jArr = tqeVar.a;
                            int iO = tqf.o(iB);
                            tqdVar = new tqd(tqeVar);
                            tqdVar.h(iB);
                            tqdVar.i(iO);
                        }
                    } while (!tqfVar.j(tqeVar, tqdVar));
                } else {
                    do {
                        tqfVar2 = (tqf) obj5;
                        tqeVar2 = (tqe) tqfVar2.a.get();
                        if (!tqeVar2.a()) {
                            tqdVar2 = new tqd(tqeVar2);
                            tqdVar2.f(2);
                        }
                        break;
                    } while (!tqfVar2.j(tqeVar2, tqdVar2));
                    tqfVar2.g();
                    Object obj6 = tqfVar2.b;
                    if (obj6 != null) {
                        avnr.b((AtomicReference) obj6);
                    }
                }
                break;
            case 14:
                this.a.invoke(obj);
                break;
            case 15:
                this.a.invoke(obj);
                break;
            case 16:
                agev agevVar = (agev) obj;
                if (agevVar.g()) {
                    ((ahto) this.a).c = agevVar;
                }
                break;
            case 17:
                vqr vqrVar = (vqr) obj;
                vtl vtlVar = vqrVar.a;
                float f = vtlVar.a;
                Object obj7 = this.a;
                RelativeLayout relativeLayout = (RelativeLayout) obj7;
                relativeLayout.setTranslationX(f);
                int i5 = vtlVar.b;
                vun vunVar = vqrVar.b;
                int i6 = vqrVar.c;
                obj7.getClass();
                relativeLayout.setTranslationY(i5);
                if (vunVar == vun.e || vunVar == vun.d) {
                    tym.h((View) obj7, new tyi(0, 1), ViewGroup.MarginLayoutParams.class);
                } else {
                    tym.h((View) obj7, new tyi(i5 + i6, 1), ViewGroup.MarginLayoutParams.class);
                }
                break;
            case 18:
                vqq vqqVar = (vqq) obj;
                vtl vtlVar2 = vqqVar.a;
                float f2 = vtlVar2.a;
                RelativeLayout relativeLayout2 = (RelativeLayout) this.a;
                relativeLayout2.setTranslationX(f2);
                tzk.E(relativeLayout2, vtlVar2.b, vqqVar.b);
                break;
            case 19:
                ((avmm) this.a).c((avmn) obj);
                break;
            default:
                ((vuk) this.a).u = (vun) obj;
                break;
        }
    }
}
