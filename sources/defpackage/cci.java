package defpackage;

import android.media.MediaFormat;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cci implements ctm, cud, cdm {
    private final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    private cud b;
    private ctm c;
    private cud d;

    @Override // defpackage.cdm
    public final void A(int i, Object obj) {
        if (i == 8) {
            this.b = (cud) obj;
        }
        switch (i) {
            case 10000:
                cul culVar = (cul) obj;
                cuj cujVar = culVar == null ? null : culVar.c;
                this.c = cujVar;
                this.d = cujVar;
                break;
            case 10001:
                CopyOnWriteArraySet copyOnWriteArraySet = this.a;
                obj.getClass();
                copyOnWriteArraySet.add((ctm) obj);
                break;
            case 10002:
                this.a.remove(obj);
                break;
        }
    }

    @Override // defpackage.cud
    public final void a(long j, float[] fArr) {
        cud cudVar = this.d;
        if (cudVar != null) {
            cudVar.a(j, fArr);
        }
        cud cudVar2 = this.b;
        if (cudVar2 != null) {
            cudVar2.a(j, fArr);
        }
    }

    @Override // defpackage.cud
    public final void b() {
        cud cudVar = this.d;
        if (cudVar != null) {
            cudVar.b();
        }
        cud cudVar2 = this.b;
        if (cudVar2 != null) {
            cudVar2.b();
        }
    }

    @Override // defpackage.ctm
    public final void c(long j, long j2, bse bseVar, MediaFormat mediaFormat) {
        ctm ctmVar = this.c;
        if (ctmVar != null) {
            ctmVar.c(j, j2, bseVar, mediaFormat);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ctm) it.next()).c(j, j2, bseVar, mediaFormat);
        }
    }
}
