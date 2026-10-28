package defpackage;

import android.support.rastermill.FrameSequenceDrawable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adfg implements tae {
    private final asnm a;
    private final WeakReference b;
    private final nry c;
    private final boolean d;

    public adfg(asnm asnmVar, adfc adfcVar, nry nryVar, boolean z) {
        this.a = asnmVar;
        this.b = new WeakReference(adfcVar);
        this.c = nryVar;
        this.d = z;
    }

    @Override // defpackage.tae, defpackage.twi
    public final /* synthetic */ void a(Object obj) {
        FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) obj;
        adfc adfcVar = (adfc) this.b.get();
        if (adfcVar == null || adfcVar.getDrawable() != null) {
            return;
        }
        int i = adfcVar.B;
        asnm asnmVar = this.a;
        int iBc = a.bc(asnmVar.d);
        if (iBc == 0) {
            iBc = 1;
        }
        adfcVar.B = iBc;
        if (this.d) {
            adfcVar.w = true;
            aecm.G(frameSequenceDrawable, asnmVar, adfcVar, this.c);
            adfcVar.w = false;
        } else {
            aecm.G(frameSequenceDrawable, asnmVar, adfcVar, this.c);
        }
        adfcVar.B = i;
    }
}
