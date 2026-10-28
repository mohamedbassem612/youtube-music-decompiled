package defpackage;

import android.os.Looper;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class addf implements nrw {
    private final /* synthetic */ int $cid;
    private final Object a;
    private final Object b;

    public addf(aunn aunnVar, avmb avmbVar, int i) {
        this.$cid = i;
        this.b = aunnVar;
        this.a = avmbVar;
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return this.$cid != 0 ? asmi.b : akdo.b;
    }

    @Override // defpackage.nrx
    public final /* synthetic */ aslz b() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [aunn, java.lang.Object] */
    @Override // defpackage.nrw
    public final /* synthetic */ avlb c(Object obj, nrv nrvVar) {
        CommandOuterClass$Command defaultInstance;
        avlb avlbVarE;
        if (this.$cid != 0) {
            asmi asmiVar = (asmi) obj;
            if ((asmiVar.c & 2) != 0) {
                nry nryVar = (nry) this.b.io();
                CommandOuterClass$Command defaultInstance2 = asmiVar.e;
                if (defaultInstance2 == null) {
                    defaultInstance2 = CommandOuterClass$Command.getDefaultInstance();
                }
                avlbVarE = nryVar.c(defaultInstance2, nrvVar, 1);
            } else {
                avlbVarE = avlb.e();
            }
            float f = asmiVar.d;
            if (f <= 0.0f) {
                return avlbVarE;
            }
            avlb avlbVarC = avlb.x((long) (((double) f) * 1000000.0d), TimeUnit.MICROSECONDS, (avmb) this.a).c(avlbVarE);
            return Looper.myLooper() == Looper.getMainLooper() ? avlbVarC.r(avmh.a()) : avlbVarC;
        }
        akdo akdoVar = (akdo) obj;
        if (((tfq) this.b).h()) {
            if ((akdoVar.c & 1) == 0) {
                return avlb.m(new nud("Invalid ConnectivityDependentCommand: missing online command"));
            }
            defaultInstance = akdoVar.d;
            if (defaultInstance == null) {
                defaultInstance = CommandOuterClass$Command.getDefaultInstance();
            }
        } else {
            if ((akdoVar.c & 2) == 0) {
                return avlb.m(new nud("Invalid ConnectivityDependentCommand: missing offline command"));
            }
            defaultInstance = akdoVar.e;
            if (defaultInstance == null) {
                defaultInstance = CommandOuterClass$Command.getDefaultInstance();
            }
        }
        return ((nry) this.a.io()).c(defaultInstance, nrvVar, 1);
    }

    @Override // defpackage.nrw
    public final /* synthetic */ avlb e(mew mewVar, nrv nrvVar) {
        return this.$cid != 0 ? nqw.a(this, mewVar, nrvVar) : nqw.a(this, mewVar, nrvVar);
    }

    public addf(aunn aunnVar, tfq tfqVar, int i) {
        this.$cid = i;
        this.a = aunnVar;
        this.b = tfqVar;
    }
}
