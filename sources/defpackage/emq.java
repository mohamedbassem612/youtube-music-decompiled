package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class emq implements emw {
    public static final emq a = new emq();
    private static final boy b = boy.s("c", "v", "i", "o");

    @Override // defpackage.emw
    public final /* bridge */ /* synthetic */ Object a(emz emzVar, float f) {
        if (emzVar.p() == 1) {
            emzVar.g();
        }
        emzVar.h();
        List listD = null;
        List listD2 = null;
        List listD3 = null;
        boolean zO = false;
        while (emzVar.n()) {
            int iQ = emzVar.q(b);
            if (iQ == 0) {
                zO = emzVar.o();
            } else if (iQ == 1) {
                listD = emg.d(emzVar, f);
            } else if (iQ == 2) {
                listD2 = emg.d(emzVar, f);
            } else if (iQ != 3) {
                emzVar.l();
                emzVar.m();
            } else {
                listD3 = emg.d(emzVar, f);
            }
        }
        emzVar.j();
        if (emzVar.p() == 2) {
            emzVar.i();
        }
        if (listD == null || listD2 == null || listD3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listD.isEmpty()) {
            return new ekx(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listD.size();
        PointF pointF = (PointF) listD.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) listD.get(i);
            int i2 = i - 1;
            arrayList.add(new ejr(enh.b((PointF) listD.get(i2), (PointF) listD3.get(i2)), enh.b(pointF2, (PointF) listD2.get(i)), pointF2));
        }
        if (zO) {
            PointF pointF3 = (PointF) listD.get(0);
            int i3 = size - 1;
            arrayList.add(new ejr(enh.b((PointF) listD.get(i3), (PointF) listD3.get(i3)), enh.b(pointF3, (PointF) listD2.get(0)), pointF3));
        }
        return new ekx(pointF, zO, arrayList);
    }
}
