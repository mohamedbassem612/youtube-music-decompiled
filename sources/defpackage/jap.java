package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.google.android.libraries.blocks.Container;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jap implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ jap(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r6v18, types: [adlz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        switch (this.$cid) {
            case 0:
                jav javVar = (jav) this.a;
                mav mavVar = (mav) obj;
                gmj gmjVar = (gmj) javVar.b.io();
                gmh gmhVar = new gmh((awoq) null, 1, (byte[]) null);
                zwa zwaVarE = gmjVar.a.e();
                int i = awrn.a;
                Object objComputeIfAbsent = ConcurrentMap.EL.computeIfAbsent(gmjVar.e, new awqv(afzz.class), new gmi(new gmg(gmjVar, zwaVarE, gmhVar, 1)));
                objComputeIfAbsent.getClass();
                avmc avmcVarV = tzk.c(((afkb) objComputeIfAbsent).a()).v(javVar.c);
                mavVar.getClass();
                javVar.d.c(avmcVarV.D(new iwb(mavVar, 8), new ido(16)));
                break;
            case 1:
                this.a.add(kro.aH(((aamo) obj).d()));
                break;
            case 2:
                mav mavVar2 = (mav) obj;
                Container containerC = ((adsr) this.a).C();
                if (containerC != null) {
                    mavVar2.b((agak) containerC.a(new afyq(11)));
                }
                break;
            case 3:
                ((View) this.a).setBackground((GradientDrawable) obj);
                break;
            case 4:
                nrw nrwVar = (nrw) obj;
                int i2 = mqq.e;
                ((agkh) this.a).e(Integer.valueOf(nrwVar.a().a()), nrwVar);
                break;
            case 5:
                nwg nwgVar = (nwg) obj;
                int i3 = mqq.e;
                ((agkh) this.a).e(Integer.valueOf(nwgVar.a().a()), nwgVar);
                break;
            case 6:
                ((agjz) this.a).h((afhq) obj);
                break;
            case 7:
                ((vro) obj).i(this.a);
                break;
            case 8:
                argn argnVar = (argn) obj;
                aihf aihfVar = (aihf) this.a;
                aihfVar.copyOnWrite();
                amca amcaVar = (amca) aihfVar.instance;
                amca amcaVar2 = amca.a;
                argnVar.getClass();
                aiie aiieVar = amcaVar.e;
                if (!aiieVar.c()) {
                    amcaVar.e = aihn.mutableCopy(aiieVar);
                }
                amcaVar.e.add(argnVar);
                break;
            default:
                this.a.l((aret) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
