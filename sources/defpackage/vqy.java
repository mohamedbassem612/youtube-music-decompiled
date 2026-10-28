package defpackage;

import android.os.Looper;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vqy implements nrw {
    public final abxv a;
    private final aunn b;
    private final xgm c;
    private final xgn d;
    private final aefv e;
    private final vxz f;
    private final hhb g;

    public vqy(aunn aunnVar, xgm xgmVar, xgn xgnVar, aefv aefvVar, vxz vxzVar, abxv abxvVar, hhb hhbVar) {
        this.b = aunnVar;
        this.c = xgmVar;
        this.d = xgnVar;
        this.e = aefvVar;
        this.f = vxzVar;
        this.a = abxvVar;
        this.g = hhbVar;
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return apxv.b;
    }

    @Override // defpackage.nrx
    public final aslz b() {
        return a.r();
    }

    @Override // defpackage.nrw
    public final /* bridge */ /* synthetic */ avlb c(Object obj, nrv nrvVar) {
        asmv asmvVar;
        avlb avlbVarN;
        apxv apxvVar = (apxv) obj;
        aefv aefvVar = this.e;
        if (aefvVar.e != null && aefv.j(aefvVar.f)) {
            return avlb.e();
        }
        akrl akrlVar = apxvVar.e;
        if (akrlVar == null) {
            akrlVar = akrl.a;
        }
        if ((akrlVar.b & 8) != 0) {
            akrl akrlVar2 = apxvVar.e;
            if (akrlVar2 == null) {
                akrlVar2 = akrl.a;
            }
            if ((akrlVar2.b & 4) != 0) {
                vrh.d(this.c, this.d, apxvVar, true);
            }
            akrl akrlVar3 = apxvVar.e;
            if (akrlVar3 == null) {
                akrlVar3 = akrl.a;
            }
            if ((akrlVar3.b & 4) == 0 && !this.f.m(8, 45399099L)) {
                return avlb.e();
            }
            nry nryVar = (nry) this.b.io();
            akrl akrlVar4 = apxvVar.e;
            if (akrlVar4 == null) {
                akrlVar4 = akrl.a;
            }
            CommandOuterClass$Command defaultInstance = akrlVar4.e;
            if (defaultInstance == null) {
                defaultInstance = CommandOuterClass$Command.getDefaultInstance();
            }
            return nryVar.a(defaultInstance, nrvVar);
        }
        akrl akrlVar5 = apxvVar.e;
        if (akrlVar5 == null) {
            akrlVar5 = akrl.a;
        }
        if ((akrlVar5.b & 1) == 0) {
            int i = apxvVar.c;
            if ((i & 1) == 0 && (i & 4) == 0) {
                return avlb.e();
            }
        }
        ghi ghiVar = (ghi) this.g.a;
        ghj ghjVar = ghiVar.b;
        mfy mfyVar = (mfy) ghjVar.eh.io();
        ght ghtVar = ghiVar.a;
        vrh vrhVar = new vrh(apxvVar, nrvVar, mfyVar, (acxn) ghtVar.a.ip.io(), aupm.b(ghjVar.H), (xgm) ghjVar.j.io(), (xgn) ghtVar.kk.io(), (aeba) ghjVar.bz.io(), ghjVar.bI());
        if ((apxvVar.c & 4) != 0) {
            avlbVarN = avlb.n(new mgd((Object) this, (Object) apxvVar, (Object) vrhVar, 13, (byte[]) null));
        } else {
            akrl akrlVar6 = apxvVar.e;
            if (((akrlVar6 == null ? akrl.a : akrlVar6).b & 1) != 0) {
                if (akrlVar6 == null) {
                    akrlVar6 = akrl.a;
                }
                asmvVar = akrlVar6.c;
                if (asmvVar == null) {
                    asmvVar = asmv.a;
                }
            } else {
                asmvVar = apxvVar.d;
                if (asmvVar == null) {
                    asmvVar = asmv.a;
                }
            }
            avlbVarN = avlb.n(new hmg(vrhVar, asmvVar, 11));
        }
        return Looper.myLooper() != Looper.getMainLooper() ? avlbVarN.v(avmh.a()) : avlbVarN;
    }

    @Override // defpackage.nrw
    public final /* synthetic */ avlb e(mew mewVar, nrv nrvVar) {
        return nqw.a(this, mewVar, nrvVar);
    }
}
